package typings.phaser.Phaser.Types.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMContainerConfig extends js.Object {
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  var behindCanvas: js.UndefOr[Boolean] = js.native
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  var createContainer: js.UndefOr[Boolean] = js.native
}

object DOMContainerConfig {
  @scala.inline
  def apply(): DOMContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMContainerConfig]
  }
  @scala.inline
  implicit class DOMContainerConfigOps[Self <: DOMContainerConfig] (val x: Self) extends AnyVal {
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
    def setBehindCanvas(value: Boolean): Self = this.set("behindCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehindCanvas: Self = this.set("behindCanvas", js.undefined)
    @scala.inline
    def setCreateContainer(value: Boolean): Self = this.set("createContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateContainer: Self = this.set("createContainer", js.undefined)
  }
  
}

