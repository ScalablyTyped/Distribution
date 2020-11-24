package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.dataMod.Data
import typings.ndnJs.interestMod.DelegationSet.Delegation
import typings.ndnJs.nameMod.Name
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js/interest", JSImport.Namespace)
@js.native
object interestMod extends js.Object {
  
  @js.native
  class DelegationSet () extends js.Object {
    
    def add(preference: Double, name: Name): Unit = js.native
    
    def clear(): Unit = js.native
    
    def find(name: Name): Double = js.native
    
    def get(i: Double): Delegation = js.native
    
    def remove(name: Name): Boolean = js.native
    
    def size(): Double = js.native
  }
  @js.native
  object DelegationSet extends js.Object {
    
    @js.native
    class Delegation () extends js.Object {
      
      def getName(): Name = js.native
      
      def getPreference(): Double = js.native
    }
  }
  
  @js.native
  class Interest () extends js.Object {
    def this(interest: Interest) = this()
    def this(name: String) = this()
    def this(name: Name) = this()
    
    def appendParametersDigestToName(): Interest = js.native
    
    def getApplicationParameters(): Blob = js.native
    
    def getCanBePrefix(): Boolean = js.native
    
    def getForwardingHint(): DelegationSet = js.native
    
    def getIncomingFaceId(): Double = js.native
    
    def getInterestLifetimeMilliseconds(): Double = js.native
    
    def getMustBeFresh(): Boolean = js.native
    
    def getName(): Name = js.native
    
    def getNonce(): Blob = js.native
    
    def matchesData(data: Data): Boolean = js.native
    
    def matchesName(name: Name): Boolean = js.native
    
    def refreshNonce(): Unit = js.native
    
    def setApplicationParameters(parameters: Blob): Interest = js.native
    def setApplicationParameters(parameters: Buffer): Interest = js.native
    
    def setCanBePrefix(canBePrefix: Boolean): Interest = js.native
    
    def setForwardingHint(fh: DelegationSet): Interest = js.native
    
    def setInterestLifetimeMilliseconds(lifetime: Double): Interest = js.native
    
    def setMustBeFresh(mustBeFresh: Boolean): Interest = js.native
    
    def setName(name: Name): Interest = js.native
    
    def toUri(): String = js.native
    
    def wireDecode(input: Blob): Unit = js.native
    def wireDecode(input: Buffer): Unit = js.native
    
    def wireEncode(): Blob = js.native
  }
}
