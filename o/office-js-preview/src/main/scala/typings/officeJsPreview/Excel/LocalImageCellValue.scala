package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.localImage
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.LocalImage
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignVALUEExclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing a locally stored or generated image.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LocalImageCellValue extends StObject {
  
  /**
    * Represents the alternate text used in accessibility scenarios to describe what the image represents.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var altText: js.UndefOr[String] = js.undefined
  
  /**
    * Represents attribution information to describe the source and license requirements for this image.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var attribution: js.UndefOr[js.Array[CellValueAttributionAttributes]] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.valueTypes` for a cell with this value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicType: js.UndefOr[error | Error] = js.undefined
  
  /**
    * Represents the value that would be returned by `Range.values` for a cell with this value.
    * When accessed through a `valuesAsJson` property, this string value aligns with the en-US locale.
    * When accessed through a `valuesAsJsonLocal` property, this string value aligns with the user's display locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var basicValue: js.UndefOr[NumbersignVALUEExclamationmark | String] = js.undefined
  
  /**
    * Represents the image itself, either cached or encoded.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var image: LocalImageCellValueCacheId | Base64EncodedImage
  
  /**
    * Represents information that describes the entity or individual who provided the image.
    * This information is used for branding purposes in image cards.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var provider: js.UndefOr[CellValueProviderAttributes] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: localImage | LocalImage
}
object LocalImageCellValue {
  
  inline def apply(image: LocalImageCellValueCacheId | Base64EncodedImage, `type`: localImage | LocalImage): LocalImageCellValue = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalImageCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalImageCellValue] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setAttribution(value: js.Array[CellValueAttributionAttributes]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setAttributionVarargs(value: CellValueAttributionAttributes*): Self = StObject.set(x, "attribution", js.Array(value*))
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setImage(value: LocalImageCellValueCacheId | Base64EncodedImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: CellValueProviderAttributes): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setType(value: localImage | LocalImage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
