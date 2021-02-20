package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import typings.passportSamlMetadata.anon.MultipleCerts
import typings.passportSamlMetadata.readerMod.MetadataReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passportMod {
  
  @JSImport("passport-saml-metadata/src/passport", "claimsToCamelCase")
  @js.native
  def claimsToCamelCase(claims: js.Any, claimSchema: js.Any): js.Any = js.native
  
  @JSImport("passport-saml-metadata/src/passport", "toPassportConfig")
  @js.native
  def toPassportConfig(): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src/passport", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: js.UndefOr[scala.Nothing], options: MultipleCerts): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src/passport", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: MetadataReader): SamlConfig = js.native
  @JSImport("passport-saml-metadata/src/passport", "toPassportConfig")
  @js.native
  def toPassportConfig(reader: MetadataReader, options: MultipleCerts): SamlConfig = js.native
}
