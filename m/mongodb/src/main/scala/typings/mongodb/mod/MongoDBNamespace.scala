package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoDBNamespace")
@js.native
open class MongoDBNamespace protected () extends StObject {
  /**
    * Create a namespace object
    *
    * @param db - database name
    * @param collection - collection name
    */
  def this(db: String) = this()
  def this(db: String, collection: String) = this()
  
  var collection: js.UndefOr[String] = js.native
  
  var db: String = js.native
  
  def withCollection(collection: String): MongoDBNamespace = js.native
}
/* static members */
object MongoDBNamespace {
  
  @JSImport("mongodb", "MongoDBNamespace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(): MongoDBNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")().asInstanceOf[MongoDBNamespace]
  inline def fromString(namespace: String): MongoDBNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(namespace.asInstanceOf[js.Any]).asInstanceOf[MongoDBNamespace]
}
