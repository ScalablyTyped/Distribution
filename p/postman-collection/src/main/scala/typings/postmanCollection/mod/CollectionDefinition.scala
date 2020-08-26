package typings.postmanCollection.mod

import typings.postmanCollection.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionDefinition extends ItemGroupDefinition {
  var info: js.UndefOr[Id] = js.native
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
}

object CollectionDefinition {
  @scala.inline
  def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  @scala.inline
  implicit class CollectionDefinitionOps[Self <: CollectionDefinition] (val x: Self) extends AnyVal {
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
    def setInfo(value: Id): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setVariableVarargs(value: VariableDefinition*): Self = this.set("variable", js.Array(value :_*))
    @scala.inline
    def setVariable(value: js.Array[VariableDefinition]): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
  
}

