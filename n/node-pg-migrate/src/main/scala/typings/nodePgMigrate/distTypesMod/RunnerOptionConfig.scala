package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerOptionConfig extends StObject {
  
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
  def apply(count: Double, dir: String, direction: MigrationDirection, migrationsTable: String): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
  
  @scala.inline
  implicit class RunnerOptionConfigMutableBuilder[Self <: RunnerOptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckOrder(value: Boolean): Self = StObject.set(x, "checkOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOrderUndefined: Self = StObject.set(x, "checkOrder", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateMigrationsSchema(value: Boolean): Self = StObject.set(x, "createMigrationsSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateMigrationsSchemaUndefined: Self = StObject.set(x, "createMigrationsSchema", js.undefined)
    
    @scala.inline
    def setCreateSchema(value: Boolean): Self = StObject.set(x, "createSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSchemaUndefined: Self = StObject.set(x, "createSchema", js.undefined)
    
    @scala.inline
    def setDecamelize(value: Boolean): Self = StObject.set(x, "decamelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecamelizeUndefined: Self = StObject.set(x, "decamelize", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: MigrationDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setFake(value: Boolean): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFakeUndefined: Self = StObject.set(x, "fake", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setIgnorePattern(value: String): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    
    @scala.inline
    def setLog(value: /* msg */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMigrationsSchema(value: String): Self = StObject.set(x, "migrationsSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationsSchemaUndefined: Self = StObject.set(x, "migrationsSchema", js.undefined)
    
    @scala.inline
    def setMigrationsTable(value: String): Self = StObject.set(x, "migrationsTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLock(value: Boolean): Self = StObject.set(x, "noLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLockUndefined: Self = StObject.set(x, "noLock", js.undefined)
    
    @scala.inline
    def setSchema(value: String | js.Array[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: String*): Self = StObject.set(x, "schema", js.Array(value :_*))
    
    @scala.inline
    def setSingleTransaction(value: Boolean): Self = StObject.set(x, "singleTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleTransactionUndefined: Self = StObject.set(x, "singleTransaction", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
