package typings.ndnDashJs.faceMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.dataMod.Data
import typings.ndnDashJs.interestMod.Interest
import typings.ndnDashJs.keyDashChainMod.KeyChain
import typings.ndnDashJs.nameMod.Name
import typings.ndnDashJs.networkDashNackMod.NetworkNack
import typings.ndnDashJs.transportMod.Transport
import typings.ndnDashJs.transportMod.TransportConnectionInfo
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/face", "Face")
@js.native
class Face () extends js.Object {
  def this(settings: FaceCtorOptions) = this()
  def this(transport: Transport, connectionInfo: TransportConnectionInfo) = this()
  def expressInterest(interest: Interest, onData: js.Function2[/* interest */ Interest, /* data */ Data, _]): Double = js.native
  def expressInterest(
    interest: Interest,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _]
  ): Double = js.native
  def expressInterest(
    interest: Interest,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _],
    onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
  ): Double = js.native
  def expressInterest(interest: Name, onData: js.Function2[/* interest */ Interest, /* data */ Data, _]): Double = js.native
  def expressInterest(
    interest: Name,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _]
  ): Double = js.native
  def expressInterest(
    interest: Name,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _],
    onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
  ): Double = js.native
  def expressInterest(
    name: Name,
    interestTemplate: Interest,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _]
  ): Double = js.native
  def expressInterest(
    name: Name,
    interestTemplate: Interest,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _]
  ): Double = js.native
  def expressInterest(
    name: Name,
    interestTemplate: Interest,
    onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
    onTimeout: js.Function1[/* interest */ Interest, _],
    onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
  ): Double = js.native
  def putData(data: Data): Unit = js.native
  def registerPrefix(prefix: Name, onInterest: OnInterestCallback, onRegisterFailed: js.Function1[/* prefix */ Name, _]): Double = js.native
  def registerPrefix(
    prefix: Name,
    onInterest: OnInterestCallback,
    onRegisterFailed: js.Function1[/* prefix */ Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _]
  ): Double = js.native
  def registerPrefix(
    prefix: Name,
    onInterest: OnInterestCallback,
    onRegisterFailed: js.Function1[/* prefix */ Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
    flags: ForwardingFlags
  ): Double = js.native
  def removePendingInterest(id: Double): Unit = js.native
  def removeRegisteredPrefix(id: Double): Unit = js.native
  def send(encoding: Blob): Unit = js.native
  def send(encoding: Buffer): Unit = js.native
  def setCommandCertificateName(certificateName: Name): Unit = js.native
  def setCommandSigningInfo(keyChain: KeyChain, certificateName: Name): Unit = js.native
  def setInterestFilter(filter: InterestFilter, onInterest: OnInterestCallback): Double = js.native
  def setInterestFilter(filter: Name, onInterest: OnInterestCallback): Double = js.native
  def unsetInterestFilter(id: Double): Unit = js.native
}

/* static members */
@JSImport("ndn-js/face", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): Double = js.native
}

