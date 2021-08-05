package typings.modularScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("modular-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: ModularScaleOptions): typings.modularScale.mod.modularScale = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[typings.modularScale.mod.modularScale]
  
  @JSImport("modular-scale", "ratios")
  @js.native
  val ratios: ModularScaleRatio = js.native
  
  trait ModularScaleOptions extends StObject {
    
    /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
    var base: js.UndefOr[Double | String] = js.undefined
    
    /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object ModularScaleOptions {
    
    inline def apply(): ModularScaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModularScaleOptions]
    }
    
    extension [Self <: ModularScaleOptions](x: Self) {
      
      inline def setBase(value: Double | String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  trait ModularScaleRatio extends StObject {
    
    var augFourth: Double
    
    var doubleOctave: Double
    
    var goldenSection: Double
    
    var majorEleventh: Double
    
    var majorSecond: Double
    
    var majorSeventh: Double
    
    var majorSixth: Double
    
    var majorTenth: Double
    
    var majorThird: Double
    
    var majorTwelfth: Double
    
    var minorSecond: Double
    
    var minorSeventh: Double
    
    var minorSixth: Double
    
    var minorThird: Double
    
    var octave: Double
    
    var perfectFifth: Double
    
    var perfectFourth: Double
  }
  object ModularScaleRatio {
    
    inline def apply(
      augFourth: Double,
      doubleOctave: Double,
      goldenSection: Double,
      majorEleventh: Double,
      majorSecond: Double,
      majorSeventh: Double,
      majorSixth: Double,
      majorTenth: Double,
      majorThird: Double,
      majorTwelfth: Double,
      minorSecond: Double,
      minorSeventh: Double,
      minorSixth: Double,
      minorThird: Double,
      octave: Double,
      perfectFifth: Double,
      perfectFourth: Double
    ): ModularScaleRatio = {
      val __obj = js.Dynamic.literal(augFourth = augFourth.asInstanceOf[js.Any], doubleOctave = doubleOctave.asInstanceOf[js.Any], goldenSection = goldenSection.asInstanceOf[js.Any], majorEleventh = majorEleventh.asInstanceOf[js.Any], majorSecond = majorSecond.asInstanceOf[js.Any], majorSeventh = majorSeventh.asInstanceOf[js.Any], majorSixth = majorSixth.asInstanceOf[js.Any], majorTenth = majorTenth.asInstanceOf[js.Any], majorThird = majorThird.asInstanceOf[js.Any], majorTwelfth = majorTwelfth.asInstanceOf[js.Any], minorSecond = minorSecond.asInstanceOf[js.Any], minorSeventh = minorSeventh.asInstanceOf[js.Any], minorSixth = minorSixth.asInstanceOf[js.Any], minorThird = minorThird.asInstanceOf[js.Any], octave = octave.asInstanceOf[js.Any], perfectFifth = perfectFifth.asInstanceOf[js.Any], perfectFourth = perfectFourth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModularScaleRatio]
    }
    
    extension [Self <: ModularScaleRatio](x: Self) {
      
      inline def setAugFourth(value: Double): Self = StObject.set(x, "augFourth", value.asInstanceOf[js.Any])
      
      inline def setDoubleOctave(value: Double): Self = StObject.set(x, "doubleOctave", value.asInstanceOf[js.Any])
      
      inline def setGoldenSection(value: Double): Self = StObject.set(x, "goldenSection", value.asInstanceOf[js.Any])
      
      inline def setMajorEleventh(value: Double): Self = StObject.set(x, "majorEleventh", value.asInstanceOf[js.Any])
      
      inline def setMajorSecond(value: Double): Self = StObject.set(x, "majorSecond", value.asInstanceOf[js.Any])
      
      inline def setMajorSeventh(value: Double): Self = StObject.set(x, "majorSeventh", value.asInstanceOf[js.Any])
      
      inline def setMajorSixth(value: Double): Self = StObject.set(x, "majorSixth", value.asInstanceOf[js.Any])
      
      inline def setMajorTenth(value: Double): Self = StObject.set(x, "majorTenth", value.asInstanceOf[js.Any])
      
      inline def setMajorThird(value: Double): Self = StObject.set(x, "majorThird", value.asInstanceOf[js.Any])
      
      inline def setMajorTwelfth(value: Double): Self = StObject.set(x, "majorTwelfth", value.asInstanceOf[js.Any])
      
      inline def setMinorSecond(value: Double): Self = StObject.set(x, "minorSecond", value.asInstanceOf[js.Any])
      
      inline def setMinorSeventh(value: Double): Self = StObject.set(x, "minorSeventh", value.asInstanceOf[js.Any])
      
      inline def setMinorSixth(value: Double): Self = StObject.set(x, "minorSixth", value.asInstanceOf[js.Any])
      
      inline def setMinorThird(value: Double): Self = StObject.set(x, "minorThird", value.asInstanceOf[js.Any])
      
      inline def setOctave(value: Double): Self = StObject.set(x, "octave", value.asInstanceOf[js.Any])
      
      inline def setPerfectFifth(value: Double): Self = StObject.set(x, "perfectFifth", value.asInstanceOf[js.Any])
      
      inline def setPerfectFourth(value: Double): Self = StObject.set(x, "perfectFourth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait modularScale extends StObject {
    
    def apply(step: Double): Double = js.native
    def apply(step: Double, relative: Boolean): Double = js.native
    
    def steps(steps: Double): js.Array[Double] = js.native
    def steps(steps: Double, relative: Boolean): js.Array[Double] = js.native
  }
}
