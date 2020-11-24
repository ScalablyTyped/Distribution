package typings.nodelibFsWalk.syncMod

import typings.nodelibFsWalk.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncProvider extends js.Object {
  
  val _reader: typings.nodelibFsWalk.readersSyncMod.default = js.native
  
  val _root: js.Any = js.native
  
  val _settings: js.Any = js.native
  
  def read(): js.Array[Entry] = js.native
}
object SyncProvider {
  
  @scala.inline
  def apply(
    _reader: typings.nodelibFsWalk.readersSyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    read: () => js.Array[Entry]
  ): SyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[SyncProvider]
  }
  
  @scala.inline
  implicit class SyncProviderOps[Self <: SyncProvider] (val x: Self) extends AnyVal {
    
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
    def set_reader(value: typings.nodelibFsWalk.readersSyncMod.default): Self = this.set("_reader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_root(value: js.Any): Self = this.set("_root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_settings(value: js.Any): Self = this.set("_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: () => js.Array[Entry]): Self = this.set("read", js.Any.fromFunction0(value))
  }
}
