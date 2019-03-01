package typings
package orientjsLib.orientjsMod.orientjsNs

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
    val __obj = js.Dynamic.literal(`@rid` = `@rid`, `@version` = `@version`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordMeta]
  }
}

