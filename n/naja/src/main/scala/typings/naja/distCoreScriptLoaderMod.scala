package typings.naja

import typings.naja.distNajaMod.Naja
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreScriptLoaderMod {
  
  @JSImport("naja/dist/core/ScriptLoader", "ScriptLoader")
  @js.native
  open class ScriptLoader protected () extends StObject {
    def this(naja: Naja) = this()
    
    def loadScripts(snippets: Record[String, String]): Unit = js.native
    
    /* private */ var loadedScripts: Any = js.native
  }
}
