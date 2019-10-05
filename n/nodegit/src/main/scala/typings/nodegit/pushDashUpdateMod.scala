package typings.nodegit

import typings.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/push-update", JSImport.Namespace)
@js.native
object pushDashUpdateMod extends js.Object {
  @js.native
  class PushUpdate () extends js.Object {
    var dst: Oid = js.native
    var dstRefname: String = js.native
    var src: Oid = js.native
    var srcRefname: String = js.native
  }
  
}

