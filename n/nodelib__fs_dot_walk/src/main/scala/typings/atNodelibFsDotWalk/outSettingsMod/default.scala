package typings.atNodelibFsDotWalk.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/settings", JSImport.Default)
@js.native
class default () extends Settings {
  def this(_options: Options) = this()
  /* CompleteClass */
  override var _getValue: js.Any = js.native
  /* CompleteClass */
  override val _options: js.Any = js.native
  /* CompleteClass */
  override val concurrency: Double = js.native
  /* CompleteClass */
  override val deepFilter: DeepFilterFunction | Null = js.native
  /* CompleteClass */
  override val entryFilter: EntryFilterFunction | Null = js.native
  /* CompleteClass */
  override val errorFilter: ErrorFilterFunction | Null = js.native
  /* CompleteClass */
  override val fsScandirSettings: typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod.Settings = js.native
  /* CompleteClass */
  override val pathSegmentSeparator: String = js.native
}

