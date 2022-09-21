package typings.nivoLegends

import typings.nivoCore.mod.ValueFormat
import typings.nivoLegends.nivoLegendsStrings.after
import typings.nivoLegends.nivoLegendsStrings.before
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import typings.nivoLegends.typesTypesMod.LegendDirection
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  object continuousColorsLegendDefaults {
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.direction")
    @js.native
    def direction: NonNullable[js.UndefOr[LegendDirection]] = js.native
    inline def direction_=(x: NonNullable[js.UndefOr[LegendDirection]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.length")
    @js.native
    def length: NonNullable[js.UndefOr[Double]] = js.native
    inline def length_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.thickness")
    @js.native
    def thickness: NonNullable[js.UndefOr[Double]] = js.native
    inline def thickness_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thickness")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.tickFormat")
    @js.native
    def tickFormat: NonNullable[js.UndefOr[ValueFormat[Double, Unit]]] = js.native
    inline def tickFormat_=(x: NonNullable[js.UndefOr[ValueFormat[Double, Unit]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.tickOverlap")
    @js.native
    def tickOverlap: NonNullable[js.UndefOr[Boolean]] = js.native
    inline def tickOverlap_=(x: NonNullable[js.UndefOr[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.tickPosition")
    @js.native
    def tickPosition: NonNullable[js.UndefOr[before | after]] = js.native
    inline def tickPosition_=(x: NonNullable[js.UndefOr[before | after]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.tickSize")
    @js.native
    def tickSize: NonNullable[js.UndefOr[Double]] = js.native
    inline def tickSize_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.tickSpacing")
    @js.native
    def tickSpacing: NonNullable[js.UndefOr[Double]] = js.native
    inline def tickSpacing_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.titleAlign")
    @js.native
    def titleAlign: NonNullable[js.UndefOr[start | middle | end]] = js.native
    inline def titleAlign_=(x: NonNullable[js.UndefOr[start | middle | end]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/defaults", "continuousColorsLegendDefaults.titleOffset")
    @js.native
    def titleOffset: NonNullable[js.UndefOr[Double]] = js.native
    inline def titleOffset_=(x: NonNullable[js.UndefOr[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOffset")(x.asInstanceOf[js.Any])
  }
}
