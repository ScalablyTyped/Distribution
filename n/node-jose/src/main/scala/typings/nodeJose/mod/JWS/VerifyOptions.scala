package typings.nodeJose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyOptions extends js.Object {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
  
  var handlers: typings.nodeJose.anon.Exp = js.native
}
object VerifyOptions {
  
  @scala.inline
  def apply(handlers: typings.nodeJose.anon.Exp): VerifyOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: typings.nodeJose.anon.Exp): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setAllowEmbeddedKey(value: Boolean): Self = this.set("allowEmbeddedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmbeddedKey: Self = this.set("allowEmbeddedKey", js.undefined)
  }
}
