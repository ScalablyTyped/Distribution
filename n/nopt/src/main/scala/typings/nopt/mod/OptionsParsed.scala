package typings.nopt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nopt.anon.Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsParsed
  extends /* k */ StringDictionary[js.Any] {
  
  var argv: Cooked = js.native
}
object OptionsParsed {
  
  @scala.inline
  def apply(argv: Cooked): OptionsParsed = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsParsed]
  }
  
  @scala.inline
  implicit class OptionsParsedOps[Self <: OptionsParsed] (val x: Self) extends AnyVal {
    
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
    def setArgv(value: Cooked): Self = this.set("argv", value.asInstanceOf[js.Any])
  }
}
