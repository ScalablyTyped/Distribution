package typings.playable.anon

import typings.playable.lifetimeMod.Lifetime
import typings.playable.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scoped extends js.Object {
  
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
  implicit class ScopedOps[Self <: Scoped] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScoped(value: () => IOptions): Self = this.set("scoped", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLifetime(value: Lifetime => IOptions): Self = this.set("setLifetime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSingleton(value: () => IOptions): Self = this.set("singleton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransient(value: () => IOptions): Self = this.set("transient", js.Any.fromFunction0(value))
  }
}
