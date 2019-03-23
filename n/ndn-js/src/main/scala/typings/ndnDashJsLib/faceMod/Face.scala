package typings
package ndnDashJsLib.faceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/face", "Face")
@js.native
class Face () extends js.Object {
  def this(settings: FaceCtorOptions) = this()
  def this(transport: ndnDashJsLib.transportMod.Transport, connectionInfo: ndnDashJsLib.transportMod.TransportConnectionInfo) = this()
  def expressInterest(
    interest: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ]
  ): scala.Double = js.native
  def expressInterest(
    interest: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _]
  ): scala.Double = js.native
  def expressInterest(
    interest: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _],
    onNetworkNack: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* nack */ ndnDashJsLib.networkDashNackMod.NetworkNack, 
      _
    ]
  ): scala.Double = js.native
  def expressInterest(
    interest: ndnDashJsLib.nameMod.Name,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ]
  ): scala.Double = js.native
  def expressInterest(
    interest: ndnDashJsLib.nameMod.Name,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _]
  ): scala.Double = js.native
  def expressInterest(
    interest: ndnDashJsLib.nameMod.Name,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _],
    onNetworkNack: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* nack */ ndnDashJsLib.networkDashNackMod.NetworkNack, 
      _
    ]
  ): scala.Double = js.native
  def expressInterest(
    name: ndnDashJsLib.nameMod.Name,
    interestTemplate: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ]
  ): scala.Double = js.native
  def expressInterest(
    name: ndnDashJsLib.nameMod.Name,
    interestTemplate: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _]
  ): scala.Double = js.native
  def expressInterest(
    name: ndnDashJsLib.nameMod.Name,
    interestTemplate: ndnDashJsLib.interestMod.Interest,
    onData: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* data */ ndnDashJsLib.dataMod.Data, 
      _
    ],
    onTimeout: js.Function1[/* interest */ ndnDashJsLib.interestMod.Interest, _],
    onNetworkNack: js.Function2[
      /* interest */ ndnDashJsLib.interestMod.Interest, 
      /* nack */ ndnDashJsLib.networkDashNackMod.NetworkNack, 
      _
    ]
  ): scala.Double = js.native
  def putData(data: ndnDashJsLib.dataMod.Data): scala.Unit = js.native
  def registerPrefix(
    prefix: ndnDashJsLib.nameMod.Name,
    onInterest: OnInterestCallback,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _]
  ): scala.Double = js.native
  def registerPrefix(
    prefix: ndnDashJsLib.nameMod.Name,
    onInterest: OnInterestCallback,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ ndnDashJsLib.nameMod.Name, /* registeredPrefixId */ scala.Double, _]
  ): scala.Double = js.native
  def registerPrefix(
    prefix: ndnDashJsLib.nameMod.Name,
    onInterest: OnInterestCallback,
    onRegisterFailed: js.Function1[/* prefix */ ndnDashJsLib.nameMod.Name, _],
    onRegisterSuccess: js.Function2[/* prefix */ ndnDashJsLib.nameMod.Name, /* registeredPrefixId */ scala.Double, _],
    flags: ForwardingFlags
  ): scala.Double = js.native
  def removePendingInterest(id: scala.Double): scala.Unit = js.native
  def removeRegisteredPrefix(id: scala.Double): scala.Unit = js.native
  def send(encoding: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def send(encoding: nodeLib.Buffer): scala.Unit = js.native
  def setCommandCertificateName(certificateName: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def setCommandSigningInfo(keyChain: ndnDashJsLib.keyDashChainMod.KeyChain, certificateName: ndnDashJsLib.nameMod.Name): scala.Unit = js.native
  def setInterestFilter(filter: InterestFilter, onInterest: OnInterestCallback): scala.Double = js.native
  def setInterestFilter(filter: ndnDashJsLib.nameMod.Name, onInterest: OnInterestCallback): scala.Double = js.native
  def unsetInterestFilter(id: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("ndn-js/face", "Face")
@js.native
object Face extends js.Object {
  def getMaxNdnPacketSize(): scala.Double = js.native
}

