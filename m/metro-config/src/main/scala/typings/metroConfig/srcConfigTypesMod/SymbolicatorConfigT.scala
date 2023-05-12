package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.Collapse
import typings.metroConfig.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolicatorConfigT extends StObject {
  
  def customizeFrame(frame: Column): js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]
}
object SymbolicatorConfigT {
  
  inline def apply(customizeFrame: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): SymbolicatorConfigT = {
    val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame))
    __obj.asInstanceOf[SymbolicatorConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolicatorConfigT] (val x: Self) extends AnyVal {
    
    inline def setCustomizeFrame(value: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
  }
}
