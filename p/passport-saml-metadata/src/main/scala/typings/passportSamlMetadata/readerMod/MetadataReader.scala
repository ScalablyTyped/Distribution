package typings.passportSamlMetadata.readerMod

import org.scalablytyped.runtime.StringDictionary
import typings.passportSamlMetadata.anon.CamelCase
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-saml-metadata/src/reader", "MetadataReader")
@js.native
class MetadataReader protected () extends js.Object {
  def this(metadata: String) = this()
  def this(metadata: String, options: PartialMetadataConstructo) = this()
  
  def claimSchema: StringDictionary[CamelCase] = js.native
  
  def encryptionCert: js.UndefOr[String] = js.native
  
  def encryptionCerts: js.Array[String] = js.native
  
  def identifierFormat: js.UndefOr[String] = js.native
  
  def identityProviderUrl: js.UndefOr[String] = js.native
  
  def logoutUrl: js.UndefOr[String] = js.native
  
  def signingCert: js.UndefOr[String] = js.native
  
  def signingCerts: js.Array[String] = js.native
}
