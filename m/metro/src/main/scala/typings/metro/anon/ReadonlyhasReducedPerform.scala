package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  hasReducedPerformance :boolean | undefined,   watch :boolean | undefined}> */
trait ReadonlyhasReducedPerform extends StObject {
  
  val hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
  
  val watch: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyhasReducedPerform {
  
  inline def apply(): ReadonlyhasReducedPerform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyhasReducedPerform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyhasReducedPerform] (val x: Self) extends AnyVal {
    
    inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
    
    inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
