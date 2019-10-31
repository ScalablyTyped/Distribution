package typings.node.osMod

import typings.node.Anon_E2BIG
import typings.node.Anon_PRIORITYABOVENORMAL
import typings.node.Anon_SIGABRT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "constants")
@js.native
object constants extends js.Object {
  var UV_UDP_REUSEADDR: Double = js.native
  var errno: Anon_E2BIG = js.native
  var priority: Anon_PRIORITYABOVENORMAL = js.native
  // signals: { [key in NodeJS.Signals]: number; }; @todo: change after migration to typescript 2.1
  var signals: Anon_SIGABRT = js.native
}

