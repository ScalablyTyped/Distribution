package typings.nodeOsUtils.oscmdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsCmd extends js.Object {
  def diskUsage(): js.Promise[String] = js.native
  def ifconfig(): js.Promise[String] = js.native
  def openPorts(): js.Promise[String] = js.native
  def processesUsers(): js.Promise[String] = js.native
  def topCpu(): js.Function0[js.Promise[String]] = js.native
  def topMem(): js.Promise[String] = js.native
  def vmstats(): js.Promise[String] = js.native
  def who(): js.Promise[String] = js.native
  def whoami(): js.Promise[String] = js.native
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
  @scala.inline
  implicit class OsCmdOps[Self <: OsCmd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiskUsage(value: () => js.Promise[String]): Self = this.set("diskUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setIfconfig(value: () => js.Promise[String]): Self = this.set("ifconfig", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenPorts(value: () => js.Promise[String]): Self = this.set("openPorts", js.Any.fromFunction0(value))
    @scala.inline
    def setProcessesUsers(value: () => js.Promise[String]): Self = this.set("processesUsers", js.Any.fromFunction0(value))
    @scala.inline
    def setTopCpu(value: () => js.Function0[js.Promise[String]]): Self = this.set("topCpu", js.Any.fromFunction0(value))
    @scala.inline
    def setTopMem(value: () => js.Promise[String]): Self = this.set("topMem", js.Any.fromFunction0(value))
    @scala.inline
    def setVmstats(value: () => js.Promise[String]): Self = this.set("vmstats", js.Any.fromFunction0(value))
    @scala.inline
    def setWho(value: () => js.Promise[String]): Self = this.set("who", js.Any.fromFunction0(value))
    @scala.inline
    def setWhoami(value: () => js.Promise[String]): Self = this.set("whoami", js.Any.fromFunction0(value))
  }
  
}

