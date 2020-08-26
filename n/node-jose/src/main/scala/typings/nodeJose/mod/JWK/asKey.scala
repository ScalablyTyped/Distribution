package typings.nodeJose.mod.JWK

import typings.node.Buffer
import typings.nodeJose.nodeJoseStrings.`private`
import typings.nodeJose.nodeJoseStrings.json
import typings.nodeJose.nodeJoseStrings.pem
import typings.nodeJose.nodeJoseStrings.pkcs8
import typings.nodeJose.nodeJoseStrings.pkix
import typings.nodeJose.nodeJoseStrings.public
import typings.nodeJose.nodeJoseStrings.spki
import typings.nodeJose.nodeJoseStrings.x509
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: js.UndefOr[json | `private` | pkcs8 | public | spki | pkix | x509 | pem],
    extras: js.UndefOr[Record[String, _]]
  ): js.Promise[Key] = js.native
}

