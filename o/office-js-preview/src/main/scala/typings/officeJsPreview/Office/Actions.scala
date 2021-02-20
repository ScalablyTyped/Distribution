package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to associate an action name to a function.
  */
@js.native
trait Actions extends StObject {
  
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
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociate(value: (String, js.Function1[/* arg */ js.UndefOr[js.Any], Unit]) => Unit): Self = StObject.set(x, "associate", js.Any.fromFunction2(value))
  }
}
