package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.ComponentContainer")
@js.native
class ComponentContainer protected () extends Control {
  /**
    * Constructor for a new ComponentContainer.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * ID of the element which is the current target of the association <code>component</code>, or
    * <code>null</code>.
    */
  def getComponent(): js.Any = js.native
  /**
    * Gets current value of property <code>handleValidation</code>.Enable/disable validation handling by
    * MessageManager for this component.The resulting Messages will be propagated to the controls.Default
    * value is <code>false</code>.
    * @returns Value of property <code>handleValidation</code>
    */
  def getHandleValidation(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>height</code>.Container height in CSS size
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>name</code>.Component name, the package where the component is
    * contained. The property can only be applied initially.
    * @returns Value of property <code>name</code>
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>propagateModel</code>.Defines whether binding information is
    * propagated to the component.Default value is <code>false</code>.
    * @returns Value of property <code>propagateModel</code>
    */
  def getPropagateModel(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>settings</code>.The settings object passed to the component
    * when created. The property can only be applied initially.
    * @returns Value of property <code>settings</code>
    */
  def getSettings(): js.Any = js.native
  /**
    * Gets current value of property <code>url</code>.The URL of the component. The property can only be
    * applied initially.
    * @returns Value of property <code>url</code>
    */
  def getUrl(): js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.Container width in CSS size
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets the associated <code>component</code>.
    * @param oComponent ID of an element which becomes the new target of this component association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setComponent(oComponent: js.Any): ComponentContainer = js.native
  def setComponent(oComponent: UIComponent): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>handleValidation</code>.Enable/disable validation handling by
    * MessageManager for this component.The resulting Messages will be propagated to the controls.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bHandleValidation New value for property <code>handleValidation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHandleValidation(bHandleValidation: scala.Boolean): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>height</code>.Container height in CSS sizeWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>name</code>.Component name, the package where the component is
    * contained. The property can only be applied initially.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: java.lang.String): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>propagateModel</code>.Defines whether binding information is
    * propagated to the component.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>false</code>.
    * @param bPropagateModel New value for property <code>propagateModel</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPropagateModel(bPropagateModel: scala.Boolean): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>settings</code>.The settings object passed to the component when
    * created. The property can only be applied initially.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oSettings New value for property <code>settings</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSettings(oSettings: js.Any): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>url</code>.The URL of the component. The property can only be
    * applied initially.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sUrl New value for property <code>url</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUrl(sUrl: js.Any): ComponentContainer = js.native
  /**
    * Sets a new value for property <code>width</code>.Container width in CSS sizeWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ComponentContainer = js.native
}

