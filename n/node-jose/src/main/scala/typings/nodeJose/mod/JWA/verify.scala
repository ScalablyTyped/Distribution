package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA.verify")
@js.native
object verify extends js.Object {
  def apply(alg: String, key: String, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: String, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: String, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: String, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
}

