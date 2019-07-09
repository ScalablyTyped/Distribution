package typings
package atNodelibFsDotStatLib.outSettingsMod

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
  override val followSymbolicLink: scala.Boolean = js.native
  /* CompleteClass */
  override val fs: atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter = js.native
  /* CompleteClass */
  override val markSymbolicLink: scala.Boolean = js.native
  /* CompleteClass */
  override val throwErrorOnBrokenSymbolicLink: scala.Boolean = js.native
}

