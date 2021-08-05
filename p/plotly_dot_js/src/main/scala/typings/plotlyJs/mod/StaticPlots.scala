package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPlots extends StObject {
  
  def resize(root: Root): Unit
}
object StaticPlots {
  
  inline def apply(resize: Root => Unit): StaticPlots = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction1(resize))
    __obj.asInstanceOf[StaticPlots]
  }
  
  extension [Self <: StaticPlots](x: Self) {
    
    inline def setResize(value: Root => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
  }
}
