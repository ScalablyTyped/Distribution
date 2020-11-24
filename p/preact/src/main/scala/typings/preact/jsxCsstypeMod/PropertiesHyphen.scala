package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.preact.jsxCsstypeMod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ @js.native
trait PropertiesHyphen[TLength]
  extends StandardLonghandPropertiesHyphen[TLength]
     with StandardShorthandPropertiesHyphen[TLength]
     with VendorLonghandPropertiesHyphen[TLength]
     with VendorShorthandPropertiesHyphen[TLength]
     with ObsoletePropertiesHyphen[TLength] {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.native
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.native
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.native
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.native
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.native
  
  var fill: js.UndefOr[FillProperty] = js.native
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.native
  
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.native
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.native
  
  var marker: js.UndefOr[MarkerProperty] = js.native
  
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.native
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.native
  
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.native
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.native
  
  var `stop-color`: js.UndefOr[StopColorProperty] = js.native
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var stroke: js.UndefOr[StrokeProperty] = js.native
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.native
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.native
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.native
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.native
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.native
}
object PropertiesHyphen {
  
  @scala.inline
  def apply[TLength](): PropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphen[TLength]]
  }
  
  @scala.inline
  implicit class PropertiesHyphenOps[Self <: PropertiesHyphen[_], TLength] (val x: Self with PropertiesHyphen[TLength]) extends AnyVal {
    
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
    def `setAlignment-baseline`(value: AlignmentBaselineProperty): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    
    @scala.inline
    def `setBaseline-shift`(value: BaselineShiftProperty[TLength]): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    
    @scala.inline
    def `setClip-rule`(value: ClipRuleProperty): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    
    @scala.inline
    def `setColor-interpolation`(value: ColorInterpolationProperty): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    
    @scala.inline
    def `setColor-rendering`(value: ColorRenderingProperty): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    
    @scala.inline
    def `setDominant-baseline`(value: DominantBaselineProperty): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    
    @scala.inline
    def setFill(value: FillProperty): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: GlobalsNumber): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-rule`(value: FillRuleProperty): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    
    @scala.inline
    def `setFlood-color`(value: FloodColorProperty): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    
    @scala.inline
    def `setFlood-opacity`(value: GlobalsNumber): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    
    @scala.inline
    def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    
    @scala.inline
    def `setLighting-color`(value: LightingColorProperty): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerProperty): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def `setMarker-end`(value: MarkerEndProperty): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    
    @scala.inline
    def `setMarker-mid`(value: MarkerMidProperty): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    
    @scala.inline
    def `setMarker-start`(value: MarkerStartProperty): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    
    @scala.inline
    def `setShape-rendering`(value: ShapeRenderingProperty): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    
    @scala.inline
    def `setStop-color`(value: StopColorProperty): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    
    @scala.inline
    def `setStop-opacity`(value: GlobalsNumber): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: StrokeProperty): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength]): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength]): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    
    @scala.inline
    def `setStroke-linecap`(value: StrokeLinecapProperty): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linejoin`(value: StrokeLinejoinProperty): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimit`(value: GlobalsNumber): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: GlobalsNumber): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: StrokeWidthProperty[TLength]): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: TextAnchorProperty): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    
    @scala.inline
    def `setVector-effect`(value: VectorEffectProperty): Self = this.set("vector-effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVector-effect`: Self = this.set("vector-effect", js.undefined)
  }
}
