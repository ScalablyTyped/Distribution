package typings.pidusage.pidusageMod

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
    val __obj = js.Dynamic.literal(cpu = cpu, ctime = ctime, elapsed = elapsed, memory = memory, pid = pid, ppid = ppid, timestamp = timestamp)
  
    __obj.asInstanceOf[Stat]
  }
}

