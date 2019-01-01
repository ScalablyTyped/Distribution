package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifiedMessage extends js.Object {
  var data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_]
   // TODO add NodeStream
  var signatures: js.Array[Signature]
}

