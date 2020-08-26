package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterBodyTileOptions extends js.Object {
  /**
    * Whether or not to add the newly created body (or existing body if options.body is used) to the Matter world.
    */
  var addToWorld: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the newly created body should be made static. This defaults to true since typically tiles should not be moved.
    */
  var isStatic: js.UndefOr[Boolean] = js.native
}

object MatterBodyTileOptions {
  @scala.inline
  def apply(): MatterBodyTileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyTileOptions]
  }
  @scala.inline
  implicit class MatterBodyTileOptionsOps[Self <: MatterBodyTileOptions] (val x: Self) extends AnyVal {
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
    def setAddToWorld(value: Boolean): Self = this.set("addToWorld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddToWorld: Self = this.set("addToWorld", js.undefined)
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStatic: Self = this.set("isStatic", js.undefined)
  }
  
}

