package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnDescriptor[T] extends StObject {
  
  var exists: Boolean
  
  var name: String
  
  var source: T
  
  var value: Any
}
object IColumnDescriptor {
  
  inline def apply[T](exists: Boolean, name: String, source: T, value: Any): IColumnDescriptor[T] = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDescriptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColumnDescriptor[?], T] (val x: Self & IColumnDescriptor[T]) extends AnyVal {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
