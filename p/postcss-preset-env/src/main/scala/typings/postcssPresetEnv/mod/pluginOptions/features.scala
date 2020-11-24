package typings.postcssPresetEnv.mod.pluginOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait features extends js.Object {
  
  var `all-property`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `any-link-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `blank-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `break-properties`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `case-insensitive-attributes`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `color-functional-notation`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `color-mod-function`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `custom-media-queries`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `custom-properties`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `custom-selectors`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `dir-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `double-position-gradients`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `environment-variables`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `focus-visible-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `focus-within-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `font-variant-property`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `gap-properties`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `gray-function`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `has-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `hexadecimal-alpha-notation`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `image-set-function`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `lab-function`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `logical-properties-and-values`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `matches-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `media-query-ranges`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `nesting-rules`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `not-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `overflow-property`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `overflow-wrap-property`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `place-properties`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `prefers-color-scheme-query`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `rebeccapurple-color`: js.UndefOr[Boolean | js.Object] = js.native
  
  var `system-ui-font-family`: js.UndefOr[Boolean | js.Object] = js.native
}
object features {
  
  @scala.inline
  def apply(): features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[features]
  }
  
  @scala.inline
  implicit class featuresOps[Self <: features] (val x: Self) extends AnyVal {
    
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
    def `setAll-property`(value: Boolean | js.Object): Self = this.set("all-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAll-property`: Self = this.set("all-property", js.undefined)
    
    @scala.inline
    def `setAny-link-pseudo-class`(value: Boolean | js.Object): Self = this.set("any-link-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAny-link-pseudo-class`: Self = this.set("any-link-pseudo-class", js.undefined)
    
    @scala.inline
    def `setBlank-pseudo-class`(value: Boolean | js.Object): Self = this.set("blank-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlank-pseudo-class`: Self = this.set("blank-pseudo-class", js.undefined)
    
    @scala.inline
    def `setBreak-properties`(value: Boolean | js.Object): Self = this.set("break-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBreak-properties`: Self = this.set("break-properties", js.undefined)
    
    @scala.inline
    def `setCase-insensitive-attributes`(value: Boolean | js.Object): Self = this.set("case-insensitive-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCase-insensitive-attributes`: Self = this.set("case-insensitive-attributes", js.undefined)
    
    @scala.inline
    def `setColor-functional-notation`(value: Boolean | js.Object): Self = this.set("color-functional-notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-functional-notation`: Self = this.set("color-functional-notation", js.undefined)
    
    @scala.inline
    def `setColor-mod-function`(value: Boolean | js.Object): Self = this.set("color-mod-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-mod-function`: Self = this.set("color-mod-function", js.undefined)
    
    @scala.inline
    def `setCustom-media-queries`(value: Boolean | js.Object): Self = this.set("custom-media-queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCustom-media-queries`: Self = this.set("custom-media-queries", js.undefined)
    
    @scala.inline
    def `setCustom-properties`(value: Boolean | js.Object): Self = this.set("custom-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCustom-properties`: Self = this.set("custom-properties", js.undefined)
    
    @scala.inline
    def `setCustom-selectors`(value: Boolean | js.Object): Self = this.set("custom-selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCustom-selectors`: Self = this.set("custom-selectors", js.undefined)
    
    @scala.inline
    def `setDir-pseudo-class`(value: Boolean | js.Object): Self = this.set("dir-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDir-pseudo-class`: Self = this.set("dir-pseudo-class", js.undefined)
    
    @scala.inline
    def `setDouble-position-gradients`(value: Boolean | js.Object): Self = this.set("double-position-gradients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDouble-position-gradients`: Self = this.set("double-position-gradients", js.undefined)
    
    @scala.inline
    def `setEnvironment-variables`(value: Boolean | js.Object): Self = this.set("environment-variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEnvironment-variables`: Self = this.set("environment-variables", js.undefined)
    
    @scala.inline
    def `setFocus-visible-pseudo-class`(value: Boolean | js.Object): Self = this.set("focus-visible-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFocus-visible-pseudo-class`: Self = this.set("focus-visible-pseudo-class", js.undefined)
    
    @scala.inline
    def `setFocus-within-pseudo-class`(value: Boolean | js.Object): Self = this.set("focus-within-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFocus-within-pseudo-class`: Self = this.set("focus-within-pseudo-class", js.undefined)
    
    @scala.inline
    def `setFont-variant-property`(value: Boolean | js.Object): Self = this.set("font-variant-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variant-property`: Self = this.set("font-variant-property", js.undefined)
    
    @scala.inline
    def `setGap-properties`(value: Boolean | js.Object): Self = this.set("gap-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGap-properties`: Self = this.set("gap-properties", js.undefined)
    
    @scala.inline
    def `setGray-function`(value: Boolean | js.Object): Self = this.set("gray-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGray-function`: Self = this.set("gray-function", js.undefined)
    
    @scala.inline
    def `setHas-pseudo-class`(value: Boolean | js.Object): Self = this.set("has-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHas-pseudo-class`: Self = this.set("has-pseudo-class", js.undefined)
    
    @scala.inline
    def `setHexadecimal-alpha-notation`(value: Boolean | js.Object): Self = this.set("hexadecimal-alpha-notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHexadecimal-alpha-notation`: Self = this.set("hexadecimal-alpha-notation", js.undefined)
    
    @scala.inline
    def `setImage-set-function`(value: Boolean | js.Object): Self = this.set("image-set-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteImage-set-function`: Self = this.set("image-set-function", js.undefined)
    
    @scala.inline
    def `setLab-function`(value: Boolean | js.Object): Self = this.set("lab-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLab-function`: Self = this.set("lab-function", js.undefined)
    
    @scala.inline
    def `setLogical-properties-and-values`(value: Boolean | js.Object): Self = this.set("logical-properties-and-values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLogical-properties-and-values`: Self = this.set("logical-properties-and-values", js.undefined)
    
    @scala.inline
    def `setMatches-pseudo-class`(value: Boolean | js.Object): Self = this.set("matches-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMatches-pseudo-class`: Self = this.set("matches-pseudo-class", js.undefined)
    
    @scala.inline
    def `setMedia-query-ranges`(value: Boolean | js.Object): Self = this.set("media-query-ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMedia-query-ranges`: Self = this.set("media-query-ranges", js.undefined)
    
    @scala.inline
    def `setNesting-rules`(value: Boolean | js.Object): Self = this.set("nesting-rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNesting-rules`: Self = this.set("nesting-rules", js.undefined)
    
    @scala.inline
    def `setNot-pseudo-class`(value: Boolean | js.Object): Self = this.set("not-pseudo-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNot-pseudo-class`: Self = this.set("not-pseudo-class", js.undefined)
    
    @scala.inline
    def `setOverflow-property`(value: Boolean | js.Object): Self = this.set("overflow-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOverflow-property`: Self = this.set("overflow-property", js.undefined)
    
    @scala.inline
    def `setOverflow-wrap-property`(value: Boolean | js.Object): Self = this.set("overflow-wrap-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOverflow-wrap-property`: Self = this.set("overflow-wrap-property", js.undefined)
    
    @scala.inline
    def `setPlace-properties`(value: Boolean | js.Object): Self = this.set("place-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePlace-properties`: Self = this.set("place-properties", js.undefined)
    
    @scala.inline
    def `setPrefers-color-scheme-query`(value: Boolean | js.Object): Self = this.set("prefers-color-scheme-query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePrefers-color-scheme-query`: Self = this.set("prefers-color-scheme-query", js.undefined)
    
    @scala.inline
    def `setRebeccapurple-color`(value: Boolean | js.Object): Self = this.set("rebeccapurple-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteRebeccapurple-color`: Self = this.set("rebeccapurple-color", js.undefined)
    
    @scala.inline
    def `setSystem-ui-font-family`(value: Boolean | js.Object): Self = this.set("system-ui-font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSystem-ui-font-family`: Self = this.set("system-ui-font-family", js.undefined)
  }
}
