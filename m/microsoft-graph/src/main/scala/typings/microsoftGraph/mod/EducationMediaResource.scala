package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationMediaResource
  extends StObject
     with EducationResource {
  
  // Location of the file on shared point folder. Required
  var fileUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationMediaResource {
  
  inline def apply(): EducationMediaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationMediaResource]
  }
  
  extension [Self <: EducationMediaResource](x: Self) {
    
    inline def setFileUrl(value: NullableOption[String]): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setFileUrlNull: Self = StObject.set(x, "fileUrl", null)
    
    inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
  }
}
