package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface that contains all the functionality provided to manage the state of the Office ribbon.
	 *
	 * @remarks
  *
  * **Requirement set**: Ribbon 1.1
  */
trait Ribbon extends StObject {
  
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
  def requestUpdate(input: RibbonUpdaterData): js.Promise[Unit]
}
object Ribbon {
  
  @scala.inline
  def apply(requestUpdate: RibbonUpdaterData => js.Promise[Unit]): Ribbon = {
    val __obj = js.Dynamic.literal(requestUpdate = js.Any.fromFunction1(requestUpdate))
    __obj.asInstanceOf[Ribbon]
  }
  
  @scala.inline
  implicit class RibbonMutableBuilder[Self <: Ribbon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestUpdate(value: RibbonUpdaterData => js.Promise[Unit]): Self = StObject.set(x, "requestUpdate", js.Any.fromFunction1(value))
  }
}
