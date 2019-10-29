package typings.mdnDashBrowserDashCompatDashData.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserStatement extends js.Object {
  /**
    * The browser brand name, for example:
    * `"Firefox"`, `"Firefox Android"`, `"Safari"`, `"iOS Safari"`, etc.
    */
  var name: String
  /**
    * An optional string containing the URL of the page where feature flags can be changed
    * (e.g. `"about:config"` for Firefox or `"chrome://flags"` for Chrome).
    */
  var pref_url: js.UndefOr[String] = js.undefined
  /**
    * The known versions of this browser.
    */
  var releases: StringDictionary[ReleaseStatement]
}

object BrowserStatement {
  @scala.inline
  def apply(name: String, releases: StringDictionary[ReleaseStatement], pref_url: String = null): BrowserStatement = {
    val __obj = js.Dynamic.literal(name = name, releases = releases)
    if (pref_url != null) __obj.updateDynamic("pref_url")(pref_url)
    __obj.asInstanceOf[BrowserStatement]
  }
}

