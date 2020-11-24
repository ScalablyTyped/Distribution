package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateFrameNames extends js.Object {
  
  /**
    * If `frames` is not provided, the number of the last frame to return.
    */
  var end: js.UndefOr[integer] = js.native
  
  /**
    * If provided as an array, the range defined by `start` and `end` will be ignored and these frame numbers will be used.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
  
  /**
    * The array to append the created configuration objects to.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
  
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * If `frames` is not provided, the number of the first frame to return.
    */
  var start: js.UndefOr[integer] = js.native
  
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var suffix: js.UndefOr[String] = js.native
  
  /**
    * The minimum expected lengths of each resulting frame's number. Numbers will be left-padded with zeroes until they are this long, then prepended and appended to create the resulting frame name.
    */
  var zeroPad: js.UndefOr[integer] = js.native
}
object GenerateFrameNames {
  
  @scala.inline
  def apply(): GenerateFrameNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateFrameNames]
  }
  
  @scala.inline
  implicit class GenerateFrameNamesOps[Self <: GenerateFrameNames] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: integer): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: integer*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: Boolean | js.Array[integer]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setOutputArrayVarargs(value: AnimationFrame*): Self = this.set("outputArray", js.Array(value :_*))
    
    @scala.inline
    def setOutputArray(value: js.Array[AnimationFrame]): Self = this.set("outputArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArray: Self = this.set("outputArray", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setStart(value: integer): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setZeroPad(value: integer): Self = this.set("zeroPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroPad: Self = this.set("zeroPad", js.undefined)
  }
}
