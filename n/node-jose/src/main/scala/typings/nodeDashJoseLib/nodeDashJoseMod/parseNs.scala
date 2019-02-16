package typings
package nodeDashJoseLib.nodeDashJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "parse")
@js.native
object parseNs extends js.Object {
  trait ParseReturn extends js.Object {
    var format: nodeDashJoseLib.nodeDashJoseLibStrings.compact | nodeDashJoseLib.nodeDashJoseLibStrings.json
    var header: js.Object
    var input: nodeLib.Buffer | java.lang.String | js.Object
    var `type`: nodeDashJoseLib.nodeDashJoseLibStrings.JWS | nodeDashJoseLib.nodeDashJoseLibStrings.JWE
    def perform(ks: nodeDashJoseLib.nodeDashJoseMod.JWKNs.KeyStore): js.Promise[nodeDashJoseLib.nodeDashJoseMod.JWENs.DecryptResult] | js.Promise[nodeDashJoseLib.nodeDashJoseMod.JWSNs.VerificationResult]
  }
  
  def compact(input: java.lang.String): ParseReturn = js.native
  def compact(input: js.Object): ParseReturn = js.native
  def compact(input: nodeLib.Buffer): ParseReturn = js.native
  def json(input: java.lang.String): ParseReturn = js.native
  def json(input: js.Object): ParseReturn = js.native
  def json(input: nodeLib.Buffer): ParseReturn = js.native
}

