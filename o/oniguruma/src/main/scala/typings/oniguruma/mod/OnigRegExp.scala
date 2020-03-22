package typings.oniguruma.mod

import typings.oniguruma.CaptureIndexmatchstring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oniguruma", "OnigRegExp")
@js.native
class OnigRegExp protected () extends js.Object {
  /**
    * Create a new regex with the given pattern
    * @param pattern A string pattern
    */
  def this(pattern: String) = this()
  /** The OnigScanner instance used internally for regex matching */
  val scanner: OnigScanner = js.native
  /** The regex pattern that the OnigRegExp matches against */
  val source: String = js.native
  /**
    * Augment the capture indices for the given Match object by extracting
    * the substrings associated with each capture, assinging them to the
    * CaptureIndex object's 'match' property
    * @param string The search string from which 'match' resulted
    * @param match The Match object containing the matches of the search
    * @return An array of CaptureIndex objects which have been augmented with
    *         the original text that triggered the match
    */
  def captureIndicesForMatch(string: js.Any, `match`: Match): js.Array[CaptureIndexmatchstring] = js.native
  /**
    * Search the string for a match starting at the beginning of the string.
    * @param string The string to search.
    * @param callback The (error, match) function to call when done. Match will
    *        be null if no matches were found. Otherwise, match will be an
    *        array of objects for each matched group.
    */
  def search(string: String, callback: Callback[js.Array[CaptureIndex] | Null]): Unit = js.native
  /**
    * Search the string for a match starting at the given position.
    * @param string The string to search.
    * @param startPosition The optional position to start at, defaults to 0
    * @param callback The (error, match) function to call when done. Match will
    *        be null if no matches were found. Otherwise, match will be an
    *        array of objects for each matched group.
    */
  def search(string: String, startPosition: Double, callback: Callback[js.Array[CaptureIndex] | Null]): Unit = js.native
  /**
    * Synchronously search the string for a match starting at the given
    * position.
    * @param string The string to search.
    * @param startPosition The optional position to start at, defaults to 0
    * @return An array of objects representing each matched group, or null if
    *         there were no matches.
    */
  def searchSync(string: String): js.Array[CaptureIndex] | Null = js.native
  def searchSync(string: String, startPosition: Double): js.Array[CaptureIndex] | Null = js.native
  /**
    * Test if this regular expression matches the given string.
    * @param string The string to test against.
    * @param callback The (error, matches) function to call when done. Matches
    *        will be true if at least one match was found, or false otherwise.
    */
  def test(sring: String, callback: Callback[Boolean]): Unit = js.native
  /**
    * Synchronously test if this regular expression matches the given string.
    * @param string The string to test against.
    * @return True if there is at least one match, or false otherwise.
    */
  def testSync(string: String): Boolean = js.native
}

