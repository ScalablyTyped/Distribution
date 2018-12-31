package typings
package onigurumaLib.onigurumaMod

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
  def this(patterns: js.Array[java.lang.String]) = this()
  /**
    * Coerce the provided value into a number
    * @param value A value of any type
    * @return A number representing 'value'
    */
  /* private */ def convertToNumber(value: js.Any): scala.Double = js.native
  /**
    * Coerce the provided value into either a string primitive or a wrapped
    * OnigString object.
    * @param value A value of any type
    * @return A string primitive or OnigString object representing 'value'
    */
  /* private */ def convertToString(value: js.Any): java.lang.String | OnigString = js.native
  /**
    * Find the next match from the beginning of a string
    * @param string The string to search
    * @param callback The (error, match) function to be called when done. Match
    *        will be null when there is no match.
    */
  def findNextMatch(string: java.lang.String, callback: Callback[Match | scala.Null]): scala.Unit = js.native
  /**
    * Find the next match from a given position
    * @param string The string to search
    * @param startPosition The optional position to start at, defaults to 0
    * @param callback The (error, match) function to be called when done. Match
    *        will be null when there is no match.
    */
  def findNextMatch(string: java.lang.String, startPosition: scala.Double, callback: Callback[Match | scala.Null]): scala.Unit = js.native
  /**
    * Synchronously find the next match from a given position
    * @param string The string to search
    * @param startPosition The optional position to start at, defaults to 0
    * @return An object containing details about the match, or null if no match
    */
  def findNextMatchSync(string: java.lang.String): Match | scala.Null = js.native
  def findNextMatchSync(string: java.lang.String, startPosition: scala.Double): Match | scala.Null = js.native
}

