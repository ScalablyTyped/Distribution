package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadCollectionParameter
  extends StObject
     with Element {
  
  /**
    * Gets current value of property <code>name</code>.Specifies the name of the parameter.
    * @since 1.12.2
    * @returns Value of property <code>name</code>
    */
  def getName(): String = js.native
  
  /**
    * Gets current value of property <code>value</code>.Specifies the value of the parameter.
    * @since 1.12.2
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  
  /**
    * Sets a new value for property <code>name</code>.Specifies the name of the parameter.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.12.2
    * @param sName New value for property <code>name</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setName(sName: String): UploadCollectionParameter = js.native
  
  /**
    * Sets a new value for property <code>value</code>.Specifies the value of the parameter.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @since 1.12.2
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): UploadCollectionParameter = js.native
}
