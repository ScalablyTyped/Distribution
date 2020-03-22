package typings.nodecredstash.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.documentClientMod.DocumentClient.DeleteItemOutput
import typings.awsSdk.documentClientMod.DocumentClient.PutItemOutput
import typings.awsSdk.dynamodbMod.AttributeMap
import typings.awsSdk.kmsMod.DecryptResponse
import typings.nodecredstash.AnonContext
import typings.nodecredstash.AnonKey
import typings.nodecredstash.AnonName
import typings.nodecredstash.AnonNameVersion
import typings.nodecredstash.AnonSecret
import typings.nodecredstash.AnonStartsWith
import typings.nodecredstash.AnonVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[Unit] = js.native
  def decryptStash(stash: AnonKey): js.Promise[DecryptResponse] = js.native
  def decryptStash(stash: AnonKey, context: CredstashContext): js.Promise[DecryptResponse] = js.native
  def deleteSecret(options: AnonNameVersion): js.Promise[DeleteItemOutput] = js.native
  def deleteSecrets(options: AnonName): js.Promise[js.Array[DeleteItemOutput]] = js.native
  def getAllSecrets(options: AnonStartsWith): js.Promise[StringDictionary[String]] = js.native
  def getAllVersions(options: AnonContext): js.Promise[js.Array[AnonSecret]] = js.native
  def getHighestVersion(options: AnonName): js.Promise[AttributeMap] = js.native
  def getSecret(options: AnonVersion): js.Promise[String] = js.native
  def incrementVersion(options: AnonName): js.Promise[String] = js.native
  def listSecrets(): js.Promise[js.Array[String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[PutItemOutput] = js.native
}

