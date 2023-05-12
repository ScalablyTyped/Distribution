package typings.nodecredstash

import typings.nodecredstash.anon.Contents
import typings.nodecredstash.srcLibKeyServiceMod.KeyService
import typings.nodecredstash.srcTypesMod.SecretRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibAesCredstashMod {
  
  @JSImport("nodecredstash/src/lib/aesCredstash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openAesCtrLegacy(keyService: KeyService, record: SecretRecord): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAesCtrLegacy")(keyService.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sealAesCtrLegacy(keyService: KeyService, secret: String): js.Promise[Contents] = (^.asInstanceOf[js.Dynamic].applyDynamic("sealAesCtrLegacy")(keyService.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Contents]]
  inline def sealAesCtrLegacy(keyService: KeyService, secret: String, digest: String): js.Promise[Contents] = (^.asInstanceOf[js.Dynamic].applyDynamic("sealAesCtrLegacy")(keyService.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Contents]]
}
