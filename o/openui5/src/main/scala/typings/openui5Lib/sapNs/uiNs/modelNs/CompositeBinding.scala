package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.CompositeBinding")
@js.native
/**
  * Constructor for CompositeBinding
  */
class CompositeBinding () extends PropertyBinding {
  /**
    * Returns the property bindings contained in this composite binding.
    * @returns the property bindings in this composite binding
    */
  def getBindings(): js.Array[_] = js.native
  /**
    * Sets the optional type and internal type for the binding. The type and internal type are used to do
    * the parsing/formatting correctly.The internal type is the property type of the element which the
    * value is formatted to.
    * @param oType the type for the binding
    * @param sInternalType the internal type of the element property which this binding is bound against.
    */
  def setType(oType: CompositeType, sInternalType: java.lang.String): scala.Unit = js.native
  /**
    * Sets the values. This will cause the setValue to be called for each nested binding, exceptfor
    * undefined values in the array.
    * @param aValues the values to set for this binding
    */
  def setValue(aValues: js.Array[_]): scala.Unit = js.native
}

