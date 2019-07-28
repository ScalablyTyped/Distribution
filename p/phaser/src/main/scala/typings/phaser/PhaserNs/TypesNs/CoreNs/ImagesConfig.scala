package typings.phaser.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesConfig extends js.Object {
  /**
    * URL to use for the 'default' texture.
    */
  var default: js.UndefOr[String] = js.undefined
  /**
    * URL to use for the 'missing' texture.
    */
  var missing: js.UndefOr[String] = js.undefined
}

object ImagesConfig {
  @scala.inline
  def apply(default: String = null, missing: String = null): ImagesConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    __obj.asInstanceOf[ImagesConfig]
  }
}

