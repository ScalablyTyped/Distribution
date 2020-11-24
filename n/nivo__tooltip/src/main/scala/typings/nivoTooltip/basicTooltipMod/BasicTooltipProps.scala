package typings.nivoTooltip.basicTooltipMod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicTooltipProps extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var enableChip: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataFormatter */ js.Any
  ] = js.native
  
  var id: ReactNode = js.native
  
  /**
    * @deprecated This should be replaced by custom tooltip components.
    */
  var renderContent: js.UndefOr[js.Function0[Element]] = js.native
  
  var value: js.UndefOr[Double | String | Date] = js.native
}
object BasicTooltipProps {
  
  @scala.inline
  def apply(): BasicTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicTooltipProps]
  }
  
  @scala.inline
  implicit class BasicTooltipPropsOps[Self <: BasicTooltipProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnableChip(value: Boolean): Self = this.set("enableChip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableChip: Self = this.set("enableChip", js.undefined)
    
    @scala.inline
    def setFormat(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataFormatter */ js.Any
    ): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: ReactNode): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRenderContent(value: () => Element): Self = this.set("renderContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderContent: Self = this.set("renderContent", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
