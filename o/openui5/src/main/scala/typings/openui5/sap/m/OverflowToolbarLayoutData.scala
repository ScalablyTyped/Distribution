package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverflowToolbarLayoutData
  extends StObject
     with ToolbarLayoutData {
  
  /**
    * Gets current value of property <code>closeOverflowOnInteraction</code>.Defines whether the overflow
    * area is automatically closed when interacting with a control in itDefault value is
    * <code>true</code>.
    * @since 1.40
    * @returns Value of property <code>closeOverflowOnInteraction</code>
    */
  def getCloseOverflowOnInteraction(): Boolean = js.native
  
  /**
    * Gets current value of property <code>group</code>.Defines OverflowToolbar items group number.Default
    * value is 0, which means that the control does not belong to any group.Elements that belong to a
    * group overflow together. The overall priority of the group is defined by the element with highest
    * priority.Elements that belong to a group are not allowed to have AlwaysOverflow or NeverOverflow
    * priority.Default value is <code>0</code>.
    * @since 1.32
    * @returns Value of property <code>group</code>
    */
  def getGroup(): Double = js.native
  
  /**
    * Gets current value of property <code>moveToOverflow</code>.The OverflowToolbar item can or cannot
    * move to the overflow areaDefault value is <code>true</code>.
    * @returns Value of property <code>moveToOverflow</code>
    */
  def getMoveToOverflow(): Boolean = js.native
  
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
  def getStayInOverflow(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>closeOverflowOnInteraction</code>.Defines whether the overflow
    * area is automatically closed when interacting with a control in itWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.40
    * @param bCloseOverflowOnInteraction New value for property <code>closeOverflowOnInteraction</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCloseOverflowOnInteraction(bCloseOverflowOnInteraction: Boolean): OverflowToolbarLayoutData = js.native
  
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
  def setGroup(iGroup: Double): OverflowToolbarLayoutData = js.native
  
  /**
    * Sets a new value for property <code>moveToOverflow</code>.The OverflowToolbar item can or cannot
    * move to the overflow areaWhen called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>true</code>.
    * @param bMoveToOverflow New value for property <code>moveToOverflow</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMoveToOverflow(bMoveToOverflow: Boolean): OverflowToolbarLayoutData = js.native
  
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
  def setStayInOverflow(bStayInOverflow: Boolean): OverflowToolbarLayoutData = js.native
}
