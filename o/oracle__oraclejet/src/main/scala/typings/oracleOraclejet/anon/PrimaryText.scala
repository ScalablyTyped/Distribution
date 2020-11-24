package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryText extends js.Object {
  
  var primaryText: js.UndefOr[String] = js.native
  
  var secondaryText: js.UndefOr[String] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object PrimaryText {
  
  @scala.inline
  def apply(): PrimaryText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryText]
  }
  
  @scala.inline
  implicit class PrimaryTextOps[Self <: PrimaryText] (val x: Self) extends AnyVal {
    
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
    def setPrimaryText(value: String): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
