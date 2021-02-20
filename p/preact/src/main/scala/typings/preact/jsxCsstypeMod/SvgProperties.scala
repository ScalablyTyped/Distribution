package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvgProperties[TLength] extends StObject {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.native
  
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  
  var clip: js.UndefOr[ClipProperty] = js.native
  
  var clipPath: js.UndefOr[ClipPathProperty] = js.native
  
  var clipRule: js.UndefOr[ClipRuleProperty] = js.native
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.native
  
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.native
  
  var cursor: js.UndefOr[CursorProperty] = js.native
  
  var direction: js.UndefOr[DirectionProperty] = js.native
  
  var display: js.UndefOr[DisplayProperty] = js.native
  
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.native
  
  var fill: js.UndefOr[FillProperty] = js.native
  
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var fillRule: js.UndefOr[FillRuleProperty] = js.native
  
  var filter: js.UndefOr[FilterProperty] = js.native
  
  var floodColor: js.UndefOr[FloodColorProperty] = js.native
  
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var font: js.UndefOr[FontProperty] = js.native
  
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  
  var fontSize: js.UndefOr[FontSizeProperty[TLength]] = js.native
  
  var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty] = js.native
  
  var fontStretch: js.UndefOr[FontStretchProperty] = js.native
  
  var fontStyle: js.UndefOr[FontStyleProperty] = js.native
  
  var fontVariant: js.UndefOr[FontVariantProperty] = js.native
  
  var fontWeight: js.UndefOr[FontWeightProperty] = js.native
  
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  
  var imageRendering: js.UndefOr[ImageRenderingProperty] = js.native
  
  var letterSpacing: js.UndefOr[LetterSpacingProperty[TLength]] = js.native
  
  var lightingColor: js.UndefOr[LightingColorProperty] = js.native
  
  var lineHeight: js.UndefOr[LineHeightProperty[TLength]] = js.native
  
  var marker: js.UndefOr[MarkerProperty] = js.native
  
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.native
  
  var markerMid: js.UndefOr[MarkerMidProperty] = js.native
  
  var markerStart: js.UndefOr[MarkerStartProperty] = js.native
  
  var mask: js.UndefOr[MaskProperty[TLength]] = js.native
  
  var opacity: js.UndefOr[OpacityProperty] = js.native
  
  var overflow: js.UndefOr[OverflowProperty] = js.native
  
  var paintOrder: js.UndefOr[PaintOrderProperty] = js.native
  
  var pointerEvents: js.UndefOr[PointerEventsProperty] = js.native
  
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.native
  
  var stopColor: js.UndefOr[StopColorProperty] = js.native
  
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var stroke: js.UndefOr[StrokeProperty] = js.native
  
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.native
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.native
  
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.native
  
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.native
  
  var textDecoration: js.UndefOr[TextDecorationProperty[TLength]] = js.native
  
  var textRendering: js.UndefOr[TextRenderingProperty] = js.native
  
  var unicodeBidi: js.UndefOr[UnicodeBidiProperty] = js.native
  
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.native
  
  var visibility: js.UndefOr[VisibilityProperty] = js.native
  
  var whiteSpace: js.UndefOr[WhiteSpaceProperty] = js.native
  
  var wordSpacing: js.UndefOr[WordSpacingProperty[TLength]] = js.native
  
  var writingMode: js.UndefOr[WritingModeProperty] = js.native
}
object SvgProperties {
  
  @scala.inline
  def apply[TLength](): SvgProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgProperties[TLength]]
  }
  
  @scala.inline
  implicit class SvgPropertiesMutableBuilder[Self <: SvgProperties[_], TLength] (val x: Self with SvgProperties[TLength]) extends AnyVal {
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaselineProperty): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: BaselineShiftProperty[TLength]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setClip(value: ClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPath(value: ClipPathProperty): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setClipRule(value: ClipRuleProperty): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolationProperty): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorRendering(value: ColorRenderingProperty): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorProperty): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionProperty): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayProperty): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: DominantBaselineProperty): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setFill(value: FillProperty): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: GlobalsNumber): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRuleProperty): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterProperty): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFloodColor(value: FloodColorProperty): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: GlobalsNumber): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: FontProperty): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: FontSizeProperty[TLength]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: FontSizeAdjustProperty): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretchProperty): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyleProperty): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariantProperty): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setImageRendering(value: ImageRenderingProperty): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacingProperty[TLength]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: LightingColorProperty): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setLineHeight(value: LineHeightProperty[TLength]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerProperty): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEnd(value: MarkerEndProperty): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: MarkerMidProperty): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: MarkerStartProperty): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMask(value: MaskProperty[TLength]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setOpacity(value: OpacityProperty): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOverflow(value: OverflowProperty): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: PaintOrderProperty): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: PointerEventsProperty): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: ShapeRenderingProperty): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColor(value: StopColorProperty): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: GlobalsNumber): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: StrokeProperty): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharrayProperty[TLength]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffsetProperty[TLength]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapProperty): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoinProperty): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: GlobalsNumber): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: GlobalsNumber): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: StrokeWidthProperty[TLength]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchorProperty): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: TextDecorationProperty[TLength]): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextRendering(value: TextRenderingProperty): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: UnicodeBidiProperty): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: VectorEffectProperty): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityProperty): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: WhiteSpaceProperty): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: WordSpacingProperty[TLength]): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: WritingModeProperty): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
  }
}
