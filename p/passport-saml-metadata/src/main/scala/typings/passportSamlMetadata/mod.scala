package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import typings.passportSamlMetadata.fetchMod.FetchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml-metadata", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MetadataReader protected ()
    extends typings.passportSamlMetadata.srcMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  def fetch(config: FetchConfig): js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader] = js.native
  def metadata(config: SamlConfig): js.Function0[Unit] = js.native
  def toPassportConfig(): SamlConfig = js.native
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = js.native
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = js.native
}

