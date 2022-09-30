package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateID extends StObject {
  
  var templateID: js.UndefOr[String] = js.undefined
  
  var templateMajorVersion: js.UndefOr[String] = js.undefined
  
  var templateMinorVersion: js.UndefOr[String] = js.undefined
}
object TemplateID {
  
  inline def apply(): TemplateID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateID]
  }
  
  extension [Self <: TemplateID](x: Self) {
    
    inline def setTemplateID(value: String): Self = StObject.set(x, "templateID", value.asInstanceOf[js.Any])
    
    inline def setTemplateIDUndefined: Self = StObject.set(x, "templateID", js.undefined)
    
    inline def setTemplateMajorVersion(value: String): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMajorVersionUndefined: Self = StObject.set(x, "templateMajorVersion", js.undefined)
    
    inline def setTemplateMinorVersion(value: String): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
  }
}
