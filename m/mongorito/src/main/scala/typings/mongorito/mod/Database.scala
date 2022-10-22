package typings.mongorito.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Database")
@js.native
open class Database () extends StObject {
  def this(urls: String) = this()
  def this(urls: js.Array[String]) = this()
  def this(urls: String, options: MongoClientOptions) = this()
  def this(urls: js.Array[String], options: MongoClientOptions) = this()
  def this(urls: Unit, options: MongoClientOptions) = this()
  
  def connect(): js.Promise[Db] = js.native
  
  def connection(): js.Promise[Db] = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  var models: js.Array[ModelClass] = js.native
  
  var options: MongoClientOptions = js.native
  
  var plugins: js.Array[Plugin] = js.native
  
  def register(models: js.Array[ModelClass]): Unit = js.native
  def register(models: ModelClass): Unit = js.native
  
  var state: DatabaseState = js.native
  
  /**
    * @see Model#use()
    */
  def use(): Unit = js.native
  def use(plugins: js.Array[Plugin]): Unit = js.native
  def use(plugins: Plugin): Unit = js.native
}
