package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.pemNs.EncodeOptions
import typings.nodeDashForge.nodeDashForgeMod.pemNs.ObjectPEM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pem")
@js.native
object pemNs extends js.Object {
  trait EncodeOptions extends js.Object {
    var maxline: js.UndefOr[Double] = js.undefined
  }
  
  trait ObjectPEM extends js.Object {
    var body: Bytes
    var contentDomain: js.UndefOr[js.Any] = js.undefined
    var dekInfo: js.UndefOr[js.Any] = js.undefined
    var headers: js.UndefOr[js.Array[_]] = js.undefined
    var procType: js.UndefOr[js.Any] = js.undefined
    var `type`: String
  }
  
  def decode(str: String): js.Array[ObjectPEM] = js.native
  def encode(msg: ObjectPEM): String = js.native
  def encode(msg: ObjectPEM, options: EncodeOptions): String = js.native
}

