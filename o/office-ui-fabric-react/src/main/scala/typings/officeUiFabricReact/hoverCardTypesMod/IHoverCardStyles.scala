package typings.officeUiFabricReact.hoverCardTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHoverCardStyles extends js.Object {
  
  /**
    * Style for the host element in the default enabled, non-toggled state.
    */
  var host: js.UndefOr[IStyle] = js.native
}
object IHoverCardStyles {
  
  @scala.inline
  def apply(): IHoverCardStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardStyles]
  }
  
  @scala.inline
  implicit class IHoverCardStylesOps[Self <: IHoverCardStyles] (val x: Self) extends AnyVal {
    
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
    def setHost(value: IStyle): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostNull: Self = this.set("host", null)
  }
}
