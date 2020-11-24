package typings.naudiodon.anon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutOptions extends js.Object {
  
  var outOptions: AudioOptions = js.native
}
object OutOptions {
  
  @scala.inline
  def apply(outOptions: AudioOptions): OutOptions = {
    val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutOptions]
  }
  
  @scala.inline
  implicit class OutOptionsOps[Self <: OutOptions] (val x: Self) extends AnyVal {
    
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
    def setOutOptions(value: AudioOptions): Self = this.set("outOptions", value.asInstanceOf[js.Any])
  }
}
