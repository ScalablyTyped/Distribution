package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.migrationMod.RunMigration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  @JSImport("node-pg-migrate/dist/runner", JSImport.Default)
  @js.native
  def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = js.native
}
