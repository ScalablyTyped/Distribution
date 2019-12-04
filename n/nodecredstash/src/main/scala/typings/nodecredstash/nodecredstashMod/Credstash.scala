package typings.nodecredstash.nodecredstashMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodecredstash.Anon_Context
import typings.nodecredstash.Anon_ContextName
import typings.nodecredstash.Anon_ContextStartsWith
import typings.nodecredstash.Anon_Key
import typings.nodecredstash.Anon_Name
import typings.nodecredstash.Anon_NameVersion
import typings.nodecredstash.Anon_Secret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[Unit] = js.native
  def decryptStash(stash: Anon_Key): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.KMS.DecryptResponse */ _
  ] = js.native
  def decryptStash(stash: Anon_Key, context: CredstashContext): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.KMS.DecryptResponse */ _
  ] = js.native
  def deleteSecret(options: Anon_NameVersion): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.DeleteItemOutput */ _
  ] = js.native
  def deleteSecrets(options: Anon_Name): js.Promise[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.DeleteItemOutput */ _
    ]
  ] = js.native
  def getAllSecrets(options: Anon_ContextStartsWith): js.Promise[StringDictionary[String]] = js.native
  def getAllVersions(options: Anon_Context): js.Promise[js.Array[Anon_Secret]] = js.native
  def getHighestVersion(options: Anon_Name): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.DynamoDB.AttributeMap */ _
  ] = js.native
  def getSecret(options: Anon_ContextName): js.Promise[String] = js.native
  def incrementVersion(options: Anon_Name): js.Promise[String] = js.native
  def listSecrets(): js.Promise[js.Array[String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.DynamoDB.DocumentClient.PutItemOutput */ _
  ] = js.native
}

