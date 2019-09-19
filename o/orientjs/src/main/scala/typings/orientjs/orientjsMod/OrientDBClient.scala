package typings.orientjs.orientjsMod

import typings.node.eventsMod.EventEmitter
import typings.orientjs.orientjsMod.MigrationNs.MigrationManager
import typings.orientjs.orientjsMod.MigrationNs.MigrationManagerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OrientDBClient")
@js.native
class OrientDBClient () extends EventEmitter {
  def this(options: OrientDBClientConfig) = this()
  def close(): js.Promise[Unit] = js.native
  def connect(): js.Promise[OrientDBClient] = js.native
  def createDatabase(): js.Promise[Unit] = js.native
  def createDatabase(options: DatabaseOptions): js.Promise[Unit] = js.native
  def dropDatabase(): js.Promise[Unit] = js.native
  def dropDatabase(options: DropDatabaseOptions): js.Promise[Unit] = js.native
  def existsDatabase(): js.Promise[Boolean] = js.native
  def existsDatabase(options: DatabaseOptions): js.Promise[Boolean] = js.native
  def listDatabases(): js.Promise[js.Array[_]] = js.native
  def listDatabases(options: ServerOptions): js.Promise[js.Array[_]] = js.native
  def migrator(): MigrationManager = js.native
  def migrator(config: MigrationManagerConfig): MigrationManager = js.native
  def session(): js.Promise[ODatabaseSession] = js.native
  def session(options: ODatabaseSessionOptions): js.Promise[ODatabaseSession] = js.native
  def sessions(): js.Promise[ODatabaseSessionPool] = js.native
  def sessions(options: ODatabaseSessionOptions): js.Promise[ODatabaseSessionPool] = js.native
}

/* static members */
@JSImport("orientjs", "OrientDBClient")
@js.native
object OrientDBClient extends js.Object {
  def connect(): js.Promise[OrientDBClient] = js.native
  def connect(options: OrientDBClientConfig): js.Promise[OrientDBClient] = js.native
}

