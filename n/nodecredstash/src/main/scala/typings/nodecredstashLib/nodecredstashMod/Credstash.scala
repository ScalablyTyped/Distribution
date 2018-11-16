package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): stdLib.Promise[scala.Unit] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key): stdLib.Promise[awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key, context: CredstashContext): stdLib.Promise[awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse] = js.native
  def deleteSecret(options: nodecredstashLib.Anon_Name): stdLib.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DeleteItemOutput] = js.native
  def deleteSecrets(options: nodecredstashLib.Anon_NameString): stdLib.Promise[
    js.Array[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DeleteItemOutput]
  ] = js.native
  def getAllSecrets(options: nodecredstashLib.Anon_Version): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def getAllVersions(options: nodecredstashLib.Anon_Limit): stdLib.Promise[js.Array[nodecredstashLib.Anon_Secret]] = js.native
  def getHighestVersion(options: nodecredstashLib.Anon_NameString): stdLib.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.AttributeMap] = js.native
  def getSecret(options: nodecredstashLib.Anon_NameContext): stdLib.Promise[java.lang.String] = js.native
  def incrementVersion(options: nodecredstashLib.Anon_NameString): stdLib.Promise[java.lang.String] = js.native
  def listSecrets(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def putSecret(options: PutSecretOptions): stdLib.Promise[awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.PutItemOutput] = js.native
}

