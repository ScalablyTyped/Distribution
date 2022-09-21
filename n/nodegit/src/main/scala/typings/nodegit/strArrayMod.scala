package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strArrayMod {
  
  @JSImport("nodegit/str-array", "Strarray")
  @js.native
  open class Strarray () extends StObject {
    
    def copy(src: Strarray): Double = js.native
    
    var count: Double = js.native
    
    def free(): Unit = js.native
    
    var strings: js.Array[String] = js.native
  }
}
