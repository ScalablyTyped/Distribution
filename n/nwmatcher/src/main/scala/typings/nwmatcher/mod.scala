package typings.nwmatcher

import typings.nwmatcher.anon.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(global: Document): Matcher = ^.asInstanceOf[js.Dynamic].apply(global.asInstanceOf[js.Any]).asInstanceOf[Matcher]
  
  @JSImport("nwmatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object NW {
      
      @JSGlobal("NW.Dom")
      @js.native
      val Dom: Matcher = js.native
    }
  }
  
  @js.native
  trait Matcher extends StObject {
    
    def byClass(className: String): js.Array[Element] = js.native
    def byClass(className: String, from: Element): js.Array[Element] = js.native
    
    // DOM Helpers
    def byId(id: String): Element | Null = js.native
    def byId(id: String, from: Element): Element | Null = js.native
    
    def byName(name: String): js.Array[Element] = js.native
    def byName(name: String, from: Element): js.Array[Element] = js.native
    
    def byTag(tag: String): js.Array[Element] = js.native
    def byTag(tag: String, from: Element): js.Array[Element] = js.native
    
    // DOM Selection
    def first(selector: String): Element | Null = js.native
    def first(selector: String, context: Element): Element | Null = js.native
    
    def getAttribute(element: Element, attribute: String): js.UndefOr[String] = js.native
    
    def hasAttribute(element: Element, attribute: String): Boolean = js.native
    
    def `match`(element: Element, selector: String): Boolean = js.native
    def `match`(element: Element, selector: String, context: Element): Boolean = js.native
    
    def select(selector: String): js.Array[Element] = js.native
    def select(selector: String, context: Unit, callback: js.Function1[/* element */ Element, Unit]): js.Array[Element] = js.native
    def select(selector: String, context: Element): js.Array[Element] = js.native
    def select(selector: String, context: Element, callback: js.Function1[/* element */ Element, Unit]): js.Array[Element] = js.native
  }
}
