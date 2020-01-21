package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordMeta extends js.Object {
  var `@rid`: ORID
  var `@version`: Version
}

object RecordMeta {
  @scala.inline
  def apply(`@rid`: ORID, `@version`: Version): RecordMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@rid")(`@rid`.asInstanceOf[js.Any])
    __obj.updateDynamic("@version")(`@version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMeta]
  }
}

