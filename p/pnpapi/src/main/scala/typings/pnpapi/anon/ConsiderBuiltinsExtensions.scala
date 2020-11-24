package typings.pnpapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsiderBuiltinsExtensions extends js.Object {
  
  var considerBuiltins: js.UndefOr[Boolean] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
}
object ConsiderBuiltinsExtensions {
  
  @scala.inline
  def apply(): ConsiderBuiltinsExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsiderBuiltinsExtensions]
  }
  
  @scala.inline
  implicit class ConsiderBuiltinsExtensionsOps[Self <: ConsiderBuiltinsExtensions] (val x: Self) extends AnyVal {
    
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
    def setConsiderBuiltins(value: Boolean): Self = this.set("considerBuiltins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsiderBuiltins: Self = this.set("considerBuiltins", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
}
