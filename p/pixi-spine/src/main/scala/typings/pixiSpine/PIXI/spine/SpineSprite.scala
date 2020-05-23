package typings.pixiSpine.PIXI.spine

import typings.pixiSpine.PIXI.spine.core.Attachment
import typings.pixiSpine.PIXI.spine.core.TextureRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Sprite * / any */ trait SpineSprite extends ISpineDisplayObject

object SpineSprite {
  @scala.inline
  def apply(attachment: Attachment = null, region: TextureRegion = null): SpineSprite = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineSprite]
  }
}

