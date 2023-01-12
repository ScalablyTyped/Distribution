package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.ReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionInfo
  extends StObject
     with Document {
  
  var idIndex: js.UndefOr[Document] = js.undefined
  
  var info: js.UndefOr[ReadOnly] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[Document] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CollectionInfo {
  
  inline def apply(name: String): CollectionInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionInfo] (val x: Self) extends AnyVal {
    
    inline def setIdIndex(value: Document): Self = StObject.set(x, "idIndex", value.asInstanceOf[js.Any])
    
    inline def setIdIndexUndefined: Self = StObject.set(x, "idIndex", js.undefined)
    
    inline def setInfo(value: ReadOnly): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Document): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
