package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerOptionConfig extends StObject {
  
  /**
    * Check order of migrations before running them.
    */
  var checkOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of migration to run.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Creates the configured migration schema if it doesn't exist.
    */
  var createMigrationsSchema: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates the configured schema if it doesn't exist.
    */
  var createSchema: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Runs [`decamelize`](https://github.com/sindresorhus/decamelize) on table/column/etc. names.
    */
  var decamelize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The directory containing your migration files.
    */
  var dir: String
  
  /**
    * Direction of migration-run.
    */
  var direction: MigrationDirection
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mark migrations as run without actually performing them (use with caution!).
    */
  var fake: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Run only migration with this name.
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * Regex pattern for file names to ignore (ignores files starting with `.` by default).
    */
  var ignorePattern: js.UndefOr[String] = js.undefined
  
  /**
    * Redirect log messages to this function, rather than `console`.
    */
  var log: js.UndefOr[LogFn] = js.undefined
  
  /**
    * Redirect messages to this logger object, rather than `console`.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  /**
    * The schema storing table which migrations have been run.
    *
    * (defaults to same value as `schema`)
    */
  var migrationsSchema: js.UndefOr[String] = js.undefined
  
  /**
    * The table storing which migrations have been run.
    */
  var migrationsTable: String
  
  /**
    * Disables locking mechanism and checks.
    */
  var noLock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The schema on which migration will be run.
    *
    * @default 'public'
    */
  var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Combines all pending migrations into a single transaction so that if any migration fails, all will be rolled back.
    *
    * @default true
    */
  var singleTransaction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Treats `count` as timestamp.
    */
  var timestamp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Print all debug messages like DB queries run (if you switch it on, it will disable `logger.debug` method).
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object RunnerOptionConfig {
  
  inline def apply(dir: String, direction: MigrationDirection, migrationsTable: String): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunnerOptionConfig] (val x: Self) extends AnyVal {
    
    inline def setCheckOrder(value: Boolean): Self = StObject.set(x, "checkOrder", value.asInstanceOf[js.Any])
    
    inline def setCheckOrderUndefined: Self = StObject.set(x, "checkOrder", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCreateMigrationsSchema(value: Boolean): Self = StObject.set(x, "createMigrationsSchema", value.asInstanceOf[js.Any])
    
    inline def setCreateMigrationsSchemaUndefined: Self = StObject.set(x, "createMigrationsSchema", js.undefined)
    
    inline def setCreateSchema(value: Boolean): Self = StObject.set(x, "createSchema", value.asInstanceOf[js.Any])
    
    inline def setCreateSchemaUndefined: Self = StObject.set(x, "createSchema", js.undefined)
    
    inline def setDecamelize(value: Boolean): Self = StObject.set(x, "decamelize", value.asInstanceOf[js.Any])
    
    inline def setDecamelizeUndefined: Self = StObject.set(x, "decamelize", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: MigrationDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setFake(value: Boolean): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    
    inline def setFakeUndefined: Self = StObject.set(x, "fake", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setIgnorePattern(value: String): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
    
    inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    
    inline def setLog(value: /* msg */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMigrationsSchema(value: String): Self = StObject.set(x, "migrationsSchema", value.asInstanceOf[js.Any])
    
    inline def setMigrationsSchemaUndefined: Self = StObject.set(x, "migrationsSchema", js.undefined)
    
    inline def setMigrationsTable(value: String): Self = StObject.set(x, "migrationsTable", value.asInstanceOf[js.Any])
    
    inline def setNoLock(value: Boolean): Self = StObject.set(x, "noLock", value.asInstanceOf[js.Any])
    
    inline def setNoLockUndefined: Self = StObject.set(x, "noLock", js.undefined)
    
    inline def setSchema(value: String | js.Array[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value*))
    
    inline def setSingleTransaction(value: Boolean): Self = StObject.set(x, "singleTransaction", value.asInstanceOf[js.Any])
    
    inline def setSingleTransactionUndefined: Self = StObject.set(x, "singleTransaction", js.undefined)
    
    inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
