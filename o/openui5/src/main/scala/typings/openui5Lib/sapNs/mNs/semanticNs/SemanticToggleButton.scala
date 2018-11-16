package typings
package openui5Lib.sapNs.mNs.semanticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.SemanticToggleButton")
@js.native
abstract class SemanticToggleButton protected () extends SemanticButton {
  /**
           * Constructor for a new SemanticToggleButton.Accepts an object literal <code>mSettings</code> that
           * defines initialproperty values, aggregated and associated objects as well as event handlers.See
           * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
           * settings object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new SemanticToggleButton.Accepts an object literal <code>mSettings</code> that
           * defines initialproperty values, aggregated and associated objects as well as event handlers.See
           * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
           * settings object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Gets current value of property <code>pressed</code>.The property is “true” when the control is
           * toggled. The default state of this property is "false".Default value is <code>false</code>.
           * @returns Value of property <code>pressed</code>
          */
  def getPressed(): scala.Boolean = js.native
  /**
           * Sets a new value for property <code>pressed</code>.The property is “true” when the control is
           * toggled. The default state of this property is "false".When called with a value of <code>null</code>
           * or <code>undefined</code>, the default value of the property will be restored.Default value is
           * <code>false</code>.
           * @param bPressed New value for property <code>pressed</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setPressed(bPressed: scala.Boolean): SemanticToggleButton = js.native
}

