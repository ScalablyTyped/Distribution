package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationPowerPointResource
  extends StObject
     with EducationResource {
  
  // Location of the file on disk.
  var fileUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationPowerPointResource {
  
  inline def apply(): EducationPowerPointResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationPowerPointResource]
  }
  
  extension [Self <: EducationPowerPointResource](x: Self) {
    
    inline def setFileUrl(value: NullableOption[String]): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setFileUrlNull: Self = StObject.set(x, "fileUrl", null)
    
    inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
  }
}
