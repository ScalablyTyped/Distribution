package typings.nivoSunburst

import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoSunburst.anon.ArcGenerator
import typings.nivoSunburst.anon.ChildColor
import typings.nivoSunburst.anon.From
import typings.nivoSunburst.anon.Theme
import typings.nivoSunburst.distTypesResponsiveSunburstMod.ResponsiveSunburstProps
import typings.nivoSunburst.distTypesTypesMod.ComputedDatum
import typings.nivoSunburst.distTypesTypesMod.SunburstCustomLayerProps
import typings.nivoSunburst.distTypesTypesMod.SunburstLayerId
import typings.nivoSunburst.distTypesTypesMod.SunburstSvgProps
import typings.nivoSunburst.nivoSunburstStrings.centerRadius
import typings.nivoSunburst.nivoSunburstStrings.data
import typings.nivoSunburst.nivoSunburstStrings.endAngle
import typings.nivoSunburst.nivoSunburstStrings.height
import typings.nivoSunburst.nivoSunburstStrings.id
import typings.nivoSunburst.nivoSunburstStrings.innerRadius
import typings.nivoSunburst.nivoSunburstStrings.middleAngle
import typings.nivoSunburst.nivoSunburstStrings.outerRadius
import typings.nivoSunburst.nivoSunburstStrings.pushIn
import typings.nivoSunburst.nivoSunburstStrings.pushOut
import typings.nivoSunburst.nivoSunburstStrings.startAngle
import typings.nivoSunburst.nivoSunburstStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/sunburst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveSunburst[RawDatum](props: ResponsiveSunburstProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveSunburst")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Sunburst[RawDatum](
    param0: (Partial[Omit[SunburstSvgProps[RawDatum], data | height | width]]) & (Pick[SunburstSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sunburst")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/sunburst", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/sunburst", "defaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.arcLabel")
    @js.native
    def arcLabel: String = js.native
    inline def arcLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.arcLabelsRadiusOffset")
    @js.native
    def arcLabelsRadiusOffset: Double = js.native
    inline def arcLabelsRadiusOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsRadiusOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.arcLabelsSkipAngle")
    @js.native
    def arcLabelsSkipAngle: Double = js.native
    inline def arcLabelsSkipAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsSkipAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.arcLabelsTextColor")
    @js.native
    def arcLabelsTextColor: Theme = js.native
    inline def arcLabelsTextColor_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arcLabelsTextColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.borderColor")
    @js.native
    def borderColor: String = js.native
    inline def borderColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.childColor")
    @js.native
    def childColor: From = js.native
    inline def childColor_=(x: From): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.colorBy")
    @js.native
    def colorBy: id = js.native
    inline def colorBy_=(x: id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfig[Any] = js.native
    inline def colors_=(x: OrdinalColorScaleConfig[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.cornerRadius")
    @js.native
    def cornerRadius: Double = js.native
    inline def cornerRadius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.enableArcLabels")
    @js.native
    def enableArcLabels: Boolean = js.native
    inline def enableArcLabels_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableArcLabels")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.inheritColorFromParent")
    @js.native
    def inheritColorFromParent: Boolean = js.native
    inline def inheritColorFromParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inheritColorFromParent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.layers")
    @js.native
    def layers: js.Array[SunburstLayerId] = js.native
    inline def layers_=(x: js.Array[SunburstLayerId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layers")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
    
    inline def tooltip[RawDatum](param0: ComputedDatum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@nivo/sunburst", "defaultProps.transitionMode")
    @js.native
    def transitionMode: startAngle | middleAngle | endAngle | innerRadius | centerRadius | outerRadius | pushIn | pushOut = js.native
    inline def transitionMode_=(
      x: startAngle | middleAngle | endAngle | innerRadius | centerRadius | outerRadius | pushIn | pushOut
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/sunburst", "defaultProps.value")
    @js.native
    def value: String = js.native
    inline def value_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def useSunburst[RawDatum](param0: ChildColor[RawDatum]): ArcGenerator[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSunburst")(param0.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator[RawDatum]]
  
  inline def useSunburstLayerContext[RawDatum](param0: SunburstCustomLayerProps[RawDatum]): SunburstCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSunburstLayerContext")(param0.asInstanceOf[js.Any]).asInstanceOf[SunburstCustomLayerProps[RawDatum]]
}
