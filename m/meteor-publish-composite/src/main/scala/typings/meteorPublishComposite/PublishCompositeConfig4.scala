package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel]
}
object PublishCompositeConfig4 {
  
  inline def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](find: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction4(find))
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
  
  extension [Self <: PublishCompositeConfig4[?, ?, ?, ?, ?], InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](x: Self & (PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel])) {
    
    inline def setChildren(value: js.Array[PublishCompositeConfigN]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: PublishCompositeConfigN*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setFind(value: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction4(value))
  }
}
