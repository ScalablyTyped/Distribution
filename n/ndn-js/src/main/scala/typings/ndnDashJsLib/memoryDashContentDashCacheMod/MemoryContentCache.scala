package typings
package ndnDashJsLib.memoryDashContentDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/memory-content-cache", "MemoryContentCache")
@js.native
class MemoryContentCache protected () extends js.Object {
  def this(face: ndnDashJsLib.faceMod.Face) = this()
  def this(face: ndnDashJsLib.faceMod.Face, cleanupIntervalMilliseconds: scala.Double) = this()
  def add(data: ndnDashJsLib.dataMod.Data): scala.Unit = js.native
  def getMinimumCacheLifetime(): scala.Double = js.native
  def getStorePendingInterest(): ndnDashJsLib.faceMod.OnInterestCallback = js.native
  def registerPrefix(
    name: ndnDashJsLib.nameMod.Name,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _]
  ): scala.Unit = js.native
  def registerPrefix(
    name: ndnDashJsLib.nameMod.Name,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ ndnDashJsLib.nameMod.Name, /* registeredPrefixId */ scala.Double, _]
  ): scala.Unit = js.native
  def registerPrefix(
    name: ndnDashJsLib.nameMod.Name,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ ndnDashJsLib.nameMod.Name, /* registeredPrefixId */ scala.Double, _],
    onDataNotFound: ndnDashJsLib.faceMod.OnInterestCallback
  ): scala.Unit = js.native
  def registerPrefix(
    name: ndnDashJsLib.nameMod.Name,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ ndnDashJsLib.nameMod.Name, /* registeredPrefixId */ scala.Double, _],
    onDataNotFound: ndnDashJsLib.faceMod.OnInterestCallback,
    flags: ndnDashJsLib.faceMod.ForwardingFlags
  ): scala.Unit = js.native
  def setInterestFilter(filter: ndnDashJsLib.faceMod.InterestFilter): scala.Unit = js.native
  def setInterestFilter(
    filter: ndnDashJsLib.faceMod.InterestFilter,
    onDataNotFound: ndnDashJsLib.faceMod.OnInterestCallback
  ): scala.Unit = js.native
  def setInterestFilter(filter: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def setInterestFilter(filter: ndnDashJsLib.nameMod.Name, onDataNotFound: ndnDashJsLib.faceMod.OnInterestCallback): scala.Unit = js.native
  def setMinimumCacheLifetime(minimumCacheLifetime: scala.Double): scala.Unit = js.native
  def storePendingInterest(interest: ndnDashJsLib.interestMod.Interest, face: ndnDashJsLib.faceMod.Face): scala.Unit = js.native
  def unregisterAll(): scala.Unit = js.native
}

