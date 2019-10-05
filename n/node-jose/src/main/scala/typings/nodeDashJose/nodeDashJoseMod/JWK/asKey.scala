package typings.nodeDashJose.nodeDashJoseMod.JWK

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseStrings.`private`
import typings.nodeDashJose.nodeDashJoseStrings.json
import typings.nodeDashJose.nodeDashJoseStrings.pem
import typings.nodeDashJose.nodeDashJoseStrings.pkcs8
import typings.nodeDashJose.nodeDashJoseStrings.pkix
import typings.nodeDashJose.nodeDashJoseStrings.public
import typings.nodeDashJose.nodeDashJoseStrings.spki
import typings.nodeDashJose.nodeDashJoseStrings.x509
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(key: String | Buffer | js.Object | RawKey): js.Promise[Key] = js.native
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
  ): js.Promise[Key] = js.native
}

