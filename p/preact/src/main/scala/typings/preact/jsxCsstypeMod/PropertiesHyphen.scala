package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.preact.jsxCsstypeMod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphen[TLength]
  extends StObject
     with StandardPropertiesHyphen[TLength]
     with VendorPropertiesHyphen[TLength]
     with ObsoletePropertiesHyphen[TLength] {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.undefined
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.undefined
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.undefined
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.undefined
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.undefined
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.undefined
  
  var fill: js.UndefOr[FillProperty] = js.undefined
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.undefined
  
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.undefined
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.undefined
  
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.undefined
  
  var marker: js.UndefOr[MarkerProperty] = js.undefined
  
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.undefined
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.undefined
  
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.undefined
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.undefined
  
  var `stop-color`: js.UndefOr[StopColorProperty] = js.undefined
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var stroke: js.UndefOr[StrokeProperty] = js.undefined
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.undefined
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.undefined
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.undefined
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.undefined
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.undefined
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.undefined
}
object PropertiesHyphen {
  
  inline def apply[TLength](): PropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphen[TLength]]
  }
  
  extension [Self <: PropertiesHyphen[?], TLength](x: Self & PropertiesHyphen[TLength]) {
    
    inline def `setAlignment-baseline`(value: AlignmentBaselineProperty): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    inline def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    inline def `setBaseline-shift`(value: BaselineShiftProperty[TLength]): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    inline def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    inline def `setClip-rule`(value: ClipRuleProperty): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    inline def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    inline def `setColor-interpolation`(value: ColorInterpolationProperty): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    inline def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    inline def `setColor-rendering`(value: ColorRenderingProperty): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    inline def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    inline def `setDominant-baseline`(value: DominantBaselineProperty): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    inline def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    inline def setFill(value: FillProperty): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: GlobalsNumber): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-rule`(value: FillRuleProperty): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def `setFlood-color`(value: FloodColorProperty): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    inline def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    inline def `setFlood-opacity`(value: GlobalsNumber): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    inline def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    inline def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    inline def `setLighting-color`(value: LightingColorProperty): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    inline def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    inline def setMarker(value: MarkerProperty): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMarker-end`(value: MarkerEndProperty): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    inline def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    inline def `setMarker-mid`(value: MarkerMidProperty): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    inline def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    inline def `setMarker-start`(value: MarkerStartProperty): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    inline def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def `setShape-rendering`(value: ShapeRenderingProperty): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    inline def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    inline def `setStop-color`(value: StopColorProperty): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    inline def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    inline def `setStop-opacity`(value: GlobalsNumber): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    inline def setStroke(value: StrokeProperty): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength]): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    inline def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength]): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    inline def `setStroke-linecap`(value: StrokeLinecapProperty): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    inline def `setStroke-linejoin`(value: StrokeLinejoinProperty): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    inline def `setStroke-miterlimit`(value: GlobalsNumber): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    inline def `setStroke-opacity`(value: GlobalsNumber): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    inline def `setStroke-width`(value: StrokeWidthProperty[TLength]): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def `setText-anchor`(value: TextAnchorProperty): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setVector-effect`(value: VectorEffectProperty): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    inline def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
  }
}
