package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarAppointment extends DateTypeRange {
  
  /**
    * Gets current value of property <code>icon</code>.Icon of the Appointment. (e.g. picture of the
    * person)URI of an image or an icon registered in sap.ui.core.IconPool.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>key</code>.Can be used as identifier of the appointment
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  
  /**
    * Gets current value of property <code>selected</code>.Indicates if the icon is selected.Default value
    * is <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  
  /**
    * Gets current value of property <code>tentative</code>.Indicates if the icon is tentative.Default
    * value is <code>false</code>.
    * @returns Value of property <code>tentative</code>
    */
  def getTentative(): Boolean = js.native
  
  /**
    * Gets current value of property <code>text</code>.Text of the appointment.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Title of the appointment.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Icon of the Appointment. (e.g. picture of the
    * person)URI of an image or an icon registered in sap.ui.core.IconPool.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): CalendarAppointment = js.native
  
  /**
    * Sets a new value for property <code>key</code>.Can be used as identifier of the appointmentWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): CalendarAppointment = js.native
  
  /**
    * Sets a new value for property <code>selected</code>.Indicates if the icon is selected.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @param bSelected New value for property <code>selected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelected(bSelected: Boolean): CalendarAppointment = js.native
  
  /**
    * Sets a new value for property <code>tentative</code>.Indicates if the icon is tentative.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @param bTentative New value for property <code>tentative</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTentative(bTentative: Boolean): CalendarAppointment = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Text of the appointment.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): CalendarAppointment = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Title of the appointment.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): CalendarAppointment = js.native
}
