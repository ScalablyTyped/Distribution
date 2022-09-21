package typings.mmdbLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("mmdb-lib/lib/reader/walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(db: Buffer, recordSize: Double): Walker = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(db.asInstanceOf[js.Any], recordSize.asInstanceOf[js.Any])).asInstanceOf[Walker]
  
  type NodeReader = js.Function1[/* offset */ Double, Double]
  
  trait Walker extends StObject {
    
    def left(offset: Double): Double
    @JSName("left")
    var left_Original: NodeReader
    
    def right(offset: Double): Double
    @JSName("right")
    var right_Original: NodeReader
  }
  object Walker {
    
    inline def apply(left: /* offset */ Double => Double, right: /* offset */ Double => Double): Walker = {
      val __obj = js.Dynamic.literal(left = js.Any.fromFunction1(left), right = js.Any.fromFunction1(right))
      __obj.asInstanceOf[Walker]
    }
    
    extension [Self <: Walker](x: Self) {
      
      inline def setLeft(value: /* offset */ Double => Double): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setRight(value: /* offset */ Double => Double): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    }
  }
}
