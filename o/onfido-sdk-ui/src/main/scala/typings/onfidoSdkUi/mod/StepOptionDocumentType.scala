package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in onfido-sdk-ui.onfido-sdk-ui.DocumentTypes ]:? Key extends 'generic_document'? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig} */
trait StepOptionDocumentType extends StObject {
  
  var driving_licence: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'driving_licence' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
  ] = js.undefined
  
  var generic_document: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'generic_document' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
  ] = js.undefined
  
  var national_identity_card: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'national_identity_card' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
  ] = js.undefined
  
  var passport: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'passport' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
  ] = js.undefined
  
  var residence_permit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: 'residence_permit' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
  ] = js.undefined
}
object StepOptionDocumentType {
  
  inline def apply(): StepOptionDocumentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionDocumentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionDocumentType] (val x: Self) extends AnyVal {
    
    inline def setDriving_licence(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'driving_licence' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
    ): Self = StObject.set(x, "driving_licence", value.asInstanceOf[js.Any])
    
    inline def setDriving_licenceUndefined: Self = StObject.set(x, "driving_licence", js.undefined)
    
    inline def setGeneric_document(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'generic_document' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
    ): Self = StObject.set(x, "generic_document", value.asInstanceOf[js.Any])
    
    inline def setGeneric_documentUndefined: Self = StObject.set(x, "generic_document", js.undefined)
    
    inline def setNational_identity_card(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'national_identity_card' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
    ): Self = StObject.set(x, "national_identity_card", value.asInstanceOf[js.Any])
    
    inline def setNational_identity_cardUndefined: Self = StObject.set(x, "national_identity_card", js.undefined)
    
    inline def setPassport(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'passport' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
    ): Self = StObject.set(x, "passport", value.asInstanceOf[js.Any])
    
    inline def setPassportUndefined: Self = StObject.set(x, "passport", js.undefined)
    
    inline def setResidence_permit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: 'residence_permit' extends 'generic_document' ? onfido-sdk-ui.onfido-sdk-ui.CustomConfig : onfido-sdk-ui.onfido-sdk-ui.DocumentTypeConfig */ js.Any
    ): Self = StObject.set(x, "residence_permit", value.asInstanceOf[js.Any])
    
    inline def setResidence_permitUndefined: Self = StObject.set(x, "residence_permit", js.undefined)
  }
}
