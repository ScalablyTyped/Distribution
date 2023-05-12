package typings.nodecredstash

import typings.awsSdkClientKms.mod.KMSClient
import typings.nodecredstash.anon.EncodedKey
import typings.nodecredstash.nodecredstashInts.`16`
import typings.nodecredstash.nodecredstashInts.`24`
import typings.nodecredstash.nodecredstashInts.`32`
import typings.nodecredstash.nodecredstashInts.`64`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibKeyServiceMod {
  
  @JSImport("nodecredstash/src/lib/keyService", "KeyService")
  @js.native
  open class KeyService protected () extends StObject {
    def this(kms: KMSClient) = this()
    def this(kms: KMSClient, keyId: String) = this()
    def this(kms: KMSClient, keyId: String, encryptionContext: Record[String, String]) = this()
    def this(kms: KMSClient, keyId: Unit, encryptionContext: Record[String, String]) = this()
    
    def decrypt(ciphertext: String): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def generateDataKey(NumberOfBytes: `16` | `24` | `32` | `64`): js.Promise[EncodedKey] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
