package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityType extends StObject {
  
  /**
    * Find property by name
    * @param sPropertyName Property name
    * @returns The DataJS object representing the property or null if         it does not exist
    */
  def findPropertyByName(sPropertyName: String): js.Any
  
  /**
    * Get the names of all properties with an associated hierarchy
    * @returns List of all property names
    */
  def getAllHierarchyPropertyNames(): js.Array[String]
  
  /**
    * Get names of properties that can be filtered, that is they can be used in$filter expressions
    * @returns Array with names of properties that can be         filtered.
    */
  def getFilterablePropertyNames(): js.Array[String]
  
  /**
    * Get heading of the property with specified name (identified by propertymetadata annotation
    * sap:heading)
    * @param sPropertyName Property name
    * @returns The heading string
    */
  def getHeadingOfProperty(sPropertyName: String): String
  
  /**
    * Get the hierarchy associated to a given property Based on the currentspecification, hierarchies are
    * always recursive. TODO: Extend behaviorwhen leveled hierarchies get in scope
    * @param sName Parameter name
    * @returns The hierarchy         object or null if it does not exist
    */
  def getHierarchy(sName: String): RecursiveHierarchy
  
  /**
    * Get key properties of this type
    * @returns The list of key property names
    */
  def getKeyProperties(): js.Array[String]
  
  /**
    * Get label of the property with specified name (identified by propertymetadata annotation sap:label)
    * @param sPropertyName Property name
    * @returns The label string
    */
  def getLabelOfProperty(sPropertyName: String): String
  
  /**
    * Get all properties
    * @returns Object with (JavaScript) properties, one for each (OData        entity type) property.
    * These (JavaScript) properties hold the        DataJS object representing the property
    */
  def getProperties(): js.Any
  
  /**
    * Get properties for which filter restrictions have been specified
    * @returns Object with (JavaScript) properties, one for each         (OData entity type) property. The
    * property value is from         odata4analytics.EntityType.propertyFilterRestriction and        
    * indicates the filter restriction for this property.
    */
  def getPropertiesWithFilterRestrictions(): js.Any
  
  /**
    * Get the fully qualified name for this entity type
    * @returns The fully qualified name
    */
  def getQName(): String
  
  /**
    * Get quick info of the property with specified name (identified by propertymetadata annotation
    * sap:quickinfo)
    * @param sPropertyName Property name
    * @returns The quick info string
    */
  def getQuickInfoOfProperty(sPropertyName: String): String
  
  /**
    * Get names of properties that must be filtered, that is they must appearin every $filter expression
    * @returns Array with names of properties that must be         filtered.
    */
  def getRequiredFilterPropertyNames(): js.Array[String]
  
  /**
    * Get names of properties that can be sorted, that is they can be used in$orderby expressions
    * @returns Array with names of properties that can be         sorted.
    */
  def getSortablePropertyNames(): js.Array[String]
  
  /**
    * Get the super-ordinate property related to the property with specifiedname (identified by property
    * metadata annotation sap:super-ordinate)
    * @param sPropertyName Property name
    * @returns The DataJS object representing the super-ordinate         property or null if it does not
    * exist
    */
  def getSuperOrdinatePropertyOfProperty(sPropertyName: String): js.Any
  
  /**
    * Get the text property related to the property with specified name(identified by property metadata
    * annotation sap:text)
    * @param sPropertyName Property name
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextPropertyOfProperty(sPropertyName: String): js.Any
  
  /**
    * Get full description for this entity type
    * @returns The DataJS object representing the entity type
    */
  def getTypeDescription(): js.Any
}
object EntityType {
  
  inline def apply(
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
  
  extension [Self <: EntityType](x: Self) {
    
    inline def setFindPropertyByName(value: String => js.Any): Self = StObject.set(x, "findPropertyByName", js.Any.fromFunction1(value))
    
    inline def setGetAllHierarchyPropertyNames(value: () => js.Array[String]): Self = StObject.set(x, "getAllHierarchyPropertyNames", js.Any.fromFunction0(value))
    
    inline def setGetFilterablePropertyNames(value: () => js.Array[String]): Self = StObject.set(x, "getFilterablePropertyNames", js.Any.fromFunction0(value))
    
    inline def setGetHeadingOfProperty(value: String => String): Self = StObject.set(x, "getHeadingOfProperty", js.Any.fromFunction1(value))
    
    inline def setGetHierarchy(value: String => RecursiveHierarchy): Self = StObject.set(x, "getHierarchy", js.Any.fromFunction1(value))
    
    inline def setGetKeyProperties(value: () => js.Array[String]): Self = StObject.set(x, "getKeyProperties", js.Any.fromFunction0(value))
    
    inline def setGetLabelOfProperty(value: String => String): Self = StObject.set(x, "getLabelOfProperty", js.Any.fromFunction1(value))
    
    inline def setGetProperties(value: () => js.Any): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    inline def setGetPropertiesWithFilterRestrictions(value: () => js.Any): Self = StObject.set(x, "getPropertiesWithFilterRestrictions", js.Any.fromFunction0(value))
    
    inline def setGetQName(value: () => String): Self = StObject.set(x, "getQName", js.Any.fromFunction0(value))
    
    inline def setGetQuickInfoOfProperty(value: String => String): Self = StObject.set(x, "getQuickInfoOfProperty", js.Any.fromFunction1(value))
    
    inline def setGetRequiredFilterPropertyNames(value: () => js.Array[String]): Self = StObject.set(x, "getRequiredFilterPropertyNames", js.Any.fromFunction0(value))
    
    inline def setGetSortablePropertyNames(value: () => js.Array[String]): Self = StObject.set(x, "getSortablePropertyNames", js.Any.fromFunction0(value))
    
    inline def setGetSuperOrdinatePropertyOfProperty(value: String => js.Any): Self = StObject.set(x, "getSuperOrdinatePropertyOfProperty", js.Any.fromFunction1(value))
    
    inline def setGetTextPropertyOfProperty(value: String => js.Any): Self = StObject.set(x, "getTextPropertyOfProperty", js.Any.fromFunction1(value))
    
    inline def setGetTypeDescription(value: () => js.Any): Self = StObject.set(x, "getTypeDescription", js.Any.fromFunction0(value))
  }
}
