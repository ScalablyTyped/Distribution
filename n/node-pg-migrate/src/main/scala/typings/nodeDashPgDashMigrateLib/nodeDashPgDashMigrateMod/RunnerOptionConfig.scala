package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionConfig extends js.Object {
  var checkOrder: js.UndefOr[scala.Boolean] = js.undefined
  var count: scala.Double
  var createMigrationsSchema: js.UndefOr[scala.Boolean] = js.undefined
  var createSchema: js.UndefOr[scala.Boolean] = js.undefined
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

object RunnerOptionConfig {
  @scala.inline
  def apply(
    count: scala.Double,
    dir: java.lang.String,
    direction: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.up | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.down,
    ignorePattern: java.lang.String,
    migrationsTable: java.lang.String,
    checkOrder: js.UndefOr[scala.Boolean] = js.undefined,
    createMigrationsSchema: js.UndefOr[scala.Boolean] = js.undefined,
    createSchema: js.UndefOr[scala.Boolean] = js.undefined,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    fake: js.UndefOr[scala.Boolean] = js.undefined,
    file: java.lang.String = null,
    log: js.Function1[/* msg */ java.lang.String, scala.Unit] = null,
    migrationsSchema: java.lang.String = null,
    noLock: js.UndefOr[scala.Boolean] = js.undefined,
    schema: java.lang.String = null,
    singleTransaction: js.UndefOr[scala.Boolean] = js.undefined,
    timestamp: js.UndefOr[scala.Boolean] = js.undefined
  ): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count, dir = dir, direction = direction.asInstanceOf[js.Any], ignorePattern = ignorePattern, migrationsTable = migrationsTable)
    if (!js.isUndefined(checkOrder)) __obj.updateDynamic("checkOrder")(checkOrder)
    if (!js.isUndefined(createMigrationsSchema)) __obj.updateDynamic("createMigrationsSchema")(createMigrationsSchema)
    if (!js.isUndefined(createSchema)) __obj.updateDynamic("createSchema")(createSchema)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (!js.isUndefined(fake)) __obj.updateDynamic("fake")(fake)
    if (file != null) __obj.updateDynamic("file")(file)
    if (log != null) __obj.updateDynamic("log")(log)
    if (migrationsSchema != null) __obj.updateDynamic("migrationsSchema")(migrationsSchema)
    if (!js.isUndefined(noLock)) __obj.updateDynamic("noLock")(noLock)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(singleTransaction)) __obj.updateDynamic("singleTransaction")(singleTransaction)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[RunnerOptionConfig]
  }
}

