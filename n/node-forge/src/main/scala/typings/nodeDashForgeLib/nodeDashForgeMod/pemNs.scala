package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pem")
@js.native
object pemNs extends js.Object {
  
  trait EncodeOptions extends js.Object {
    var maxline: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait ObjectPEM extends js.Object {
    var body: nodeDashForgeLib.nodeDashForgeMod.Bytes
    var contentDomain: js.UndefOr[js.Any] = js.undefined
    var dekInfo: js.UndefOr[js.Any] = js.undefined
    var headers: js.UndefOr[js.Array[_]] = js.undefined
    var procType: js.UndefOr[js.Any] = js.undefined
    var `type`: java.lang.String
  }
  
  def decode(str: java.lang.String): js.Array[ObjectPEM] = js.native
  def encode(msg: ObjectPEM): java.lang.String = js.native
  def encode(msg: ObjectPEM, options: EncodeOptions): java.lang.String = js.native
}

