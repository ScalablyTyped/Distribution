package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtRuleNewProps extends ContainerNewProps {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String | Double] = js.native
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.native
}

object AtRuleNewProps {
  @scala.inline
  def apply(): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleNewProps]
  }
  @scala.inline
  implicit class AtRuleNewPropsOps[Self <: AtRuleNewProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParams(value: String | Double): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRaws(value: AtRuleRaws): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaws: Self = this.set("raws", js.undefined)
  }
  
}

