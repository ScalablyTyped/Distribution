package typings.optimism.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dirty[TKey] extends js.Object {
  
  def dirty(key: TKey): Unit = js.native
}
object Dirty {
  
  @scala.inline
  def apply[TKey](dirty: TKey => Unit): Dirty[TKey] = {
    val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty))
    __obj.asInstanceOf[Dirty[TKey]]
  }
  
  @scala.inline
  implicit class DirtyOps[Self <: Dirty[_], TKey] (val x: Self with Dirty[TKey]) extends AnyVal {
    
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
    def setDirty(value: TKey => Unit): Self = this.set("dirty", js.Any.fromFunction1(value))
  }
}
