package typings.passportSamlMetadata.readerMod

import org.scalablytyped.runtime.StringDictionary
import typings.passportSamlMetadata.AnonCamelCase
import typings.passportSamlMetadata.PartialMetadataConstructo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml-metadata/src/reader", "MetadataReader")
@js.native
class MetadataReader protected () extends js.Object {
  def this(metadata: String) = this()
  def this(metadata: String, options: PartialMetadataConstructo) = this()
  def claimSchema: StringDictionary[AnonCamelCase] = js.native
  def encryptionCert: js.UndefOr[String] = js.native
  def encryptionCerts: js.Array[String] = js.native
  def identifierFormat: js.UndefOr[String] = js.native
  def identityProviderUrl: js.UndefOr[String] = js.native
  def logoutUrl: js.UndefOr[String] = js.native
  def signingCert: js.UndefOr[String] = js.native
  def signingCerts: js.Array[String] = js.native
}

