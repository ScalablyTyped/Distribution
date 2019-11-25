package typings.node.NodeJS

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
    val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceUsage]
  }
}

