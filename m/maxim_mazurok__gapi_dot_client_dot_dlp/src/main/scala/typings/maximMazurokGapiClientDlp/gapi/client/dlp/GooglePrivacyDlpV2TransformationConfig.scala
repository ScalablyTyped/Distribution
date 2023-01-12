package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransformationConfig extends StObject {
  
  /**
    * De-identify template. If this template is specified, it will serve as the default de-identify template. This template cannot contain `record_transformations` since it can be used
    * for unstructured content such as free-form text files. If this template is not set, a default `ReplaceWithInfoTypeConfig` will be used to de-identify unstructured content.
    */
  var deidentifyTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Image redact template. If this template is specified, it will serve as the de-identify template for images. If this template is not set, all findings in the image will be redacted
    * with a black box.
    */
  var imageRedactTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Structured de-identify template. If this template is specified, it will serve as the de-identify template for structured content such as delimited files and tables. If this template
    * is not set but the `deidentify_template` is set, then `deidentify_template` will also apply to the structured content. If neither template is set, a default
    * `ReplaceWithInfoTypeConfig` will be used to de-identify structured content.
    */
  var structuredDeidentifyTemplate: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TransformationConfig {
  
  inline def apply(): GooglePrivacyDlpV2TransformationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2TransformationConfig] (val x: Self) extends AnyVal {
    
    inline def setDeidentifyTemplate(value: String): Self = StObject.set(x, "deidentifyTemplate", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplateUndefined: Self = StObject.set(x, "deidentifyTemplate", js.undefined)
    
    inline def setImageRedactTemplate(value: String): Self = StObject.set(x, "imageRedactTemplate", value.asInstanceOf[js.Any])
    
    inline def setImageRedactTemplateUndefined: Self = StObject.set(x, "imageRedactTemplate", js.undefined)
    
    inline def setStructuredDeidentifyTemplate(value: String): Self = StObject.set(x, "structuredDeidentifyTemplate", value.asInstanceOf[js.Any])
    
    inline def setStructuredDeidentifyTemplateUndefined: Self = StObject.set(x, "structuredDeidentifyTemplate", js.undefined)
  }
}
