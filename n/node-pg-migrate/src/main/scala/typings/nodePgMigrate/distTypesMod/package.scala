package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Literal = js.Function1[/* v */ typings.nodePgMigrate.generalTypesMod.Name, java.lang.String]
  type LogFn = js.Function1[/* msg */ java.lang.String, scala.Unit]
  type MigrationAction = js.Function2[
    /* pgm */ typings.nodePgMigrate.distTypesMod.MigrationBuilder, 
    /* run */ js.UndefOr[js.Function0[scala.Unit]], 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type RunnerOption = typings.nodePgMigrate.distTypesMod.RunnerOptionConfig with (typings.nodePgMigrate.distTypesMod.RunnerOptionClient | typings.nodePgMigrate.distTypesMod.RunnerOptionUrl)
}
