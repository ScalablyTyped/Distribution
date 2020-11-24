package typings.pleaseUpgradeNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<please-upgrade-node.please-upgrade-node.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var exitCode: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[js.Function1[/* version */ String, String]] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setMessage(value: /* version */ String => String): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
