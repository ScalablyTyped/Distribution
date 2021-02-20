package typings.nodecredstash

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.documentClientMod.DocumentClient.DeleteItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.PutItemOutput
import typings.awsSdk.dynamodbMod.AttributeMap
import typings.awsSdk.kmsMod.ClientConfiguration
import typings.awsSdk.kmsMod.DecryptResponse
import typings.nodecredstash.anon.Context
import typings.nodecredstash.anon.Key
import typings.nodecredstash.anon.Name
import typings.nodecredstash.anon.NameVersion
import typings.nodecredstash.anon.Secret
import typings.nodecredstash.anon.StartsWith
import typings.nodecredstash.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodecredstash", JSImport.Namespace)
  @js.native
  def apply(config: CredstashConfig): Credstash = js.native
  
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
  
  @js.native
  trait CredstashConfig extends StObject {
    
    var awsOpts: js.UndefOr[ClientConfiguration] = js.native
    
    var dynamoOpts: js.UndefOr[typings.awsSdk.dynamodbMod.ClientConfiguration] = js.native
    
    var kmsKey: js.UndefOr[String] = js.native
    
    var kmsOpts: js.UndefOr[ClientConfiguration] = js.native
    
    var table: js.UndefOr[String] = js.native
  }
  object CredstashConfig {
    
    @scala.inline
    def apply(): CredstashConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredstashConfig]
    }
    
    @scala.inline
    implicit class CredstashConfigMutableBuilder[Self <: CredstashConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsOpts(value: ClientConfiguration): Self = StObject.set(x, "awsOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsOptsUndefined: Self = StObject.set(x, "awsOpts", js.undefined)
      
      @scala.inline
      def setDynamoOpts(value: typings.awsSdk.dynamodbMod.ClientConfiguration): Self = StObject.set(x, "dynamoOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamoOptsUndefined: Self = StObject.set(x, "dynamoOpts", js.undefined)
      
      @scala.inline
      def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      @scala.inline
      def setKmsOpts(value: ClientConfiguration): Self = StObject.set(x, "kmsOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsOptsUndefined: Self = StObject.set(x, "kmsOpts", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  type CredstashContext = StringDictionary[String]
  
  @js.native
  trait PutSecretOptions extends StObject {
    
    var context: CredstashContext = js.native
    
    var digest: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var secret: String = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object PutSecretOptions {
    
    @scala.inline
    def apply(context: CredstashContext, name: String, secret: String): PutSecretOptions = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutSecretOptions]
    }
    
    @scala.inline
    implicit class PutSecretOptionsMutableBuilder[Self <: PutSecretOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CredstashContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
