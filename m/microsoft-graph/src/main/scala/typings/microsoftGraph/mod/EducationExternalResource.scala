package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationExternalResource
  extends StObject
     with EducationResource {
  
  // Location of the resource. Required
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationExternalResource {
  
  inline def apply(): EducationExternalResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationExternalResource]
  }
  
  extension [Self <: EducationExternalResource](x: Self) {
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
