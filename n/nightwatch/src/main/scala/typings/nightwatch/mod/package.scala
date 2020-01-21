package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnhancedPageObject[Commands, Elements, Sections /* <: typings.nightwatch.mod.EnhancedPageObjectSections */] = typings.nightwatch.mod.Nightwatch with typings.nightwatch.mod.SharedCommands with typings.nightwatch.mod.NightwatchCustomCommands with Commands with typings.nightwatch.AnonCallback[Sections]
  type EnhancedSectionInstance[Commands, Elements, Sections] = typings.nightwatch.mod.EnhancedPageObject[Commands, Elements, Sections]
  type NightwatchAssert = js.Function6[
    /* passed */ scala.Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    /* abortOnFailure */ js.UndefOr[scala.Boolean], 
    /* originalStackTrace */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NightwatchTest = js.Function1[/* browser */ typings.nightwatch.mod.NightwatchBrowser, scala.Unit]
  type NightwatchTestHook = (js.Function2[
    /* browser */ typings.nightwatch.mod.NightwatchBrowser, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit])
  type NightwatchTestSettings = org.scalablytyped.runtime.StringDictionary[typings.nightwatch.mod.NightwatchTestSettingScreenshots]
}
