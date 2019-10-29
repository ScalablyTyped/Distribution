package typings.mdnDashBrowserDashCompatDashData.typesMod

import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.beta
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.current
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.esr
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.limited
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.nightly
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.planned
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.retired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseStatement extends js.Object {
  /**
    * Name of the browser's underlying engine.
    */
  var engine: js.UndefOr[BrowserEngines] = js.undefined
  /**
    * Version of the engine corresponding to the browser version.
    */
  var engine_version: js.UndefOr[String] = js.undefined
  /**
    * The date on which this version was released.
    *
    * Formatted as `YYYY-MM-DD`.
    */
  var release_date: js.UndefOr[String] = js.undefined
  /**
    * The URL of the release notes.
    */
  var release_notes: js.UndefOr[String] = js.undefined
  /**
    * A property indicating where in the lifetime cycle this release is in.
    *
    * It's an enum accepting these values:
    * - `retired`: This release is no longer supported (EOL).
    * - `current`: This release is the official latest release.
    * - `exclusive`: This is an exclusive release (for example on a flagship device),
    *   not generally available.
    * - `beta`: This release will the next official release.
    * - `nightly`: This release is the current alpha / experimental release
    *   (like Firefox Nightly, Chrome Canary).
    * - `esr`: This release is an Extended Support Release.
    * - `planned`: This release is planned in the future.
    */
  var status: retired | current | limited | beta | nightly | esr | planned
}

object ReleaseStatement {
  @scala.inline
  def apply(
    status: retired | current | limited | beta | nightly | esr | planned,
    engine: BrowserEngines = null,
    engine_version: String = null,
    release_date: String = null,
    release_notes: String = null
  ): ReleaseStatement = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (engine_version != null) __obj.updateDynamic("engine_version")(engine_version)
    if (release_date != null) __obj.updateDynamic("release_date")(release_date)
    if (release_notes != null) __obj.updateDynamic("release_notes")(release_notes)
    __obj.asInstanceOf[ReleaseStatement]
  }
}

