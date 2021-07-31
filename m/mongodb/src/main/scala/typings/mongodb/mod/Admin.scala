package typings.mongodb.mod

import typings.mongodb.anon.MaxTimeMS
import typings.mongodb.anon.NameOnly
import typings.mongodb.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Admin extends StObject {
  
  def addUser(username: String, password: String): js.Promise[js.Any] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#addUser */
  def addUser(username: String, password: String, callback: MongoCallback[js.Any]): Unit = js.native
  def addUser(username: String, password: String, options: AddUserOptions): js.Promise[js.Any] = js.native
  def addUser(username: String, password: String, options: AddUserOptions, callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#buildInfo */
  def buildInfo(): js.Promise[js.Any] = js.native
  def buildInfo(callback: MongoCallback[js.Any]): Unit = js.native
  def buildInfo(options: `1`): js.Promise[js.Any] = js.native
  def buildInfo(options: `1`, callback: MongoCallback[js.Any]): Unit = js.native
  
  def command(command: js.Object): js.Promise[js.Any] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#command */
  def command(command: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
  def command(command: js.Object, options: MaxTimeMS): js.Promise[js.Any] = js.native
  def command(command: js.Object, options: MaxTimeMS, callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#listDatabases */
  def listDatabases(): js.Promise[js.Any] = js.native
  def listDatabases(callback: MongoCallback[js.Any]): Unit = js.native
  def listDatabases(options: NameOnly): js.Promise[js.Any] = js.native
  def listDatabases(options: NameOnly, callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#ping */
  def ping(): js.Promise[js.Any] = js.native
  def ping(callback: MongoCallback[js.Any]): Unit = js.native
  def ping(options: `1`): js.Promise[js.Any] = js.native
  def ping(options: `1`, callback: MongoCallback[js.Any]): Unit = js.native
  
  def removeUser(username: String): js.Promise[js.Any] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#removeUser */
  def removeUser(username: String, callback: MongoCallback[js.Any]): Unit = js.native
  def removeUser(username: String, options: FSyncOptions): js.Promise[js.Any] = js.native
  def removeUser(username: String, options: FSyncOptions, callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#replSetGetStatus */
  def replSetGetStatus(): js.Promise[js.Any] = js.native
  def replSetGetStatus(callback: MongoCallback[js.Any]): Unit = js.native
  def replSetGetStatus(options: `1`): js.Promise[js.Any] = js.native
  def replSetGetStatus(options: `1`, callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverInfo */
  def serverInfo(): js.Promise[js.Any] = js.native
  def serverInfo(callback: MongoCallback[js.Any]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverStatus */
  def serverStatus(): js.Promise[js.Any] = js.native
  def serverStatus(callback: MongoCallback[js.Any]): Unit = js.native
  def serverStatus(options: `1`): js.Promise[js.Any] = js.native
  def serverStatus(options: `1`, callback: MongoCallback[js.Any]): Unit = js.native
  
  def validateCollection(collectionNme: String): js.Promise[js.Any] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#validateCollection */
  def validateCollection(collectionNme: String, callback: MongoCallback[js.Any]): Unit = js.native
  def validateCollection(collectionNme: String, options: js.Object): js.Promise[js.Any] = js.native
  def validateCollection(collectionNme: String, options: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
}
