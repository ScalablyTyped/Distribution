package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityType extends js.Object {
  /**
    * Find property by name
    * @param sPropertyName Property name
    * @returns The DataJS object representing the property or null if         it does not exist
    */
  def findPropertyByName(sPropertyName: String): js.Any = js.native
  /**
    * Get the names of all properties with an associated hierarchy
    * @returns List of all property names
    */
  def getAllHierarchyPropertyNames(): js.Array[String] = js.native
  /**
    * Get names of properties that can be filtered, that is they can be used in$filter expressions
    * @returns Array with names of properties that can be         filtered.
    */
  def getFilterablePropertyNames(): js.Array[String] = js.native
  /**
    * Get heading of the property with specified name (identified by propertymetadata annotation
    * sap:heading)
    * @param sPropertyName Property name
    * @returns The heading string
    */
  def getHeadingOfProperty(sPropertyName: String): String = js.native
  /**
    * Get the hierarchy associated to a given property Based on the currentspecification, hierarchies are
    * always recursive. TODO: Extend behaviorwhen leveled hierarchies get in scope
    * @param sName Parameter name
    * @returns The hierarchy         object or null if it does not exist
    */
  def getHierarchy(sName: String): RecursiveHierarchy = js.native
  /**
    * Get key properties of this type
    * @returns The list of key property names
    */
  def getKeyProperties(): js.Array[String] = js.native
  /**
    * Get label of the property with specified name (identified by propertymetadata annotation sap:label)
    * @param sPropertyName Property name
    * @returns The label string
    */
  def getLabelOfProperty(sPropertyName: String): String = js.native
  /**
    * Get all properties
    * @returns Object with (JavaScript) properties, one for each (OData        entity type) property.
    * These (JavaScript) properties hold the        DataJS object representing the property
    */
  def getProperties(): js.Any = js.native
  /**
    * Get properties for which filter restrictions have been specified
    * @returns Object with (JavaScript) properties, one for each         (OData entity type) property. The
    * property value is from         odata4analytics.EntityType.propertyFilterRestriction and        
    * indicates the filter restriction for this property.
    */
  def getPropertiesWithFilterRestrictions(): js.Any = js.native
  /**
    * Get the fully qualified name for this entity type
    * @returns The fully qualified name
    */
  def getQName(): String = js.native
  /**
    * Get quick info of the property with specified name (identified by propertymetadata annotation
    * sap:quickinfo)
    * @param sPropertyName Property name
    * @returns The quick info string
    */
  def getQuickInfoOfProperty(sPropertyName: String): String = js.native
  /**
    * Get names of properties that must be filtered, that is they must appearin every $filter expression
    * @returns Array with names of properties that must be         filtered.
    */
  def getRequiredFilterPropertyNames(): js.Array[String] = js.native
  /**
    * Get names of properties that can be sorted, that is they can be used in$orderby expressions
    * @returns Array with names of properties that can be         sorted.
    */
  def getSortablePropertyNames(): js.Array[String] = js.native
  /**
    * Get the super-ordinate property related to the property with specifiedname (identified by property
    * metadata annotation sap:super-ordinate)
    * @param sPropertyName Property name
    * @returns The DataJS object representing the super-ordinate         property or null if it does not
    * exist
    */
  def getSuperOrdinatePropertyOfProperty(sPropertyName: String): js.Any = js.native
  /**
    * Get the text property related to the property with specified name(identified by property metadata
    * annotation sap:text)
    * @param sPropertyName Property name
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextPropertyOfProperty(sPropertyName: String): js.Any = js.native
  /**
    * Get full description for this entity type
    * @returns The DataJS object representing the entity type
    */
  def getTypeDescription(): js.Any = js.native
}

object EntityType {
  @scala.inline
  def apply(
    findPropertyByName: String => js.Any,
    getAllHierarchyPropertyNames: () => js.Array[String],
    getFilterablePropertyNames: () => js.Array[String],
    getHeadingOfProperty: String => String,
    getHierarchy: String => RecursiveHierarchy,
    getKeyProperties: () => js.Array[String],
    getLabelOfProperty: String => String,
    getProperties: () => js.Any,
    getPropertiesWithFilterRestrictions: () => js.Any,
    getQName: () => String,
    getQuickInfoOfProperty: String => String,
    getRequiredFilterPropertyNames: () => js.Array[String],
    getSortablePropertyNames: () => js.Array[String],
    getSuperOrdinatePropertyOfProperty: String => js.Any,
    getTextPropertyOfProperty: String => js.Any,
    getTypeDescription: () => js.Any
  ): EntityType = {
    val __obj = js.Dynamic.literal(findPropertyByName = js.Any.fromFunction1(findPropertyByName), getAllHierarchyPropertyNames = js.Any.fromFunction0(getAllHierarchyPropertyNames), getFilterablePropertyNames = js.Any.fromFunction0(getFilterablePropertyNames), getHeadingOfProperty = js.Any.fromFunction1(getHeadingOfProperty), getHierarchy = js.Any.fromFunction1(getHierarchy), getKeyProperties = js.Any.fromFunction0(getKeyProperties), getLabelOfProperty = js.Any.fromFunction1(getLabelOfProperty), getProperties = js.Any.fromFunction0(getProperties), getPropertiesWithFilterRestrictions = js.Any.fromFunction0(getPropertiesWithFilterRestrictions), getQName = js.Any.fromFunction0(getQName), getQuickInfoOfProperty = js.Any.fromFunction1(getQuickInfoOfProperty), getRequiredFilterPropertyNames = js.Any.fromFunction0(getRequiredFilterPropertyNames), getSortablePropertyNames = js.Any.fromFunction0(getSortablePropertyNames), getSuperOrdinatePropertyOfProperty = js.Any.fromFunction1(getSuperOrdinatePropertyOfProperty), getTextPropertyOfProperty = js.Any.fromFunction1(getTextPropertyOfProperty), getTypeDescription = js.Any.fromFunction0(getTypeDescription))
    __obj.asInstanceOf[EntityType]
  }
  @scala.inline
  implicit class EntityTypeOps[Self <: EntityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindPropertyByName(value: String => js.Any): Self = this.set("findPropertyByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllHierarchyPropertyNames(value: () => js.Array[String]): Self = this.set("getAllHierarchyPropertyNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilterablePropertyNames(value: () => js.Array[String]): Self = this.set("getFilterablePropertyNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeadingOfProperty(value: String => String): Self = this.set("getHeadingOfProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHierarchy(value: String => RecursiveHierarchy): Self = this.set("getHierarchy", js.Any.fromFunction1(value))
    @scala.inline
    def setGetKeyProperties(value: () => js.Array[String]): Self = this.set("getKeyProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabelOfProperty(value: String => String): Self = this.set("getLabelOfProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperties(value: () => js.Any): Self = this.set("getProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPropertiesWithFilterRestrictions(value: () => js.Any): Self = this.set("getPropertiesWithFilterRestrictions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQName(value: () => String): Self = this.set("getQName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQuickInfoOfProperty(value: String => String): Self = this.set("getQuickInfoOfProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRequiredFilterPropertyNames(value: () => js.Array[String]): Self = this.set("getRequiredFilterPropertyNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSortablePropertyNames(value: () => js.Array[String]): Self = this.set("getSortablePropertyNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSuperOrdinatePropertyOfProperty(value: String => js.Any): Self = this.set("getSuperOrdinatePropertyOfProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTextPropertyOfProperty(value: String => js.Any): Self = this.set("getTextPropertyOfProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTypeDescription(value: () => js.Any): Self = this.set("getTypeDescription", js.Any.fromFunction0(value))
  }
  
}

