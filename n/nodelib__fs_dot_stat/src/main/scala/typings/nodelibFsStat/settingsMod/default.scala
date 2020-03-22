package typings.nodelibFsStat.settingsMod

import typings.nodelibFsStat.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/settings", JSImport.Default)
@js.native
class default () extends Settings {
  def this(_options: Options) = this()
  /* CompleteClass */
  override var _getValue: js.Any = js.native
  /* CompleteClass */
  override val _options: js.Any = js.native
  /* CompleteClass */
  override val followSymbolicLink: Boolean = js.native
  /* CompleteClass */
  override val fs: FileSystemAdapter = js.native
  /* CompleteClass */
  override val markSymbolicLink: Boolean = js.native
  /* CompleteClass */
  override val throwErrorOnBrokenSymbolicLink: Boolean = js.native
}

