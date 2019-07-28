package typings.node.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUsage extends js.Object {
  var fsRead: Double
  var fsWrite: Double
  var involuntaryContextSwitches: Double
  var ipcReceived: Double
  var ipcSent: Double
  var majorPageFault: Double
  var maxRSS: Double
  var minorPageFault: Double
  var sharedMemorySize: Double
  var signalsCount: Double
  var swappedOut: Double
  var systemCPUTime: Double
  var unsharedDataSize: Double
  var unsharedStackSize: Double
  var userCPUTime: Double
  var voluntaryContextSwitches: Double
}

object ResourceUsage {
  @scala.inline
  def apply(
    fsRead: Double,
    fsWrite: Double,
    involuntaryContextSwitches: Double,
    ipcReceived: Double,
    ipcSent: Double,
    majorPageFault: Double,
    maxRSS: Double,
    minorPageFault: Double,
    sharedMemorySize: Double,
    signalsCount: Double,
    swappedOut: Double,
    systemCPUTime: Double,
    unsharedDataSize: Double,
    unsharedStackSize: Double,
    userCPUTime: Double,
    voluntaryContextSwitches: Double
  ): ResourceUsage = {
    val __obj = js.Dynamic.literal(fsRead = fsRead, fsWrite = fsWrite, involuntaryContextSwitches = involuntaryContextSwitches, ipcReceived = ipcReceived, ipcSent = ipcSent, majorPageFault = majorPageFault, maxRSS = maxRSS, minorPageFault = minorPageFault, sharedMemorySize = sharedMemorySize, signalsCount = signalsCount, swappedOut = swappedOut, systemCPUTime = systemCPUTime, unsharedDataSize = unsharedDataSize, unsharedStackSize = unsharedStackSize, userCPUTime = userCPUTime, voluntaryContextSwitches = voluntaryContextSwitches)
  
    __obj.asInstanceOf[ResourceUsage]
  }
}

