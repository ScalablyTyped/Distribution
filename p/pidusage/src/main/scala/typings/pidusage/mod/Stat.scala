package typings.pidusage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  /**
    * percentage (from 0 to 100*vcore)
    */
  var cpu: Double = js.native
  /**
    * ms user + system time
    */
  var ctime: Double = js.native
  /**
    * ms since the start of the process
    */
  var elapsed: Double = js.native
  /**
    * bytes
    */
  var memory: Double = js.native
  /**
    * PID
    */
  var pid: Double = js.native
  /**
    * PPID
    */
  var ppid: Double = js.native
  /**
    * ms since epoch
    */
  var timestamp: Double = js.native
}

object Stat {
  @scala.inline
  def apply(
    cpu: Double,
    ctime: Double,
    elapsed: Double,
    memory: Double,
    pid: Double,
    ppid: Double,
    timestamp: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
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
    def setCpu(value: Double): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: Double): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpid(value: Double): Self = this.set("ppid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

