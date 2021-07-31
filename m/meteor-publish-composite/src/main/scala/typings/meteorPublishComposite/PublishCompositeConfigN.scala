package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishCompositeConfigN extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  
  var collectionName: js.UndefOr[String] = js.undefined
  
  def find(args: js.Any*): Cursor[js.Any, js.Any]
}
object PublishCompositeConfigN {
  
  @scala.inline
  def apply(find: /* repeated */ js.Any => Cursor[js.Any, js.Any]): PublishCompositeConfigN = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfigN]
  }
  
  @scala.inline
  implicit class PublishCompositeConfigNMutableBuilder[Self <: PublishCompositeConfigN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfigN]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: PublishCompositeConfigN*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    @scala.inline
    def setFind(value: /* repeated */ js.Any => Cursor[js.Any, js.Any]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
