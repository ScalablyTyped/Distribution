package typings.atNodelibFsDotWalk.outSettingsMod

import typings.atNodelibFsDotWalk.outTypesMod.Entry
import typings.atNodelibFsDotWalk.outTypesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var _getValue: js.Any
  val _options: js.Any
  val basePath: js.UndefOr[String] = js.undefined
  val concurrency: Double
  val deepFilter: DeepFilterFunction | Null
  val entryFilter: EntryFilterFunction | Null
  val errorFilter: ErrorFilterFunction | Null
  val fsScandirSettings: typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod.Settings
  val pathSegmentSeparator: String
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    concurrency: Double,
    fsScandirSettings: typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod.Settings,
    pathSegmentSeparator: String,
    basePath: String = null,
    deepFilter: Entry => Boolean = null,
    entryFilter: Entry => Boolean = null,
    errorFilter: Errno => Boolean = null
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue, _options = _options, concurrency = concurrency, fsScandirSettings = fsScandirSettings, pathSegmentSeparator = pathSegmentSeparator)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (deepFilter != null) __obj.updateDynamic("deepFilter")(js.Any.fromFunction1(deepFilter))
    if (entryFilter != null) __obj.updateDynamic("entryFilter")(js.Any.fromFunction1(entryFilter))
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    __obj.asInstanceOf[Settings]
  }
}

