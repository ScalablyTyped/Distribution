package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA.decrypt")
@js.native
object decrypt extends js.Object {
  def apply(alg: String, key: String, cdata: String): js.Promise[Buffer] = js.native
  def apply(alg: String, key: String, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def apply(alg: String, key: String, cdata: Buffer): js.Promise[Buffer] = js.native
  def apply(alg: String, key: String, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer, cdata: String): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer, cdata: Buffer): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
}

