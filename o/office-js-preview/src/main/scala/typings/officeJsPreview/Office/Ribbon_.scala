package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that contains all the functionality provided to manage the state of the OFfice ribbon.
  */
trait Ribbon_ extends js.Object {
  /**
    * Sends a request to Office to update the ribbon.
    * Note that this API is only to request an update. The actual UI update to the ribbon is controlled by the Office application and hence the exact timing of the ribbon update (or refresh) cannot be determined by the completion of this API.
    * @param input - Represents the updates to be made to the ribbon. Note that only the changes specified in the input parameter are made.
    */
  def requestUpdate(input: RibbonUpdaterData): js.Promise[Unit]
}

object Ribbon_ {
  @scala.inline
  def apply(requestUpdate: RibbonUpdaterData => js.Promise[Unit]): Ribbon_ = {
    val __obj = js.Dynamic.literal(requestUpdate = js.Any.fromFunction1(requestUpdate))
  
    __obj.asInstanceOf[Ribbon_]
  }
}

