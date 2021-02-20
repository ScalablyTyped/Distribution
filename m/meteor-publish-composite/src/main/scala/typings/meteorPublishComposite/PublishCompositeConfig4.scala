package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig4 {
  
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](find: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction4(find))
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfig4MutableBuilder[Self <: PublishCompositeConfig4[_, _, _, _, _], InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] (val x: Self with (PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel])) extends AnyVal {
    
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
    def setFind(value: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction4(value))
  }
}
