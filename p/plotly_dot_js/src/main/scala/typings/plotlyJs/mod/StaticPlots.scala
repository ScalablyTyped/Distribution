package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPlots extends StObject {
  
  def resize(root: Root): Unit
}
object StaticPlots {
  
  @scala.inline
  def apply(resize: Root => Unit): StaticPlots = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction1(resize))
    __obj.asInstanceOf[StaticPlots]
  }
  
  @scala.inline
  implicit class StaticPlotsMutableBuilder[Self <: StaticPlots] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResize(value: Root => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
  }
}
