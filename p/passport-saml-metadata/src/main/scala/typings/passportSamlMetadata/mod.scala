package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import typings.passportSamlMetadata.fetchMod.FetchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-saml-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("passport-saml-metadata", "MetadataReader")
  @js.native
  class MetadataReader protected ()
    extends typings.passportSamlMetadata.srcMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  @scala.inline
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("claimsToCamelCase")(claims.asInstanceOf[js.Any], claimSchema.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def fetch(config: FetchConfig): js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader]]
  
  @scala.inline
  def metadata(config: SamlConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def toPassportConfig(): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")().asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: Unit, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any]).asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
}
