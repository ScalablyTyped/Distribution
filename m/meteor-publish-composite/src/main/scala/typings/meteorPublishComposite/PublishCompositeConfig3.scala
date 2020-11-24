package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] extends js.Object {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig3 {
  
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, OutLevel](find: (InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction3(find))
    __obj.asInstanceOf[PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfig3Ops[Self <: PublishCompositeConfig3[_, _, _, _], InLevel1, InLevel2, InLevel3, OutLevel] (val x: Self with (PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFind(value: (InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = this.set("find", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, js.Any])*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
}
