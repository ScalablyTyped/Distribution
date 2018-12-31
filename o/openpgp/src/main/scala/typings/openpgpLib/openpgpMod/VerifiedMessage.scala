package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifiedMessage extends js.Object {
  var data: stdLib.Uint8Array | java.lang.String
  var filename: java.lang.String
  var signatures: js.Array[Signature]
}

