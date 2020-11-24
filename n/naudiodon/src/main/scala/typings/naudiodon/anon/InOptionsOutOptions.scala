package typings.naudiodon.anon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InOptionsOutOptions extends js.Object {
  
  var inOptions: AudioOptions = js.native
  
  var outOptions: AudioOptions = js.native
}
object InOptionsOutOptions {
  
  @scala.inline
  def apply(inOptions: AudioOptions, outOptions: AudioOptions): InOptionsOutOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InOptionsOutOptions]
  }
  
  @scala.inline
  implicit class InOptionsOutOptionsOps[Self <: InOptionsOutOptions] (val x: Self) extends AnyVal {
    
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
    def setInOptions(value: AudioOptions): Self = this.set("inOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOptions(value: AudioOptions): Self = this.set("outOptions", value.asInstanceOf[js.Any])
  }
}
