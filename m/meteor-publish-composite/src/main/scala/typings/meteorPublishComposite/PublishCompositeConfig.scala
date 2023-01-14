package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishCompositeConfig[OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, Any]]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  def find(): Cursor[OutLevel, OutLevel]
}
object PublishCompositeConfig {
  
  inline def apply[OutLevel](find: () => Cursor[OutLevel, OutLevel]): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find))
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishCompositeConfig[?], OutLevel] (val x: Self & PublishCompositeConfig[OutLevel]) extends AnyVal {
    
    inline def setChildren(value: js.Array[PublishCompositeConfig1[OutLevel, Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (PublishCompositeConfig1[OutLevel, Any])*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    inline def setFind(value: () => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
  }
}
