package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.AttributeBase")
@js.native
class AttributeBase () extends js.Object {
  /**
    * Gets whether the value of the attribute has changed.
    */
  def getIsChanged(): scala.Boolean = js.native
  /**
    * Gets the logical name of the attribute.
    */
  def getName(): java.lang.String = js.native
  /**
    * Gets the value type of the attribute.
    */
  def getType(): ValueType = js.native
  /**
    * Gets the value of the attribute.
    * The type of value depends on the type of attribute.
    */
  def getValue(): js.Any = js.native
  /**
    * Whether the value of the attribute is set.
    */
  def isValueSet(): scala.Boolean = js.native
  /**
    * Sets whether the value of the attribute has changed.
    * @param isChanged Whether the value of the attribute has changed.
    */
  def setIsChanged(isChanged: scala.Boolean): Unit = js.native
  /**
    * Sets the name of the attribute
    * @param name The name of the attribute.
    */
  def setName(name: java.lang.String): Unit = js.native
  /**
    * For internal use only.
    * @param type The type of the attribute.
    */
  def setType(`type`: ValueType): Unit = js.native
  /**
    * Sets the general value of the attribute
    * @param name The value of the attribute.
    */
  def setValue(value: js.Any): Unit = js.native
  /// prototype methods
  /**
    * XML node for Attribute.
    */
  def toXml(action: java.lang.String): java.lang.String = js.native
}

