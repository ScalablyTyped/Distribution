package typings.nodeHtmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-html-parser/dist/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  
  @js.native
  trait Matcher extends js.Object {
    
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
  
  @js.native
  class default protected () extends Matcher {
    /**
      * Creates an instance of Matcher.
      * @param {string} selector
      *
      * @memberof Matcher
      */
    def this(selector: String) = this()
  }
}
