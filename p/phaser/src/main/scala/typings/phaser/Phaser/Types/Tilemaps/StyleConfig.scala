package typings.phaser.Phaser.Types.Tilemaps

import typings.phaser.Phaser.Display.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleConfig extends js.Object {
  /**
    * Color to use for drawing a filled rectangle at colliding tile locations. If set to null, colliding tiles will not be drawn.
    */
  var collidingTileColor: js.UndefOr[Color | Double | Null] = js.native
  /**
    * Color to use for drawing a line at interesting tile faces. If set to null, interesting tile faces will not be drawn.
    */
  var faceColor: js.UndefOr[Color | Double | Null] = js.native
  /**
    * Color to use for drawing a filled rectangle at non-colliding tile locations. If set to null, non-colliding tiles will not be drawn.
    */
  var tileColor: js.UndefOr[Color | Double | Null] = js.native
}

object StyleConfig {
  @scala.inline
  def apply(): StyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleConfig]
  }
  @scala.inline
  implicit class StyleConfigOps[Self <: StyleConfig] (val x: Self) extends AnyVal {
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
    def setCollidingTileColor(value: Color | Double): Self = this.set("collidingTileColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollidingTileColor: Self = this.set("collidingTileColor", js.undefined)
    @scala.inline
    def setCollidingTileColorNull: Self = this.set("collidingTileColor", null)
    @scala.inline
    def setFaceColor(value: Color | Double): Self = this.set("faceColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceColor: Self = this.set("faceColor", js.undefined)
    @scala.inline
    def setFaceColorNull: Self = this.set("faceColor", null)
    @scala.inline
    def setTileColor(value: Color | Double): Self = this.set("tileColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileColor: Self = this.set("tileColor", js.undefined)
    @scala.inline
    def setTileColorNull: Self = this.set("tileColor", null)
  }
  
}

