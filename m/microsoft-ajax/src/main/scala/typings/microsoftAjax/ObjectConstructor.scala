package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor extends StObject {
  
  /**
    * Formats a number by using the invariant culture.
    */
  def getType(instance: js.Any): Type = js.native
  
  /**
    * Returns a string that identifies the run-time type name of an object.
    */
  def getTypeName(instance: js.Any): java.lang.String = js.native
}
object ObjectConstructor {
  
  @scala.inline
  def apply(getType: js.Any => Type, getTypeName: js.Any => java.lang.String): ObjectConstructor = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), getTypeName = js.Any.fromFunction1(getTypeName))
    __obj.asInstanceOf[ObjectConstructor]
  }
  
  @scala.inline
  implicit class ObjectConstructorMutableBuilder[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetType(value: js.Any => Type): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeName(value: js.Any => java.lang.String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction1(value))
  }
}
