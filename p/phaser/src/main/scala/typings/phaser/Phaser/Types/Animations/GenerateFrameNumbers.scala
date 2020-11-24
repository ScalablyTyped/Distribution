package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateFrameNumbers extends js.Object {
  
  /**
    * The ending frame of the animation.
    */
  var end: js.UndefOr[integer] = js.native
  
  /**
    * A frame to put at the beginning of the animation, before `start` or `outputArray` or `frames`.
    */
  var first: js.UndefOr[Boolean | integer] = js.native
  
  /**
    * A custom sequence of frames.
    */
  var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
  
  /**
    * An array to concatenate the output onto.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
  
  /**
    * The starting frame of the animation.
    */
  var start: js.UndefOr[integer] = js.native
}
object GenerateFrameNumbers {
  
  @scala.inline
  def apply(): GenerateFrameNumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateFrameNumbers]
  }
  
  @scala.inline
  implicit class GenerateFrameNumbersOps[Self <: GenerateFrameNumbers] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Boolean | integer): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
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
    def setStart(value: integer): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
