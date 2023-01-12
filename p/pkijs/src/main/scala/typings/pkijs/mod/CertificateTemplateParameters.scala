package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificateTemplate> */
trait CertificateTemplateParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var templateID: js.UndefOr[String] = js.undefined
  
  var templateMajorVersion: js.UndefOr[Double] = js.undefined
  
  var templateMinorVersion: js.UndefOr[Double] = js.undefined
}
object CertificateTemplateParameters {
  
  inline def apply(): CertificateTemplateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateTemplateParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateTemplateParameters] (val x: Self) extends AnyVal {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
    
    inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
    
    inline def setTemplateMajorVersion(value: Double): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: Double): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
