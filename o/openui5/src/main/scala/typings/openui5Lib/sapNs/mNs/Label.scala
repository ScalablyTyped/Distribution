package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Label")
@js.native
class Label protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new Label.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new Label.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Gets current value of property <code>design</code>.Sets the design of a Label to either Standard or
         * Bold.Default value is <code>Standard</code>.
         * @returns Value of property <code>design</code>
        */
  def getDesign(): LabelDesign = js.native
  /**
         * ID of the element which is the current target of the association <code>labelFor</code>, or
         * <code>null</code>.
        */
  def getLabelFor(): js.Any = js.native
  /**
         * Gets current value of property <code>required</code>.Indicates that user input is required in the
         * input this label labels.Default value is <code>false</code>.
         * @returns Value of property <code>required</code>
        */
  def getRequired(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>text</code>.Determines the Label text to be displayed.
         * @returns Value of property <code>text</code>
        */
  def getText(): java.lang.String = js.native
  /**
         * Gets current value of property <code>textAlign</code>.Available alignment settings are "Begin",
         * "Center", "End", "Left", and "Right".Default value is <code>Begin</code>.
         * @returns Value of property <code>textAlign</code>
        */
  def getTextAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
         * Gets current value of property <code>textDirection</code>.Options for the text direction are RTL and
         * LTR. Alternatively, the control can inherit the text direction from its parent container.Default
         * value is <code>Inherit</code>.
         * @returns Value of property <code>textDirection</code>
        */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
         * Gets current value of property <code>width</code>.Determines the width of the label.Default value is
         * <code></code>.
         * @returns Value of property <code>width</code>
        */
  def getWidth(): js.Any = js.native
  /**
         * Sets a new value for property <code>design</code>.Sets the design of a Label to either Standard or
         * Bold.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
         * the property will be restored.Default value is <code>Standard</code>.
         * @param sDesign New value for property <code>design</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setDesign(sDesign: LabelDesign): Label = js.native
  /**
         * Sets the associated <code>labelFor</code>.
         * @param oLabelFor ID of an element which becomes the new target of this labelFor association;
         * alternatively, an element instance may be given
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setLabelFor(oLabelFor: js.Any): Label = js.native
  /**
         * Sets the associated <code>labelFor</code>.
         * @param oLabelFor ID of an element which becomes the new target of this labelFor association;
         * alternatively, an element instance may be given
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setLabelFor(oLabelFor: openui5Lib.sapNs.uiNs.coreNs.Control): Label = js.native
  /**
         * Sets a new value for property <code>required</code>.Indicates that user input is required in the
         * input this label labels.When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.Default value is <code>false</code>.
         * @param bRequired New value for property <code>required</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setRequired(bRequired: scala.Boolean): Label = js.native
  /**
         * Sets a new value for property <code>text</code>.Determines the Label text to be displayed.When
         * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
         * property will be restored.
         * @param sText New value for property <code>text</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setText(sText: java.lang.String): Label = js.native
  /**
         * Sets a new value for property <code>textAlign</code>.Available alignment settings are "Begin",
         * "Center", "End", "Left", and "Right".When called with a value of <code>null</code> or
         * <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>Begin</code>.
         * @param sTextAlign New value for property <code>textAlign</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTextAlign(sTextAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): Label = js.native
  /**
         * Sets a new value for property <code>textDirection</code>.Options for the text direction are RTL and
         * LTR. Alternatively, the control can inherit the text direction from its parent container.When called
         * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
         * be restored.Default value is <code>Inherit</code>.
         * @param sTextDirection New value for property <code>textDirection</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): Label = js.native
  /**
         * Sets a new value for property <code>width</code>.Determines the width of the label.When called with
         * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code></code>.
         * @param sWidth New value for property <code>width</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setWidth(sWidth: js.Any): Label = js.native
}

