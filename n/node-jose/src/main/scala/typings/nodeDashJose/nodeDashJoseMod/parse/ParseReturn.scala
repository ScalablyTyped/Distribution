package typings.nodeDashJose.nodeDashJoseMod.parse

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWE.DecryptResult
import typings.nodeDashJose.nodeDashJoseMod.JWK.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWS.VerificationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var format: typings.nodeDashJose.nodeDashJoseStrings.compact | typings.nodeDashJose.nodeDashJoseStrings.json
  var header: js.Object
  var input: Buffer | String | js.Object
  var `type`: typings.nodeDashJose.nodeDashJoseStrings.JWS | typings.nodeDashJose.nodeDashJoseStrings.JWE
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
}

object ParseReturn {
  @scala.inline
  def apply(
    format: typings.nodeDashJose.nodeDashJoseStrings.compact | typings.nodeDashJose.nodeDashJoseStrings.json,
    header: js.Object,
    input: Buffer | String | js.Object,
    perform: KeyStore => js.Promise[DecryptResult | VerificationResult],
    `type`: typings.nodeDashJose.nodeDashJoseStrings.JWS | typings.nodeDashJose.nodeDashJoseStrings.JWE
  ): ParseReturn = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
}

