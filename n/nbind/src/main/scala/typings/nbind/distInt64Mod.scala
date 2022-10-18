package typings.nbind

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInt64Mod {
  
  @JSImport("nbind/dist/int64", "Int64")
  @js.native
  open class Int64 protected () extends StObject {
    def this(lo: Double, hi: Double, sign: Boolean) = this()
    
    def fromJS(output: js.Function3[/* lo */ Double, /* hi */ Double, /* sign */ Boolean, Unit]): Unit = js.native
    
    var hi: Double = js.native
    
    var lo: Double = js.native
    
    var sign: Boolean = js.native
    
    def toString(base: Double): String = js.native
  }
}
