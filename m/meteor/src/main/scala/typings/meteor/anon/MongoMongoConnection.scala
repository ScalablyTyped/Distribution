package typings.meteor.anon

import typings.meteor.MongoInternals.MongoConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoMongoConnection extends StObject {
  
  var mongo: MongoConnection
}
object MongoMongoConnection {
  
  inline def apply(mongo: MongoConnection): MongoMongoConnection = {
    val __obj = js.Dynamic.literal(mongo = mongo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMongoConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MongoMongoConnection] (val x: Self) extends AnyVal {
    
    inline def setMongo(value: MongoConnection): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
  }
}
