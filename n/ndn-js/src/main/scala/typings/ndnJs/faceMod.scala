package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.dataMod.Data
import typings.ndnJs.interestMod.Interest
import typings.ndnJs.keyChainMod.KeyChain
import typings.ndnJs.nameMod.Name
import typings.ndnJs.networkNackMod.NetworkNack
import typings.ndnJs.transportMod.Transport
import typings.ndnJs.transportMod.TransportConnectionInfo
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceMod {
  
  @JSImport("ndn-js/face", "Face")
  @js.native
  class Face () extends StObject {
    def this(settings: FaceCtorOptions) = this()
    def this(transport: Transport, connectionInfo: TransportConnectionInfo) = this()
    
    def expressInterest(interest: Interest, onData: js.Function2[/* interest */ Interest, /* data */ Data, _]): Double = js.native
    def expressInterest(
      interest: Interest,
      onData: js.Function2[/* interest */ Interest, /* data */ Data, _],
      onTimeout: js.UndefOr[scala.Nothing],
      onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
    ): Double = js.native
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
      onTimeout: js.UndefOr[scala.Nothing],
      onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
    ): Double = js.native
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
      onTimeout: js.UndefOr[scala.Nothing],
      onNetworkNack: js.Function2[/* interest */ Interest, /* nack */ NetworkNack, _]
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
      onRegisterSuccess: js.UndefOr[scala.Nothing],
      flags: ForwardingFlags
    ): Double = js.native
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
  object Face {
    
    @JSImport("ndn-js/face", "Face.getMaxNdnPacketSize")
    @js.native
    def getMaxNdnPacketSize(): Double = js.native
  }
  
  @JSImport("ndn-js/face", "ForwardingFlags")
  @js.native
  class ForwardingFlags () extends StObject
  
  @JSImport("ndn-js/face", "InterestFilter")
  @js.native
  class InterestFilter protected () extends StObject {
    def this(filter: InterestFilter) = this()
    def this(prefix: String) = this()
    def this(prefix: Name) = this()
    def this(prefix: String, regexFilter: String) = this()
    def this(prefix: Name, regexFilter: String) = this()
    
    def doesMatch(name: Name): Boolean = js.native
    
    def getPrefix(): Name = js.native
    
    def getRegexFilter(): String = js.native
    
    def hasRegexFilter(): Boolean = js.native
  }
  
  @js.native
  trait FaceCtorOptions extends StObject {
    
    var connectionInfo: js.UndefOr[TransportConnectionInfo | Null] = js.native
    
    var getConnectionInfo: js.UndefOr[js.Function0[TransportConnectionInfo]] = js.native
    
    var getTransport: js.UndefOr[js.Function0[Transport]] = js.native
    
    var host: js.UndefOr[String | Null] = js.native
    
    var port: js.UndefOr[Double | Null] = js.native
  }
  object FaceCtorOptions {
    
    @scala.inline
    def apply(): FaceCtorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceCtorOptions]
    }
    
    @scala.inline
    implicit class FaceCtorOptionsMutableBuilder[Self <: FaceCtorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionInfo(value: TransportConnectionInfo): Self = StObject.set(x, "connectionInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionInfoNull: Self = StObject.set(x, "connectionInfo", null)
      
      @scala.inline
      def setConnectionInfoUndefined: Self = StObject.set(x, "connectionInfo", js.undefined)
      
      @scala.inline
      def setGetConnectionInfo(value: () => TransportConnectionInfo): Self = StObject.set(x, "getConnectionInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetConnectionInfoUndefined: Self = StObject.set(x, "getConnectionInfo", js.undefined)
      
      @scala.inline
      def setGetTransport(value: () => Transport): Self = StObject.set(x, "getTransport", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTransportUndefined: Self = StObject.set(x, "getTransport", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  type OnInterestCallback = js.Function5[
    /* prefix */ Name, 
    /* interest */ Interest, 
    /* face */ Face, 
    /* filterId */ Double, 
    /* filter */ InterestFilter, 
    js.Any
  ]
}
