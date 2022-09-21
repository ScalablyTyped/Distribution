package typings.popcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(pluginName: String, info: PopcornPlugin): Any = js.native
    def apply(pluginName: String, info: PopcornPlugin, manifest: Any): Any = js.native
    
    var debug: Boolean = js.native
    
    var errors: js.Array[Any] = js.native
  }
  
  @js.native
  trait ToSeconds extends StObject {
    
    def toSeconds(smpte: String): Double = js.native
    def toSeconds(smpte: String, fps: Double): Double = js.native
  }
}
