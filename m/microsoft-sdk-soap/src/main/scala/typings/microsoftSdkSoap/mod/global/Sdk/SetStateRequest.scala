package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the data that is needed to set the state of an entity record.
  * @param entityMoniker Sets the entity.
  * @param state Sets the state of the entity record.
  * @param status Sets the status that corresponds to the State property.
  */
@JSGlobal("Sdk.SetStateRequest")
@js.native
class SetStateRequest protected () extends OrganizationRequest {
  def this(entityMoniker: EntityReference, state: scala.Double, status: scala.Double) = this()
  
  /**
    * Sets the entity.
    * @param value The entity.
    */
  def setEntityMoniker(value: EntityReference): Unit = js.native
  
  /**
    * Sets the state of the entity record.
    * @param value The state of the entity record.
    */
  def setState(value: scala.Double): Unit = js.native
  
  /**
    * Sets the status that corresponds to the State property.
    * @param value The status that corresponds to the State property.
    */
  def setStatus(value: scala.Double): Unit = js.native
}
