package typings.playcanvas

import typings.playcanvas.pc.Ray
import typings.playcanvas.pc.XrHitTestSource
import typings.playcanvas.pc.callbacks.XrHitTestStart
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: js.UndefOr[XrHitTestStart] = js.undefined
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  var offsetRay: js.UndefOr[Ray] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var spaceType: js.UndefOr[String] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: (/* err */ Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit = null,
    entityTypes: js.Array[String] = null,
    offsetRay: Ray = null,
    profile: String = null,
    spaceType: String = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    if (offsetRay != null) __obj.updateDynamic("offsetRay")(offsetRay.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (spaceType != null) __obj.updateDynamic("spaceType")(spaceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

