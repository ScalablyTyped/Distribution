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

@js.native
trait ParseReturn extends js.Object {
  var format: typings.nodeJose.nodeJoseStrings.compact | typings.nodeJose.nodeJoseStrings.json = js.native
  var header: js.Object = js.native
  var input: Buffer | String | js.Object = js.native
  var `type`: JWS | JWE = js.native
  def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult] = js.native
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
  @scala.inline
  implicit class ParseReturnOps[Self <: ParseReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: typings.nodeJose.nodeJoseStrings.compact | typings.nodeJose.nodeJoseStrings.json): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Buffer | String | js.Object): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerform(value: KeyStore => js.Promise[DecryptResult | VerificationResult]): Self = this.set("perform", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: JWS | JWE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

