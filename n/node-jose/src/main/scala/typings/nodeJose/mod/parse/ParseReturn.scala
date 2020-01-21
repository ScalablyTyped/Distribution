package typings.nodeJose.mod.parse

import typings.node.Buffer
import typings.nodeJose.mod.JWE.DecryptResult
import typings.nodeJose.mod.JWK.KeyStore
import typings.nodeJose.mod.JWS.VerificationResult
import typings.nodeJose.nodeJoseStrings.JWE
import typings.nodeJose.nodeJoseStrings.JWS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseReturn extends js.Object {
  var format: typings.nodeJose.nodeJoseStrings.compact | typings.nodeJose.nodeJoseStrings.json
  var header: js.Object
  var input: Buffer | String | js.Object
  var `type`: JWS | JWE
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
}

object ParseReturn {
  @scala.inline
  def apply(
    format: typings.nodeJose.nodeJoseStrings.compact | typings.nodeJose.nodeJoseStrings.json,
    header: js.Object,
    input: Buffer | String | js.Object,
    perform: KeyStore => js.Promise[DecryptResult | VerificationResult],
    `type`: JWS | JWE
  ): ParseReturn = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
}

