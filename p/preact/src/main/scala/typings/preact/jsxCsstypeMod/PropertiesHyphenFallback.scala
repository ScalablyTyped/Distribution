package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.preact.jsxCsstypeMod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ @js.native
trait PropertiesHyphenFallback[TLength]
  extends StandardPropertiesHyphenFallback[TLength]
     with VendorPropertiesHyphenFallback[TLength]
     with ObsoletePropertiesHyphenFallback[TLength] {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.native
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var `fill-rule`: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  
  var `flood-color`: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  
  var `lighting-color`: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  
  var `marker-end`: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  
  var `marker-start`: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  
  var `stop-color`: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.native
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.native
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.native
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}
object PropertiesHyphenFallback {
  
  @scala.inline
  def apply[TLength](): PropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength]]
  }
  
  @scala.inline
  implicit class PropertiesHyphenFallbackMutableBuilder[Self <: PropertiesHyphenFallback[_], TLength] (val x: Self with PropertiesHyphenFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def `setAlignment-baseline`(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    @scala.inline
    def `setAlignment-baselineVarargs`(value: AlignmentBaselineProperty*): Self = StObject.set(x, "alignment-baseline", js.Array(value :_*))
    
    @scala.inline
    def `setBaseline-shift`(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    @scala.inline
    def `setBaseline-shiftVarargs`(value: BaselineShiftProperty[TLength]*): Self = StObject.set(x, "baseline-shift", js.Array(value :_*))
    
    @scala.inline
    def `setClip-rule`(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    @scala.inline
    def `setClip-ruleVarargs`(value: ClipRuleProperty*): Self = StObject.set(x, "clip-rule", js.Array(value :_*))
    
    @scala.inline
    def `setColor-interpolation`(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    @scala.inline
    def `setColor-interpolationVarargs`(value: ColorInterpolationProperty*): Self = StObject.set(x, "color-interpolation", js.Array(value :_*))
    
    @scala.inline
    def `setColor-rendering`(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    @scala.inline
    def `setColor-renderingVarargs`(value: ColorRenderingProperty*): Self = StObject.set(x, "color-rendering", js.Array(value :_*))
    
    @scala.inline
    def `setDominant-baseline`(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    @scala.inline
    def `setDominant-baselineVarargs`(value: DominantBaselineProperty*): Self = StObject.set(x, "dominant-baseline", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: FillProperty | js.Array[FillProperty]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "fill-opacity", js.Array(value :_*))
    
    @scala.inline
    def `setFill-rule`(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    @scala.inline
    def `setFill-ruleVarargs`(value: FillRuleProperty*): Self = StObject.set(x, "fill-rule", js.Array(value :_*))
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: FillProperty*): Self = StObject.set(x, "fill", js.Array(value :_*))
    
    @scala.inline
    def `setFlood-color`(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    @scala.inline
    def `setFlood-colorVarargs`(value: FloodColorProperty*): Self = StObject.set(x, "flood-color", js.Array(value :_*))
    
    @scala.inline
    def `setFlood-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    @scala.inline
    def `setFlood-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "flood-opacity", js.Array(value :_*))
    
    @scala.inline
    def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    @scala.inline
    def `setGlyph-orientation-verticalVarargs`(value: GlyphOrientationVerticalProperty*): Self = StObject.set(x, "glyph-orientation-vertical", js.Array(value :_*))
    
    @scala.inline
    def `setLighting-color`(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    @scala.inline
    def `setLighting-colorVarargs`(value: LightingColorProperty*): Self = StObject.set(x, "lighting-color", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-end`(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    @scala.inline
    def `setMarker-endVarargs`(value: MarkerEndProperty*): Self = StObject.set(x, "marker-end", js.Array(value :_*))
    
    @scala.inline
    def `setMarker-mid`(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    @scala.inline
    def `setMarker-midVarargs`(value: MarkerMidProperty*): Self = StObject.set(x, "marker-mid", js.Array(value :_*))
    
    @scala.inline
    def `setMarker-start`(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    @scala.inline
    def `setMarker-startVarargs`(value: MarkerStartProperty*): Self = StObject.set(x, "marker-start", js.Array(value :_*))
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMarkerVarargs(value: MarkerProperty*): Self = StObject.set(x, "marker", js.Array(value :_*))
    
    @scala.inline
    def `setShape-rendering`(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    @scala.inline
    def `setShape-renderingVarargs`(value: ShapeRenderingProperty*): Self = StObject.set(x, "shape-rendering", js.Array(value :_*))
    
    @scala.inline
    def `setStop-color`(value: StopColorProperty | js.Array[StopColorProperty]): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    @scala.inline
    def `setStop-colorVarargs`(value: StopColorProperty*): Self = StObject.set(x, "stop-color", js.Array(value :_*))
    
    @scala.inline
    def `setStop-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    @scala.inline
    def `setStop-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stop-opacity", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-dasharrayVarargs`(value: StrokeDasharrayProperty[TLength]*): Self = StObject.set(x, "stroke-dasharray", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    @scala.inline
    def `setStroke-dashoffsetVarargs`(value: StrokeDashoffsetProperty[TLength]*): Self = StObject.set(x, "stroke-dashoffset", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-linecap`(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linecapVarargs`(value: StrokeLinecapProperty*): Self = StObject.set(x, "stroke-linecap", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-linejoin`(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-linejoinVarargs`(value: StrokeLinejoinProperty*): Self = StObject.set(x, "stroke-linejoin", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-miterlimit`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimitVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stroke-miterlimit", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-opacity`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-opacityVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "stroke-opacity", js.Array(value :_*))
    
    @scala.inline
    def `setStroke-width`(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    @scala.inline
    def `setStroke-widthVarargs`(value: StrokeWidthProperty[TLength]*): Self = StObject.set(x, "stroke-width", js.Array(value :_*))
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: StrokeProperty*): Self = StObject.set(x, "stroke", js.Array(value :_*))
    
    @scala.inline
    def `setText-anchor`(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    @scala.inline
    def `setText-anchorVarargs`(value: TextAnchorProperty*): Self = StObject.set(x, "text-anchor", js.Array(value :_*))
    
    @scala.inline
    def `setVector-effect`(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
    
    @scala.inline
    def `setVector-effectVarargs`(value: VectorEffectProperty*): Self = StObject.set(x, "vector-effect", js.Array(value :_*))
  }
}
