package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  var container: JQuery[HTMLElement]
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var singleExpanded: js.UndefOr[Boolean] = js.undefined
}
object Fill {
  
  inline def apply(container: JQuery[HTMLElement]): Fill = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  extension [Self <: Fill](x: Self) {
    
    inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
    
    inline def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
  }
}
