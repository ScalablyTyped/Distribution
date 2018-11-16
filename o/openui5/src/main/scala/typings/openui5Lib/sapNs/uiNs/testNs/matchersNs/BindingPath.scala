package typings
package openui5Lib.sapNs.uiNs.testNs.matchersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.BindingPath")
@js.native
class BindingPath protected () extends Matcher {
  /**
             * BindingPath - checks if a control has a binding context with the exact same binding path.Accepts an
             * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
             * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
             * description of the syntax of the settings object.
             * @param mSettings Map/JSON-object with initial settings for the new BindingPath.
            */
  def this(mSettings: js.Any) = this()
  /**
             * Gets current value of property <code>modelName</code>.The name of the binding model that is used for
             * matching.
             * @returns Value of property <code>modelName</code>
            */
  def getModelName(): java.lang.String = js.native
  /**
             * Gets current value of property <code>path</code>.The value of the binding path that is used for
             * matching.
             * @returns Value of property <code>path</code>
            */
  def getPath(): java.lang.String = js.native
  /**
             * Sets a new value for property <code>modelName</code>.The name of the binding model that is used for
             * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
             * of the property will be restored.
             * @param sModelName New value for property <code>modelName</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setModelName(sModelName: java.lang.String): BindingPath = js.native
  /**
             * Sets a new value for property <code>path</code>.The value of the binding path that is used for
             * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
             * of the property will be restored.
             * @param sPath New value for property <code>path</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setPath(sPath: java.lang.String): BindingPath = js.native
}

