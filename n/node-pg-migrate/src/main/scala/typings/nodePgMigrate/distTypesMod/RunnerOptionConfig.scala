package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunnerOptionConfig extends js.Object {
  
  var checkOrder: js.UndefOr[Boolean] = js.native
  
  var count: Double = js.native
  
  var createMigrationsSchema: js.UndefOr[Boolean] = js.native
  
  var createSchema: js.UndefOr[Boolean] = js.native
  
  var decamelize: js.UndefOr[Boolean] = js.native
  
  var dir: String = js.native
  
  var direction: MigrationDirection = js.native
  
  var dryRun: js.UndefOr[Boolean] = js.native
  
  var fake: js.UndefOr[Boolean] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var ignorePattern: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[LogFn] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var migrationsSchema: js.UndefOr[String] = js.native
  
  var migrationsTable: String = js.native
  
  var noLock: js.UndefOr[Boolean] = js.native
  
  var schema: js.UndefOr[String | js.Array[String]] = js.native
  
  var singleTransaction: js.UndefOr[Boolean] = js.native
  
  var timestamp: js.UndefOr[Boolean] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object RunnerOptionConfig {
  
  @scala.inline
  def apply(count: Double, dir: String, direction: MigrationDirection, migrationsTable: String): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
  
  @scala.inline
  implicit class RunnerOptionConfigOps[Self <: RunnerOptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: MigrationDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationsTable(value: String): Self = this.set("migrationsTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOrder(value: Boolean): Self = this.set("checkOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOrder: Self = this.set("checkOrder", js.undefined)
    
    @scala.inline
    def setCreateMigrationsSchema(value: Boolean): Self = this.set("createMigrationsSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateMigrationsSchema: Self = this.set("createMigrationsSchema", js.undefined)
    
    @scala.inline
    def setCreateSchema(value: Boolean): Self = this.set("createSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSchema: Self = this.set("createSchema", js.undefined)
    
    @scala.inline
    def setDecamelize(value: Boolean): Self = this.set("decamelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecamelize: Self = this.set("decamelize", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setFake(value: Boolean): Self = this.set("fake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFake: Self = this.set("fake", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setIgnorePattern(value: String): Self = this.set("ignorePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePattern: Self = this.set("ignorePattern", js.undefined)
    
    @scala.inline
    def setLog(value: /* msg */ String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMigrationsSchema(value: String): Self = this.set("migrationsSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationsSchema: Self = this.set("migrationsSchema", js.undefined)
    
    @scala.inline
    def setNoLock(value: Boolean): Self = this.set("noLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLock: Self = this.set("noLock", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: String*): Self = this.set("schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: String | js.Array[String]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSingleTransaction(value: Boolean): Self = this.set("singleTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleTransaction: Self = this.set("singleTransaction", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
