package typings.openui5.sap.ui.model

import typings.openui5.TypeofBindingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.PropertyBinding")
@js.native
class PropertyBinding protected () extends Binding {
  /**
    * Constructor for PropertyBinding
    * @param oModel undefined
    * @param sPath undefined
    * @param oContext undefined
    * @param mParameters undefined
    */
  def this(oModel: Model, sPath: String, oContext: Context) = this()
  def this(oModel: Model, sPath: String, oContext: Context, mParameters: js.Any) = this()
  /**
    * Returns the binding mode
    * @returns the binding mode
    */
  def getBindingMode(): TypeofBindingMode = js.native
  /**
    * Returns the current external value of the bound target which is formatted via a type or formatter
    * function.
    * @returns the current value of the bound target
    */
  def getExternalValue(): js.Any = js.native
  /**
    * Returns the formatter function
    * @returns the formatter function
    */
  def getFormatter(): js.Any = js.native
  /**
    * Returns the type if any for the binding.
    * @returns the binding type
    */
  def getType(): Type_ = js.native
  /**
    * Returns the current value of the bound target
    * @returns the current value of the bound target
    */
  def getValue(): js.Any = js.native
  /**
    * Sets the binding mode
    * @param sBindingMode the binding mode
    */
  def setBindingMode(sBindingMode: TypeofBindingMode): Unit = js.native
  /**
    * Sets the value for this binding. The value is parsed and validated against its type and then set to
    * the binding.A model implementation should check if the current default binding mode permitssetting
    * the binding value and if so set the new value also in the model.
    * @param oValue the value to set for this binding
    */
  def setExternalValue(oValue: js.Any): Unit = js.native
  /**
    * Sets the optional formatter function for the binding.
    * @param fnFormatter the formatter function for the binding
    */
  def setFormatter(fnFormatter: js.Any): Unit = js.native
  /**
    * Sets the optional type and internal type for the binding. The type and internal type are used to do
    * the parsing/formatting correctly.The internal type is the property type of the element which the
    * value is formatted to.
    * @param oType the type for the binding
    * @param sInternalType the internal type of the element property which this binding is bound against.
    */
  def setType(oType: Type_, sInternalType: String): Unit = js.native
  /**
    * Sets the value for this binding. A model implementation should check if the current default binding
    * mode permitssetting the binding value and if so set the new value also in the model.
    * @param oValue the value to set for this binding
    */
  def setValue(oValue: js.Any): Unit = js.native
}

