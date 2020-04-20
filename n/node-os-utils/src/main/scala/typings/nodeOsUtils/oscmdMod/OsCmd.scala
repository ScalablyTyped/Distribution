package typings.nodeOsUtils.oscmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsCmd extends js.Object {
  def diskUsage(): js.Promise[String]
  def ifconfig(): js.Promise[String]
  def openPorts(): js.Promise[String]
  def processesUsers(): js.Promise[String]
  def topCpu(): js.Function0[js.Promise[String]]
  def topMem(): js.Promise[String]
  def vmstats(): js.Promise[String]
  def who(): js.Promise[String]
  def whoami(): js.Promise[String]
}

object OsCmd {
  @scala.inline
  def apply(
    diskUsage: () => js.Promise[String],
    ifconfig: () => js.Promise[String],
    openPorts: () => js.Promise[String],
    processesUsers: () => js.Promise[String],
    topCpu: () => js.Function0[js.Promise[String]],
    topMem: () => js.Promise[String],
    vmstats: () => js.Promise[String],
    who: () => js.Promise[String],
    whoami: () => js.Promise[String]
  ): OsCmd = {
    val __obj = js.Dynamic.literal(diskUsage = js.Any.fromFunction0(diskUsage), ifconfig = js.Any.fromFunction0(ifconfig), openPorts = js.Any.fromFunction0(openPorts), processesUsers = js.Any.fromFunction0(processesUsers), topCpu = js.Any.fromFunction0(topCpu), topMem = js.Any.fromFunction0(topMem), vmstats = js.Any.fromFunction0(vmstats), who = js.Any.fromFunction0(who), whoami = js.Any.fromFunction0(whoami))
    __obj.asInstanceOf[OsCmd]
  }
}

