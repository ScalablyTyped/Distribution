package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptedMessage extends js.Object {
  var data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_]
  var filename: java.lang.String
   // TODO add NodeStream
  var signatures: js.Array[Signature]
}

