package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationExcelResource
  extends StObject
     with EducationResource {
  
  // Pointer to the Excel file object.
  var fileUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationExcelResource {
  
  inline def apply(): EducationExcelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationExcelResource]
  }
  
  extension [Self <: EducationExcelResource](x: Self) {
    
    inline def setFileUrl(value: NullableOption[String]): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setFileUrlNull: Self = StObject.set(x, "fileUrl", null)
    
    inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
  }
}
