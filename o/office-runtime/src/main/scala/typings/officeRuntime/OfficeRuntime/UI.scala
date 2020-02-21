package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates methods that interact with the Office UI.
  * @beta
  */
trait UI extends js.Object {
  /**
    * Get the ribbon of the Office application.
    */
  def getRibbon(): js.Promise[Ribbon]
}

object UI {
  @scala.inline
  def apply(getRibbon: () => js.Promise[Ribbon]): UI = {
    val __obj = js.Dynamic.literal(getRibbon = js.Any.fromFunction0(getRibbon))
  
    __obj.asInstanceOf[UI]
  }
}

