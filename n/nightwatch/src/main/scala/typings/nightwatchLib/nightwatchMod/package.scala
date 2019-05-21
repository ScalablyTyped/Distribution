package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nightwatchMod {
  type EnhancedPageObject[Commands, Elements, Sections /* <: EnhancedPageObjectSections */] = Nightwatch with SharedCommands with NightwatchCustomCommands with Commands with nightwatchLib.Anon_Callback[Sections]
  type EnhancedSectionInstance[Commands, Elements, Sections] = EnhancedPageObject[Commands, Elements, Sections]
  type NightwatchAssert = js.Function6[
    /* passed */ scala.Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    /* abortOnFailure */ js.UndefOr[scala.Boolean], 
    /* originalStackTrace */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NightwatchTest = js.Function1[/* browser */ NightwatchBrowser, scala.Unit]
  type NightwatchTestHook = (js.Function2[
    /* browser */ NightwatchBrowser, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit])
  type NightwatchTestSettings = org.scalablytyped.runtime.StringDictionary[NightwatchTestSettingScreenshots]
}
