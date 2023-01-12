package typings.nodecredstash

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.clientsDynamodbMod.AttributeMap
import typings.awsSdk.clientsKmsMod.ClientConfiguration
import typings.awsSdk.clientsKmsMod.DecryptResponse
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.DeleteItemOutput
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemOutput
import typings.nodecredstash.anon.Context
import typings.nodecredstash.anon.Key
import typings.nodecredstash.anon.Name
import typings.nodecredstash.anon.NameVersion
import typings.nodecredstash.anon.Secret
import typings.nodecredstash.anon.StartsWith
import typings.nodecredstash.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(config: CredstashConfig): Credstash = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Credstash]
  
  @JSImport("nodecredstash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Credstash extends StObject {
    
    def createDdbTable(): js.Promise[Unit] = js.native
    
    def decryptStash(stash: Key): js.Promise[DecryptResponse] = js.native
    def decryptStash(stash: Key, context: CredstashContext): js.Promise[DecryptResponse] = js.native
    
    def deleteSecret(options: NameVersion): js.Promise[DeleteItemOutput] = js.native
    
    def deleteSecrets(options: Name): js.Promise[js.Array[DeleteItemOutput]] = js.native
    
    def getAllSecrets(options: StartsWith): js.Promise[StringDictionary[String]] = js.native
    
    def getAllVersions(options: Context): js.Promise[js.Array[Secret]] = js.native
    
    def getHighestVersion(options: Name): js.Promise[AttributeMap] = js.native
    
    def getSecret(options: Version): js.Promise[String] = js.native
    
    def incrementVersion(options: Name): js.Promise[String] = js.native
    
    def listSecrets(): js.Promise[js.Array[String]] = js.native
    
    def putSecret(options: PutSecretOptions): js.Promise[PutItemOutput] = js.native
  }
  
  trait CredstashConfig extends StObject {
    
    var awsOpts: js.UndefOr[ClientConfiguration] = js.undefined
    
    var dynamoOpts: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientConfiguration] = js.undefined
    
    var kmsKey: js.UndefOr[String] = js.undefined
    
    var kmsOpts: js.UndefOr[ClientConfiguration] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object CredstashConfig {
    
    inline def apply(): CredstashConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredstashConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredstashConfig] (val x: Self) extends AnyVal {
      
      inline def setAwsOpts(value: ClientConfiguration): Self = StObject.set(x, "awsOpts", value.asInstanceOf[js.Any])
      
      inline def setAwsOptsUndefined: Self = StObject.set(x, "awsOpts", js.undefined)
      
      inline def setDynamoOpts(value: typings.awsSdk.clientsDynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamoOpts", value.asInstanceOf[js.Any])
      
      inline def setDynamoOptsUndefined: Self = StObject.set(x, "dynamoOpts", js.undefined)
      
      inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      inline def setKmsOpts(value: ClientConfiguration): Self = StObject.set(x, "kmsOpts", value.asInstanceOf[js.Any])
      
      inline def setKmsOptsUndefined: Self = StObject.set(x, "kmsOpts", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  type CredstashContext = StringDictionary[String]
  
  trait PutSecretOptions extends StObject {
    
    var context: CredstashContext
    
    var digest: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var secret: String
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object PutSecretOptions {
    
    inline def apply(context: CredstashContext, name: String, secret: String): PutSecretOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutSecretOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutSecretOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: CredstashContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
