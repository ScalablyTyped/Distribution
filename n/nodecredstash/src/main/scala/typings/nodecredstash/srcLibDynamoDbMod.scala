package typings.nodecredstash

import typings.awsSdkClientDynamodb.mod.DynamoDBClient
import typings.awsSdkLibDynamodb.distTypesCommandsDeleteCommandMod.DeleteCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput
import typings.nodecredstash.anon.Item
import typings.nodecredstash.anon.Items
import typings.nodecredstash.srcTypesMod.NameAndVersionOpts
import typings.nodecredstash.srcTypesMod.NameOpts
import typings.nodecredstash.srcTypesMod.Opts
import typings.nodecredstash.srcTypesMod.QueryOpts
import typings.nodecredstash.srcTypesMod.SecretRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibDynamoDbMod {
  
  @JSImport("nodecredstash/src/lib/dynamoDb", "DynamoDB")
  @js.native
  open class DynamoDB protected () extends StObject {
    def this(ddb: DynamoDBClient) = this()
    
    def createSecret(item: SecretRecord): js.Promise[PutCommandOutput] = js.native
    def createSecret(item: SecretRecord, tableName: String): js.Promise[PutCommandOutput] = js.native
    
    def createTable(): js.Promise[Unit] = js.native
    def createTable(param0: Opts): js.Promise[Unit] = js.native
    
    def deleteSecret(param0: NameAndVersionOpts): js.Promise[DeleteCommandOutput] = js.native
    
    def getAllSecretsAndVersions(): js.Promise[Items] = js.native
    def getAllSecretsAndVersions(param0: QueryOpts): js.Promise[Items] = js.native
    
    def getAllVersions(opts: QueryOpts & NameOpts): js.Promise[Items] = js.native
    
    def getByVersion(param0: NameAndVersionOpts): js.Promise[Item] = js.native
    
    def getLatestVersion(opts: NameOpts): js.Promise[Items] = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
