package typings.postcss.anon

import typings.postcss.mod.Processor
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postcss extends _AcceptedPlugin {
  
  var postcss: TransformCallback | Processor = js.native
}
object Postcss {
  
  @scala.inline
  def apply(postcss: TransformCallback | Processor): Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postcss]
  }
  
  @scala.inline
  implicit class PostcssOps[Self <: Postcss] (val x: Self) extends AnyVal {
    
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
    def setPostcssFunction2(value: (/* root */ Root_, /* result */ Result) => js.Promise[js.Any] | js.Any): Self = this.set("postcss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostcss(value: TransformCallback | Processor): Self = this.set("postcss", value.asInstanceOf[js.Any])
  }
}
