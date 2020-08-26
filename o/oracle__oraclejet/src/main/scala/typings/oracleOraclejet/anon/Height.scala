package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height[K, D] extends js.Object {
  var height: enable | disable = js.native
  var width: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
}

object Height {
  @scala.inline
  def apply[K, D](height: enable | disable): Height[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height[K, D]]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height[_, _], K, D] (val x: Self with (Height[K, D])) extends AnyVal {
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
    def setHeight(value: enable | disable): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthFunction1(value: /* context */ HeaderContext[K, D] => String): Self = this.set("width", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
  
}

