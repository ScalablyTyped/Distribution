package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnDescriptor[S] extends StObject {
  
  var exists: Boolean
  
  var name: String
  
  var source: S
  
  var value: js.Any
}
object IColumnDescriptor {
  
  @scala.inline
  def apply[S](exists: Boolean, name: String, source: S, value: js.Any): IColumnDescriptor[S] = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDescriptor[S]]
  }
  
  @scala.inline
  implicit class IColumnDescriptorMutableBuilder[Self <: IColumnDescriptor[?], S] (val x: Self & IColumnDescriptor[S]) extends AnyVal {
    
    @scala.inline
    def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: S): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
