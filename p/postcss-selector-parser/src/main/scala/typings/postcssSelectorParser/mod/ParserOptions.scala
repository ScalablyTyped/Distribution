package typings.postcssSelectorParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  var css: String = js.native
  
  def error(message: String, options: ErrorOptions): Error = js.native
  
  var options: Options = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(css: String, error: (String, ErrorOptions) => Error, options: Options): ParserOptions = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: (String, ErrorOptions) => Error): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
