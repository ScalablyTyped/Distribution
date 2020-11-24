package typings.mendixmodelsdk.transactionManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransactionOptions extends js.Object {
  
  var commitCurrentImplicitTransaction: Boolean = js.native
}
object ITransactionOptions {
  
  @scala.inline
  def apply(commitCurrentImplicitTransaction: Boolean): ITransactionOptions = {
    val __obj = js.Dynamic.literal(commitCurrentImplicitTransaction = commitCurrentImplicitTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionOptions]
  }
  
  @scala.inline
  implicit class ITransactionOptionsOps[Self <: ITransactionOptions] (val x: Self) extends AnyVal {
    
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
    def setCommitCurrentImplicitTransaction(value: Boolean): Self = this.set("commitCurrentImplicitTransaction", value.asInstanceOf[js.Any])
  }
}
