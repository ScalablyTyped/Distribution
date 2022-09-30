package typings.meteor.anon

import typings.meteor.MongoConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mongo extends StObject {
  
  var mongo: MongoConnection
}
object Mongo {
  
  inline def apply(mongo: MongoConnection): Mongo = {
    val __obj = js.Dynamic.literal(mongo = mongo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mongo]
  }
  
  extension [Self <: Mongo](x: Self) {
    
    inline def setMongo(value: MongoConnection): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
  }
}
