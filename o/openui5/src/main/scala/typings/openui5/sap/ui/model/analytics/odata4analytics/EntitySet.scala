package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitySet extends js.Object {
  /**
    * Get entity type used for this entity set
    * @returns The DataJS object representing the entity type
    */
  def getEntityType(): js.Any
  /**
    * Get the fully qualified name for this entity type
    * @returns The fully qualified name
    */
  def getQName(): String
  /**
    * Get full description for this entity set
    * @returns The DataJS object representing the entity set
    */
  def getSetDescription(): js.Any
  /**
    * Get names of properties in this entity set that can be updated
    * @returns An object with individual JS properties for each         updatable property. For testing
    * whether propertyName is the name         of an updatable property, use        
    * <code>getUpdatablePropertyNameSet()[propertyName]</code>. The         included JS object properties
    * are all set to true.
    */
  def getUpdatablePropertyNameSet(): js.Any
}

object EntitySet {
  @scala.inline
  def apply(
    getEntityType: () => js.Any,
    getQName: () => String,
    getSetDescription: () => js.Any,
    getUpdatablePropertyNameSet: () => js.Any
  ): EntitySet = {
    val __obj = js.Dynamic.literal(getEntityType = js.Any.fromFunction0(getEntityType), getQName = js.Any.fromFunction0(getQName), getSetDescription = js.Any.fromFunction0(getSetDescription), getUpdatablePropertyNameSet = js.Any.fromFunction0(getUpdatablePropertyNameSet))
    __obj.asInstanceOf[EntitySet]
  }
}

