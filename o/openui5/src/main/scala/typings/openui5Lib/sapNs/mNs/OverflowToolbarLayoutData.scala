package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.OverflowToolbarLayoutData")
@js.native
class OverflowToolbarLayoutData protected () extends ToolbarLayoutData {
  /**
    * Constructor for a new OverflowToolbarLayoutData.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new element, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>closeOverflowOnInteraction</code>.Defines whether the overflow
    * area is automatically closed when interacting with a control in itDefault value is
    * <code>true</code>.
    * @since 1.40
    * @returns Value of property <code>closeOverflowOnInteraction</code>
    */
  def getCloseOverflowOnInteraction(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>group</code>.Defines OverflowToolbar items group number.Default
    * value is 0, which means that the control does not belong to any group.Elements that belong to a
    * group overflow together. The overall priority of the group is defined by the element with highest
    * priority.Elements that belong to a group are not allowed to have AlwaysOverflow or NeverOverflow
    * priority.Default value is <code>0</code>.
    * @since 1.32
    * @returns Value of property <code>group</code>
    */
  def getGroup(): scala.Double = js.native
  /**
    * Gets current value of property <code>moveToOverflow</code>.The OverflowToolbar item can or cannot
    * move to the overflow areaDefault value is <code>true</code>.
    * @returns Value of property <code>moveToOverflow</code>
    */
  def getMoveToOverflow(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>priority</code>.Defines OverflowToolbar items priority,
    * Available priorities ate NeverOverflow, High, Low, Disappear and AlwaysOverflowDefault value is
    * <code>High</code>.
    * @since 1.32
    * @returns Value of property <code>priority</code>
    */
  def getPriority(): OverflowToolbarPriority = js.native
  /**
    * Gets current value of property <code>stayInOverflow</code>.The OverflowToolbar item can or cannot
    * stay in the overflow areaDefault value is <code>false</code>.
    * @returns Value of property <code>stayInOverflow</code>
    */
  def getStayInOverflow(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>closeOverflowOnInteraction</code>.Defines whether the overflow
    * area is automatically closed when interacting with a control in itWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.40
    * @param bCloseOverflowOnInteraction New value for property <code>closeOverflowOnInteraction</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCloseOverflowOnInteraction(bCloseOverflowOnInteraction: scala.Boolean): OverflowToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>group</code>.Defines OverflowToolbar items group number.Default
    * value is 0, which means that the control does not belong to any group.Elements that belong to a
    * group overflow together. The overall priority of the group is defined by the element with highest
    * priority.Elements that belong to a group are not allowed to have AlwaysOverflow or NeverOverflow
    * priority.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>0</code>.
    * @since 1.32
    * @param iGroup New value for property <code>group</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGroup(iGroup: scala.Double): OverflowToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>moveToOverflow</code>.The OverflowToolbar item can or cannot
    * move to the overflow areaWhen called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @param bMoveToOverflow New value for property <code>moveToOverflow</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMoveToOverflow(bMoveToOverflow: scala.Boolean): OverflowToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>priority</code>.Defines OverflowToolbar items priority,
    * Available priorities ate NeverOverflow, High, Low, Disappear and AlwaysOverflowWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>High</code>.
    * @since 1.32
    * @param sPriority New value for property <code>priority</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPriority(sPriority: OverflowToolbarPriority): OverflowToolbarLayoutData = js.native
  /**
    * Sets a new value for property <code>stayInOverflow</code>.The OverflowToolbar item can or cannot
    * stay in the overflow areaWhen called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>false</code>.
    * @param bStayInOverflow New value for property <code>stayInOverflow</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStayInOverflow(bStayInOverflow: scala.Boolean): OverflowToolbarLayoutData = js.native
}

