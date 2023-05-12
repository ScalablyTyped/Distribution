package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<metro-config.metro-config/src/configTypes.SymbolicatorConfigT> */
trait PartialSymbolicatorConfig extends StObject {
  
  var customizeFrame: js.UndefOr[
    js.Function1[/* frame */ Column, js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]]
  ] = js.undefined
}
object PartialSymbolicatorConfig {
  
  inline def apply(): PartialSymbolicatorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSymbolicatorConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSymbolicatorConfig] (val x: Self) extends AnyVal {
    
    inline def setCustomizeFrame(value: /* frame */ Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
    
    inline def setCustomizeFrameUndefined: Self = StObject.set(x, "customizeFrame", js.undefined)
  }
}
