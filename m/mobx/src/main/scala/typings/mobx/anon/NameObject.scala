package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameObject[T]
  extends StObject
     with IObjectDidChange[T] {
  
  var name: PropertyKey
  
  var `object`: T
  
  var oldValue: js.Any
  
  var `type`: remove
}
object NameObject {
  
  @scala.inline
  def apply[T](name: PropertyKey, `object`: T, oldValue: js.Any): NameObject[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[NameObject[T]]
  }
  
  @scala.inline
  implicit class NameObjectMutableBuilder[Self <: NameObject[?], T] (val x: Self & NameObject[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: PropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
