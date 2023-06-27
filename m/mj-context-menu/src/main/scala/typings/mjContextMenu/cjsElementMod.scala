package typings.mjContextMenu

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsElementMod {
  
  trait Element extends StObject {
    
    def generateHtml(): Unit
    
    var html: HTMLElement
  }
  object Element {
    
    inline def apply(generateHtml: () => Unit, html: HTMLElement): Element = {
      val __obj = js.Dynamic.literal(generateHtml = js.Any.fromFunction0(generateHtml), html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setGenerateHtml(value: () => Unit): Self = StObject.set(x, "generateHtml", js.Any.fromFunction0(value))
      
      inline def setHtml(value: HTMLElement): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
}
