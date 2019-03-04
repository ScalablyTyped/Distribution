package typings
package pidusageLib.pidusageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  /**
    * percentage (from 0 to 100*vcore)
    */
  var cpu: scala.Double
  /**
    * ms user + system time
    */
  var ctime: scala.Double
  /**
    * ms since the start of the process
    */
  var elapsed: scala.Double
  /**
    * bytes
    */
  var memory: scala.Double
  /**
    * PID
    */
  var pid: scala.Double
  /**
    * PPID
    */
  var ppid: scala.Double
  /**
    * ms since epoch
    */
  var timestamp: scala.Double
}

object Stat {
  @scala.inline
  def apply(
    cpu: scala.Double,
    ctime: scala.Double,
    elapsed: scala.Double,
    memory: scala.Double,
    pid: scala.Double,
    ppid: scala.Double,
    timestamp: scala.Double
  ): Stat = {
    val __obj = js.Dynamic.literal(cpu = cpu, ctime = ctime, elapsed = elapsed, memory = memory, pid = pid, ppid = ppid, timestamp = timestamp)
  
    __obj.asInstanceOf[Stat]
  }
}

