package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] extends js.Object {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig2 {
  
  @scala.inline
  def apply[InLevel1, InLevel2, OutLevel](find: (InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find))
    __obj.asInstanceOf[PublishCompositeConfig2[InLevel1, InLevel2, OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfig2Ops[Self <: PublishCompositeConfig2[_, _, _], InLevel1, InLevel2, OutLevel] (val x: Self with (PublishCompositeConfig2[InLevel1, InLevel2, OutLevel])) extends AnyVal {
    
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
    def setFind(value: (InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = this.set("find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, js.Any])*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
}
