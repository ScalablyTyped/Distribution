package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that contains all the functionality provided to manage the state of the Office ribbon.
	 *
	 * @remarks
  *
  * **Requirement set**: Ribbon 1.1
  */
@js.native
trait Ribbon extends js.Object {
  
  /**
    * Sends a request to Office to update the ribbon.
  		 *
  		 * @remarks
    *
    * **Requirement set**: Ribbon 1.1
  		 *
    * Note that this API is only to request an update. The actual UI update to the ribbon is controlled by the Office application and hence the exact timing of the ribbon update (or refresh) cannot be determined by the completion of this API.
  		 *
    * @param input - Represents the updates to be made to the ribbon. Note that only the changes specified in the input parameter are made.
    */
  def requestUpdate(input: RibbonUpdaterData): js.Promise[Unit] = js.native
}
object Ribbon {
  
  @scala.inline
  def apply(requestUpdate: RibbonUpdaterData => js.Promise[Unit]): Ribbon = {
    val __obj = js.Dynamic.literal(requestUpdate = js.Any.fromFunction1(requestUpdate))
    __obj.asInstanceOf[Ribbon]
  }
  
  @scala.inline
  implicit class RibbonOps[Self <: Ribbon] (val x: Self) extends AnyVal {
    
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
    def setRequestUpdate(value: RibbonUpdaterData => js.Promise[Unit]): Self = this.set("requestUpdate", js.Any.fromFunction1(value))
  }
}
