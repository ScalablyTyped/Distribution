package typings.playable.anon

import typings.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime
import typings.playable.distSrcCoreDependencyContainerTypesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scoped extends StObject {
  
  def scoped(): IOptions
  
  def setLifetime(value: Lifetime): IOptions
  
  def singleton(): IOptions
  
  def transient(): IOptions
}
object Scoped {
  
  inline def apply(
    scoped: () => IOptions,
    setLifetime: Lifetime => IOptions,
    singleton: () => IOptions,
    transient: () => IOptions
  ): Scoped = {
    val __obj = js.Dynamic.literal(scoped = js.Any.fromFunction0(scoped), setLifetime = js.Any.fromFunction1(setLifetime), singleton = js.Any.fromFunction0(singleton), transient = js.Any.fromFunction0(transient))
    __obj.asInstanceOf[Scoped]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scoped] (val x: Self) extends AnyVal {
    
    inline def setScoped(value: () => IOptions): Self = StObject.set(x, "scoped", js.Any.fromFunction0(value))
    
    inline def setSetLifetime(value: Lifetime => IOptions): Self = StObject.set(x, "setLifetime", js.Any.fromFunction1(value))
    
    inline def setSingleton(value: () => IOptions): Self = StObject.set(x, "singleton", js.Any.fromFunction0(value))
    
    inline def setTransient(value: () => IOptions): Self = StObject.set(x, "transient", js.Any.fromFunction0(value))
  }
}
