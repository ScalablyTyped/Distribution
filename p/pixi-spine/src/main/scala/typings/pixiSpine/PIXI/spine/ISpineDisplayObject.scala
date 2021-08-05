package typings.pixiSpine.PIXI.spine

import typings.pixiSpine.PIXI.spine.core.Attachment
import typings.pixiSpine.PIXI.spine.core.TextureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.DisplayObject * / any */ trait ISpineDisplayObject extends StObject {
  
  var attachment: js.UndefOr[Attachment] = js.undefined
  
  var region: js.UndefOr[TextureRegion] = js.undefined
}
object ISpineDisplayObject {
  
  inline def apply(): ISpineDisplayObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpineDisplayObject]
  }
  
  extension [Self <: ISpineDisplayObject](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
