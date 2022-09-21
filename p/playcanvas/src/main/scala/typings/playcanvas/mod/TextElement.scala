package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "TextElement")
@js.native
open class TextElement protected () extends StObject {
  def this(element: Any) = this()
  
  var _aabb: BoundingBox = js.native
  
  var _aabbDirty: Boolean = js.native
  
  var _alignment: Vec2 = js.native
  
  var _autoFitHeight: Boolean = js.native
  
  var _autoFitWidth: Boolean = js.native
  
  var _autoHeight: Boolean = js.native
  
  var _autoWidth: Boolean = js.native
  
  def _calculateCharsPerTexture(symbolIndex: Any): js.Object = js.native
  
  var _color: Color = js.native
  
  var _colorPalette: js.Array[Any] = js.native
  
  var _colorUniform: js.typedarray.Float32Array = js.native
  
  var _currentMaterialType: Any = js.native
  
  var _drawOrder: Double = js.native
  
  var _element: Any = js.native
  
  var _enableMarkup: Boolean = js.native
  
  var _entity: Any = js.native
  
  var _font: Any = js.native
  
  var _fontAsset: LocalizedAsset = js.native
  
  var _fontMaxY: Double = js.native
  
  var _fontMinY: Double = js.native
  
  var _fontSize: Double = js.native
  
  def _getPxRange(font: Any): Double = js.native
  
  def _getUv(char: Any): Any = js.native
  
  var _i18nKey: Any = js.native
  
  def _isNextCJKBoundary(char: Any, nextchar: Any): Boolean = js.native
  
  def _isNextCJKWholeWord(nextchar: Any): Boolean = js.native
  
  def _isValidNextChar(nextchar: Any): Boolean = js.native
  
  def _isWordBoundary(char: Any): Boolean = js.native
  
  var _lineContents: js.Array[Any] = js.native
  
  var _lineHeight: Double = js.native
  
  var _lineWidths: js.Array[Any] = js.native
  
  var _maskedMaterialSrc: Any = js.native
  
  var _material: Any = js.native
  
  var _maxFontSize: Double = js.native
  
  var _maxLines: Double = js.native
  
  var _meshInfo: js.Array[Any] = js.native
  
  var _minFontSize: Double = js.native
  
  var _model: Model = js.native
  
  var _noResize: Boolean = js.native
  
  var _node: GraphNode = js.native
  
  def _onDrawOrderChange(order: Any): Unit = js.native
  
  def _onFontChange(asset: Any, name: Any, _new: Any, _old: Any): Unit = js.native
  
  def _onFontLoad(asset: Any): Unit = js.native
  
  def _onFontRemove(asset: Any): Unit = js.native
  
  def _onFontRender(): Unit = js.native
  
  def _onLocaleSet(locale: Any): Unit = js.native
  
  def _onLocalizationData(locale: Any, messages: Any): Unit = js.native
  
  def _onParentResize(width: Any, height: Any): Unit = js.native
  
  def _onPivotChange(pivot: Any): Unit = js.native
  
  def _onScreenChange(screen: Any): Unit = js.native
  
  def _onScreenSpaceChange(value: Any): Unit = js.native
  
  var _originalFontSize: Double = js.native
  
  var _outlineColor: Color = js.native
  
  var _outlineColorUniform: js.typedarray.Float32Array = js.native
  
  var _outlinePalette: js.Array[Any] = js.native
  
  var _outlineThickness: Double = js.native
  
  var _outlineThicknessScale: Double = js.native
  
  var _rangeEnd: Double = js.native
  
  var _rangeStart: Double = js.native
  
  def _removeMeshInstance(meshInstance: Any): Unit = js.native
  
  def _resetLocalizedText(): Unit = js.native
  
  var _rtl: Boolean = js.native
  
  var _rtlReorder: Boolean = js.native
  
  var _scaledLineHeight: Double = js.native
  
  def _setMaterial(material: Any): Unit = js.native
  
  def _setStencil(stencilParams: Any): Unit = js.native
  
  def _setText(text: Any): Unit = js.native
  
  def _setTextureParams(mi: Any, texture: Any): Unit = js.native
  
  var _shadowColor: Color = js.native
  
  var _shadowColorUniform: js.typedarray.Float32Array = js.native
  
  var _shadowOffset: Vec2 = js.native
  
  var _shadowOffsetScale: Double = js.native
  
  var _shadowOffsetUniform: js.typedarray.Float32Array = js.native
  
  var _shadowPalette: js.Array[Any] = js.native
  
  def _shouldAutoFit(): Boolean = js.native
  
  def _shouldAutoFitHeight(): Boolean = js.native
  
  def _shouldAutoFitWidth(): Boolean = js.native
  
  var _spacing: Double = js.native
  
  var _symbolColors: js.Array[Any] = js.native
  
  var _symbolOutlineParams: js.Array[Any] = js.native
  
  var _symbolShadowParams: js.Array[Any] = js.native
  
  var _symbols: js.Array[Any] = js.native
  
  var _system: Any = js.native
  
  var _text: String = js.native
  
  var _unicodeConverter: Boolean = js.native
  
  def _updateMaterial(screenSpace: Any): Unit = js.native
  
  def _updateMaterialEmissive(): Unit = js.native
  
  def _updateMaterialOutline(): Unit = js.native
  
  def _updateMaterialShadow(): Unit = js.native
  
  def _updateMeshes(): Unit = js.native
  
  def _updateRenderRange(): Unit = js.native
  
  def _updateText(text: Any): Unit = js.native
  
  var _wrapLines: Boolean = js.native
  
  def aabb: BoundingBox = js.native
  
  def alignment: Vec2 = js.native
  def alignment_=(arg: Vec2): Unit = js.native
  
  def autoFitHeight: Boolean = js.native
  def autoFitHeight_=(arg: Boolean): Unit = js.native
  
  def autoFitWidth: Boolean = js.native
  def autoFitWidth_=(arg: Boolean): Unit = js.native
  
  def autoHeight: Boolean = js.native
  def autoHeight_=(arg: Boolean): Unit = js.native
  
  def autoWidth: Boolean = js.native
  def autoWidth_=(arg: Boolean): Unit = js.native
  
  def color: Color = js.native
  def color_=(arg: Color): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def enableMarkup: Boolean = js.native
  def enableMarkup_=(arg: Boolean): Unit = js.native
  
  def font: Any = js.native
  
  def fontAsset: Any = js.native
  def fontAsset_=(arg: Any): Unit = js.native
  
  def fontSize: Double = js.native
  def fontSize_=(arg: Double): Unit = js.native
  
  def font_=(arg: Any): Unit = js.native
  
  var height: Double = js.native
  
  def key: Any = js.native
  def key_=(arg: Any): Unit = js.native
  
  def lineHeight: Double = js.native
  def lineHeight_=(arg: Double): Unit = js.native
  
  def lines: js.Array[Any] = js.native
  
  def maxFontSize: Double = js.native
  def maxFontSize_=(arg: Double): Unit = js.native
  
  def maxLines: Double = js.native
  def maxLines_=(arg: Double): Unit = js.native
  
  def minFontSize: Double = js.native
  def minFontSize_=(arg: Double): Unit = js.native
  
  def onDisable(): Unit = js.native
  
  def onEnable(): Unit = js.native
  
  def opacity: Double = js.native
  def opacity_=(arg: Double): Unit = js.native
  
  def outlineColor: Color = js.native
  def outlineColor_=(arg: Color): Unit = js.native
  
  def outlineThickness: Double = js.native
  def outlineThickness_=(arg: Double): Unit = js.native
  
  def rangeEnd: Double = js.native
  def rangeEnd_=(arg: Double): Unit = js.native
  
  def rangeStart: Double = js.native
  def rangeStart_=(arg: Double): Unit = js.native
  
  def rtl: Boolean = js.native
  
  def rtlReorder: Boolean = js.native
  def rtlReorder_=(arg: Boolean): Unit = js.native
  
  def shadowColor: Color = js.native
  def shadowColor_=(arg: Color): Unit = js.native
  
  def shadowOffset: Vec2 = js.native
  def shadowOffset_=(arg: Vec2): Unit = js.native
  
  def spacing: Double = js.native
  def spacing_=(arg: Double): Unit = js.native
  
  def symbolColors: js.Array[Any] = js.native
  
  def symbolOutlineParams: js.Array[Any] = js.native
  
  def symbolShadowParams: js.Array[Any] = js.native
  
  def symbols: js.Array[Any] = js.native
  
  def text: String = js.native
  def text_=(arg: String): Unit = js.native
  
  def unicodeConverter: Boolean = js.native
  def unicodeConverter_=(arg: Boolean): Unit = js.native
  
  var width: Double = js.native
  
  def wrapLines: Boolean = js.native
  def wrapLines_=(arg: Boolean): Unit = js.native
}
