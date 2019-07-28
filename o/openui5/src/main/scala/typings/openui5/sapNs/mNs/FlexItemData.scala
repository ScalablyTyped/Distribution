package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FlexItemData")
@js.native
class FlexItemData protected () extends LayoutData {
  /**
    * Constructor for a new <code>sap.m.FlexItemData</code>.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId id for the new element, generated automatically if no id is given
    * @param mSettings initial settings for the new element
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>alignSelf</code>.Determines cross-axis alignment of individual
    * element (not currently supported in Internet Explorer)Default value is <code>Auto</code>.
    * @returns Value of property <code>alignSelf</code>
    */
  def getAlignSelf(): FlexAlignSelf = js.native
  /**
    * Gets current value of property <code>backgroundDesign</code>.Defines the background style of the
    * flex item.Default value is <code>Transparent</code>.
    * @since 1.38.5
    * @returns Value of property <code>backgroundDesign</code>
    */
  def getBackgroundDesign(): BackgroundDesign = js.native
  /**
    * Gets current value of property <code>baseSize</code>.The base size is the initial main size of the
    * item for the flex algorithm. If set to "auto", this will be the computed size of the item.Default
    * value is <code>auto</code>.
    * @since 1.32.0
    * @returns Value of property <code>baseSize</code>
    */
  def getBaseSize(): js.Any = js.native
  /**
    * Gets current value of property <code>growFactor</code>.Determines the flexibility of the flex item
    * when allocatable space is remaining.Default value is <code>0</code>.
    * @returns Value of property <code>growFactor</code>
    */
  def getGrowFactor(): Double = js.native
  /**
    * Gets current value of property <code>maxHeight</code>.The maximum height of the flex item.Default
    * value is <code></code>.
    * @since 1.36.0
    * @returns Value of property <code>maxHeight</code>
    */
  def getMaxHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>maxWidth</code>.The maximum height of the flex item.Default
    * value is <code></code>.
    * @since 1.36.0
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>minHeight</code>.The minimum height of the flex item.Default
    * value is <code>auto</code>.
    * @since 1.36.0
    * @returns Value of property <code>minHeight</code>
    */
  def getMinHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>minWidth</code>.The minimum height of the flex item.Default
    * value is <code>auto</code>.
    * @since 1.36.0
    * @returns Value of property <code>minWidth</code>
    */
  def getMinWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>order</code>.Determines the display order of flex items
    * independent of their source code order.Default value is <code>0</code>.
    * @returns Value of property <code>order</code>
    */
  def getOrder(): Double = js.native
  /**
    * Gets current value of property <code>shrinkFactor</code>.The shrink factor determines how much the
    * flex item will shrink relative to the rest of the flex items in the flex container when negative
    * free space is distributed.Default value is <code>1</code>.
    * @since 1.24.0
    * @returns Value of property <code>shrinkFactor</code>
    */
  def getShrinkFactor(): Double = js.native
  /**
    * Gets current value of property <code>styleClass</code>.The style class will be applied to the flex
    * item and can be used for CSS selectorsDefault value is <code></code>.
    * @returns Value of property <code>styleClass</code>
    */
  def getStyleClass(): String = js.native
  /**
    * Sets a new value for property <code>alignSelf</code>.Determines cross-axis alignment of individual
    * element (not currently supported in Internet Explorer)When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Auto</code>.
    * @param sAlignSelf New value for property <code>alignSelf</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAlignSelf(sAlignSelf: FlexAlignSelf): FlexItemData = js.native
  /**
    * Sets a new value for property <code>backgroundDesign</code>.Defines the background style of the flex
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Transparent</code>.
    * @since 1.38.5
    * @param sBackgroundDesign New value for property <code>backgroundDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBackgroundDesign(sBackgroundDesign: BackgroundDesign): FlexItemData = js.native
  /**
    * Sets a new value for property <code>baseSize</code>.The base size is the initial main size of the
    * item for the flex algorithm. If set to "auto", this will be the computed size of the item.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>auto</code>.
    * @since 1.32.0
    * @param sBaseSize New value for property <code>baseSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBaseSize(sBaseSize: js.Any): FlexItemData = js.native
  /**
    * Sets a new value for property <code>growFactor</code>.Determines the flexibility of the flex item
    * when allocatable space is remaining.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param fGrowFactor New value for property <code>growFactor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowFactor(fGrowFactor: Double): FlexItemData = js.native
  /**
    * Sets a new value for property <code>maxHeight</code>.The maximum height of the flex item.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code></code>.
    * @since 1.36.0
    * @param sMaxHeight New value for property <code>maxHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxHeight(sMaxHeight: js.Any): FlexItemData = js.native
  /**
    * Sets a new value for property <code>maxWidth</code>.The maximum height of the flex item.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code></code>.
    * @since 1.36.0
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): FlexItemData = js.native
  /**
    * Sets a new value for property <code>minHeight</code>.The minimum height of the flex item.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>auto</code>.
    * @since 1.36.0
    * @param sMinHeight New value for property <code>minHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinHeight(sMinHeight: js.Any): FlexItemData = js.native
  /**
    * Sets a new value for property <code>minWidth</code>.The minimum height of the flex item.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>auto</code>.
    * @since 1.36.0
    * @param sMinWidth New value for property <code>minWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinWidth(sMinWidth: js.Any): FlexItemData = js.native
  /**
    * Sets a new value for property <code>order</code>.Determines the display order of flex items
    * independent of their source code order.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param iOrder New value for property <code>order</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOrder(iOrder: Double): FlexItemData = js.native
  /**
    * Sets a new value for property <code>shrinkFactor</code>.The shrink factor determines how much the
    * flex item will shrink relative to the rest of the flex items in the flex container when negative
    * free space is distributed.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>1</code>.
    * @since 1.24.0
    * @param fShrinkFactor New value for property <code>shrinkFactor</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShrinkFactor(fShrinkFactor: Double): FlexItemData = js.native
  /**
    * Sets a new value for property <code>styleClass</code>.The style class will be applied to the flex
    * item and can be used for CSS selectorsWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code></code>.
    * @param sStyleClass New value for property <code>styleClass</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStyleClass(sStyleClass: String): FlexItemData = js.native
}

