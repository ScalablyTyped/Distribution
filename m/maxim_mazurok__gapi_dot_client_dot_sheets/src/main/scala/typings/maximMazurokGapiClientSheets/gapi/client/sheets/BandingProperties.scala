package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandingProperties extends StObject {
  
  /** The first color that is alternating. (Required) */
  var firstBandColor: js.UndefOr[Color] = js.native
  
  /** The first color that is alternating. (Required) If first_band_color is also set, this field takes precedence. */
  var firstBandColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /**
    * The color of the last row or column. If this field is not set, the last row or column is filled with either first_band_color or second_band_color, depending on the color of the
    * previous row or column.
    */
  var footerColor: js.UndefOr[Color] = js.native
  
  /**
    * The color of the last row or column. If this field is not set, the last row or column is filled with either first_band_color or second_band_color, depending on the color of the
    * previous row or column. If footer_color is also set, this field takes precedence.
    */
  var footerColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /**
    * The color of the first row or column. If this field is set, the first row or column is filled with this color and the colors alternate between first_band_color and second_band_color
    * starting from the second row or column. Otherwise, the first row or column is filled with first_band_color and the colors proceed to alternate as they normally would.
    */
  var headerColor: js.UndefOr[Color] = js.native
  
  /**
    * The color of the first row or column. If this field is set, the first row or column is filled with this color and the colors alternate between first_band_color and second_band_color
    * starting from the second row or column. Otherwise, the first row or column is filled with first_band_color and the colors proceed to alternate as they normally would. If
    * header_color is also set, this field takes precedence.
    */
  var headerColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The second color that is alternating. (Required) */
  var secondBandColor: js.UndefOr[Color] = js.native
  
  /** The second color that is alternating. (Required) If second_band_color is also set, this field takes precedence. */
  var secondBandColorStyle: js.UndefOr[ColorStyle] = js.native
}
object BandingProperties {
  
  @scala.inline
  def apply(): BandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandingProperties]
  }
  
  @scala.inline
  implicit class BandingPropertiesMutableBuilder[Self <: BandingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstBandColor(value: Color): Self = StObject.set(x, "firstBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBandColorStyle(value: ColorStyle): Self = StObject.set(x, "firstBandColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBandColorStyleUndefined: Self = StObject.set(x, "firstBandColorStyle", js.undefined)
    
    @scala.inline
    def setFirstBandColorUndefined: Self = StObject.set(x, "firstBandColor", js.undefined)
    
    @scala.inline
    def setFooterColor(value: Color): Self = StObject.set(x, "footerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterColorStyle(value: ColorStyle): Self = StObject.set(x, "footerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterColorStyleUndefined: Self = StObject.set(x, "footerColorStyle", js.undefined)
    
    @scala.inline
    def setFooterColorUndefined: Self = StObject.set(x, "footerColor", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColorStyle(value: ColorStyle): Self = StObject.set(x, "headerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColorStyleUndefined: Self = StObject.set(x, "headerColorStyle", js.undefined)
    
    @scala.inline
    def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
    
    @scala.inline
    def setSecondBandColor(value: Color): Self = StObject.set(x, "secondBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondBandColorStyle(value: ColorStyle): Self = StObject.set(x, "secondBandColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondBandColorStyleUndefined: Self = StObject.set(x, "secondBandColorStyle", js.undefined)
    
    @scala.inline
    def setSecondBandColorUndefined: Self = StObject.set(x, "secondBandColor", js.undefined)
  }
}
