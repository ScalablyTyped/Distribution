package typings.pinoHttp.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLoggingOptions extends js.Object {
  
  var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.native
  
  var ignorePaths: js.UndefOr[js.Array[String]] = js.native
}
object AutoLoggingOptions {
  
  @scala.inline
  def apply(): AutoLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLoggingOptions]
  }
  
  @scala.inline
  implicit class AutoLoggingOptionsOps[Self <: AutoLoggingOptions] (val x: Self) extends AnyVal {
    
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
    def setGetPath(value: /* req */ IncomingMessage => js.UndefOr[String]): Self = this.set("getPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPath: Self = this.set("getPath", js.undefined)
    
    @scala.inline
    def setIgnorePathsVarargs(value: String*): Self = this.set("ignorePaths", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePaths(value: js.Array[String]): Self = this.set("ignorePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePaths: Self = this.set("ignorePaths", js.undefined)
  }
}
