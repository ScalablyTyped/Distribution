package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EnhancedPageObject[Commands, Elements, Sections /* <: typings.nightwatch.mod.EnhancedPageObjectSections */] = typings.nightwatch.mod.Nightwatch & typings.nightwatch.mod.SharedCommands & typings.nightwatch.mod.NightwatchCustomCommands & Commands & typings.nightwatch.anon.Elements[Sections]

type EnhancedSectionInstance[Commands, Elements, Sections] = typings.nightwatch.mod.EnhancedPageObject[Commands, Elements, Sections]

type GlobalNightwatchTestHook = js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], scala.Unit]

type GlobalNightwatchTestHookEach = js.Function2[
/* browser */ typings.nightwatch.mod.NightwatchBrowser, 
/* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
scala.Unit]

type NightwatchAssert = js.Function6[
/* passed */ scala.Boolean, 
/* receivedValue */ js.UndefOr[js.Any], 
/* expectedValue */ js.UndefOr[js.Any], 
/* message */ js.UndefOr[java.lang.String], 
/* abortOnFailure */ js.UndefOr[scala.Boolean], 
/* originalStackTrace */ js.UndefOr[java.lang.String], 
scala.Unit]

type NightwatchTest = js.Function1[/* browser */ typings.nightwatch.mod.NightwatchBrowser, scala.Unit]

type NightwatchTestHook = typings.nightwatch.mod.GlobalNightwatchTestHookEach | typings.nightwatch.mod.GlobalNightwatchTestHook

type NightwatchTestSettings = org.scalablytyped.runtime.StringDictionary[typings.nightwatch.mod.NightwatchTestSettingScreenshots]
