package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComparison
  extends /* item */ StringDictionary[js.Any] {
  var __count: js.UndefOr[Double] = js.native
  var __offset: js.UndefOr[Double] = js.native
  var __order: js.UndefOr[String] = js.native
}

object IComparison {
  @scala.inline
  def apply(): IComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComparison]
  }
  @scala.inline
  implicit class IComparisonOps[Self <: IComparison] (val x: Self) extends AnyVal {
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
    def set__count(value: Double): Self = this.set("__count", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__count: Self = this.set("__count", js.undefined)
    @scala.inline
    def set__offset(value: Double): Self = this.set("__offset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__offset: Self = this.set("__offset", js.undefined)
    @scala.inline
    def set__order(value: String): Self = this.set("__order", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__order: Self = this.set("__order", js.undefined)
  }
  
}

