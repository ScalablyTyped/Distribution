package typings.officeUiFabricReact.teachingBubbleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITeachingBubbleState extends js.Object {
  
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.native
}
object ITeachingBubbleState {
  
  @scala.inline
  def apply(): ITeachingBubbleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleState]
  }
  
  @scala.inline
  implicit class ITeachingBubbleStateOps[Self <: ITeachingBubbleState] (val x: Self) extends AnyVal {
    
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
    def setIsTeachingBubbleVisible(value: Boolean): Self = this.set("isTeachingBubbleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTeachingBubbleVisible: Self = this.set("isTeachingBubbleVisible", js.undefined)
  }
}
