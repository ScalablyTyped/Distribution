package typings.nodeHtmlParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("node-html-parser/dist/matcher", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Matcher {
    /**
      * Creates an instance of Matcher.
      * @param {string} selector
      *
      * @memberof Matcher
      */
    def this(selector: String) = this()
  }
  
  @js.native
  trait Matcher extends StObject {
    
    /**
      * Trying to advance match pointer
      * @param  {HTMLElement} el element to make the match
      * @return {bool}           true when pointer advanced.
      */
    def advance(el: typings.nodeHtmlParser.htmlMod.default): Boolean = js.native
    
    /**
      * flush cache to free memory
      */
    def flushCache(): Unit = js.native
    
    /**
      * Trying to determine if match made.
      * @return {bool} true when the match is made
      */
    def matched: Boolean = js.native
    
    var matchers: js.Any = js.native
    
    var nextMatch: js.Any = js.native
    
    /**
      * Rest match pointer.
      * @return {[type]} [description]
      */
    def reset(): Unit = js.native
    
    /**
      * Rewind the match pointer
      */
    def rewind(): Unit = js.native
  }
}
