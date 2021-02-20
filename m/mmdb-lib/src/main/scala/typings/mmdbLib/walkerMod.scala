package typings.mmdbLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("mmdb-lib/lib/reader/walker", JSImport.Default)
  @js.native
  def default(db: Buffer, recordSize: Double): Walker = js.native
  
  type NodeReader = js.Function1[/* offset */ Double, Double]
  
  @js.native
  trait Walker extends StObject {
    
    def left(offset: Double): Double = js.native
    @JSName("left")
    var left_Original: NodeReader = js.native
    
    def right(offset: Double): Double = js.native
    @JSName("right")
    var right_Original: NodeReader = js.native
  }
}
