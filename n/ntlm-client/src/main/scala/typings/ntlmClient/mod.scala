package typings.ntlmClient

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ntlm-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createType1Message(workstation: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createType1Message")(workstation.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createType3Message(type2Message: NtlmType2, username: String, password: String, workstation: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createType3Message")(type2Message.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], workstation.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeType2Message(type1Message: String): NtlmType2 = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeType2Message")(type1Message.asInstanceOf[js.Any]).asInstanceOf[NtlmType2]
  
  trait NtlmType2 extends StObject {
    
    var challenge: Buffer
    
    var encoding: String
    
    var flags: Double
    
    var targetInfo: typings.ntlmClient.anon.Buffer
    
    var targetName: String
    
    var version: Double
  }
  object NtlmType2 {
    
    inline def apply(
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
    
    extension [Self <: NtlmType2](x: Self) {
      
      inline def setChallenge(value: Buffer): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setTargetInfo(value: typings.ntlmClient.anon.Buffer): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
