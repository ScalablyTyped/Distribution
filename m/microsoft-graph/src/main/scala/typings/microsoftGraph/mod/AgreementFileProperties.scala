package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgreementFileProperties
  extends StObject
     with Entity {
  
  /**
    * The date time representing when the file was created.The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Localized display name of the policy file of an agreement. The localized display name is shown to end users who view
    * the agreement.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Data that represents the terms of use PDF document. Read-only.
  var fileData: js.UndefOr[NullableOption[AgreementFileData]] = js.undefined
  
  // Name of the agreement file (for example, TOU.pdf). Read-only.
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If none of the languages matches the client preference, indicates whether this is the default agreement file . If none
    * of the files are marked as default, the first one is treated as the default. Read-only.
    */
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the agreement file is a major version update. Major version updates invalidate the agreement's
    * acceptances on the corresponding language.
    */
  var isMajorVersion: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The language of the agreement file in the format 'languagecode2-country/regioncode2'. 'languagecode2' is a lowercase
    * two-letter code derived from ISO 639-1, while 'country/regioncode2' is derived from ISO 3166 and usually consists of
    * two uppercase letters, or a BCP-47 language tag. For example, U.S. English is en-US. Read-only.
    */
  var language: js.UndefOr[NullableOption[String]] = js.undefined
}
object AgreementFileProperties {
  
  inline def apply(): AgreementFileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreementFileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgreementFileProperties] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFileData(value: NullableOption[AgreementFileData]): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
    
    inline def setFileDataNull: Self = StObject.set(x, "fileData", null)
    
    inline def setFileDataUndefined: Self = StObject.set(x, "fileData", js.undefined)
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setIsDefault(value: NullableOption[Boolean]): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIsMajorVersion(value: NullableOption[Boolean]): Self = StObject.set(x, "isMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setIsMajorVersionNull: Self = StObject.set(x, "isMajorVersion", null)
    
    inline def setIsMajorVersionUndefined: Self = StObject.set(x, "isMajorVersion", js.undefined)
    
    inline def setLanguage(value: NullableOption[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
