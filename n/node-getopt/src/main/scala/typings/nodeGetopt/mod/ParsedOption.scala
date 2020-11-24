package typings.nodeGetopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parsed options.
  */
@js.native
trait ParsedOption extends js.Object {
  
  var argv: js.Array[String] = js.native
  
  def empty(): Boolean = js.native
  
  var options: OptionMap = js.native
}
object ParsedOption {
  
  @scala.inline
  def apply(argv: js.Array[String], empty: () => Boolean, options: OptionMap): ParsedOption = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOption]
  }
  
  @scala.inline
  implicit class ParsedOptionOps[Self <: ParsedOption] (val x: Self) extends AnyVal {
    
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: OptionMap): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
