package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceHyphen extends js.Object {
  
  var `-moz-font-feature-settings`: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.native
  
  var `font-display`: js.UndefOr[FontFaceFontDisplayProperty] = js.native
  
  var `font-family`: js.UndefOr[String] = js.native
  
  var `font-feature-settings`: js.UndefOr[FontFaceFontFeatureSettingsProperty] = js.native
  
  var `font-stretch`: js.UndefOr[FontFaceFontStretchProperty] = js.native
  
  var `font-style`: js.UndefOr[FontFaceFontStyleProperty] = js.native
  
  var `font-variant`: js.UndefOr[FontFaceFontVariantProperty] = js.native
  
  var `font-variation-settings`: js.UndefOr[FontFaceFontVariationSettingsProperty] = js.native
  
  var `font-weight`: js.UndefOr[FontFaceFontWeightProperty] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var `unicode-range`: js.UndefOr[String] = js.native
}
object FontFaceHyphen {
  
  @scala.inline
  def apply(): FontFaceHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceHyphen]
  }
  
  @scala.inline
  implicit class FontFaceHyphenOps[Self <: FontFaceHyphen] (val x: Self) extends AnyVal {
    
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
    def `set-moz-font-feature-settings`(value: FontFaceFontFeatureSettingsProperty): Self = this.set("-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-moz-font-feature-settings`: Self = this.set("-moz-font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-display`(value: FontFaceFontDisplayProperty): Self = this.set("font-display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-display`: Self = this.set("font-display", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-feature-settings`(value: FontFaceFontFeatureSettingsProperty): Self = this.set("font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-feature-settings`: Self = this.set("font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-stretch`(value: FontFaceFontStretchProperty): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: FontFaceFontStyleProperty): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    
    @scala.inline
    def `setFont-variant`(value: FontFaceFontVariantProperty): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    
    @scala.inline
    def `setFont-variation-settings`(value: FontFaceFontVariationSettingsProperty): Self = this.set("font-variation-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variation-settings`: Self = this.set("font-variation-settings", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: FontFaceFontWeightProperty): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def `setUnicode-range`(value: String): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUnicode-range`: Self = this.set("unicode-range", js.undefined)
  }
}
