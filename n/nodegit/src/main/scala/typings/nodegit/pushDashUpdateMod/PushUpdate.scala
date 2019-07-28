package typings.nodegit.pushDashUpdateMod

import typings.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/push-update", "PushUpdate")
@js.native
class PushUpdate () extends js.Object {
  var dst: Oid = js.native
  var dstRefname: String = js.native
  var src: Oid = js.native
  var srcRefname: String = js.native
}

