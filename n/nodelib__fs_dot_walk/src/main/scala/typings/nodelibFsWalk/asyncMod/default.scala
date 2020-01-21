package typings.nodelibFsWalk.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers/async", JSImport.Default)
@js.native
class default protected () extends AsyncProvider {
  def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  /* CompleteClass */
  override val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
  /* CompleteClass */
  override val _root: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override val _storage: js.Any = js.native
  /* CompleteClass */
  override def read(callback: AsyncCallback): Unit = js.native
}

