package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationOnPremisesInfo extends StObject {
  
  // Unique identifier for the user object in Active Directory.
  var immutableId: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationOnPremisesInfo {
  
  inline def apply(): EducationOnPremisesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationOnPremisesInfo]
  }
  
  extension [Self <: EducationOnPremisesInfo](x: Self) {
    
    inline def setImmutableId(value: NullableOption[String]): Self = StObject.set(x, "immutableId", value.asInstanceOf[js.Any])
    
    inline def setImmutableIdNull: Self = StObject.set(x, "immutableId", null)
    
    inline def setImmutableIdUndefined: Self = StObject.set(x, "immutableId", js.undefined)
  }
}
