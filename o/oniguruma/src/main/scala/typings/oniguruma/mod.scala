package typings.oniguruma

import typings.oniguruma.anon.CaptureIndexmatchstring
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oniguruma", "OnigRegExp")
  @js.native
  class OnigRegExp protected () extends StObject {
    /**
      * Create a new regex with the given pattern
      * @param pattern A string pattern
      */
    def this(pattern: String) = this()
    
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
    
    /** The OnigScanner instance used internally for regex matching */
    val scanner: OnigScanner = js.native
    
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
    
    /** The regex pattern that the OnigRegExp matches against */
    val source: String = js.native
    
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
  
  @JSImport("oniguruma", "OnigScanner")
  @js.native
  class OnigScanner protected () extends StObject {
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
  
  @JSImport("oniguruma", "OnigString")
  @js.native
  class OnigString protected () extends StObject {
    /**
      * Wrap a string primitive in a new OnigString object
      * @param string The string primitive to be wrapped
      */
    def this(string: String) = this()
    
    /** The string primitive wrapped by the object */
    val content: String = js.native
    
    /** The character length of the string primitive wrapped by the object */
    val length: Double = js.native
    
    /**
      * Returns a substring of the string primitive wrapped by the object
      * @param start The index of the first character to include
      * @param end The index before which the substring should end
      * @return A new string primitive containing the specified index range
      */
    def substring(start: Double, end: Double): String = js.native
  }
  
  type Callback[T] = js.Function2[/* error */ Error, /* match */ T, Unit]
  
  @js.native
  trait CaptureIndex extends StObject {
    
    /** The position in the search string where the capture ends */
    var end: Double = js.native
    
    /** The index of the capturing group, or 0 for a full-string match */
    var index: Double = js.native
    
    /** The total character length of the capture */
    var length: Double = js.native
    
    /** The position in the search string where the capture begins */
    var start: Double = js.native
  }
  object CaptureIndex {
    
    @scala.inline
    def apply(end: Double, index: Double, length: Double, start: Double): CaptureIndex = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureIndex]
    }
    
    @scala.inline
    implicit class CaptureIndexMutableBuilder[Self <: CaptureIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Match extends StObject {
    
    /** An array holding all of the captures (full match + capturing groups) */
    var captureIndices: js.Array[CaptureIndex] = js.native
    
    /** The index of the best pattern match */
    var index: Double = js.native
  }
  object Match {
    
    @scala.inline
    def apply(captureIndices: js.Array[CaptureIndex], index: Double): Match = {
      val __obj = js.Dynamic.literal(captureIndices = captureIndices.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureIndices(value: js.Array[CaptureIndex]): Self = StObject.set(x, "captureIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureIndicesVarargs(value: CaptureIndex*): Self = StObject.set(x, "captureIndices", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
