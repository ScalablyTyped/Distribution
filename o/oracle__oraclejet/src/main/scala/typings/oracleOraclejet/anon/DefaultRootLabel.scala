package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRootLabel extends js.Object {
  
  var defaultRootLabel: js.UndefOr[String] = js.native
  
  var hierMenuBtnLabel: js.UndefOr[String] = js.native
  
  var previousIcon: js.UndefOr[String] = js.native
}
object DefaultRootLabel {
  
  @scala.inline
  def apply(): DefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRootLabel]
  }
  
  @scala.inline
  implicit class DefaultRootLabelOps[Self <: DefaultRootLabel] (val x: Self) extends AnyVal {
    
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
    def setDefaultRootLabel(value: String): Self = this.set("defaultRootLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootLabel: Self = this.set("defaultRootLabel", js.undefined)
    
    @scala.inline
    def setHierMenuBtnLabel(value: String): Self = this.set("hierMenuBtnLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierMenuBtnLabel: Self = this.set("hierMenuBtnLabel", js.undefined)
    
    @scala.inline
    def setPreviousIcon(value: String): Self = this.set("previousIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousIcon: Self = this.set("previousIcon", js.undefined)
  }
}
