package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.distTypesMod.Logger
import typings.pg.mod.ClientBase
import typings.pg.mod.ClientConfig
import typings.pg.mod.QueryArrayConfig
import typings.pg.mod.QueryConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbMod {
  
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: String): DBConnection = js.native
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: String, logger: Logger): DBConnection = js.native
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: ClientBase): DBConnection = js.native
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: ClientBase, logger: Logger): DBConnection = js.native
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: ClientConfig): DBConnection = js.native
  @JSImport("node-pg-migrate/dist/db", JSImport.Default)
  @js.native
  def default(connection: ClientConfig, logger: Logger): DBConnection = js.native
  
  @js.native
  trait DBConnection extends DB {
    
    def addBeforeCloseListener(listener: js.Any): Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    
    def connected(): Boolean = js.native
    
    def createConnection(): js.Promise[Unit] = js.native
  }
}
