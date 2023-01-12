package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.CellValueType.webImage
import typings.officeJsPreview.Excel.RangeValueType.error
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.NumbersignVALUEExclamationmark
import typings.officeJsPreview.officeJsPreviewStrings.WebImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the value of a cell containing an image downloaded from the internet.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait WebImageCellValue extends StObject {
  
  /**
    * Represents the URL from which the image will be downloaded.
    * This image must be hosted on a server that supports HTTPS.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var address: String
  
  /**
    * Represents the alternate text that can be used in accessibility scenarios to describe what the image represents.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var altText: js.UndefOr[String] = js.undefined
  
  /**
    * Represents attribution information to describe the source and license requirements for using this image.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
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
    * Represents information that describes the entity or individual who provided the image.
    * This information can be used for branding in image cards.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var provider: js.UndefOr[CellValueProviderAttributes] = js.undefined
  
  /**
    * Represents the URL of a webpage with images that are considered related to this `WebImageCellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var relatedImagesAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the type of this cell value.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var `type`: webImage | WebImage
}
object WebImageCellValue {
  
  inline def apply(address: String, `type`: webImage | WebImage): WebImageCellValue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebImageCellValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebImageCellValue] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setAttribution(value: js.Array[CellValueAttributionAttributes]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setAttributionVarargs(value: CellValueAttributionAttributes*): Self = StObject.set(x, "attribution", js.Array(value*))
    
    inline def setBasicType(value: error | Error): Self = StObject.set(x, "basicType", value.asInstanceOf[js.Any])
    
    inline def setBasicTypeUndefined: Self = StObject.set(x, "basicType", js.undefined)
    
    inline def setBasicValue(value: NumbersignVALUEExclamationmark | String): Self = StObject.set(x, "basicValue", value.asInstanceOf[js.Any])
    
    inline def setBasicValueUndefined: Self = StObject.set(x, "basicValue", js.undefined)
    
    inline def setProvider(value: CellValueProviderAttributes): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRelatedImagesAddress(value: String): Self = StObject.set(x, "relatedImagesAddress", value.asInstanceOf[js.Any])
    
    inline def setRelatedImagesAddressUndefined: Self = StObject.set(x, "relatedImagesAddress", js.undefined)
    
    inline def setType(value: webImage | WebImage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
