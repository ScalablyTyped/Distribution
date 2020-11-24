package typings.modularScale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModularScaleRatio extends js.Object {
  
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
  implicit class ModularScaleRatioOps[Self <: ModularScaleRatio] (val x: Self) extends AnyVal {
    
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
    def setAugFourth(value: Double): Self = this.set("augFourth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleOctave(value: Double): Self = this.set("doubleOctave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoldenSection(value: Double): Self = this.set("goldenSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorEleventh(value: Double): Self = this.set("majorEleventh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorSecond(value: Double): Self = this.set("majorSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorSeventh(value: Double): Self = this.set("majorSeventh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorSixth(value: Double): Self = this.set("majorSixth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTenth(value: Double): Self = this.set("majorTenth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorThird(value: Double): Self = this.set("majorThird", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTwelfth(value: Double): Self = this.set("majorTwelfth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorSecond(value: Double): Self = this.set("minorSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorSeventh(value: Double): Self = this.set("minorSeventh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorSixth(value: Double): Self = this.set("minorSixth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorThird(value: Double): Self = this.set("minorThird", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOctave(value: Double): Self = this.set("octave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfectFifth(value: Double): Self = this.set("perfectFifth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfectFourth(value: Double): Self = this.set("perfectFourth", value.asInstanceOf[js.Any])
  }
}
