package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSetting[T] extends StObject {
  
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  var value: T
}
object NodeSetting {
  
  inline def apply[T](value: T): NodeSetting[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSetting[T]]
  }
  
  extension [Self <: NodeSetting[?], T](x: Self & NodeSetting[T]) {
    
    inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
