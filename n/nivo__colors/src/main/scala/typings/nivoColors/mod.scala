package typings.nivoColors

import typings.d3Scale.mod.ScaleDiverging_
import typings.d3Scale.mod.ScaleQuantize_
import typings.d3Scale.mod.ScaleSequential_
import typings.nivoColors.anon.Datum
import typings.nivoColors.anon.From
import typings.nivoColors.anon.Key
import typings.nivoColors.anon.PartialPickCompleteThemeb
import typings.nivoColors.anon.Scheme
import typings.nivoColors.anon.Theme
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfigCustomFunction
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleConfig
import typings.nivoColors.distTypesScalesContinuousColorScaleMod.ContinuousColorScaleValues
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleColorsConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesDivergingColorScaleMod.DivergingColorScaleValues
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.DatumIdentityAccessor
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleColorsConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesQuantizeColorScaleMod.QuantizeColorScaleValues
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleColorsConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleInterpolatorConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleSchemeConfig
import typings.nivoColors.distTypesScalesSequentialColorScaleMod.SequentialColorScaleValues
import typings.nivoColors.distTypesSchemesAllMod.ColorSchemeId
import typings.nivoColors.distTypesSchemesInterpolatorsMod.ColorInterpolatorId
import typings.nivoColors.nivoColorsStrings.accent
import typings.nivoColors.nivoColorsStrings.blue_green
import typings.nivoColors.nivoColorsStrings.blue_purple
import typings.nivoColors.nivoColorsStrings.blues
import typings.nivoColors.nivoColorsStrings.brown_blueGreen
import typings.nivoColors.nivoColorsStrings.category10
import typings.nivoColors.nivoColorsStrings.dark2
import typings.nivoColors.nivoColorsStrings.green_blue
import typings.nivoColors.nivoColorsStrings.greens
import typings.nivoColors.nivoColorsStrings.greys
import typings.nivoColors.nivoColorsStrings.nivo
import typings.nivoColors.nivoColorsStrings.orange_red
import typings.nivoColors.nivoColorsStrings.oranges
import typings.nivoColors.nivoColorsStrings.paired
import typings.nivoColors.nivoColorsStrings.pastel1
import typings.nivoColors.nivoColorsStrings.pastel2
import typings.nivoColors.nivoColorsStrings.pink_yellowGreen
import typings.nivoColors.nivoColorsStrings.purpleRed_green
import typings.nivoColors.nivoColorsStrings.purple_blue
import typings.nivoColors.nivoColorsStrings.purple_blue_green
import typings.nivoColors.nivoColorsStrings.purple_orange
import typings.nivoColors.nivoColorsStrings.purple_red
import typings.nivoColors.nivoColorsStrings.purples
import typings.nivoColors.nivoColorsStrings.red_blue
import typings.nivoColors.nivoColorsStrings.red_grey
import typings.nivoColors.nivoColorsStrings.red_purple
import typings.nivoColors.nivoColorsStrings.red_yellow_blue
import typings.nivoColors.nivoColorsStrings.red_yellow_green
import typings.nivoColors.nivoColorsStrings.reds
import typings.nivoColors.nivoColorsStrings.set1
import typings.nivoColors.nivoColorsStrings.set2
import typings.nivoColors.nivoColorsStrings.set3
import typings.nivoColors.nivoColorsStrings.spectral
import typings.nivoColors.nivoColorsStrings.yellow_green
import typings.nivoColors.nivoColorsStrings.yellow_green_blue
import typings.nivoColors.nivoColorsStrings.yellow_orange_brown
import typings.nivoColors.nivoColorsStrings.yellow_orange_red
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/colors", "categoricalColorSchemeIds")
  @js.native
  val categoricalColorSchemeIds: js.Array[
    nivo | category10 | accent | dark2 | paired | pastel1 | pastel2 | set1 | set2 | set3
  ] = js.native
  
  object categoricalColorSchemes {
    
    @JSImport("@nivo/colors", "categoricalColorSchemes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.accent")
    @js.native
    def accent: js.Array[String] = js.native
    inline def accent_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.category10")
    @js.native
    def category10: js.Array[String] = js.native
    inline def category10_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category10")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.dark2")
    @js.native
    def dark2: js.Array[String] = js.native
    inline def dark2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.nivo")
    @js.native
    def nivo: js.Array[String] = js.native
    inline def nivo_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nivo")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.paired")
    @js.native
    def paired: js.Array[String] = js.native
    inline def paired_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paired")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.pastel1")
    @js.native
    def pastel1: js.Array[String] = js.native
    inline def pastel1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.pastel2")
    @js.native
    def pastel2: js.Array[String] = js.native
    inline def pastel2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.set1")
    @js.native
    def set1: js.Array[String] = js.native
    inline def set1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.set2")
    @js.native
    def set2: js.Array[String] = js.native
    inline def set2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "categoricalColorSchemes.set3")
    @js.native
    def set3: js.Array[String] = js.native
    inline def set3_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set3")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/colors", "colorInterpolatorIds")
  @js.native
  val colorInterpolatorIds: js.Array[ColorInterpolatorId] = js.native
  
  object colorInterpolators {
    
    @JSImport("@nivo/colors", "colorInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "colorInterpolators.blue_green")
    @js.native
    def blueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def blueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.blue_purple")
    @js.native
    def bluePurple: js.Function1[/* t */ Double, String] = js.native
    
    inline def bluePurple_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.blues")
    @js.native
    def blues: js.Function1[/* t */ Double, String] = js.native
    inline def blues_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.brown_blueGreen")
    @js.native
    def brownBlueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def brownBlueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown_blueGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.cividis")
    @js.native
    def cividis: js.Function1[/* t */ Double, String] = js.native
    inline def cividis_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cividis")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.cool")
    @js.native
    def cool: js.Function1[/* t */ Double, String] = js.native
    inline def cool_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cool")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.cubehelixDefault")
    @js.native
    def cubehelixDefault: js.Function1[/* t */ Double, String] = js.native
    inline def cubehelixDefault_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubehelixDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.green_blue")
    @js.native
    def greenBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def greenBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.greens")
    @js.native
    def greens: js.Function1[/* t */ Double, String] = js.native
    inline def greens_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greens")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.greys")
    @js.native
    def greys: js.Function1[/* t */ Double, String] = js.native
    inline def greys_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.inferno")
    @js.native
    def inferno: js.Function1[/* t */ Double, String] = js.native
    inline def inferno_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inferno")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.magma")
    @js.native
    def magma: js.Function1[/* t */ Double, String] = js.native
    inline def magma_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magma")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.orange_red")
    @js.native
    def orangeRed: js.Function1[/* t */ Double, String] = js.native
    
    inline def orangeRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.oranges")
    @js.native
    def oranges: js.Function1[/* t */ Double, String] = js.native
    inline def oranges_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oranges")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.pink_yellowGreen")
    @js.native
    def pinkYellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def pinkYellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink_yellowGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.plasma")
    @js.native
    def plasma: js.Function1[/* t */ Double, String] = js.native
    inline def plasma_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plasma")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.purple_blue")
    @js.native
    def purpleBlue: js.Function1[/* t */ Double, String] = js.native
    
    @JSImport("@nivo/colors", "colorInterpolators.purple_blue_green")
    @js.native
    def purpleBlueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleBlueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue_green")(x.asInstanceOf[js.Any])
    
    inline def purpleBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.purple_orange")
    @js.native
    def purpleOrange: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleOrange_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.purple_red")
    @js.native
    def purpleRed: js.Function1[/* t */ Double, String] = js.native
    
    @JSImport("@nivo/colors", "colorInterpolators.purpleRed_green")
    @js.native
    def purpleRedGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleRedGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purpleRed_green")(x.asInstanceOf[js.Any])
    
    inline def purpleRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.purples")
    @js.native
    def purples: js.Function1[/* t */ Double, String] = js.native
    inline def purples_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purples")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.rainbow")
    @js.native
    def rainbow: js.Function1[/* t */ Double, String] = js.native
    inline def rainbow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rainbow")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.red_blue")
    @js.native
    def redBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def redBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.red_grey")
    @js.native
    def redGrey: js.Function1[/* t */ Double, String] = js.native
    
    inline def redGrey_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.red_purple")
    @js.native
    def redPurple: js.Function1[/* t */ Double, String] = js.native
    
    inline def redPurple_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.red_yellow_blue")
    @js.native
    def redYellowBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def redYellowBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.red_yellow_green")
    @js.native
    def redYellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def redYellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.reds")
    @js.native
    def reds: js.Function1[/* t */ Double, String] = js.native
    inline def reds_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.sinebow")
    @js.native
    def sinebow: js.Function1[/* t */ Double, String] = js.native
    inline def sinebow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinebow")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.spectral")
    @js.native
    def spectral: js.Function1[/* t */ Double, String] = js.native
    inline def spectral_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spectral")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.turbo")
    @js.native
    def turbo: js.Function1[/* t */ Double, String] = js.native
    inline def turbo_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turbo")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.viridis")
    @js.native
    def viridis: js.Function1[/* t */ Double, String] = js.native
    inline def viridis_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viridis")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.warm")
    @js.native
    def warm: js.Function1[/* t */ Double, String] = js.native
    inline def warm_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warm")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.yellow_green")
    @js.native
    def yellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    @JSImport("@nivo/colors", "colorInterpolators.yellow_green_blue")
    @js.native
    def yellowGreenBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowGreenBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green_blue")(x.asInstanceOf[js.Any])
    
    inline def yellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.yellow_orange_brown")
    @js.native
    def yellowOrangeBrown: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowOrangeBrown_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorInterpolators.yellow_orange_red")
    @js.native
    def yellowOrangeRed: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowOrangeRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_red")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/colors", "colorSchemeIds")
  @js.native
  val colorSchemeIds: js.Array[ColorSchemeId] = js.native
  
  object colorSchemes {
    
    @JSImport("@nivo/colors", "colorSchemes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "colorSchemes.accent")
    @js.native
    def accent: js.Array[String] = js.native
    inline def accent_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accent")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.blue_green")
    @js.native
    def blueGreen: js.Array[js.Array[String]] = js.native
    
    inline def blueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.blue_purple")
    @js.native
    def bluePurple: js.Array[js.Array[String]] = js.native
    
    inline def bluePurple_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.blues")
    @js.native
    def blues: js.Array[js.Array[String]] = js.native
    inline def blues_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.brown_blueGreen")
    @js.native
    def brownBlueGreen: js.Array[js.Array[String]] = js.native
    
    inline def brownBlueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown_blueGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.category10")
    @js.native
    def category10: js.Array[String] = js.native
    inline def category10_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category10")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.dark2")
    @js.native
    def dark2: js.Array[String] = js.native
    inline def dark2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.green_blue")
    @js.native
    def greenBlue: js.Array[js.Array[String]] = js.native
    
    inline def greenBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.greens")
    @js.native
    def greens: js.Array[js.Array[String]] = js.native
    inline def greens_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greens")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.greys")
    @js.native
    def greys: js.Array[js.Array[String]] = js.native
    inline def greys_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.nivo")
    @js.native
    def nivo: js.Array[String] = js.native
    inline def nivo_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nivo")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.orange_red")
    @js.native
    def orangeRed: js.Array[js.Array[String]] = js.native
    
    inline def orangeRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.oranges")
    @js.native
    def oranges: js.Array[js.Array[String]] = js.native
    inline def oranges_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oranges")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.paired")
    @js.native
    def paired: js.Array[String] = js.native
    inline def paired_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paired")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.pastel1")
    @js.native
    def pastel1: js.Array[String] = js.native
    inline def pastel1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.pastel2")
    @js.native
    def pastel2: js.Array[String] = js.native
    inline def pastel2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pastel2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.pink_yellowGreen")
    @js.native
    def pinkYellowGreen: js.Array[js.Array[String]] = js.native
    
    inline def pinkYellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink_yellowGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.purple_blue")
    @js.native
    def purpleBlue: js.Array[js.Array[String]] = js.native
    
    @JSImport("@nivo/colors", "colorSchemes.purple_blue_green")
    @js.native
    def purpleBlueGreen: js.Array[js.Array[String]] = js.native
    
    inline def purpleBlueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue_green")(x.asInstanceOf[js.Any])
    
    inline def purpleBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.purple_orange")
    @js.native
    def purpleOrange: js.Array[js.Array[String]] = js.native
    
    inline def purpleOrange_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.purple_red")
    @js.native
    def purpleRed: js.Array[js.Array[String]] = js.native
    
    @JSImport("@nivo/colors", "colorSchemes.purpleRed_green")
    @js.native
    def purpleRedGreen: js.Array[js.Array[String]] = js.native
    
    inline def purpleRedGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purpleRed_green")(x.asInstanceOf[js.Any])
    
    inline def purpleRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.purples")
    @js.native
    def purples: js.Array[js.Array[String]] = js.native
    inline def purples_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purples")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.red_blue")
    @js.native
    def redBlue: js.Array[js.Array[String]] = js.native
    
    inline def redBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.red_grey")
    @js.native
    def redGrey: js.Array[js.Array[String]] = js.native
    
    inline def redGrey_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.red_purple")
    @js.native
    def redPurple: js.Array[js.Array[String]] = js.native
    
    inline def redPurple_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.red_yellow_blue")
    @js.native
    def redYellowBlue: js.Array[js.Array[String]] = js.native
    
    inline def redYellowBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.red_yellow_green")
    @js.native
    def redYellowGreen: js.Array[js.Array[String]] = js.native
    
    inline def redYellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.reds")
    @js.native
    def reds: js.Array[js.Array[String]] = js.native
    inline def reds_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.set1")
    @js.native
    def set1: js.Array[String] = js.native
    inline def set1_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set1")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.set2")
    @js.native
    def set2: js.Array[String] = js.native
    inline def set2_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set2")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.set3")
    @js.native
    def set3: js.Array[String] = js.native
    inline def set3_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set3")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.spectral")
    @js.native
    def spectral: js.Array[js.Array[String]] = js.native
    inline def spectral_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spectral")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.yellow_green")
    @js.native
    def yellowGreen: js.Array[js.Array[String]] = js.native
    
    @JSImport("@nivo/colors", "colorSchemes.yellow_green_blue")
    @js.native
    def yellowGreenBlue: js.Array[js.Array[String]] = js.native
    
    inline def yellowGreenBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green_blue")(x.asInstanceOf[js.Any])
    
    inline def yellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.yellow_orange_brown")
    @js.native
    def yellowOrangeBrown: js.Array[js.Array[String]] = js.native
    
    inline def yellowOrangeBrown_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "colorSchemes.yellow_orange_red")
    @js.native
    def yellowOrangeRed: js.Array[js.Array[String]] = js.native
    
    inline def yellowOrangeRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_red")(x.asInstanceOf[js.Any])
  }
  
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleDiverging_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleQuantize_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  inline def computeContinuousColorScaleColorStops(scale: ScaleSequential_[String, scala.Nothing], steps: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeContinuousColorScaleColorStops")(scale.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  object cyclicalColorInterpolators {
    
    @JSImport("@nivo/colors", "cyclicalColorInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "cyclicalColorInterpolators.rainbow")
    @js.native
    def rainbow: js.Function1[/* t */ Double, String] = js.native
    inline def rainbow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rainbow")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "cyclicalColorInterpolators.sinebow")
    @js.native
    def sinebow: js.Function1[/* t */ Double, String] = js.native
    inline def sinebow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinebow")(x.asInstanceOf[js.Any])
  }
  
  object divergingColorInterpolators {
    
    @JSImport("@nivo/colors", "divergingColorInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.brown_blueGreen")
    @js.native
    def brownBlueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def brownBlueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown_blueGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.pink_yellowGreen")
    @js.native
    def pinkYellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def pinkYellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink_yellowGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.purple_orange")
    @js.native
    def purpleOrange: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleOrange_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.purpleRed_green")
    @js.native
    def purpleRedGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleRedGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purpleRed_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.red_blue")
    @js.native
    def redBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def redBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.red_grey")
    @js.native
    def redGrey: js.Function1[/* t */ Double, String] = js.native
    
    inline def redGrey_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.red_yellow_blue")
    @js.native
    def redYellowBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def redYellowBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.red_yellow_green")
    @js.native
    def redYellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def redYellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorInterpolators.spectral")
    @js.native
    def spectral: js.Function1[/* t */ Double, String] = js.native
    inline def spectral_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spectral")(x.asInstanceOf[js.Any])
  }
  
  object divergingColorScaleDefaults {
    
    @JSImport("@nivo/colors", "divergingColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "divergingColorScaleDefaults.divergeAt")
    @js.native
    def divergeAt: Double = js.native
    inline def divergeAt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("divergeAt")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/colors", "divergingColorSchemeIds")
  @js.native
  val divergingColorSchemeIds: js.Array[
    brown_blueGreen | purpleRed_green | pink_yellowGreen | purple_orange | red_blue | red_grey | red_yellow_blue | red_yellow_green | spectral
  ] = js.native
  
  object divergingColorSchemes {
    
    @JSImport("@nivo/colors", "divergingColorSchemes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "divergingColorSchemes.brown_blueGreen")
    @js.native
    def brownBlueGreen: js.Array[js.Array[String]] = js.native
    
    inline def brownBlueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown_blueGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.pink_yellowGreen")
    @js.native
    def pinkYellowGreen: js.Array[js.Array[String]] = js.native
    
    inline def pinkYellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink_yellowGreen")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.purple_orange")
    @js.native
    def purpleOrange: js.Array[js.Array[String]] = js.native
    
    inline def purpleOrange_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_orange")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.purpleRed_green")
    @js.native
    def purpleRedGreen: js.Array[js.Array[String]] = js.native
    
    inline def purpleRedGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purpleRed_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.red_blue")
    @js.native
    def redBlue: js.Array[js.Array[String]] = js.native
    
    inline def redBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.red_grey")
    @js.native
    def redGrey: js.Array[js.Array[String]] = js.native
    
    inline def redGrey_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_grey")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.red_yellow_blue")
    @js.native
    def redYellowBlue: js.Array[js.Array[String]] = js.native
    
    inline def redYellowBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.red_yellow_green")
    @js.native
    def redYellowGreen: js.Array[js.Array[String]] = js.native
    
    inline def redYellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "divergingColorSchemes.spectral")
    @js.native
    def spectral: js.Array[js.Array[String]] = js.native
    inline def spectral_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spectral")(x.asInstanceOf[js.Any])
  }
  
  inline def getContinuousColorScale(config: DivergingColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: DivergingColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: QuantizeColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleColorsConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleInterpolatorConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  inline def getContinuousColorScale(config: SequentialColorScaleSchemeConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def getDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  inline def getInheritedColorGenerator[Datum](config: InheritedColorConfig[Datum]): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getInheritedColorGenerator")(config.asInstanceOf[js.Any]).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  inline def getInheritedColorGenerator[Datum](config: InheritedColorConfig[Datum], theme: PartialPickCompleteThemeb): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("getInheritedColorGenerator")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum]): OrdinalColorScale[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any]).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def getOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  inline def getQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  inline def getSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
  
  @JSImport("@nivo/colors", "inheritedColorPropType")
  @js.native
  val inheritedColorPropType: Requireable[String | (js.Function1[/* repeated */ Any, Any]) | (InferProps[From | Theme])] = js.native
  
  inline def isCategoricalColorScheme(scheme: ColorSchemeId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCategoricalColorScheme")(scheme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDivergingColorScheme(scheme: ColorSchemeId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDivergingColorScheme")(scheme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSequentialColorScheme(scheme: ColorSchemeId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSequentialColorScheme")(scheme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@nivo/colors", "ordinalColorsPropType")
  @js.native
  val ordinalColorsPropType: Requireable[
    String | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]]) | (InferProps[Datum | Scheme])
  ] = js.native
  
  object quantizeColorScaleDefaults {
    
    @JSImport("@nivo/colors", "quantizeColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "quantizeColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "quantizeColorScaleDefaults.steps")
    @js.native
    def steps: NonNullable[js.UndefOr[Double]] = js.native
    inline def steps_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("steps")(x.asInstanceOf[js.Any])
  }
  
  object sequentialColorInterpolators {
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.blue_green")
    @js.native
    def blueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def blueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.blue_purple")
    @js.native
    def bluePurple: js.Function1[/* t */ Double, String] = js.native
    
    inline def bluePurple_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.blues")
    @js.native
    def blues: js.Function1[/* t */ Double, String] = js.native
    inline def blues_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.cividis")
    @js.native
    def cividis: js.Function1[/* t */ Double, String] = js.native
    inline def cividis_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cividis")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.cool")
    @js.native
    def cool: js.Function1[/* t */ Double, String] = js.native
    inline def cool_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cool")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.cubehelixDefault")
    @js.native
    def cubehelixDefault: js.Function1[/* t */ Double, String] = js.native
    inline def cubehelixDefault_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubehelixDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.green_blue")
    @js.native
    def greenBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def greenBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.greens")
    @js.native
    def greens: js.Function1[/* t */ Double, String] = js.native
    inline def greens_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greens")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.greys")
    @js.native
    def greys: js.Function1[/* t */ Double, String] = js.native
    inline def greys_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.inferno")
    @js.native
    def inferno: js.Function1[/* t */ Double, String] = js.native
    inline def inferno_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inferno")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.magma")
    @js.native
    def magma: js.Function1[/* t */ Double, String] = js.native
    inline def magma_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magma")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.orange_red")
    @js.native
    def orangeRed: js.Function1[/* t */ Double, String] = js.native
    
    inline def orangeRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.oranges")
    @js.native
    def oranges: js.Function1[/* t */ Double, String] = js.native
    inline def oranges_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oranges")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.plasma")
    @js.native
    def plasma: js.Function1[/* t */ Double, String] = js.native
    inline def plasma_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plasma")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.purple_blue")
    @js.native
    def purpleBlue: js.Function1[/* t */ Double, String] = js.native
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.purple_blue_green")
    @js.native
    def purpleBlueGreen: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleBlueGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue_green")(x.asInstanceOf[js.Any])
    
    inline def purpleBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.purple_red")
    @js.native
    def purpleRed: js.Function1[/* t */ Double, String] = js.native
    
    inline def purpleRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.purples")
    @js.native
    def purples: js.Function1[/* t */ Double, String] = js.native
    inline def purples_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purples")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.red_purple")
    @js.native
    def redPurple: js.Function1[/* t */ Double, String] = js.native
    
    inline def redPurple_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.reds")
    @js.native
    def reds: js.Function1[/* t */ Double, String] = js.native
    inline def reds_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.turbo")
    @js.native
    def turbo: js.Function1[/* t */ Double, String] = js.native
    inline def turbo_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("turbo")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.viridis")
    @js.native
    def viridis: js.Function1[/* t */ Double, String] = js.native
    inline def viridis_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viridis")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.warm")
    @js.native
    def warm: js.Function1[/* t */ Double, String] = js.native
    inline def warm_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warm")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.yellow_green")
    @js.native
    def yellowGreen: js.Function1[/* t */ Double, String] = js.native
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.yellow_green_blue")
    @js.native
    def yellowGreenBlue: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowGreenBlue_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green_blue")(x.asInstanceOf[js.Any])
    
    inline def yellowGreen_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.yellow_orange_brown")
    @js.native
    def yellowOrangeBrown: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowOrangeBrown_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorInterpolators.yellow_orange_red")
    @js.native
    def yellowOrangeRed: js.Function1[/* t */ Double, String] = js.native
    
    inline def yellowOrangeRed_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_red")(x.asInstanceOf[js.Any])
  }
  
  object sequentialColorScaleDefaults {
    
    @JSImport("@nivo/colors", "sequentialColorScaleDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "sequentialColorScaleDefaults.scheme")
    @js.native
    def scheme: ColorInterpolatorId = js.native
    inline def scheme_=(x: ColorInterpolatorId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@nivo/colors", "sequentialColorSchemeIds")
  @js.native
  val sequentialColorSchemeIds: js.Array[
    blues | greens | greys | oranges | purples | reds | blue_green | blue_purple | green_blue | orange_red | purple_blue_green | purple_blue | purple_red | red_purple | yellow_green_blue | yellow_green | yellow_orange_brown | yellow_orange_red
  ] = js.native
  
  object sequentialColorSchemes {
    
    @JSImport("@nivo/colors", "sequentialColorSchemes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.blue_green")
    @js.native
    def blueGreen: js.Array[js.Array[String]] = js.native
    
    inline def blueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.blue_purple")
    @js.native
    def bluePurple: js.Array[js.Array[String]] = js.native
    
    inline def bluePurple_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.blues")
    @js.native
    def blues: js.Array[js.Array[String]] = js.native
    inline def blues_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blues")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.green_blue")
    @js.native
    def greenBlue: js.Array[js.Array[String]] = js.native
    
    inline def greenBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.greens")
    @js.native
    def greens: js.Array[js.Array[String]] = js.native
    inline def greens_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greens")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.greys")
    @js.native
    def greys: js.Array[js.Array[String]] = js.native
    inline def greys_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("greys")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.orange_red")
    @js.native
    def orangeRed: js.Array[js.Array[String]] = js.native
    
    inline def orangeRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.oranges")
    @js.native
    def oranges: js.Array[js.Array[String]] = js.native
    inline def oranges_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oranges")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.purple_blue")
    @js.native
    def purpleBlue: js.Array[js.Array[String]] = js.native
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.purple_blue_green")
    @js.native
    def purpleBlueGreen: js.Array[js.Array[String]] = js.native
    
    inline def purpleBlueGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue_green")(x.asInstanceOf[js.Any])
    
    inline def purpleBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_blue")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.purple_red")
    @js.native
    def purpleRed: js.Array[js.Array[String]] = js.native
    
    inline def purpleRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple_red")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.purples")
    @js.native
    def purples: js.Array[js.Array[String]] = js.native
    inline def purples_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purples")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.red_purple")
    @js.native
    def redPurple: js.Array[js.Array[String]] = js.native
    
    inline def redPurple_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red_purple")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.reds")
    @js.native
    def reds: js.Array[js.Array[String]] = js.native
    inline def reds_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reds")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.yellow_green")
    @js.native
    def yellowGreen: js.Array[js.Array[String]] = js.native
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.yellow_green_blue")
    @js.native
    def yellowGreenBlue: js.Array[js.Array[String]] = js.native
    
    inline def yellowGreenBlue_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green_blue")(x.asInstanceOf[js.Any])
    
    inline def yellowGreen_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_green")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.yellow_orange_brown")
    @js.native
    def yellowOrangeBrown: js.Array[js.Array[String]] = js.native
    
    inline def yellowOrangeBrown_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_brown")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors", "sequentialColorSchemes.yellow_orange_red")
    @js.native
    def yellowOrangeRed: js.Array[js.Array[String]] = js.native
    
    inline def yellowOrangeRed_=(x: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow_orange_red")(x.asInstanceOf[js.Any])
  }
  
  inline def useContinuousColorScale(config: ContinuousColorScaleConfig, values: ContinuousColorScaleValues): (ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useContinuousColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[(ScaleSequential_[String, scala.Nothing]) | (ScaleDiverging_[String, scala.Nothing]) | (ScaleQuantize_[String, scala.Nothing])]
  
  inline def useDivergingColorScale(config: DivergingColorScaleConfig, values: DivergingColorScaleValues): ScaleDiverging_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDivergingColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleDiverging_[String, scala.Nothing]]
  
  inline def useInheritedColor[Datum](config: InheritedColorConfig[Datum]): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useInheritedColor")(config.asInstanceOf[js.Any]).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  inline def useInheritedColor[Datum](config: InheritedColorConfig[Datum], theme: PartialPickCompleteThemeb): InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useInheritedColor")(config.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[InheritedColorConfigCustomFunction[Datum] | (js.Function1[/* d */ Datum, Any])]
  
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: String): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  inline def useOrdinalColorScale[Datum](config: OrdinalColorScaleConfig[Datum], identity: DatumIdentityAccessor[Datum]): OrdinalColorScale[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOrdinalColorScale")(config.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[OrdinalColorScale[Datum]]
  
  inline def useQuantizeColorScale(config: QuantizeColorScaleConfig, values: QuantizeColorScaleValues): ScaleQuantize_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuantizeColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleQuantize_[String, scala.Nothing]]
  
  inline def useSequentialColorScale(config: SequentialColorScaleConfig, values: SequentialColorScaleValues): ScaleSequential_[String, scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSequentialColorScale")(config.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ScaleSequential_[String, scala.Nothing]]
}
