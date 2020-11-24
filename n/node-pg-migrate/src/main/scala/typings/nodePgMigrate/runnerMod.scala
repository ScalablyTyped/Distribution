package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.migrationMod.RunMigration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/runner", JSImport.Namespace)
@js.native
object runnerMod extends js.Object {
  
  def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = js.native
}
