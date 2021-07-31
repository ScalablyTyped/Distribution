package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.readerMod.MetadataReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passportMod {
  
  @JSImport("passport-saml-metadata/src/passport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("claimsToCamelCase")(claims.asInstanceOf[js.Any], claimSchema.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def toPassportConfig(): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")().asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: Unit, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: MetadataReader): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any]).asInstanceOf[SamlConfig]
  @scala.inline
  def toPassportConfig(reader: MetadataReader, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
}
