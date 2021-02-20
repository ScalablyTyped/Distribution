package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import typings.passportSamlMetadata.fetchMod.FetchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("passport-saml-metadata/src", "MetadataReader")
  @js.native
  class MetadataReader protected ()
    extends typings.passportSamlMetadata.readerMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  @JSImport("passport-saml-metadata/src", "claimsToCamelCase")
  @js.native
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  
  @JSImport("passport-saml-metadata/src", "fetch")
  @js.native
  def fetch(config: FetchConfig): js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader] = js.native
  
  @JSImport("passport-saml-metadata/src", "metadata")
  @js.native
  def metadata(config: SamlConfig): js.Function0[Unit] = js.native
  
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: js.UndefOr[scala.Nothing], options: MultipleCerts): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = js.native
}
