package typings.pixiSpine.PIXI.spine

import typings.pixiSpine.PIXI.spine.core.Attachment
import typings.pixiSpine.PIXI.spine.core.TextureRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.SimpleMesh * / any */ trait SpineMesh extends ISpineDisplayObject

object SpineMesh {
  @scala.inline
  def apply(attachment: Attachment = null, region: TextureRegion = null): SpineMesh = {
    val __obj = js.Dynamic.literal()
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineMesh]
  }
}

