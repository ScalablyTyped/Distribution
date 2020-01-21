package typings.nodelibFsScandir.settingsMod

import typings.nodelibFsScandir.fsMod.FileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/settings", JSImport.Default)
@js.native
class default () extends Settings {
  def this(_options: Options) = this()
  /* CompleteClass */
  override var _getValue: js.Any = js.native
  /* CompleteClass */
  override val _options: js.Any = js.native
  /* CompleteClass */
  override val followSymbolicLinks: Boolean = js.native
  /* CompleteClass */
  override val fs: FileSystemAdapter = js.native
  /* CompleteClass */
  override val fsStatSettings: Settings = js.native
  /* CompleteClass */
  override val pathSegmentSeparator: String = js.native
  /* CompleteClass */
  override val stats: Boolean = js.native
  /* CompleteClass */
  override val throwErrorOnBrokenSymbolicLink: Boolean = js.native
}

