package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordMeta extends js.Object {
  var `@rid`: RID
  var `@version`: Version
}

object RecordMeta {
  @scala.inline
  def apply(`@rid`: RID, `@version`: Version): RecordMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@rid")(`@rid`)
    __obj.updateDynamic("@version")(`@version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMeta]
  }
}

