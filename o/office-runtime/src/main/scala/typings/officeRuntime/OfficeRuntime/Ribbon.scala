package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the management of the Office ribbon state.
  * @beta
  */
trait Ribbon extends js.Object {
  /**
    * Stages the updates to be made to the ribbon.
    * Note that this API only requests an update. The actual UI update to the ribbon is controlled by the
    * Office application and hence the exact timing of the ribbon update (or refresh) cannot be determined
    * by the completion of this API.
    * @param input Represents the updates to be made to the ribbon. Note that the only changes made to the ribbon
    * are those specified in the input parameter. In all other respects, the ribbon is not changed.
    */
  def requestUpdate(input: RibbonUpdaterData): js.Promise[Unit]
}

object Ribbon {
  @scala.inline
  def apply(requestUpdate: RibbonUpdaterData => js.Promise[Unit]): Ribbon = {
    val __obj = js.Dynamic.literal(requestUpdate = js.Any.fromFunction1(requestUpdate))
  
    __obj.asInstanceOf[Ribbon]
  }
}

