package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationFileResource
  extends StObject
     with EducationResource {
  
  // Location on disk of the file resource.
  var fileUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationFileResource {
  
  inline def apply(): EducationFileResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationFileResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationFileResource] (val x: Self) extends AnyVal {
    
    inline def setFileUrl(value: NullableOption[String]): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setFileUrlNull: Self = StObject.set(x, "fileUrl", null)
    
    inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
  }
}
