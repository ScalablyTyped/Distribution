package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to associate an action name to a function.
  */
@js.native
trait Actions extends js.Object {
  
  /**
    * Function to associate a name with the action function.
    */
  def associate(actionName: String, action: js.Function1[/* arg */ js.UndefOr[js.Any], Unit]): Unit = js.native
}
object Actions {
  
  @scala.inline
  def apply(associate: (String, js.Function1[/* arg */ js.UndefOr[js.Any], Unit]) => Unit): Actions = {
    val __obj = js.Dynamic.literal(associate = js.Any.fromFunction2(associate))
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
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
    def setAssociate(value: (String, js.Function1[/* arg */ js.UndefOr[js.Any], Unit]) => Unit): Self = this.set("associate", js.Any.fromFunction2(value))
  }
}
