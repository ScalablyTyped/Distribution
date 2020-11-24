package typings.pako.anon

import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pako.pako.InflateFunctionOptions & {  to :'string'} */
@js.native
trait InflateFunctionOptionstos extends js.Object {
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var to: js.UndefOr[string] with string = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object InflateFunctionOptionstos {
  
  @scala.inline
  def apply(to: js.UndefOr[string] with string): InflateFunctionOptionstos = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflateFunctionOptionstos]
  }
  
  @scala.inline
  implicit class InflateFunctionOptionstosOps[Self <: InflateFunctionOptionstos] (val x: Self) extends AnyVal {
    
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
    def setTo(value: js.UndefOr[string] with string): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
}
