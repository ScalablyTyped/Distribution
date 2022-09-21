package typings.nivoPie

import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoPie.anon.ActiveId
import typings.nivoPie.anon.ArcGenerator
import typings.nivoPie.anon.CenterX
import typings.nivoPie.anon.Data
import typings.nivoPie.anon.DataArray
import typings.nivoPie.anon.DataWithArc
import typings.nivoPie.anon.Datum
import typings.nivoPie.anon.From
import typings.nivoPie.anon.InnerRadius
import typings.nivoPie.anon.Theme
import typings.nivoPie.hooksMod.MayHaveLabel
import typings.nivoPie.nivoPieStrings.activeInnerRadiusOffset
import typings.nivoPie.nivoPieStrings.activeOuterRadiusOffset
import typings.nivoPie.nivoPieStrings.arc
import typings.nivoPie.nivoPieStrings.centerRadius
import typings.nivoPie.nivoPieStrings.colors
import typings.nivoPie.nivoPieStrings.cornerRadius
import typings.nivoPie.nivoPieStrings.endAngle
import typings.nivoPie.nivoPieStrings.fill
import typings.nivoPie.nivoPieStrings.fit
import typings.nivoPie.nivoPieStrings.height
import typings.nivoPie.nivoPieStrings.id
import typings.nivoPie.nivoPieStrings.innerRadius
import typings.nivoPie.nivoPieStrings.middleAngle
import typings.nivoPie.nivoPieStrings.outerRadius
import typings.nivoPie.nivoPieStrings.padAngle
import typings.nivoPie.nivoPieStrings.pushIn
import typings.nivoPie.nivoPieStrings.pushOut
import typings.nivoPie.nivoPieStrings.sortByValue
import typings.nivoPie.nivoPieStrings.startAngle
import typings.nivoPie.nivoPieStrings.value
import typings.nivoPie.nivoPieStrings.valueFormat
import typings.nivoPie.nivoPieStrings.width
import typings.nivoPie.typesMod.CompletePieSvgProps
import typings.nivoPie.typesMod.ComputedDatum
import typings.nivoPie.typesMod.PieCanvasProps
import typings.nivoPie.typesMod.PieCustomLayerProps
import typings.nivoPie.typesMod.PieSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/pie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Pie[RawDatum](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: PieSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pie")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PieCanvas[RawDatum](hasIsInteractiveThemeRenderWrapperOtherProps: PieCanvasProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PieCanvas")(hasIsInteractiveThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsivePie[RawDatum](props: Omit[PieSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePie")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsivePieCanvas[RawDatum](props: Omit[PieCanvasProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePieCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/pie", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/pie", "defaultProps.activeInnerRadiusOffset")
    @js.native
    def activeInnerRadiusOffset: Double = js.native
    inline def activeInnerRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeInnerRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.activeOuterRadiusOffset")
    @js.native
    def activeOuterRadiusOffset: Double = js.native
    inline def activeOuterRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeOuterRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLabel")
    @js.native
    def arcLabel: String = js.native
    inline def arcLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLabelsRadiusOffset")
    @js.native
    def arcLabelsRadiusOffset: Double = js.native
    inline def arcLabelsRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLabelsSkipAngle")
    @js.native
    def arcLabelsSkipAngle: Double = js.native
    inline def arcLabelsSkipAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsSkipAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLabelsTextColor")
    @js.native
    def arcLabelsTextColor: Theme = js.native
    inline def arcLabelsTextColor_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsTextColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabel")
    @js.native
    def arcLinkLabel: String = js.native
    inline def arcLinkLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsColor")
    @js.native
    def arcLinkLabelsColor: Theme = js.native
    inline def arcLinkLabelsColor_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsDiagonalLength")
    @js.native
    def arcLinkLabelsDiagonalLength: Double = js.native
    inline def arcLinkLabelsDiagonalLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsDiagonalLength")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsOffset")
    @js.native
    def arcLinkLabelsOffset: Double = js.native
    inline def arcLinkLabelsOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsSkipAngle")
    @js.native
    def arcLinkLabelsSkipAngle: Double = js.native
    inline def arcLinkLabelsSkipAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsSkipAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsStraightLength")
    @js.native
    def arcLinkLabelsStraightLength: Double = js.native
    inline def arcLinkLabelsStraightLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsStraightLength")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsTextColor")
    @js.native
    def arcLinkLabelsTextColor: Theme = js.native
    inline def arcLinkLabelsTextColor_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsTextColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsTextOffset")
    @js.native
    def arcLinkLabelsTextOffset: Double = js.native
    inline def arcLinkLabelsTextOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsTextOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.arcLinkLabelsThickness")
    @js.native
    def arcLinkLabelsThickness: Double = js.native
    inline def arcLinkLabelsThickness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLinkLabelsThickness")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.borderColor")
    @js.native
    def borderColor: From = js.native
    inline def borderColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.cornerRadius")
    @js.native
    def cornerRadius: Double = js.native
    inline def cornerRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.enableArcLabels")
    @js.native
    def enableArcLabels: Boolean = js.native
    inline def enableArcLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableArcLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.enableArcLinkLabels")
    @js.native
    def enableArcLinkLabels: Boolean = js.native
    inline def enableArcLinkLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableArcLinkLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.endAngle")
    @js.native
    def endAngle: Double = js.native
    inline def endAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.fit")
    @js.native
    def fit: Boolean = js.native
    inline def fit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fit")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.innerRadius")
    @js.native
    def innerRadius: Double = js.native
    inline def innerRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.layers")
    @js.native
    def layers: js.Array[String] = js.native
    inline def layers_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.padAngle")
    @js.native
    def padAngle: Double = js.native
    inline def padAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.sortByValue")
    @js.native
    def sortByValue: Boolean = js.native
    inline def sortByValue_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortByValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.startAngle")
    @js.native
    def startAngle: Double = js.native
    inline def startAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](hasDatum: Datum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(hasDatum.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/pie", "defaultProps.transitionMode")
    @js.native
    def transitionMode: startAngle | middleAngle | endAngle | innerRadius | centerRadius | outerRadius | pushIn | pushOut = js.native
    inline def transitionMode_=(
      x: startAngle | middleAngle | endAngle | innerRadius | centerRadius | outerRadius | pushIn | pushOut
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/pie", "defaultProps.value")
    @js.native
    def value: String = js.native
    inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def useNormalizedData[RawDatum /* <: MayHaveLabel */](
    hasDataIdValueValueFormatColors: (Pick[CompletePieSvgProps[RawDatum], id | value | valueFormat | colors]) & Data[RawDatum]
  ): js.Array[Omit[ComputedDatum[RawDatum], fill | arc]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNormalizedData")(hasDataIdValueValueFormatColors.asInstanceOf[js.Any]).asInstanceOf[js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]]
  
  inline def usePie[RawDatum](
    hasDataRadiusInnerRadiusStartAngleEndAnglePadAngleSortByValueCornerRadiusActiveInnerRadiusOffsetActiveOuterRadiusOffset: (Pick[
      Partial[CompletePieSvgProps[RawDatum]], 
      startAngle | endAngle | sortByValue | padAngle | cornerRadius | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & InnerRadius[RawDatum]
  ): ArcGenerator[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePie")(hasDataRadiusInnerRadiusStartAngleEndAnglePadAngleSortByValueCornerRadiusActiveInnerRadiusOffsetActiveOuterRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator[RawDatum]]
  
  inline def usePieArcs[RawDatum](
    hasDataStartAngleEndAngleInnerRadiusOuterRadiusPadAngleSortByValueActiveIdActiveInnerRadiusOffsetActiveOuterRadiusOffsetHiddenIds: ActiveId[RawDatum]
  ): DataWithArc[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieArcs")(hasDataStartAngleEndAngleInnerRadiusOuterRadiusPadAngleSortByValueActiveIdActiveInnerRadiusOffsetActiveOuterRadiusOffsetHiddenIds.asInstanceOf[js.Any]).asInstanceOf[DataWithArc[RawDatum]]
  
  inline def usePieFromBox[RawDatum](
    hasDataWidthHeightInnerRadiusRatioStartAngleEndAnglePadAngleSortByValueCornerRadiusFitActiveInnerRadiusOffsetActiveOuterRadiusOffset: (Pick[
      CompletePieSvgProps[RawDatum], 
      startAngle | endAngle | innerRadius | width | height | sortByValue | padAngle | cornerRadius | fit | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & DataArray[RawDatum]
  ): CenterX[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieFromBox")(hasDataWidthHeightInnerRadiusRatioStartAngleEndAnglePadAngleSortByValueCornerRadiusFitActiveInnerRadiusOffsetActiveOuterRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[CenterX[RawDatum]]
  
  inline def usePieLayerContext[RawDatum](hasDataWithArcArcGeneratorCenterXCenterYRadiusInnerRadius: PieCustomLayerProps[RawDatum]): PieCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieLayerContext")(hasDataWithArcArcGeneratorCenterXCenterYRadiusInnerRadius.asInstanceOf[js.Any]).asInstanceOf[PieCustomLayerProps[RawDatum]]
}
