package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorShorthandProperties[TLength] extends js.Object {
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var MozAnimation: js.UndefOr[AnimationProperty] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var MozBorderImage: js.UndefOr[BorderImageProperty] = js.native
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var MozColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.native
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var MozColumns: js.UndefOr[ColumnsProperty[TLength]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var MozTransition: js.UndefOr[TransitionProperty] = js.native
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var WebkitAnimation: js.UndefOr[AnimationProperty] = js.native
  
  /**
    * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-width'> || <'border-style'> || <'color'>`
    */
  var WebkitBorderBefore: js.UndefOr[WebkitBorderBeforeProperty[TLength]] = js.native
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var WebkitBorderImage: js.UndefOr[BorderImageProperty] = js.native
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    */
  var WebkitBorderRadius: js.UndefOr[BorderRadiusProperty[TLength]] = js.native
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var WebkitColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.native
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var WebkitColumns: js.UndefOr[ColumnsProperty[TLength]] = js.native
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var WebkitFlex: js.UndefOr[FlexProperty[TLength]] = js.native
  
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    */
  var WebkitFlexFlow: js.UndefOr[FlexFlowProperty] = js.native
  
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
    */
  var WebkitMask: js.UndefOr[WebkitMaskProperty[TLength]] = js.native
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    */
  var WebkitTextEmphasis: js.UndefOr[TextEmphasisProperty] = js.native
  
  /**
    * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
    *
    * **Syntax**: `<length> || <color>`
    */
  var WebkitTextStroke: js.UndefOr[WebkitTextStrokeProperty[TLength]] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var WebkitTransition: js.UndefOr[TransitionProperty] = js.native
  
  /**
    * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
    */
  var msContentZoomLimit: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
    */
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnapProperty] = js.native
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var msFlex: js.UndefOr[FlexProperty[TLength]] = js.native
  
  /**
    * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
    *
    * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
    */
  var msScrollLimit: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
    */
  var msScrollSnapX: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
    */
  var msScrollSnapY: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var msTransition: js.UndefOr[TransitionProperty] = js.native
}
object VendorShorthandProperties {
  
  @scala.inline
  def apply[TLength](): VendorShorthandProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandProperties[TLength]]
  }
  
  @scala.inline
  implicit class VendorShorthandPropertiesOps[Self <: VendorShorthandProperties[_], TLength] (val x: Self with VendorShorthandProperties[TLength]) extends AnyVal {
    
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
    def setMozAnimation(value: AnimationProperty): Self = this.set("MozAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimation: Self = this.set("MozAnimation", js.undefined)
    
    @scala.inline
    def setMozBorderImage(value: BorderImageProperty): Self = this.set("MozBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderImage: Self = this.set("MozBorderImage", js.undefined)
    
    @scala.inline
    def setMozColumnRule(value: ColumnRuleProperty[TLength]): Self = this.set("MozColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnRule: Self = this.set("MozColumnRule", js.undefined)
    
    @scala.inline
    def setMozColumns(value: ColumnsProperty[TLength]): Self = this.set("MozColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumns: Self = this.set("MozColumns", js.undefined)
    
    @scala.inline
    def setMozTransition(value: TransitionProperty): Self = this.set("MozTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransition: Self = this.set("MozTransition", js.undefined)
    
    @scala.inline
    def setWebkitAnimation(value: AnimationProperty): Self = this.set("WebkitAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimation: Self = this.set("WebkitAnimation", js.undefined)
    
    @scala.inline
    def setWebkitBorderBefore(value: WebkitBorderBeforeProperty[TLength]): Self = this.set("WebkitBorderBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBefore: Self = this.set("WebkitBorderBefore", js.undefined)
    
    @scala.inline
    def setWebkitBorderImage(value: BorderImageProperty): Self = this.set("WebkitBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderImage: Self = this.set("WebkitBorderImage", js.undefined)
    
    @scala.inline
    def setWebkitBorderRadius(value: BorderRadiusProperty[TLength]): Self = this.set("WebkitBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderRadius: Self = this.set("WebkitBorderRadius", js.undefined)
    
    @scala.inline
    def setWebkitColumnRule(value: ColumnRuleProperty[TLength]): Self = this.set("WebkitColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnRule: Self = this.set("WebkitColumnRule", js.undefined)
    
    @scala.inline
    def setWebkitColumns(value: ColumnsProperty[TLength]): Self = this.set("WebkitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumns: Self = this.set("WebkitColumns", js.undefined)
    
    @scala.inline
    def setWebkitFlex(value: FlexProperty[TLength]): Self = this.set("WebkitFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlex: Self = this.set("WebkitFlex", js.undefined)
    
    @scala.inline
    def setWebkitFlexFlow(value: FlexFlowProperty): Self = this.set("WebkitFlexFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexFlow: Self = this.set("WebkitFlexFlow", js.undefined)
    
    @scala.inline
    def setWebkitMask(value: WebkitMaskProperty[TLength]): Self = this.set("WebkitMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMask: Self = this.set("WebkitMask", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasis(value: TextEmphasisProperty): Self = this.set("WebkitTextEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextEmphasis: Self = this.set("WebkitTextEmphasis", js.undefined)
    
    @scala.inline
    def setWebkitTextStroke(value: WebkitTextStrokeProperty[TLength]): Self = this.set("WebkitTextStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextStroke: Self = this.set("WebkitTextStroke", js.undefined)
    
    @scala.inline
    def setWebkitTransition(value: TransitionProperty): Self = this.set("WebkitTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransition: Self = this.set("WebkitTransition", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimit(value: GlobalsString): Self = this.set("msContentZoomLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomLimit: Self = this.set("msContentZoomLimit", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnap(value: MsContentZoomSnapProperty): Self = this.set("msContentZoomSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomSnap: Self = this.set("msContentZoomSnap", js.undefined)
    
    @scala.inline
    def setMsFlex(value: FlexProperty[TLength]): Self = this.set("msFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFlex: Self = this.set("msFlex", js.undefined)
    
    @scala.inline
    def setMsScrollLimit(value: GlobalsString): Self = this.set("msScrollLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollLimit: Self = this.set("msScrollLimit", js.undefined)
    
    @scala.inline
    def setMsScrollSnapX(value: GlobalsString): Self = this.set("msScrollSnapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollSnapX: Self = this.set("msScrollSnapX", js.undefined)
    
    @scala.inline
    def setMsScrollSnapY(value: GlobalsString): Self = this.set("msScrollSnapY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollSnapY: Self = this.set("msScrollSnapY", js.undefined)
    
    @scala.inline
    def setMsTransition(value: TransitionProperty): Self = this.set("msTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransition: Self = this.set("msTransition", js.undefined)
  }
}
