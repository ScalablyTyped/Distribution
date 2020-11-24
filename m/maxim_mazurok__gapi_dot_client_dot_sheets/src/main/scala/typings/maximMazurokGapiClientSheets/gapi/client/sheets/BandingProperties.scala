package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandingProperties extends js.Object {
  
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
  implicit class BandingPropertiesOps[Self <: BandingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstBandColor(value: Color): Self = this.set("firstBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBandColor: Self = this.set("firstBandColor", js.undefined)
    
    @scala.inline
    def setFirstBandColorStyle(value: ColorStyle): Self = this.set("firstBandColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBandColorStyle: Self = this.set("firstBandColorStyle", js.undefined)
    
    @scala.inline
    def setFooterColor(value: Color): Self = this.set("footerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterColor: Self = this.set("footerColor", js.undefined)
    
    @scala.inline
    def setFooterColorStyle(value: ColorStyle): Self = this.set("footerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterColorStyle: Self = this.set("footerColorStyle", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setHeaderColorStyle(value: ColorStyle): Self = this.set("headerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColorStyle: Self = this.set("headerColorStyle", js.undefined)
    
    @scala.inline
    def setSecondBandColor(value: Color): Self = this.set("secondBandColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondBandColor: Self = this.set("secondBandColor", js.undefined)
    
    @scala.inline
    def setSecondBandColorStyle(value: ColorStyle): Self = this.set("secondBandColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondBandColorStyle: Self = this.set("secondBandColorStyle", js.undefined)
  }
}
