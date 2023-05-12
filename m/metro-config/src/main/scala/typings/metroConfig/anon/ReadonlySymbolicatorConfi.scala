package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<metro-config.metro-config/src/configTypes.SymbolicatorConfigT> */
trait ReadonlySymbolicatorConfi extends StObject {
  
  def customizeFrame(frame: Column): js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]
}
object ReadonlySymbolicatorConfi {
  
  inline def apply(customizeFrame: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): ReadonlySymbolicatorConfi = {
    val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame))
    __obj.asInstanceOf[ReadonlySymbolicatorConfi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySymbolicatorConfi] (val x: Self) extends AnyVal {
    
    inline def setCustomizeFrame(value: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
  }
}
