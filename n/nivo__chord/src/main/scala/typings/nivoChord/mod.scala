package typings.nivoChord

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.anon.ActiveArcOpacity
import typings.nivoChord.anon.ArcGenerator
import typings.nivoChord.anon.Arcs
import typings.nivoChord.anon.Center
import typings.nivoChord.anon.Chord
import typings.nivoChord.anon.Colors
import typings.nivoChord.anon.CurrentArc
import typings.nivoChord.anon.GetColor
import typings.nivoChord.anon.Height
import typings.nivoChord.anon.OmitArcDatumlabelcolor
import typings.nivoChord.anon.OmitChordCanvasPropswidth
import typings.nivoChord.anon.OmitChordSvgPropswidthhei
import typings.nivoChord.anon.PadAngle
import typings.nivoChord.anon.PartialAnimationConfig
import typings.nivoChord.anon.Radius
import typings.nivoChord.anon.RibbonGenerator
import typings.nivoChord.distTypesTypesMod.ArcDatum
import typings.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typings.nivoChord.distTypesTypesMod.ChordCanvasProps
import typings.nivoChord.distTypesTypesMod.ChordSvgProps
import typings.nivoChord.distTypesTypesMod.CustomLayerProps
import typings.nivoChord.distTypesTypesMod.LayerId
import typings.nivoChord.distTypesTypesMod.RibbonTooltipComponentProps
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoLegends.distTypesTypesMod.LegendProps
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/chord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Chord(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: ChordSvgProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Chord")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ChordCanvas(hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps: ChordCanvasProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ChordCanvas")(hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveChord(props: OmitChordSvgPropswidthhei): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveChord")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveChordCanvas(props: OmitChordCanvasPropswidth): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveChordCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object canvasDefaultProps {
    
    @JSImport("@nivo/chord", "canvasDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/chord", "canvasDefaultProps.activeArcOpacity")
    @js.native
    def activeArcOpacity: Double = js.native
    inline def activeArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.activeRibbonOpacity")
    @js.native
    def activeRibbonOpacity: Double = js.native
    inline def activeRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.arcBorderColor")
    @js.native
    def arcBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def arcBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.arcBorderWidth")
    @js.native
    def arcBorderWidth: Double = js.native
    inline def arcBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.arcOpacity")
    @js.native
    def arcOpacity: Double = js.native
    inline def arcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.arcTooltip")
    @js.native
    def arcTooltip: ArcTooltipComponent = js.native
    inline def arcTooltip_=(x: ArcTooltipComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitArcDatumlabelcolor] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.inactiveArcOpacity")
    @js.native
    def inactiveArcOpacity: Double = js.native
    inline def inactiveArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.inactiveRibbonOpacity")
    @js.native
    def inactiveRibbonOpacity: Double = js.native
    inline def inactiveRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.innerRadiusOffset")
    @js.native
    def innerRadiusOffset: Double = js.native
    inline def innerRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.innerRadiusRatio")
    @js.native
    def innerRadiusRatio: Double = js.native
    inline def innerRadiusRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitArcDatumlabelcolor, String] = js.native
    
    @JSImport("@nivo/chord", "canvasDefaultProps.labelOffset")
    @js.native
    def labelOffset: Double = js.native
    inline def labelOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.labelRotation")
    @js.native
    def labelRotation: Double = js.native
    inline def labelRotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ArcDatum] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitArcDatumlabelcolor, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.legends")
    @js.native
    def legends: js.Array[LegendProps] = js.native
    inline def legends_=(x: js.Array[LegendProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.padAngle")
    @js.native
    def padAngle: Double = js.native
    inline def padAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.ribbonBlendMode")
    @js.native
    def ribbonBlendMode: CssMixBlendMode = js.native
    inline def ribbonBlendMode_=(x: CssMixBlendMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBlendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.ribbonBorderColor")
    @js.native
    def ribbonBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def ribbonBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.ribbonBorderWidth")
    @js.native
    def ribbonBorderWidth: Double = js.native
    inline def ribbonBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.ribbonOpacity")
    @js.native
    def ribbonOpacity: Double = js.native
    inline def ribbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "canvasDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Omit<@nivo/chord.@nivo/chord/dist/types/types.ChordCommonProps, 'valueFormat' | 'margin' | 'theme' | 'onArcMouseEnter' | 'onArcMouseMove' | 'onArcMouseLeave' | 'onArcClick' | 'onRibbonMouseEnter' | 'onRibbonMouseMove' | 'onRibbonMouseLeave' | 'onRibbonClick' | 'renderWrapper' | 'ariaLabel' | 'ariaLabelledBy' | 'ariaDescribedBy'> & {  layers :std.Array<@nivo/chord.@nivo/chord/dist/types/types.LayerId>} */
  object commonDefaultProps {
    
    @JSImport("@nivo/chord", "commonDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/chord", "commonDefaultProps.activeArcOpacity")
    @js.native
    def activeArcOpacity: Double = js.native
    inline def activeArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.activeRibbonOpacity")
    @js.native
    def activeRibbonOpacity: Double = js.native
    inline def activeRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.arcBorderColor")
    @js.native
    def arcBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def arcBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.arcBorderWidth")
    @js.native
    def arcBorderWidth: Double = js.native
    inline def arcBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.arcOpacity")
    @js.native
    def arcOpacity: Double = js.native
    inline def arcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.arcTooltip")
    @js.native
    def arcTooltip: ArcTooltipComponent = js.native
    inline def arcTooltip_=(x: ArcTooltipComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitArcDatumlabelcolor] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.inactiveArcOpacity")
    @js.native
    def inactiveArcOpacity: Double = js.native
    inline def inactiveArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.inactiveRibbonOpacity")
    @js.native
    def inactiveRibbonOpacity: Double = js.native
    inline def inactiveRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.innerRadiusOffset")
    @js.native
    def innerRadiusOffset: Double = js.native
    inline def innerRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.innerRadiusRatio")
    @js.native
    def innerRadiusRatio: Double = js.native
    inline def innerRadiusRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitArcDatumlabelcolor, String] = js.native
    
    @JSImport("@nivo/chord", "commonDefaultProps.labelOffset")
    @js.native
    def labelOffset: Double = js.native
    inline def labelOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.labelRotation")
    @js.native
    def labelRotation: Double = js.native
    inline def labelRotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ArcDatum] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitArcDatumlabelcolor, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.legends")
    @js.native
    def legends: js.Array[LegendProps] = js.native
    inline def legends_=(x: js.Array[LegendProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any) = js.native
    inline def motionConfig_=(
      x: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.padAngle")
    @js.native
    def padAngle: Double = js.native
    inline def padAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.ribbonBlendMode")
    @js.native
    def ribbonBlendMode: CssMixBlendMode = js.native
    inline def ribbonBlendMode_=(x: CssMixBlendMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBlendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.ribbonBorderColor")
    @js.native
    def ribbonBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def ribbonBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.ribbonBorderWidth")
    @js.native
    def ribbonBorderWidth: Double = js.native
    inline def ribbonBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.ribbonOpacity")
    @js.native
    def ribbonOpacity: Double = js.native
    inline def ribbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "commonDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  inline def computeArcPath(hasStartAngleEndAngleArcGenerator: ArcGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcPath")(hasStartAngleEndAngleArcGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def computeChordArcsAndRibbons(hasChordDataKeysGetLabelFormatValueGetColor: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordArcsAndRibbons")(hasChordDataKeysGetLabelFormatValueGetColor.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def computeChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def computeChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def computeRibbonPath(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator: RibbonGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRibbonPath")(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object svgDefaultProps {
    
    @JSImport("@nivo/chord", "svgDefaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/chord", "svgDefaultProps.activeArcOpacity")
    @js.native
    def activeArcOpacity: Double = js.native
    inline def activeArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.activeRibbonOpacity")
    @js.native
    def activeRibbonOpacity: Double = js.native
    inline def activeRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.arcBorderColor")
    @js.native
    def arcBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def arcBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.arcBorderWidth")
    @js.native
    def arcBorderWidth: Double = js.native
    inline def arcBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.arcOpacity")
    @js.native
    def arcOpacity: Double = js.native
    inline def arcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.arcTooltip")
    @js.native
    def arcTooltip: ArcTooltipComponent = js.native
    inline def arcTooltip_=(x: ArcTooltipComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[OmitArcDatumlabelcolor] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.enableLabel")
    @js.native
    def enableLabel: Boolean = js.native
    inline def enableLabel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.inactiveArcOpacity")
    @js.native
    def inactiveArcOpacity: Double = js.native
    inline def inactiveArcOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveArcOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.inactiveRibbonOpacity")
    @js.native
    def inactiveRibbonOpacity: Double = js.native
    inline def inactiveRibbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inactiveRibbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.innerRadiusOffset")
    @js.native
    def innerRadiusOffset: Double = js.native
    inline def innerRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.innerRadiusRatio")
    @js.native
    def innerRadiusRatio: Double = js.native
    inline def innerRadiusRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.label")
    @js.native
    def label: PropertyAccessor[OmitArcDatumlabelcolor, String] = js.native
    
    @JSImport("@nivo/chord", "svgDefaultProps.labelOffset")
    @js.native
    def labelOffset: Double = js.native
    inline def labelOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.labelRotation")
    @js.native
    def labelRotation: Double = js.native
    inline def labelRotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.labelTextColor")
    @js.native
    def labelTextColor: InheritedColorConfig[ArcDatum] = js.native
    inline def labelTextColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(x.asInstanceOf[js.Any])
    
    inline def label_=(x: PropertyAccessor[OmitArcDatumlabelcolor, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.layers")
    @js.native
    def layers: js.Array[LayerId] = js.native
    inline def layers_=(x: js.Array[LayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.legends")
    @js.native
    def legends: js.Array[LegendProps] = js.native
    inline def legends_=(x: js.Array[LegendProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.motionConfig")
    @js.native
    def motionConfig: String | PartialAnimationConfig = js.native
    inline def motionConfig_=(x: String | PartialAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.padAngle")
    @js.native
    def padAngle: Double = js.native
    inline def padAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.ribbonBlendMode")
    @js.native
    def ribbonBlendMode: CssMixBlendMode = js.native
    inline def ribbonBlendMode_=(x: CssMixBlendMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBlendMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.ribbonBorderColor")
    @js.native
    def ribbonBorderColor: InheritedColorConfig[ArcDatum] = js.native
    inline def ribbonBorderColor_=(x: InheritedColorConfig[ArcDatum]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.ribbonBorderWidth")
    @js.native
    def ribbonBorderWidth: Double = js.native
    inline def ribbonBorderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.ribbonOpacity")
    @js.native
    def ribbonOpacity: Double = js.native
    inline def ribbonOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.ribbonTooltip")
    @js.native
    def ribbonTooltip: MemoExoticComponent[js.Function1[/* hasRibbon */ RibbonTooltipComponentProps, Element]] = js.native
    inline def ribbonTooltip_=(x: MemoExoticComponent[js.Function1[/* hasRibbon */ RibbonTooltipComponentProps, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ribbonTooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/chord", "svgDefaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  inline def useChord(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors: Colors): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useChord")(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors.asInstanceOf[js.Any]).asInstanceOf[GetColor]
  
  inline def useChordArcsAndRibbons(hasChordGetColorKeysDataGetLabelFormatValue: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordArcsAndRibbons")(hasChordGetColorKeysDataGetLabelFormatValue.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def useChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def useChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def useChordSelection(
    hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity: ActiveArcOpacity
  ): CurrentArc = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordSelection")(hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity.asInstanceOf[js.Any]).asInstanceOf[CurrentArc]
  
  inline def useCustomLayerProps(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator: Radius): CustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps]
}
