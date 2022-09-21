package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of one type of object.
  */
trait IObjectCollection[T] extends StObject {
  
  /**
    * An array container for objects when a collection of objects is
    * returned.
    */
  var data: js.Array[T]
}
object IObjectCollection {
  
  inline def apply[T](data: js.Array[T]): IObjectCollection[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectCollection[T]]
  }
  
  extension [Self <: IObjectCollection[?], T](x: Self & IObjectCollection[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
