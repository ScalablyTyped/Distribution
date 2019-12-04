package typings.pixiDashSpine.PIXI.spine

import typings.pixiDashSpine.PIXI.spine.core.Attachment
import typings.pixiDashSpine.PIXI.spine.core.TextureRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.DisplayObject * / any */ trait ISpineDisplayObject extends js.Object {
  var attachment: js.UndefOr[Attachment] = js.undefined
  var region: js.UndefOr[TextureRegion] = js.undefined
}

object ISpineDisplayObject {
  @scala.inline
  def apply(attachment: Attachment = null, region: TextureRegion = null): ISpineDisplayObject = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpineDisplayObject]
  }
}

