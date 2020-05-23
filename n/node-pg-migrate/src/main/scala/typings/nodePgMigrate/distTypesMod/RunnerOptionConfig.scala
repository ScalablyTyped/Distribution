package typings.nodePgMigrate.distTypesMod

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
  var direction: MigrationDirection
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var fake: js.UndefOr[Boolean] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var ignorePattern: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[LogFn] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var migrationsSchema: js.UndefOr[String] = js.undefined
  var migrationsTable: String
  var noLock: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  var singleTransaction: js.UndefOr[Boolean] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object RunnerOptionConfig {
  @scala.inline
  def apply(
    count: Double,
    dir: String,
    direction: MigrationDirection,
    migrationsTable: String,
    checkOrder: js.UndefOr[Boolean] = js.undefined,
    createMigrationsSchema: js.UndefOr[Boolean] = js.undefined,
    createSchema: js.UndefOr[Boolean] = js.undefined,
    decamelize: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    fake: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    ignorePattern: String = null,
    log: /* msg */ String => Unit = null,
    logger: Logger = null,
    migrationsSchema: String = null,
    noLock: js.UndefOr[Boolean] = js.undefined,
    schema: String | js.Array[String] = null,
    singleTransaction: js.UndefOr[Boolean] = js.undefined,
    timestamp: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOrder)) __obj.updateDynamic("checkOrder")(checkOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createMigrationsSchema)) __obj.updateDynamic("createMigrationsSchema")(createMigrationsSchema.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createSchema)) __obj.updateDynamic("createSchema")(createSchema.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decamelize)) __obj.updateDynamic("decamelize")(decamelize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fake)) __obj.updateDynamic("fake")(fake.get.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (ignorePattern != null) __obj.updateDynamic("ignorePattern")(ignorePattern.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (migrationsSchema != null) __obj.updateDynamic("migrationsSchema")(migrationsSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(noLock)) __obj.updateDynamic("noLock")(noLock.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(singleTransaction)) __obj.updateDynamic("singleTransaction")(singleTransaction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
}

