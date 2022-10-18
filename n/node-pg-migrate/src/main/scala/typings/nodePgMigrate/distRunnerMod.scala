package typings.nodePgMigrate

import typings.nodePgMigrate.distMigrationMod.RunMigration
import typings.nodePgMigrate.distTypesMod.RunnerOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRunnerMod {
  
  @JSImport("node-pg-migrate/dist/runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RunMigration]]]
}
