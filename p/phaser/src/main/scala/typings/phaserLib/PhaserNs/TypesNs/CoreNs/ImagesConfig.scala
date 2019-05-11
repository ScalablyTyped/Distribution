package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesConfig extends js.Object {
  /**
    * URL to use for the 'default' texture.
    */
  var default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to use for the 'missing' texture.
    */
  var missing: js.UndefOr[java.lang.String] = js.undefined
}

object ImagesConfig {
  @scala.inline
  def apply(default: java.lang.String = null, missing: java.lang.String = null): ImagesConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    __obj.asInstanceOf[ImagesConfig]
  }
}

