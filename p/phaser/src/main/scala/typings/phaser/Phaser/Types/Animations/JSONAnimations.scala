package typings.phaser.Phaser.Types.Animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONAnimations extends js.Object {
  /**
    * An array of all Animations added to the Animation Manager.
    */
  var anims: js.Array[JSONAnimation] = js.native
  /**
    * The global time scale of the Animation Manager.
    */
  var globalTimeScale: Double = js.native
}

object JSONAnimations {
  @scala.inline
  def apply(anims: js.Array[JSONAnimation], globalTimeScale: Double): JSONAnimations = {
    val __obj = js.Dynamic.literal(anims = anims.asInstanceOf[js.Any], globalTimeScale = globalTimeScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAnimations]
  }
  @scala.inline
  implicit class JSONAnimationsOps[Self <: JSONAnimations] (val x: Self) extends AnyVal {
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
    def setAnimsVarargs(value: JSONAnimation*): Self = this.set("anims", js.Array(value :_*))
    @scala.inline
    def setAnims(value: js.Array[JSONAnimation]): Self = this.set("anims", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalTimeScale(value: Double): Self = this.set("globalTimeScale", value.asInstanceOf[js.Any])
  }
  
}

