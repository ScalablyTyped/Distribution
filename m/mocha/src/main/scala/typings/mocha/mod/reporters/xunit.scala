package typings.mocha.mod.reporters

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.reporters.XUnit
import typings.mocha.Mocha.reporters.XUnit.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mocha", "reporters.xunit")
@js.native
object xunit
  extends TopLevel[
      Instantiable2[/* runner */ Runner, /* options */ js.UndefOr[MochaOptions], XUnit]
    ]
