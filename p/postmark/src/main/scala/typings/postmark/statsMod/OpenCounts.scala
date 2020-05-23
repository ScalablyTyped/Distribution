package typings.postmark.statsMod

import typings.postmark.anon.Opens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCounts extends js.Object {
  var Days: js.Array[Opens]
  var Opens: Double
  var Unique: Double
}

object OpenCounts {
  @scala.inline
  def apply(Days: js.Array[Opens], Opens: Double, Unique: Double): OpenCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCounts]
  }
}

