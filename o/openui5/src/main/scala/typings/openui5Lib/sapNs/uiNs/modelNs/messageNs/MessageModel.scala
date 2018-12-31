package typings
package openui5Lib.sapNs.uiNs.modelNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.message.MessageModel")
@js.native
class MessageModel protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ClientModel {
  /**
    * Constructor for a new JSONModel.
    * @param oMessageManager The MessageManager instance
    */
  def this(oMessageManager: openui5Lib.sapNs.uiNs.coreNs.messageNs.MessageManager) = this()
  /**
    * Sets the message data to the model.
    * @param oData the data to set on the model
    */
  def setData(oData: js.Any): scala.Unit = js.native
  /**
    * Sets a new value for the given property <code>sPropertyName</code> in the model.If the model value
    * changed all interested parties are informed.
    * @param sPath path of the property to set
    * @param oValue value to set the property to
    * @param oContext the context which will be used to set the property
    */
  def setProperty(sPath: java.lang.String, oValue: js.Any): scala.Unit = js.native
  def setProperty(sPath: java.lang.String, oValue: js.Any, oContext: js.Any): scala.Unit = js.native
}

