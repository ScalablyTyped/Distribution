package typings.phonegap

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var modificationTime: Date
}

object Metadata {
  @scala.inline
  def apply(modificationTime: Date): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

