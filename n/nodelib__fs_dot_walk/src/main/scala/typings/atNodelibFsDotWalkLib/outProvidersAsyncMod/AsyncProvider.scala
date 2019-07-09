package typings
package atNodelibFsDotWalkLib.outProvidersAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProvider extends js.Object {
  val _reader: atNodelibFsDotWalkLib.outReadersAsyncMod.default
  val _root: js.Any
  val _settings: js.Any
  val _storage: js.Any
  def read(callback: AsyncCallback): scala.Unit
}

object AsyncProvider {
  @scala.inline
  def apply(
    _reader: atNodelibFsDotWalkLib.outReadersAsyncMod.default,
    _root: js.Any,
    _settings: js.Any,
    _storage: js.Any,
    read: AsyncCallback => scala.Unit
  ): AsyncProvider = {
    val __obj = js.Dynamic.literal(_reader = _reader, _root = _root, _settings = _settings, _storage = _storage, read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[AsyncProvider]
  }
}

