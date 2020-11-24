package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownstreamOnly extends js.Object {
  
  var downstreamOnly: Boolean = js.native
  
  var expr: Null | String = js.native
}
object DownstreamOnly {
  
  @scala.inline
  def apply(downstreamOnly: Boolean): DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownstreamOnly]
  }
  
  @scala.inline
  implicit class DownstreamOnlyOps[Self <: DownstreamOnly] (val x: Self) extends AnyVal {
    
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
    def setDownstreamOnly(value: Boolean): Self = this.set("downstreamOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: String): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprNull: Self = this.set("expr", null)
  }
}
