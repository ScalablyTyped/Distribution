package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishCompositeConfig1[InLevel1, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, js.Any]]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  def find(arg1: InLevel1): Cursor[OutLevel, OutLevel]
}
object PublishCompositeConfig1 {
  
  inline def apply[InLevel1, OutLevel](find: InLevel1 => Cursor[OutLevel, OutLevel]): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
  
  extension [Self <: PublishCompositeConfig1[?, ?], InLevel1, OutLevel](x: Self & (PublishCompositeConfig1[InLevel1, OutLevel])) {
    
    inline def setChildren(value: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, js.Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (PublishCompositeConfig2[InLevel1, OutLevel, js.Any])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setFind(value: InLevel1 => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
