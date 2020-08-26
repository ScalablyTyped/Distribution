package typings.nodelibFsWalk.settingsMod

import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var _getValue: js.Any = js.native
  val _options: js.Any = js.native
  val basePath: js.UndefOr[String] = js.native
  val concurrency: Double = js.native
  val deepFilter: DeepFilterFunction | Null = js.native
  val entryFilter: EntryFilterFunction | Null = js.native
  val errorFilter: ErrorFilterFunction | Null = js.native
  val fsScandirSettings: typings.nodelibFsScandir.mod.Settings = js.native
  val pathSegmentSeparator: String = js.native
}

object Settings {
  @scala.inline
  def apply(
    _getValue: js.Any,
    _options: js.Any,
    concurrency: Double,
    fsScandirSettings: typings.nodelibFsScandir.mod.Settings,
    pathSegmentSeparator: String
  ): Settings = {
    val __obj = js.Dynamic.literal(_getValue = _getValue.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], concurrency = concurrency.asInstanceOf[js.Any], fsScandirSettings = fsScandirSettings.asInstanceOf[js.Any], pathSegmentSeparator = pathSegmentSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def set_getValue(value: js.Any): Self = this.set("_getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setFsScandirSettings(value: typings.nodelibFsScandir.mod.Settings): Self = this.set("fsScandirSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathSegmentSeparator(value: String): Self = this.set("pathSegmentSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setDeepFilter(value: Entry => Boolean): Self = this.set("deepFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setDeepFilterNull: Self = this.set("deepFilter", null)
    @scala.inline
    def setEntryFilter(value: Entry => Boolean): Self = this.set("entryFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setEntryFilterNull: Self = this.set("entryFilter", null)
    @scala.inline
    def setErrorFilter(value: Errno => Boolean): Self = this.set("errorFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setErrorFilterNull: Self = this.set("errorFilter", null)
  }
  
}

