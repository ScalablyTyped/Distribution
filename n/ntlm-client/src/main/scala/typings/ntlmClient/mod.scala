package typings.ntlmClient

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ntlm-client", "createType1Message")
  @js.native
  def createType1Message(workstation: String, domain: String): String = js.native
  
  @JSImport("ntlm-client", "createType3Message")
  @js.native
  def createType3Message(type2Message: NtlmType2, username: String, password: String, workstation: String, domain: String): String = js.native
  
  @JSImport("ntlm-client", "decodeType2Message")
  @js.native
  def decodeType2Message(type1Message: String): NtlmType2 = js.native
  
  @js.native
  trait NtlmType2 extends StObject {
    
    var challenge: Buffer = js.native
    
    var encoding: String = js.native
    
    var flags: Double = js.native
    
    var targetInfo: typings.ntlmClient.anon.Buffer = js.native
    
    var targetName: String = js.native
    
    var version: Double = js.native
  }
  object NtlmType2 {
    
    @scala.inline
    def apply(
      challenge: Buffer,
      encoding: String,
      flags: Double,
      targetInfo: typings.ntlmClient.anon.Buffer,
      targetName: String,
      version: Double
    ): NtlmType2 = {
      val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], targetInfo = targetInfo.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NtlmType2]
    }
    
    @scala.inline
    implicit class NtlmType2MutableBuilder[Self <: NtlmType2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallenge(value: Buffer): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetInfo(value: typings.ntlmClient.anon.Buffer): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
