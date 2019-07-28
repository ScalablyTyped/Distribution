package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.Key
import typings.nodeDashJose.nodeDashJoseMod.JWKNs.KeyStore
import typings.nodeDashJose.nodeDashJoseMod.JWSNs.Verifier
import typings.nodeDashJose.nodeDashJoseMod.parseNs.ParseReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canYouSee(ks: KeyStore, opts: js.Object): Verifier = js.native
  def canYouSee(ks: Key, opts: js.Object): Verifier = js.native
  def parse(input: String): ParseReturn = js.native
  def parse(input: js.Object): ParseReturn = js.native
  def parse(input: Buffer): ParseReturn = js.native
}

