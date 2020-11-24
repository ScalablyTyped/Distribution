package typings.openui5.sap.ui.test.matchers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingPath extends Matcher {
  
  /**
    * Gets current value of property <code>modelName</code>.The name of the binding model that is used for
    * matching.
    * @returns Value of property <code>modelName</code>
    */
  def getModelName(): String = js.native
  
  /**
    * Gets current value of property <code>path</code>.The value of the binding path that is used for
    * matching.
    * @returns Value of property <code>path</code>
    */
  def getPath(): String = js.native
  
  /**
    * Sets a new value for property <code>modelName</code>.The name of the binding model that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sModelName New value for property <code>modelName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setModelName(sModelName: String): BindingPath = js.native
  
  /**
    * Sets a new value for property <code>path</code>.The value of the binding path that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sPath New value for property <code>path</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPath(sPath: String): BindingPath = js.native
}
