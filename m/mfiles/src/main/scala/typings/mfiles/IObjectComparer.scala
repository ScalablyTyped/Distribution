package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectComparer extends js.Object {
  def Compare(ObjectVersionDataLeft: IObjectVersion, ObjectVersionDataRight: IObjectVersion): Double = js.native
}

object IObjectComparer {
  @scala.inline
  def apply(Compare: (IObjectVersion, IObjectVersion) => Double): IObjectComparer = {
    val __obj = js.Dynamic.literal(Compare = js.Any.fromFunction2(Compare))
    __obj.asInstanceOf[IObjectComparer]
  }
  @scala.inline
  implicit class IObjectComparerOps[Self <: IObjectComparer] (val x: Self) extends AnyVal {
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
    def setCompare(value: (IObjectVersion, IObjectVersion) => Double): Self = this.set("Compare", js.Any.fromFunction2(value))
  }
  
}

