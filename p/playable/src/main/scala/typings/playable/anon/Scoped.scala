package typings.playable.anon

import typings.playable.lifetimeMod.Lifetime
import typings.playable.typesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scoped extends StObject {
  
  def scoped(): IOptions = js.native
  
  def setLifetime(value: Lifetime): IOptions = js.native
  
  def singleton(): IOptions = js.native
  
  def transient(): IOptions = js.native
}
object Scoped {
  
  @scala.inline
  def apply(
    scoped: () => IOptions,
    setLifetime: Lifetime => IOptions,
    singleton: () => IOptions,
    transient: () => IOptions
  ): Scoped = {
    val __obj = js.Dynamic.literal(scoped = js.Any.fromFunction0(scoped), setLifetime = js.Any.fromFunction1(setLifetime), singleton = js.Any.fromFunction0(singleton), transient = js.Any.fromFunction0(transient))
    __obj.asInstanceOf[Scoped]
  }
  
  @scala.inline
  implicit class ScopedMutableBuilder[Self <: Scoped] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScoped(value: () => IOptions): Self = StObject.set(x, "scoped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLifetime(value: Lifetime => IOptions): Self = StObject.set(x, "setLifetime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingleton(value: () => IOptions): Self = StObject.set(x, "singleton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransient(value: () => IOptions): Self = StObject.set(x, "transient", js.Any.fromFunction0(value))
  }
}
