package typings.nodeDashJose.nodeDashJoseMod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA.digest")
@js.native
object digest extends js.Object {
  def apply(alg: String, data: String): js.Promise[Buffer] = js.native
  def apply(alg: String, data: String, props: js.Any): js.Promise[Buffer] = js.native
  def apply(alg: String, data: Buffer): js.Promise[Buffer] = js.native
  def apply(alg: String, data: Buffer, props: js.Any): js.Promise[Buffer] = js.native
}

