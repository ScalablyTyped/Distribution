package typings
package nodecredstashLib.nodecredstashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[scala.Unit] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.DecryptResponse */ _
  ] = js.native
  def decryptStash(stash: nodecredstashLib.Anon_Key, context: CredstashContext): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.KMS.DecryptResponse */ _
  ] = js.native
  def deleteSecret(options: nodecredstashLib.Anon_NameVersion): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.DeleteItemOutput */ _
  ] = js.native
  def deleteSecrets(options: nodecredstashLib.Anon_Name): js.Promise[
    js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.DeleteItemOutput */ _
    ]
  ] = js.native
  def getAllSecrets(options: nodecredstashLib.Anon_ContextStartsWith): js.Promise[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  def getAllVersions(options: nodecredstashLib.Anon_Context): js.Promise[js.Array[nodecredstashLib.Anon_Secret]] = js.native
  def getHighestVersion(options: nodecredstashLib.Anon_Name): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeMap */ _
  ] = js.native
  def getSecret(options: nodecredstashLib.Anon_ContextName): js.Promise[java.lang.String] = js.native
  def incrementVersion(options: nodecredstashLib.Anon_Name): js.Promise[java.lang.String] = js.native
  def listSecrets(): js.Promise[js.Array[java.lang.String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.PutItemOutput */ _
  ] = js.native
}

