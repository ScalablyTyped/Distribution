package typings.modularScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("modular-scale", JSImport.Default)
  @js.native
  def default(options: ModularScaleOptions): typings.modularScale.mod.modularScale = js.native
  
  @JSImport("modular-scale", "ratios")
  @js.native
  val ratios: ModularScaleRatio = js.native
  
  @js.native
  trait ModularScaleOptions extends StObject {
    
    /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
    var base: js.UndefOr[Double | String] = js.native
    
    /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
    var ratio: js.UndefOr[Double] = js.native
  }
  object ModularScaleOptions {
    
    @scala.inline
    def apply(): ModularScaleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModularScaleOptions]
    }
    
    @scala.inline
    implicit class ModularScaleOptionsMutableBuilder[Self <: ModularScaleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Double | String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  @js.native
  trait ModularScaleRatio extends StObject {
    
    var augFourth: Double = js.native
    
    var doubleOctave: Double = js.native
    
    var goldenSection: Double = js.native
    
    var majorEleventh: Double = js.native
    
    var majorSecond: Double = js.native
    
    var majorSeventh: Double = js.native
    
    var majorSixth: Double = js.native
    
    var majorTenth: Double = js.native
    
    var majorThird: Double = js.native
    
    var majorTwelfth: Double = js.native
    
    var minorSecond: Double = js.native
    
    var minorSeventh: Double = js.native
    
    var minorSixth: Double = js.native
    
    var minorThird: Double = js.native
    
    var octave: Double = js.native
    
    var perfectFifth: Double = js.native
    
    var perfectFourth: Double = js.native
  }
  object ModularScaleRatio {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ModularScaleRatioMutableBuilder[Self <: ModularScaleRatio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAugFourth(value: Double): Self = StObject.set(x, "augFourth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleOctave(value: Double): Self = StObject.set(x, "doubleOctave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldenSection(value: Double): Self = StObject.set(x, "goldenSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorEleventh(value: Double): Self = StObject.set(x, "majorEleventh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorSecond(value: Double): Self = StObject.set(x, "majorSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorSeventh(value: Double): Self = StObject.set(x, "majorSeventh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorSixth(value: Double): Self = StObject.set(x, "majorSixth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTenth(value: Double): Self = StObject.set(x, "majorTenth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorThird(value: Double): Self = StObject.set(x, "majorThird", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTwelfth(value: Double): Self = StObject.set(x, "majorTwelfth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorSecond(value: Double): Self = StObject.set(x, "minorSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorSeventh(value: Double): Self = StObject.set(x, "minorSeventh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorSixth(value: Double): Self = StObject.set(x, "minorSixth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorThird(value: Double): Self = StObject.set(x, "minorThird", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOctave(value: Double): Self = StObject.set(x, "octave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerfectFifth(value: Double): Self = StObject.set(x, "perfectFifth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerfectFourth(value: Double): Self = StObject.set(x, "perfectFourth", value.asInstanceOf[js.Any])
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
