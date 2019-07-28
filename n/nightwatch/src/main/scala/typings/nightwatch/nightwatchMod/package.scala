package typings.nightwatch

import org.scalablytyped.runtime.StringDictionary
import typings.nightwatch.Anon_Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nightwatchMod {
  type EnhancedPageObject[Commands, Elements, Sections /* <: EnhancedPageObjectSections */] = Nightwatch with SharedCommands with NightwatchCustomCommands with Commands with Anon_Callback[Sections]
  type EnhancedSectionInstance[Commands, Elements, Sections] = EnhancedPageObject[Commands, Elements, Sections]
  type NightwatchAssert = js.Function6[
    /* passed */ Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[String], 
    /* abortOnFailure */ js.UndefOr[Boolean], 
    /* originalStackTrace */ js.UndefOr[String], 
    Unit
  ]
  type NightwatchTest = js.Function1[/* browser */ NightwatchBrowser, Unit]
  type NightwatchTestHook = (js.Function2[
    /* browser */ NightwatchBrowser, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]) | (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit])
  type NightwatchTestSettings = StringDictionary[NightwatchTestSettingScreenshots]
}
