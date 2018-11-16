package typings
package openui5Lib.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.EntityType")
@js.native
class EntityType protected () extends js.Object {
  /**
               * Create a representation of an OData entity type in the context of an analyticquery. Do not create
               * your own instances.
               * @param oModel DataJS object for the OData model containing this entity           type
               * @param oSchema DataJS object for the schema containing this entity type
               * @param oEntityType DataJS object for the entity type
              */
  def this(oModel: js.Any, oSchema: js.Any, oEntityType: js.Any) = this()
  /**
               * Find property by name
               * @param sPropertyName Property name
               * @returns The DataJS object representing the property or null if         it does not exist
              */
  def findPropertyByName(sPropertyName: java.lang.String): js.Any = js.native
  /**
               * Get the names of all properties with an associated hierarchy
               * @returns List of all property names
              */
  def getAllHierarchyPropertyNames(): js.Array[java.lang.String] = js.native
  /**
               * Get names of properties that can be filtered, that is they can be used in$filter expressions
               * @returns Array with names of properties that can be         filtered.
              */
  def getFilterablePropertyNames(): js.Array[java.lang.String] = js.native
  /**
               * Get heading of the property with specified name (identified by propertymetadata annotation
               * sap:heading)
               * @param sPropertyName Property name
               * @returns The heading string
              */
  def getHeadingOfProperty(sPropertyName: java.lang.String): java.lang.String = js.native
  /**
               * Get the hierarchy associated to a given property Based on the currentspecification, hierarchies are
               * always recursive. TODO: Extend behaviorwhen leveled hierarchies get in scope
               * @param sName Parameter name
               * @returns The hierarchy         object or null if it does not exist
              */
  def getHierarchy(sName: java.lang.String): RecursiveHierarchy = js.native
  /**
               * Get key properties of this type
               * @returns The list of key property names
              */
  def getKeyProperties(): js.Array[java.lang.String] = js.native
  /**
               * Get label of the property with specified name (identified by propertymetadata annotation sap:label)
               * @param sPropertyName Property name
               * @returns The label string
              */
  def getLabelOfProperty(sPropertyName: java.lang.String): java.lang.String = js.native
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
  def getQName(): java.lang.String = js.native
  /**
               * Get quick info of the property with specified name (identified by propertymetadata annotation
               * sap:quickinfo)
               * @param sPropertyName Property name
               * @returns The quick info string
              */
  def getQuickInfoOfProperty(sPropertyName: java.lang.String): java.lang.String = js.native
  /**
               * Get names of properties that must be filtered, that is they must appearin every $filter expression
               * @returns Array with names of properties that must be         filtered.
              */
  def getRequiredFilterPropertyNames(): js.Array[java.lang.String] = js.native
  /**
               * Get names of properties that can be sorted, that is they can be used in$orderby expressions
               * @returns Array with names of properties that can be         sorted.
              */
  def getSortablePropertyNames(): js.Array[java.lang.String] = js.native
  /**
               * Get the super-ordinate property related to the property with specifiedname (identified by property
               * metadata annotation sap:super-ordinate)
               * @param sPropertyName Property name
               * @returns The DataJS object representing the super-ordinate         property or null if it does not
               * exist
              */
  def getSuperOrdinatePropertyOfProperty(sPropertyName: java.lang.String): js.Any = js.native
  /**
               * Get the text property related to the property with specified name(identified by property metadata
               * annotation sap:text)
               * @param sPropertyName Property name
               * @returns The DataJS object representing the text property or         null if it does not exist
              */
  def getTextPropertyOfProperty(sPropertyName: java.lang.String): js.Any = js.native
  /**
               * Get full description for this entity type
               * @returns The DataJS object representing the entity type
              */
  def getTypeDescription(): js.Any = js.native
}

