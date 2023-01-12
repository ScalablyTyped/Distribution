package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusteredCollectionOptions
  extends StObject
     with Document {
  
  var key: Document
  
  var name: js.UndefOr[String] = js.undefined
  
  var unique: Boolean
}
object ClusteredCollectionOptions {
  
  inline def apply(key: Document, unique: Boolean): ClusteredCollectionOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusteredCollectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusteredCollectionOptions] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Document): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
