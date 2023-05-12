package typings.nodecredstash

import typings.nodecredstash.anon.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  trait Configuration extends StObject {
    
    var dynamoOpts: js.UndefOr[DynamoDBOpts] = js.undefined
    
    var kmsKey: js.UndefOr[String] = js.undefined
    
    var kmsOpts: js.UndefOr[KMSOpts] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setDynamoOpts(value: DynamoDBOpts): Self = StObject.set(x, "dynamoOpts", value.asInstanceOf[js.Any])
      
      inline def setDynamoOptsUndefined: Self = StObject.set(x, "dynamoOpts", js.undefined)
      
      inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      inline def setKmsOpts(value: KMSOpts): Self = StObject.set(x, "kmsOpts", value.asInstanceOf[js.Any])
      
      inline def setKmsOptsUndefined: Self = StObject.set(x, "kmsOpts", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  type DynamoDBOpts = /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (configuration : @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb/dist-types/DynamoDBClient.DynamoDBClientConfig): @aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DynamoDBClient>[0] */ js.Any
  
  trait GetAllSecrets
    extends StObject
       with OptContext {
    
    var startsWith: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String | Double] = js.undefined
  }
  object GetAllSecrets {
    
    inline def apply(): GetAllSecrets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllSecrets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAllSecrets] (val x: Self) extends AnyVal {
      
      inline def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodecredstash.srcTypesMod.Opts because Already inherited
  - typings.nodecredstash.srcTypesMod.QueryOpts because var conflicts: kmsKey, tableName. Inlined limit */ trait GetAllVersions
    extends StObject
       with OptContext {
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var name: String
  }
  object GetAllVersions {
    
    inline def apply(name: String): GetAllVersions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAllVersions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetHighestVersionResponse extends StObject {
    
    var secret: String
    
    var version: String
  }
  object GetHighestVersionResponse {
    
    inline def apply(secret: String, version: String): GetHighestVersionResponse = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHighestVersionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetHighestVersionResponse] (val x: Self) extends AnyVal {
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nodecredstash.srcTypesMod.Opts because Already inherited
  - typings.nodecredstash.srcTypesMod.OptContext because var conflicts: kmsKey, tableName. Inlined context */ trait GetSecret
    extends StObject
       with NameOpts {
    
    var context: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: js.UndefOr[String | Double] = js.undefined
  }
  object GetSecret {
    
    inline def apply(name: String): GetSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSecret] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Record[String, String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type KMSOpts = /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (configuration : @aws-sdk/client-kms.@aws-sdk/client-kms/dist-types/KMSClient.KMSClientConfig): @aws-sdk/client-kms.@aws-sdk/client-kms.KMSClient>[0] */ js.Any
  
  trait NameAndVersionOpts
    extends StObject
       with NameOpts {
    
    var version: String | Double
  }
  object NameAndVersionOpts {
    
    inline def apply(name: String, version: String | Double): NameAndVersionOpts = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameAndVersionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameAndVersionOpts] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameOpts
    extends StObject
       with Opts {
    
    var name: String
  }
  object NameOpts {
    
    inline def apply(name: String): NameOpts = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameOpts] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptContext
    extends StObject
       with Opts {
    
    var context: js.UndefOr[Record[String, String]] = js.undefined
  }
  object OptContext {
    
    inline def apply(): OptContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptContext] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Record[String, String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait Opts extends StObject {
    
    var kmsKey: js.UndefOr[String] = js.undefined
    
    var tableName: js.UndefOr[String] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  trait PutSecret
    extends StObject
       with OptContext {
    
    var digest: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var secret: String
    
    var version: js.UndefOr[String | Double] = js.undefined
  }
  object PutSecret {
    
    inline def apply(name: String, secret: String): PutSecret = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutSecret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutSecret] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait QueryOpts
    extends StObject
       with Opts {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object QueryOpts {
    
    inline def apply(): QueryOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryOpts] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait SecretRecord extends StObject {
    
    var contents: String
    
    var digest: js.UndefOr[String] = js.undefined
    
    var hmac: String | Value
    
    var key: String
    
    var name: String
    
    var version: String
  }
  object SecretRecord {
    
    inline def apply(contents: String, hmac: String | Value, key: String, name: String, version: String): SecretRecord = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], hmac = hmac.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecretRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecretRecord] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      inline def setHmac(value: String | Value): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
