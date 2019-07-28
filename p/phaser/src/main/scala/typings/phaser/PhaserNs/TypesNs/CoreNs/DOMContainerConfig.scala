package typings.phaser.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMContainerConfig extends js.Object {
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  var behindCanvas: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  var createContainer: js.UndefOr[Boolean] = js.undefined
}

object DOMContainerConfig {
  @scala.inline
  def apply(
    behindCanvas: js.UndefOr[Boolean] = js.undefined,
    createContainer: js.UndefOr[Boolean] = js.undefined
  ): DOMContainerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(behindCanvas)) __obj.updateDynamic("behindCanvas")(behindCanvas)
    if (!js.isUndefined(createContainer)) __obj.updateDynamic("createContainer")(createContainer)
    __obj.asInstanceOf[DOMContainerConfig]
  }
}

