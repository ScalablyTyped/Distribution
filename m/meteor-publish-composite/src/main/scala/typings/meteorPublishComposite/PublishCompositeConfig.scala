package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig[OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, _]]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig {
  
  @scala.inline
  def apply[OutLevel](find: () => Cursor[OutLevel, OutLevel]): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find))
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfigMutableBuilder[Self <: PublishCompositeConfig[_], OutLevel] (val x: Self with PublishCompositeConfig[OutLevel]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig1[OutLevel, _]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig1[OutLevel, js.Any])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    @scala.inline
    def setFind(value: () => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
  }
}
