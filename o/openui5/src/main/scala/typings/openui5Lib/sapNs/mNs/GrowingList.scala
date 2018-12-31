package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.GrowingList")
@js.native
class GrowingList protected () extends List {
  /**
    * Constructor for a new GrowingList.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>scrollToLoad</code>.If you set this property to true then user
    * needs to scroll end to trigger loading a new page. Default value is false which means user needs to
    * scroll end and then click button to load new page.NOTE: This property can be set true, if growing
    * property is set "true" and if you only have one instance of this control inside the scroll
    * container(e.g Page).Default value is <code>false</code>.
    * @since 1.16
    * @returns Value of property <code>scrollToLoad</code>
    */
  def getScrollToLoad(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>threshold</code>.Number of items requested from the server. To
    * activate this you should set growing property to "true"Default value is <code>20</code>.
    * @since 1.16
    * @returns Value of property <code>threshold</code>
    */
  def getThreshold(): scala.Double = js.native
  /**
    * Gets current value of property <code>triggerText</code>.Text which is displayed on the trigger at
    * the end of the list. The default is a translated text ("Load More Data") coming from the
    * messagebundle properties.This property can be used only if growing property is set "true" and
    * scrollToLoad property is set "false".
    * @since 1.16
    * @returns Value of property <code>triggerText</code>
    */
  def getTriggerText(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>scrollToLoad</code>.If you set this property to true then user
    * needs to scroll end to trigger loading a new page. Default value is false which means user needs to
    * scroll end and then click button to load new page.NOTE: This property can be set true, if growing
    * property is set "true" and if you only have one instance of this control inside the scroll
    * container(e.g Page).When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @since 1.16
    * @param bScrollToLoad New value for property <code>scrollToLoad</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setScrollToLoad(bScrollToLoad: scala.Boolean): GrowingList = js.native
  /**
    * Sets a new value for property <code>threshold</code>.Number of items requested from the server. To
    * activate this you should set growing property to "true"When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>20</code>.
    * @since 1.16
    * @param iThreshold New value for property <code>threshold</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setThreshold(iThreshold: scala.Double): GrowingList = js.native
  /**
    * Sets a new value for property <code>triggerText</code>.Text which is displayed on the trigger at the
    * end of the list. The default is a translated text ("Load More Data") coming from the messagebundle
    * properties.This property can be used only if growing property is set "true" and scrollToLoad
    * property is set "false".When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.16
    * @param sTriggerText New value for property <code>triggerText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTriggerText(sTriggerText: java.lang.String): GrowingList = js.native
}

