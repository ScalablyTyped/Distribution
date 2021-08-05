package typings.passportSamlMetadata

import typings.passportSaml.mod.SamlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("passport-saml-metadata/src/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def metadata(config: SamlConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
