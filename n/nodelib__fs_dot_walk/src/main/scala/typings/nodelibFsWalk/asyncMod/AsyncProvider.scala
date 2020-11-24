package typings.nodelibFsWalk.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncProvider extends js.Object {
  
  val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
  
  val _root: js.Any = js.native
  
  val _settings: js.Any = js.native
  
  val _storage: js.Any = js.native
  
  def read(callback: AsyncCallback): Unit = js.native
}
object AsyncProvider {
  
  @scala.inline
  def apply(
    _reader: typings.nodelibFsWalk.readersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _storage: js.Any,
    read: AsyncCallback => Unit
  ): AsyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[AsyncProvider]
  }
  
  @scala.inline
  implicit class AsyncProviderOps[Self <: AsyncProvider] (val x: Self) extends AnyVal {
    
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
    def set_reader(value: typings.nodelibFsWalk.readersAsyncMod.default): Self = this.set("_reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_root(value: js.Any): Self = this.set("_root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_storage(value: js.Any): Self = this.set("_storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: AsyncCallback => Unit): Self = this.set("read", js.Any.fromFunction1(value))
  }
}
