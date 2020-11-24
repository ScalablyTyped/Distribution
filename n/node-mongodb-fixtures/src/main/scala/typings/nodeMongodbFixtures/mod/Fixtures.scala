package typings.nodeMongodbFixtures.mod

import typings.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setup and tear down test fixtures with MongoDB.
  *
  * Use custom scripts to create indexes and more!
  *
  * @see https://www.npmjs.com/package/node-mongodb-fixtures
  */
@js.native
trait Fixtures extends js.Object {
  
  /**
    * @param uri MongoDB connection string.
    *
    * @param options MongoDB connection options.
    *
    * @param dbName Identifies a database to switch to. Useful when the db in the connection string differs from the db you want to connect to.
    */
  def connect(uri: String): js.Promise[this.type] = js.native
  def connect(uri: String, options: js.UndefOr[scala.Nothing], dbName: String): js.Promise[this.type] = js.native
  def connect(uri: String, options: MongoClientOptions): js.Promise[this.type] = js.native
  def connect(uri: String, options: MongoClientOptions, dbName: String): js.Promise[this.type] = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  def load(): js.Promise[this.type] = js.native
  
  def unload(): js.Promise[this.type] = js.native
}
