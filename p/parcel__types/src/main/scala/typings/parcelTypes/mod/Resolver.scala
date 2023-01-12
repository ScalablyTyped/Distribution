package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolver extends StObject {
  
  def resolve(arg0: typings.parcelTypes.anon.Dependency): Async[js.UndefOr[ResolveResult | Null]]
}
object Resolver {
  
  inline def apply(resolve: typings.parcelTypes.anon.Dependency => Async[js.UndefOr[ResolveResult | Null]]): Resolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Resolver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolver] (val x: Self) extends AnyVal {
    
    inline def setResolve(value: typings.parcelTypes.anon.Dependency => Async[js.UndefOr[ResolveResult | Null]]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
