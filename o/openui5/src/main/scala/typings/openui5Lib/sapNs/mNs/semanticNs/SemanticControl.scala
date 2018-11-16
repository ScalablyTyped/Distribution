package typings
package openui5Lib.sapNs.mNs.semanticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.semantic.SemanticControl")
@js.native
abstract class SemanticControl protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
           * Constructor for a new SemanticControl.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new SemanticControl.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Gets current value of property <code>visible</code>.See {@link sap.ui.core.Control#visible}Default
           * value is <code>true</code>.
           * @returns Value of property <code>visible</code>
          */
  def getVisible(): scala.Boolean = js.native
  /**
           * Sets a new value for property <code>visible</code>.See {@link sap.ui.core.Control#visible}When
           * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
           * property will be restored.Default value is <code>true</code>.
           * @param bVisible New value for property <code>visible</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setVisible(bVisible: scala.Boolean): SemanticControl = js.native
}

