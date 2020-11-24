package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvgProperties[TLength] extends js.Object {
  
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
  implicit class SvgPropertiesOps[Self <: SvgProperties[_], TLength] (val x: Self with SvgProperties[TLength]) extends AnyVal {
    
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
    def setAlignmentBaseline(value: AlignmentBaselineProperty): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: BaselineShiftProperty[TLength]): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setClip(value: ClipProperty): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setClipPath(value: ClipPathProperty): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    
    @scala.inline
    def setClipRule(value: ClipRuleProperty): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolationProperty): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorRendering(value: ColorRenderingProperty): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorProperty): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionProperty): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayProperty): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: DominantBaselineProperty): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setFill(value: FillProperty): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: GlobalsNumber): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRuleProperty): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterProperty): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFloodColor(value: FloodColorProperty): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: GlobalsNumber): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setFont(value: FontProperty): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: FontSizeProperty[TLength]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeAdjust(value: FontSizeAdjustProperty): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretchProperty): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyleProperty): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariantProperty): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightProperty): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setImageRendering(value: ImageRenderingProperty): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacingProperty[TLength]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLightingColor(value: LightingColorProperty): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setLineHeight(value: LineHeightProperty[TLength]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerProperty): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: MarkerEndProperty): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: MarkerMidProperty): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: MarkerStartProperty): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setMask(value: MaskProperty[TLength]): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setOpacity(value: OpacityProperty): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOverflow(value: OverflowProperty): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: PaintOrderProperty): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: PointerEventsProperty): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: ShapeRenderingProperty): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColor(value: StopColorProperty): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: GlobalsNumber): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: StrokeProperty): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharrayProperty[TLength]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffsetProperty[TLength]): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapProperty): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoinProperty): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: GlobalsNumber): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: GlobalsNumber): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: StrokeWidthProperty[TLength]): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchorProperty): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: TextDecorationProperty[TLength]): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextRendering(value: TextRenderingProperty): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: UnicodeBidiProperty): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: VectorEffectProperty): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityProperty): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: WhiteSpaceProperty): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteSpace: Self = this.set("whiteSpace", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: WordSpacingProperty[TLength]): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    
    @scala.inline
    def setWritingMode(value: WritingModeProperty): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
  }
}
