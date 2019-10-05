package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The structure of an app glance.
  */
trait AppGlanceSlice extends js.Object {
  var expirationTime: js.UndefOr[String] = js.undefined
  var layout: Layout
}

object AppGlanceSlice {
  @scala.inline
  def apply(layout: Layout, expirationTime: String = null): AppGlanceSlice = {
    val __obj = js.Dynamic.literal(layout = layout)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    __obj.asInstanceOf[AppGlanceSlice]
  }
}

