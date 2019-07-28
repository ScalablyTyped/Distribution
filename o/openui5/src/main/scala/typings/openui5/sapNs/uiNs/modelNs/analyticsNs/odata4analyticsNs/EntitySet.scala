package typings.openui5.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.EntitySet")
@js.native
class EntitySet protected () extends js.Object {
  /**
    * Create a representation of an OData entity set in the context of an analyticquery. Do not create
    * your own instances.
    * @param oModel DataJS object for the OData model containing this entity           set
    * @param oSchema DataJS object for the schema surrounding the container of           this entity set
    * @param oContainer DataJS object for the container holding this entity set
    * @param oEntitySet DataJS object for the entity set
    * @param oEntityType DataJS object for the entity type
    */
  def this(oModel: js.Any, oSchema: js.Any, oContainer: js.Any, oEntitySet: js.Any, oEntityType: js.Any) = this()
  /**
    * Get entity type used for this entity set
    * @returns The DataJS object representing the entity type
    */
  def getEntityType(): js.Any = js.native
  /**
    * Get the fully qualified name for this entity type
    * @returns The fully qualified name
    */
  def getQName(): String = js.native
  /**
    * Get full description for this entity set
    * @returns The DataJS object representing the entity set
    */
  def getSetDescription(): js.Any = js.native
  /**
    * Get names of properties in this entity set that can be updated
    * @returns An object with individual JS properties for each         updatable property. For testing
    * whether propertyName is the name         of an updatable property, use        
    * <code>getUpdatablePropertyNameSet()[propertyName]</code>. The         included JS object properties
    * are all set to true.
    */
  def getUpdatablePropertyNameSet(): js.Any = js.native
}

