package typings.microsoftSdkSoap.mod.global.Sdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.AttributeCollection")
@js.native
class AttributeCollection () extends Collection[AttributeBase] {
  
  def add(attribute: AttributeBase, isChanged: scala.Boolean): Unit = js.native
  
  /**
    * Returns all attributes in the collection.
    */
  def get(): Collection[AttributeBase] = js.native
  /**
    * Returns the attribute with matching name.
    * @param attribuetName
    */
  def get(attribuetName: java.lang.String): AttributeBase = js.native
  /**
    * Returns the attribute with matching index.
    * @param attribuetName
    */
  def get(index: scala.Double): AttributeBase = js.native
  
  /**
    * Gets an attribute at a given index.
    * @param index The index.
    */
  def getAttributeByIndex(index: scala.Double): AttributeBase = js.native
  
  /**
    * Gets an attribute with a given name.
    * @param name The Logical name of the attribute.
    */
  def getAttributeByName(name: java.lang.String): AttributeBase = js.native
  
  /**
    * Gets the attributes in the collection.
    */
  def getAttributes(): Collection[AttributeBase] = js.native
  
  /**
    * Gets an array of the names of attributes in a collection.
    */
  def getNames(): js.Array[java.lang.String] = js.native
  
  /**
    * The XML for an attribute collection.
    */
  def toXml(action: java.lang.String): java.lang.String = js.native
}
