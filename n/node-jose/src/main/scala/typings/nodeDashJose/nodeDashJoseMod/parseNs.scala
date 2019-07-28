package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWENs.DecryptResult
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.VerificationResult
import typings.nodeDashJose.nodeDashJoseMod.parseNs.ParseReturn
import typings.nodeDashJose.nodeDashJoseStrings.JWE
import typings.nodeDashJose.nodeDashJoseStrings.JWS
import typings.nodeDashJose.nodeDashJoseStrings.compact
import typings.nodeDashJose.nodeDashJoseStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "parse")
@js.native
object parseNs extends js.Object {
  trait ParseReturn extends js.Object {
    var format: compact | json
    var header: js.Object
    var input: Buffer | String | js.Object
    var `type`: JWS | JWE
    def perform(ks: KeyStore): js.Promise[DecryptResult | VerificationResult]
  }
  
  def compact(input: String): ParseReturn = js.native
  def compact(input: js.Object): ParseReturn = js.native
  def compact(input: Buffer): ParseReturn = js.native
  def json(input: String): ParseReturn = js.native
  def json(input: js.Object): ParseReturn = js.native
  def json(input: Buffer): ParseReturn = js.native
}

