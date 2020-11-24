package typings.mocha.mod.reporters

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.reporters.Progress
import typings.mocha.Mocha.reporters.Progress.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mocha", "reporters.progress")
@js.native
object progress
  extends TopLevel[
      Instantiable2[/* runner */ Runner, /* options */ js.UndefOr[MochaOptions], Progress]
    ]
