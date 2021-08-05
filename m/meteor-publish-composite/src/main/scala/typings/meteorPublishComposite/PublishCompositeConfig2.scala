package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, js.Any]]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  def find(arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel]
}
object PublishCompositeConfig2 {
  
  inline def apply[InLevel1, InLevel2, OutLevel](find: (InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find))
    __obj.asInstanceOf[PublishCompositeConfig2[InLevel1, InLevel2, OutLevel]]
  }
  
  extension [Self <: PublishCompositeConfig2[?, ?, ?], InLevel1, InLevel2, OutLevel](x: Self & (PublishCompositeConfig2[InLevel1, InLevel2, OutLevel])) {
    
    inline def setChildren(value: js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, js.Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, js.Any])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setFind(value: (InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
  }
}
