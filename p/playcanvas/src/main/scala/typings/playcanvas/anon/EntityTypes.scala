package typings.playcanvas.anon

import typings.playcanvas.pc.Ray
import typings.playcanvas.pc.XrHitTestSource
import typings.playcanvas.pc.callbacks.XrHitTestStart
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityTypes extends js.Object {
  var callback: js.UndefOr[XrHitTestStart] = js.undefined
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  var offsetRay: js.UndefOr[Ray] = js.undefined
}

object EntityTypes {
  @scala.inline
  def apply(
    callback: (/* err */ Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit = null,
    entityTypes: js.Array[String] = null,
    offsetRay: Ray = null
  ): EntityTypes = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes.asInstanceOf[js.Any])
    if (offsetRay != null) __obj.updateDynamic("offsetRay")(offsetRay.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypes]
  }
}

