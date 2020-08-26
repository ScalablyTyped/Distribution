package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleSubComponentStyles extends js.Object {
  /** Refers to the callout that hosts the TeachingBubble. */
  var callout: IStyleFunctionOrObject[_, _] = js.native
}

object ITeachingBubbleSubComponentStyles {
  @scala.inline
  def apply(callout: IStyleFunctionOrObject[_, _]): ITeachingBubbleSubComponentStyles = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleSubComponentStyles]
  }
  @scala.inline
  implicit class ITeachingBubbleSubComponentStylesOps[Self <: ITeachingBubbleSubComponentStyles] (val x: Self) extends AnyVal {
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
    def setCalloutFunction1(value: _ => DeepPartial[_]): Self = this.set("callout", js.Any.fromFunction1(value))
    @scala.inline
    def setCallout(value: IStyleFunctionOrObject[_, _]): Self = this.set("callout", value.asInstanceOf[js.Any])
  }
  
}

