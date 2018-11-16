package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dnsMod {
  type AnyRecord = AnyARecord | AnyAaaaRecord | AnyCnameRecord | AnyMxRecord | AnyNaptrRecord | AnyNsRecord | AnyPtrRecord | AnySoaRecord | AnySrvRecord | AnyTxtRecord
  /** @deprecated Use AnyARecord or AnyAaaaRecord instead. */
  type AnyRecordWithTtl = AnyARecord | AnyAaaaRecord
}
