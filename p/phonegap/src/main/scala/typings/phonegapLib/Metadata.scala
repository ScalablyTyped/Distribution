package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var modificationTime: stdLib.Date
}

object Metadata {
  @scala.inline
  def apply(modificationTime: stdLib.Date): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("modificationTime")(modificationTime)
    __obj.asInstanceOf[Metadata]
  }
}

