package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import typings.passportSamlMetadata.fetchMod.FetchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("passport-saml-metadata/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("passport-saml-metadata/src", "MetadataReader")
  @js.native
  open class MetadataReader protected ()
    extends typings.passportSamlMetadata.readerMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  inline def claimsToCamelCase(claims: Any, claimSchema: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("claimsToCamelCase")(claims.asInstanceOf[js.Any], claimSchema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fetch(config: FetchConfig): js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.passportSamlMetadata.readerMod.MetadataReader]]
  
  inline def metadata(config: SamlConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def toPassportConfig(): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")().asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: Unit, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any]).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: typings.passportSamlMetadata.readerMod.MetadataReader, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
}
