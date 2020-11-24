package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelLayout extends js.Object {
  
  var id: js.Any = js.native
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object LabelLayout {
  
  @scala.inline
  def apply(
    id: js.Any,
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  
  @scala.inline
  implicit class LabelLayoutOps[Self <: LabelLayout] (val x: Self) extends AnyVal {
    
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = this.set("labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
