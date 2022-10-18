package typings.next.anon

import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: js.UndefOr[Any] = js.undefined
  
  var onStart: js.UndefOr[js.Function2[/* span */ Span, /* repeated */ Any, Unit]] = js.undefined
  
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var parentSpan: js.UndefOr[js.Function0[Span]] = js.undefined
}
object Attrs {
  
  inline def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setOnStart(value: (/* span */ Span, /* repeated */ Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setParentSpan(value: () => Span): Self = StObject.set(x, "parentSpan", js.Any.fromFunction0(value))
    
    inline def setParentSpanUndefined: Self = StObject.set(x, "parentSpan", js.undefined)
  }
}
