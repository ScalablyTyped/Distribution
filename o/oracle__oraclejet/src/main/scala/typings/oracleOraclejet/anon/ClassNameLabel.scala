package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameLabel[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
  var label: ClassNameRenderer[K, D] = js.native
  var renderer: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], `1` | Unit | Null]) | Null] = js.native
  var resizable: Height[K, D] = js.native
  var style: js.UndefOr[
    (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
}

object ClassNameLabel {
  @scala.inline
  def apply[K, D](label: ClassNameRenderer[K, D], resizable: Height[K, D]): ClassNameLabel[K, D] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameLabel[K, D]]
  }
  @scala.inline
  implicit class ClassNameLabelOps[Self <: ClassNameLabel[_, _], K, D] (val x: Self with (ClassNameLabel[K, D])) extends AnyVal {
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
    def setLabel(value: ClassNameRenderer[K, D]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizable(value: Height[K, D]): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassNameFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = this.set("className", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    @scala.inline
    def setRenderer(value: /* context */ HeaderContext[K, D] => `1` | Unit | Null): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
    @scala.inline
    def setStyleFunction1(value: /* context */ HeaderContext[K, D] => String | Unit | Null): Self = this.set("style", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: (js.Function1[/* context */ HeaderContext[K, D], String | Unit | Null]) | String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

