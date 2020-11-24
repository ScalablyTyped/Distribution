package typings.popmotionPose.anon

import typings.popmotionPose.popmotionPoseStrings.anticipate
import typings.popmotionPose.popmotionPoseStrings.backIn
import typings.popmotionPose.popmotionPoseStrings.backInOut
import typings.popmotionPose.popmotionPoseStrings.backOut
import typings.popmotionPose.popmotionPoseStrings.circIn
import typings.popmotionPose.popmotionPoseStrings.circInOut
import typings.popmotionPose.popmotionPoseStrings.circOut
import typings.popmotionPose.popmotionPoseStrings.easeIn
import typings.popmotionPose.popmotionPoseStrings.easeInOut
import typings.popmotionPose.popmotionPoseStrings.easeOut
import typings.popmotionPose.popmotionPoseStrings.linear
import typings.popmotionPose.typesMod.CubicBezierArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ease extends js.Object {
  
  var ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs = js.native
}
object Ease {
  
  @scala.inline
  def apply(
    ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
  ): Ease = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ease]
  }
  
  @scala.inline
  implicit class EaseOps[Self <: Ease] (val x: Self) extends AnyVal {
    
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
    def setEase(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Self = this.set("ease", value.asInstanceOf[js.Any])
  }
}
