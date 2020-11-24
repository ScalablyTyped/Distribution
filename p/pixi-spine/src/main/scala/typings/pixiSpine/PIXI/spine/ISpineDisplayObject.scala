package typings.pixiSpine.PIXI.spine

import typings.pixiSpine.PIXI.spine.core.Attachment
import typings.pixiSpine.PIXI.spine.core.TextureRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.DisplayObject * / any */ @js.native
trait ISpineDisplayObject extends js.Object {
  
  var attachment: js.UndefOr[Attachment] = js.native
  
  var region: js.UndefOr[TextureRegion] = js.native
}
object ISpineDisplayObject {
  
  @scala.inline
  def apply(): ISpineDisplayObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpineDisplayObject]
  }
  
  @scala.inline
  implicit class ISpineDisplayObjectOps[Self <: ISpineDisplayObject] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: Attachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    
    @scala.inline
    def setRegion(value: TextureRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
