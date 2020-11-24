package typings.nodeSass.mod

import typings.node.Buffer
import typings.nodeSass.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  var css: Buffer = js.native
  
  var map: Buffer = js.native
  
  var stats: Duration = js.native
}
object Result {
  
  @scala.inline
  def apply(css: Buffer, map: Buffer, stats: Duration): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
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
    def setCss(value: Buffer): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: Buffer): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Duration): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
