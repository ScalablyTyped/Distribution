package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificateTemplate extends StObject {
  
  var templateID: String
  
  var templateMajorVersion: js.UndefOr[Double] = js.undefined
  
  var templateMinorVersion: js.UndefOr[Double] = js.undefined
}
object ICertificateTemplate {
  
  inline def apply(templateID: String): ICertificateTemplate = {
    val __obj = js.Dynamic.literal(templateID = templateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICertificateTemplate] (val x: Self) extends AnyVal {
    
    inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersion(value: Double): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: Double): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
