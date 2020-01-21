package typings.oniguruma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oniguruma", "OnigScanner")
@js.native
class OnigScanner protected () extends js.Object {
  /**
    * Create a new scanner with the given patterns.
    * @param patterns An array of string patterns.
    */
  def this(patterns: js.Array[String]) = this()
  /**
    * Coerce the provided value into a number
    * @param value A value of any type
    * @return A number representing 'value'
    */
  /* private */ def convertToNumber(value: js.Any): Double = js.native
  /**
    * Coerce the provided value into either a string primitive or a wrapped
    * OnigString object.
    * @param value A value of any type
    * @return A string primitive or OnigString object representing 'value'
    */
  /* private */ def convertToString(value: js.Any): String | OnigString = js.native
  /**
    * Find the next match from the beginning of a string
    * @param string The string to search
    * @param callback The (error, match) function to be called when done. Match
    *        will be null when there is no match.
    */
  def findNextMatch(string: String, callback: Callback[Match | Null]): Unit = js.native
  /**
    * Find the next match from a given position
    * @param string The string to search
    * @param startPosition The optional position to start at, defaults to 0
    * @param callback The (error, match) function to be called when done. Match
    *        will be null when there is no match.
    */
  def findNextMatch(string: String, startPosition: Double, callback: Callback[Match | Null]): Unit = js.native
  /**
    * Synchronously find the next match from a given position
    * @param string The string to search
    * @param startPosition The optional position to start at, defaults to 0
    * @return An object containing details about the match, or null if no match
    */
  def findNextMatchSync(string: String): Match | Null = js.native
  def findNextMatchSync(string: String, startPosition: Double): Match | Null = js.native
}

