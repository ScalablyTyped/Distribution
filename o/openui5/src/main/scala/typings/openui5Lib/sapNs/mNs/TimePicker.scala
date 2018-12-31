package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TimePicker")
@js.native
class TimePicker protected () extends MaskInput {
  /**
    * Constructor for a new TimePicker.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>dateValue</code>.Holds a reference to a JavaScript Date Object.
    * The <code>value</code> (string)property will be set according to it. Alternatively, if the
    * <code>value</code>and <code>valueFormat</code> pair properties are supplied instead,the
    * <code>dateValue</code> will be instantiated аccording to the parsed<code>value</code>.
    * @returns Value of property <code>dateValue</code>
    */
  def getDateValue(): js.Any = js.native
  /**
    * Gets current value of property <code>displayFormat</code>.Determines the format, displayed in the
    * input field and the picker sliders.The default value is the browser's medium time format locale
    * setting{@link sap.ui.core.LocaleData#getTimePattern}.If data binding with type {@link
    * sap.ui.model.type.Time} is used for the<code>value</code> property, the <code>displayFormat</code>
    * propertyis ignored as the information is provided from the binding itself.
    * @returns Value of property <code>displayFormat</code>
    */
  def getDisplayFormat(): java.lang.String = js.native
  /**
    * Gets current value of property <code>localeId</code>.Defines the locale used to parse string values
    * representing time.Determines the locale, used to interpret the string, supplied by
    * the<code>value</code> property.Example: AM in the string "09:04 AM" is locale (language)
    * dependent.The format comes from the browser language settings if not set explicitly.Used in
    * combination with 12 hour <code>valueFormat</code> containing 'a', whichstands for day period
    * string.Default value is taken from browser's locale setting.
    * @returns Value of property <code>localeId</code>
    */
  def getLocaleId(): java.lang.String = js.native
  /**
    * Gets current value of property <code>minutesStep</code>.Sets the minutes slider step.The minutes
    * slider is populated only by multiples of the step.Default value is <code>1</code>.
    * @returns Value of property <code>minutesStep</code>
    */
  def getMinutesStep(): scala.Double = js.native
  /**
    * Gets current value of property <code>secondsStep</code>.Sets the seconds slider step.The seconds
    * slider is populated only by multiples of the step.Default value is <code>1</code>.
    * @returns Value of property <code>secondsStep</code>
    */
  def getSecondsStep(): scala.Double = js.native
  /**
    * Gets current value of property <code>title</code>.Displays the text of the general picker label and
    * is read by screen readers.It is visible only on phone.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Gets current value of property <code>valueFormat</code>.Determines the format of the value
    * property.The default value is the browser's medium time format locale setting{@link
    * sap.ui.core.LocaleData#getTimePattern}.If data binding with type {@link sap.ui.model.type.Time} is
    * used for the<code>value</code> property, the <code>valueFormat</code> propertyis ignored as the
    * information is provided from the binding itself.
    * @returns Value of property <code>valueFormat</code>
    */
  def getValueFormat(): java.lang.String = js.native
  /**
    * Called after the picker closes.
    */
  def onAfterClose(): scala.Unit = js.native
  /**
    * Called after the picker appears.
    */
  def onAfterOpen(): scala.Unit = js.native
  /**
    * Called before the picker appears.
    */
  def onBeforeOpen(): scala.Unit = js.native
  /**
    * Sets the <code>dateValue</code> JavaScript date object.Recommended usage is when <code>value</code>
    * is not set, as they are mutually exclusive.
    * @param oDate New date object
    * @returns this instance, used for chaining
    */
  def setDateValue(oDate: js.Any): TimePicker | stdLib.Error = js.native
  /**
    * Sets the <code>displayFormat</code>.
    * @param sDisplayFormat The format of the string inside the input
    * @returns this instance, used for chaining
    */
  def setDisplayFormat(sDisplayFormat: java.lang.String): TimePicker = js.native
  /**
    * Sets the locale of the control.Used for parsing and formatting the time values in languages
    * different than English.Necessary for translation and auto-complete of the day periods, such as AM
    * and PM.
    * @param sLocaleId A locale identifier like 'en_US'
    * @returns this instance, used for chaining
    */
  def setLocaleId(sLocaleId: java.lang.String): TimePicker = js.native
  /**
    * Sets the minutes slider step.
    * @param iStep The step used to generate values for the minutes slider
    * @returns this
    */
  def setMinutesStep(iStep: js.Any): js.Any = js.native
  /**
    * Sets the seconds slider step.
    * @param iStep The step used to generate values for the seconds slider
    * @returns this
    */
  def setSecondsStep(iStep: js.Any): js.Any = js.native
  /**
    * Sets the <code>valueFormat</code> property.
    * @param sValueFormat The format of strings that are set as value to the control
    * @returns this instance, used for chaining
    */
  def setValueFormat(sValueFormat: java.lang.String): TimePicker = js.native
}

