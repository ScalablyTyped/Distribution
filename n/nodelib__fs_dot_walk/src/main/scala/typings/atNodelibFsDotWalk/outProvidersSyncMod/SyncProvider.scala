package typings.atNodelibFsDotWalk.outProvidersSyncMod

import typings.atNodelibFsDotWalk.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncProvider extends js.Object {
  val _reader: typings.atNodelibFsDotWalk.outReadersSyncMod.default
  val _root: js.Any
  val _settings: js.Any
  def read(): js.Array[Entry]
}

object SyncProvider {
  @scala.inline
  def apply(
    _reader: typings.atNodelibFsDotWalk.outReadersSyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    read: () => js.Array[Entry]
  ): SyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
  
    __obj.asInstanceOf[SyncProvider]
  }
}

