package typings.openui5.sapNs.uiNs.coreNs

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Message")
@js.native
class Message protected () extends Element {
  /**
    * Constructor for a new Message.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Compares two given messages with each other.The types of {@link sap.ui.core.MessageType} are ordered
    * from "Error" > "Warning" > "Success" >"Information" > "None".
    * @param oMessage1 first message to compare
    * @param oMessage2 second message to compare
    * @returns returns <code>0</code> if both messages are at        the same level. <code>-1</code> if
    * <code>this</code>        message has a lower level. <code>1</code> if <code>this</code>       
    * message has a higher level.
    */
  def compareByType(
    oMessage1: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message],
    oMessage2: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message]
  ): Double = js.native
  /**
    * Compares the given message with <code>this</code> message. The types of{@link
    * sap.ui.core.MessageType} are ordered from "Error" > "Warning" > "Success" >"Information" >
    * "None".See  {@link sap.ui.core.Message.compareByType}
    * @param oOther message to compare with this one
    * @returns returns <code>0</code> if both messages are at        the same level. <code>-1</code> if
    * <code>this</code>        message has a lower level. <code>1</code> if <code>this</code>       
    * message has a higher level.
    */
  def compareByType(oOther: Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message]): Double = js.native
  /**
    * Returns the icon's default URI depending on given size.There are default icons for messages
    * available that can be used this way. If noparameter is given, the size will be 16x16 per default. If
    * larger icons are needed,the parameter "32x32" might be given.
    * @param sSize If parameter is not set the default icon's size will be 16x16. If parameter        is
    * set to "32x32" the icon size will be 32x32.
    * @returns URI of the default icon.
    */
  def getDefaultIcon(sSize: String): js.Any = js.native
  /**
    * Gets current value of property <code>icon</code>.A possible icon URI of the message
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>level</code>.Setting the message's level.Default value is
    * <code>None</code>.
    * @returns Value of property <code>level</code>
    */
  def getLevel(): MessageType = js.native
  /**
    * Gets current value of property <code>readOnly</code>.Determines whether the message should be read
    * only. This helps the application to handle a message a different way if the application
    * differentiates between read-only and common messages.Default value is <code>false</code>.
    * @since 1.19.0
    * @returns Value of property <code>readOnly</code>
    */
  def getReadOnly(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.Message text
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>timestamp</code>.Message's timestamp. It is just a simple
    * String that will be used without any transformation. So the application that uses messages needs to
    * format the timestamp to its own needs.
    * @returns Value of property <code>timestamp</code>
    */
  def getTimestamp(): String = js.native
  /**
    * Sets a new value for property <code>icon</code>.A possible icon URI of the messageWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>level</code>.Setting the message's level.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sLevel New value for property <code>level</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLevel(sLevel: MessageType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>readOnly</code>.Determines whether the message should be read
    * only. This helps the application to handle a message a different way if the application
    * differentiates between read-only and common messages.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.19.0
    * @param bReadOnly New value for property <code>readOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setReadOnly(bReadOnly: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>text</code>.Message textWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
  /**
    * Sets a new value for property <code>timestamp</code>.Message's timestamp. It is just a simple String
    * that will be used without any transformation. So the application that uses messages needs to format
    * the timestamp to its own needs.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sTimestamp New value for property <code>timestamp</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTimestamp(sTimestamp: String): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Message] = js.native
}

