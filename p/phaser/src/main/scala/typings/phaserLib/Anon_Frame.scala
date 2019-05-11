package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frame extends js.Object {
  /**
    * An optional frame from the Texture this Game Object is rendering with.
    */
  var frame: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Frame {
  @scala.inline
  def apply(frame: scala.Double | java.lang.String = null, key: java.lang.String = null): Anon_Frame = {
    val __obj = js.Dynamic.literal()
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Frame]
  }
}

