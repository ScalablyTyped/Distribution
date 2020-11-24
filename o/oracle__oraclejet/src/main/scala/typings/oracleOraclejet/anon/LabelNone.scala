package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelNone extends js.Object {
  
  var labelNone: js.UndefOr[String] = js.native
}
object LabelNone {
  
  @scala.inline
  def apply(): LabelNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelNone]
  }
  
  @scala.inline
  implicit class LabelNoneOps[Self <: LabelNone] (val x: Self) extends AnyVal {
    
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
    def setLabelNone(value: String): Self = this.set("labelNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelNone: Self = this.set("labelNone", js.undefined)
  }
}
