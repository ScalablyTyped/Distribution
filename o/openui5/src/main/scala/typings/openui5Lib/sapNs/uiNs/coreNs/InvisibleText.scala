package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.InvisibleText")
@js.native
class InvisibleText protected () extends Control {
  /**
           * Constructor for a new InvisibleText.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new InvisibleText.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Gets current value of property <code>text</code>.The text of the InvisibleText.Default value is
           * <code></code>.
           * @returns Value of property <code>text</code>
          */
  def getText(): java.lang.String = js.native
  /**
           * @returns Returns <code>this</code> to allow method chaining
          */
  def setBusy(): js.Any = js.native
  /**
           * @returns Returns <code>this</code> to allow method chaining
          */
  def setBusyIndicatorDelay(): js.Any = js.native
  /**
           * Sets a new value for property <code>text</code>.The text of the InvisibleText.When called with a
           * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code></code>.
           * @param sText New value for property <code>text</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setText(sText: java.lang.String): InvisibleText = js.native
  /**
           * @returns Returns <code>this</code> to allow method chaining
          */
  def setTooltip(): js.Any = js.native
  /**
           * @returns Returns <code>this</code> to allow method chaining
          */
  def setVisible(): js.Any = js.native
  /**
           * Adds <code>this</code> control into the static, hidden area UI area container.
           * @returns Returns <code>this</code> to allow method chaining
          */
  def toStatic(): js.Any = js.native
}

