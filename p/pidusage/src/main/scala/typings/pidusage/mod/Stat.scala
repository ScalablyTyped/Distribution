package typings.pidusage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  /**
    * percentage (from 0 to 100*vcore)
    */
  var cpu: Double
  /**
    * ms user + system time
    */
  var ctime: Double
  /**
    * ms since the start of the process
    */
  var elapsed: Double
  /**
    * bytes
    */
  var memory: Double
  /**
    * PID
    */
  var pid: Double
  /**
    * PPID
    */
  var ppid: Double
  /**
    * ms since epoch
    */
  var timestamp: Double
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
}

