package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAnswerString
  extends StObject
     with AccessPackageAnswer {
  
  // The value stored on the requestor's user profile, if this answer is configured to be stored as a specific attribute.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageAnswerString {
  
  inline def apply(): AccessPackageAnswerString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAnswerString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAnswerString] (val x: Self) extends AnyVal {
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
