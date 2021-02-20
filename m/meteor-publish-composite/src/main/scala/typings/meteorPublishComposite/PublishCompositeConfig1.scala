package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig1[InLevel1, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(arg1: InLevel1): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig1 {
  
  @scala.inline
  def apply[InLevel1, OutLevel](find: InLevel1 => Cursor[OutLevel, OutLevel]): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfig1MutableBuilder[Self <: PublishCompositeConfig1[_, _], InLevel1, OutLevel] (val x: Self with (PublishCompositeConfig1[InLevel1, OutLevel])) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig2[InLevel1, OutLevel, js.Any])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    @scala.inline
    def setFind(value: InLevel1 => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
  }
}
