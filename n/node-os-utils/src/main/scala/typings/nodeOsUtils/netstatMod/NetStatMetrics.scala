package typings.nodeOsUtils.netstatMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeOsUtils.anon.InputMb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetStatMetrics extends /* key */ StringDictionary[InputMb] {
  
  var total: InputMb = js.native
}
object NetStatMetrics {
  
  @scala.inline
  def apply(total: InputMb): NetStatMetrics = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetStatMetrics]
  }
  
  @scala.inline
  implicit class NetStatMetricsOps[Self <: NetStatMetrics] (val x: Self) extends AnyVal {
    
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
    def setTotal(value: InputMb): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
