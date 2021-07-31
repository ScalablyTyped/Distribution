package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSetting[T] extends StObject {
  
  var exportable: js.UndefOr[Boolean] = js.undefined
  
  var value: T
}
object NodeSetting {
  
  @scala.inline
  def apply[T](value: T): NodeSetting[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSetting[T]]
  }
  
  @scala.inline
  implicit class NodeSettingMutableBuilder[Self <: NodeSetting[?], T] (val x: Self & NodeSetting[T]) extends AnyVal {
    
    @scala.inline
    def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
