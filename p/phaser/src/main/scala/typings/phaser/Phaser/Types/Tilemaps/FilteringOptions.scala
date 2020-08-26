package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringOptions extends js.Object {
  /**
    * If true, only return tiles that have at least one interesting face.
    */
  var hasInterestingFace: js.UndefOr[Boolean] = js.native
  /**
    * If true, only return tiles that collide on at least one side.
    */
  var isColliding: js.UndefOr[Boolean] = js.native
  /**
    * If true, only return tiles that don't have -1 for an index.
    */
  var isNotEmpty: js.UndefOr[Boolean] = js.native
}

object FilteringOptions {
  @scala.inline
  def apply(): FilteringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringOptions]
  }
  @scala.inline
  implicit class FilteringOptionsOps[Self <: FilteringOptions] (val x: Self) extends AnyVal {
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
    def setHasInterestingFace(value: Boolean): Self = this.set("hasInterestingFace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasInterestingFace: Self = this.set("hasInterestingFace", js.undefined)
    @scala.inline
    def setIsColliding(value: Boolean): Self = this.set("isColliding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColliding: Self = this.set("isColliding", js.undefined)
    @scala.inline
    def setIsNotEmpty(value: Boolean): Self = this.set("isNotEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNotEmpty: Self = this.set("isNotEmpty", js.undefined)
  }
  
}

