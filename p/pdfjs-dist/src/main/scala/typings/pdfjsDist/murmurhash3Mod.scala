package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object murmurhash3Mod {
  
  @JSImport("pdfjs-dist/types/src/shared/murmurhash3", "MurmurHash3_64")
  @js.native
  open class MurmurHash364 protected () extends StObject {
    def this(seed: Any) = this()
    
    var h1: Double = js.native
    
    var h2: Double = js.native
    
    def hexdigest(): String = js.native
    
    def update(input: Any): Unit = js.native
  }
}
