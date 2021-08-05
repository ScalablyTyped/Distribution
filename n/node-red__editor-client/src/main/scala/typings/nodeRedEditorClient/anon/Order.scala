package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientStrings.reorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var order: js.UndefOr[js.Object] = js.undefined
  
  var t: reorder
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal(t = "reorder")
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setT(value: reorder): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
