package typings.openui5.global.sap.ui.model

import typings.openui5.sap.ui.core.message.MessageManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.message")
@js.native
object message extends js.Object {
  @js.native
  class MessageModel protected ()
    extends typings.openui5.sap.ui.model.message.MessageModel {
    /**
      * Constructor for a new JSONModel.
      * @param oMessageManager The MessageManager instance
      */
    def this(oMessageManager: MessageManager) = this()
  }
  
}

