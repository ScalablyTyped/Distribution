package typings.oojsUi.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultClasses extends StObject {
  
  /**
    * Get a default set of classes to be registered on construction.
    *
    * @return Default classes
    */
  def getDefaultClasses(): js.Array[Instantiable1[/* args (repeated) */ Any, Any]]
}
object GetDefaultClasses {
  
  inline def apply(getDefaultClasses: () => js.Array[Instantiable1[/* args (repeated) */ Any, Any]]): GetDefaultClasses = {
    val __obj = js.Dynamic.literal(getDefaultClasses = js.Any.fromFunction0(getDefaultClasses))
    __obj.asInstanceOf[GetDefaultClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDefaultClasses] (val x: Self) extends AnyVal {
    
    inline def setGetDefaultClasses(value: () => js.Array[Instantiable1[/* args (repeated) */ Any, Any]]): Self = StObject.set(x, "getDefaultClasses", js.Any.fromFunction0(value))
  }
}
