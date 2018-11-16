package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RunnerOption extends js.Object {
  var checkOrder: js.UndefOr[scala.Boolean] = js.undefined
  var count: scala.Double
  var createMigrationsSchema: js.UndefOr[scala.Boolean] = js.undefined
  var createSchema: js.UndefOr[scala.Boolean] = js.undefined
  var databaseUrl: java.lang.String | ClientConfig
  var dir: java.lang.String
  var direction: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.up | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.down
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  var fake: js.UndefOr[scala.Boolean] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var ignorePattern: java.lang.String
  var log: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
  var migrationsSchema: js.UndefOr[java.lang.String] = js.undefined
  var migrationsTable: java.lang.String
  var noLock: js.UndefOr[scala.Boolean] = js.undefined
  var schema: js.UndefOr[java.lang.String] = js.undefined
  var singleTransaction: js.UndefOr[scala.Boolean] = js.undefined
  var timestamp: js.UndefOr[scala.Boolean] = js.undefined
}

