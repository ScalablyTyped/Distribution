package typings.nivoChord.mod

import typings.nivoChord.anon.OmitArcDataformattedValue
import typings.nivoChord.anon.OmitArcDatalabel
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.@nivo/chord.CommonChordProps & @nivo/core.@nivo/core.MotionProps & {  onRibbonMouseEnter :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler | undefined,   onRibbonMouseMove :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler | undefined,   onRibbonMouseLeave :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler | undefined,   onRibbonClick :@nivo/chord.@nivo/chord.ChordRibbonMouseHandler | undefined,   ribbonTooltip :any | undefined} */
@js.native
trait ChordProps extends js.Object {
  var BorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var animate: js.UndefOr[Boolean] = js.native
  var arcBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var arcBorderWidth: js.UndefOr[Double] = js.native
  var arcHoverOpacity: js.UndefOr[Double] = js.native
  var arcHoverOthersOpacity: js.UndefOr[Double] = js.native
  var arcOpacity: js.UndefOr[Double] = js.native
  var arcTooltip: js.UndefOr[js.Any] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var enableLabel: js.UndefOr[Boolean] = js.native
  var innerRadiusOffset: js.UndefOr[Double] = js.native
  var innerRadiusRatio: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String] = js.native
  var label: js.UndefOr[String | LabelAccessor] = js.native
  var labelOffset: js.UndefOr[Double] = js.native
  var labelRotation: js.UndefOr[Double] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var layers: js.Array[_] = js.native
  var margin: js.UndefOr[Box] = js.native
  var matrix: js.Array[js.Array[Double]] = js.native
  var motionDamping: js.UndefOr[Double] = js.native
  var motionStiffness: js.UndefOr[Double] = js.native
  var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.native
  var onRibbonClick: js.UndefOr[ChordRibbonMouseHandler] = js.native
  var onRibbonMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.native
  var onRibbonMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.native
  var onRibbonMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var ribbonBorderWidth: js.UndefOr[Double] = js.native
  var ribbonHoverOpacity: js.UndefOr[Double] = js.native
  var ribbonHoverOthersOpacity: js.UndefOr[Double] = js.native
  var ribbonOpacity: js.UndefOr[Double] = js.native
  var ribbonTooltip: js.UndefOr[js.Any] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object ChordProps {
  @scala.inline
  def apply(keys: js.Array[String], layers: js.Array[_], matrix: js.Array[js.Array[Double]]): ChordProps = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordProps]
  }
  @scala.inline
  implicit class ChordPropsOps[Self <: ChordProps] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayersVarargs(value: js.Any*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[_]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrixVarargs(value: js.Array[Double]*): Self = this.set("matrix", js.Array(value :_*))
    @scala.inline
    def setMatrix(value: js.Array[js.Array[Double]]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColorFunction1(value: _ => String): Self = this.set("BorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[_]): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("BorderColor", js.undefined)
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setArcBorderColorFunction1(value: _ => String): Self = this.set("arcBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setArcBorderColor(value: InheritedColorProp[_]): Self = this.set("arcBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcBorderColor: Self = this.set("arcBorderColor", js.undefined)
    @scala.inline
    def setArcBorderWidth(value: Double): Self = this.set("arcBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcBorderWidth: Self = this.set("arcBorderWidth", js.undefined)
    @scala.inline
    def setArcHoverOpacity(value: Double): Self = this.set("arcHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcHoverOpacity: Self = this.set("arcHoverOpacity", js.undefined)
    @scala.inline
    def setArcHoverOthersOpacity(value: Double): Self = this.set("arcHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcHoverOthersOpacity: Self = this.set("arcHoverOthersOpacity", js.undefined)
    @scala.inline
    def setArcOpacity(value: Double): Self = this.set("arcOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcOpacity: Self = this.set("arcOpacity", js.undefined)
    @scala.inline
    def setArcTooltip(value: js.Any): Self = this.set("arcTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcTooltip: Self = this.set("arcTooltip", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setEnableLabel(value: Boolean): Self = this.set("enableLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLabel: Self = this.set("enableLabel", js.undefined)
    @scala.inline
    def setInnerRadiusOffset(value: Double): Self = this.set("innerRadiusOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadiusOffset: Self = this.set("innerRadiusOffset", js.undefined)
    @scala.inline
    def setInnerRadiusRatio(value: Double): Self = this.set("innerRadiusRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadiusRatio: Self = this.set("innerRadiusRatio", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setLabelFunction1(value: /* datum */ OmitArcDatalabel => String): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String | LabelAccessor): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelOffset(value: Double): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    @scala.inline
    def setLabelRotation(value: Double): Self = this.set("labelRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelRotation: Self = this.set("labelRotation", js.undefined)
    @scala.inline
    def setLabelTextColorFunction1(value: _ => String): Self = this.set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelTextColor(value: InheritedColorProp[_]): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMotionDamping(value: Double): Self = this.set("motionDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionDamping: Self = this.set("motionDamping", js.undefined)
    @scala.inline
    def setMotionStiffness(value: Double): Self = this.set("motionStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotionStiffness: Self = this.set("motionStiffness", js.undefined)
    @scala.inline
    def setOnArcClick(value: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onArcClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnArcClick: Self = this.set("onArcClick", js.undefined)
    @scala.inline
    def setOnArcMouseEnter(value: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onArcMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnArcMouseEnter: Self = this.set("onArcMouseEnter", js.undefined)
    @scala.inline
    def setOnArcMouseLeave(value: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onArcMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnArcMouseLeave: Self = this.set("onArcMouseLeave", js.undefined)
    @scala.inline
    def setOnArcMouseMove(value: (/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onArcMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnArcMouseMove: Self = this.set("onArcMouseMove", js.undefined)
    @scala.inline
    def setOnRibbonClick(value: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onRibbonClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRibbonClick: Self = this.set("onRibbonClick", js.undefined)
    @scala.inline
    def setOnRibbonMouseEnter(value: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onRibbonMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRibbonMouseEnter: Self = this.set("onRibbonMouseEnter", js.undefined)
    @scala.inline
    def setOnRibbonMouseLeave(value: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onRibbonMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRibbonMouseLeave: Self = this.set("onRibbonMouseLeave", js.undefined)
    @scala.inline
    def setOnRibbonMouseMove(value: (/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onRibbonMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRibbonMouseMove: Self = this.set("onRibbonMouseMove", js.undefined)
    @scala.inline
    def setPadAngle(value: Double): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    @scala.inline
    def setRibbonBorderWidth(value: Double): Self = this.set("ribbonBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRibbonBorderWidth: Self = this.set("ribbonBorderWidth", js.undefined)
    @scala.inline
    def setRibbonHoverOpacity(value: Double): Self = this.set("ribbonHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRibbonHoverOpacity: Self = this.set("ribbonHoverOpacity", js.undefined)
    @scala.inline
    def setRibbonHoverOthersOpacity(value: Double): Self = this.set("ribbonHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRibbonHoverOthersOpacity: Self = this.set("ribbonHoverOthersOpacity", js.undefined)
    @scala.inline
    def setRibbonOpacity(value: Double): Self = this.set("ribbonOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRibbonOpacity: Self = this.set("ribbonOpacity", js.undefined)
    @scala.inline
    def setRibbonTooltip(value: js.Any): Self = this.set("ribbonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRibbonTooltip: Self = this.set("ribbonTooltip", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValueFormatFunction1(value: /* datum */ OmitArcDataformattedValue => String | Double): Self = this.set("valueFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setValueFormat(value: String | ValueFormatter): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
  
}

