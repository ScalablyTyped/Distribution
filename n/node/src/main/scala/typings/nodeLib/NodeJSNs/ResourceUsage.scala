package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUsage extends js.Object {
  var fsRead: scala.Double
  var fsWrite: scala.Double
  var involuntaryContextSwitches: scala.Double
  var ipcReceived: scala.Double
  var ipcSent: scala.Double
  var majorPageFault: scala.Double
  var maxRSS: scala.Double
  var minorPageFault: scala.Double
  var sharedMemorySize: scala.Double
  var signalsCount: scala.Double
  var swappedOut: scala.Double
  var systemCPUTime: scala.Double
  var unsharedDataSize: scala.Double
  var unsharedStackSize: scala.Double
  var userCPUTime: scala.Double
  var voluntaryContextSwitches: scala.Double
}

object ResourceUsage {
  @scala.inline
  def apply(
    fsRead: scala.Double,
    fsWrite: scala.Double,
    involuntaryContextSwitches: scala.Double,
    ipcReceived: scala.Double,
    ipcSent: scala.Double,
    majorPageFault: scala.Double,
    maxRSS: scala.Double,
    minorPageFault: scala.Double,
    sharedMemorySize: scala.Double,
    signalsCount: scala.Double,
    swappedOut: scala.Double,
    systemCPUTime: scala.Double,
    unsharedDataSize: scala.Double,
    unsharedStackSize: scala.Double,
    userCPUTime: scala.Double,
    voluntaryContextSwitches: scala.Double
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal(fsRead = fsRead, fsWrite = fsWrite, involuntaryContextSwitches = involuntaryContextSwitches, ipcReceived = ipcReceived, ipcSent = ipcSent, majorPageFault = majorPageFault, maxRSS = maxRSS, minorPageFault = minorPageFault, sharedMemorySize = sharedMemorySize, signalsCount = signalsCount, swappedOut = swappedOut, systemCPUTime = systemCPUTime, unsharedDataSize = unsharedDataSize, unsharedStackSize = unsharedStackSize, userCPUTime = userCPUTime, voluntaryContextSwitches = voluntaryContextSwitches)
  
    __obj.asInstanceOf[ResourceUsage]
  }
}

