package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.down
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionConfig extends js.Object {
  var checkOrder: js.UndefOr[Boolean] = js.undefined
  var count: Double
  var createMigrationsSchema: js.UndefOr[Boolean] = js.undefined
  var createSchema: js.UndefOr[Boolean] = js.undefined
  var decamelize: js.UndefOr[Boolean] = js.undefined
  var dir: String
  var direction: up | down
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var fake: js.UndefOr[Boolean] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var ignorePattern: String
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var migrationsSchema: js.UndefOr[String] = js.undefined
  var migrationsTable: String
  var noLock: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  var singleTransaction: js.UndefOr[Boolean] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object RunnerOptionConfig {
  @scala.inline
  def apply(
    count: Double,
    dir: String,
    direction: up | down,
    ignorePattern: String,
    migrationsTable: String,
    checkOrder: js.UndefOr[Boolean] = js.undefined,
    createMigrationsSchema: js.UndefOr[Boolean] = js.undefined,
    createSchema: js.UndefOr[Boolean] = js.undefined,
    decamelize: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    fake: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    log: /* msg */ String => Unit = null,
    migrationsSchema: String = null,
    noLock: js.UndefOr[Boolean] = js.undefined,
    schema: String | js.Array[String] = null,
    singleTransaction: js.UndefOr[Boolean] = js.undefined,
    timestamp: js.UndefOr[Boolean] = js.undefined
  ): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count, dir = dir, direction = direction.asInstanceOf[js.Any], ignorePattern = ignorePattern, migrationsTable = migrationsTable)
    if (!js.isUndefined(checkOrder)) __obj.updateDynamic("checkOrder")(checkOrder)
    if (!js.isUndefined(createMigrationsSchema)) __obj.updateDynamic("createMigrationsSchema")(createMigrationsSchema)
    if (!js.isUndefined(createSchema)) __obj.updateDynamic("createSchema")(createSchema)
    if (!js.isUndefined(decamelize)) __obj.updateDynamic("decamelize")(decamelize)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (!js.isUndefined(fake)) __obj.updateDynamic("fake")(fake)
    if (file != null) __obj.updateDynamic("file")(file)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (migrationsSchema != null) __obj.updateDynamic("migrationsSchema")(migrationsSchema)
    if (!js.isUndefined(noLock)) __obj.updateDynamic("noLock")(noLock)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(singleTransaction)) __obj.updateDynamic("singleTransaction")(singleTransaction)
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[RunnerOptionConfig]
  }
}

