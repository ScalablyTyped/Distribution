package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.EntityReference")
@js.native
class EntityReference protected () extends js.Object {
  /**
    * Identifies a record.
    * @param logicalName The logical name of the entity.
    * @param id The id of the record.
    * @param name The value of the primary attribute of the entity instance. This property can contain a value or null. This property is not automatically populated unless the EntityReference object has been retrieved from the server.
    */
  def this(logicalName: java.lang.String, id: java.lang.String) = this()
  def this(logicalName: java.lang.String, id: java.lang.String, name: java.lang.String) = this()
  
  /**
    * Gets the Id value of the referenced entity.
    */
  def getId(): java.lang.String = js.native
  
  /**
    * Gets the primary attribute value of the referenced entity.
    */
  def getName(): java.lang.String = js.native
  
  /**
    * Gets the logicalName representing the type of referenced entity.
    */
  def getType(): java.lang.String = js.native
  
  /**
    * Sets the Id value of the entity.
    * @param id The Id value of the entity.
    */
  def setId(id: java.lang.String): Unit = js.native
  
  /**
    * Sets the primary attribute value of the referenced entity.
    * @param name The primary attribute value of the referenced entity.
    */
  def setName(name: java.lang.String): Unit = js.native
  
  /**
    * Sets the logicalName representing the type of referenced entity.
    * @param type The logicalName representing the type of referenced entity.
    */
  def setType(`type`: java.lang.String): Unit = js.native
  
  /**
    * Returns the values of serialized entity reference as XML nodes.
    */
  def toValueXml(): java.lang.String = js.native
  
  /// prototype methods
  /**
    * Returns a serialized entity reference where the root element is <a:EntityReference>.
    */
  def toXml(): java.lang.String = js.native
  
  /**
    * Returns a view of the data in an EntityReference
    */
  def view(): IEntityReferenceView = js.native
}
