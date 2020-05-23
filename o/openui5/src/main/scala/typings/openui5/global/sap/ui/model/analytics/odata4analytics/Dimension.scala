package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Dimension")
@js.native
class Dimension protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension {
  /**
    * Create a representation of a dimension provided by an analytic query. Do not create your own
    * instances.
    * @param oQueryResult The query result containing this dimension
    * @param oProperty The DataJS object object representing the dimension
    */
  def this(
    oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
    oProperty: js.Any
  ) = this()
  /**
    * Find attribute by name
    * @param sName Attribute name
    * @returns The dimension attribute         object with this name or null if it does not exist
    */
  /* CompleteClass */
  override def findAttributeByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension = js.native
  /**
    * Get the names of all attributes included in this dimension
    * @returns List of all attribute names
    */
  /* CompleteClass */
  override def getAllAttributeNames(): js.Array[String] = js.native
  /**
    * Get all attributes of this dimension
    * @returns An object with individual JS properties for each         attribute of this dimension. The
    * JS object properties all are         objects of type odata4analytics.DimensionAttribute. The        
    * names of the JS object properties are given by the OData entity         type property names
    * representing the dimension attribute keys.
    */
  /* CompleteClass */
  override def getAllAttributes(): js.Any = js.native
  /**
    * Get query result containing this dimension
    * @returns The query result object
    */
  /* CompleteClass */
  override def getContainingQueryResult(): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
  /**
    * Get associated hierarchy
    * @returns The hierarchy object or null if there is none. It can         be an instance of class      
    *   odata4analytics.RecursiveHierarchy (TODO later: or a         leveled hierarchy). Use methods
    * isLeveledHierarchy and         isRecursiveHierarchy to determine object type.
    */
  /* CompleteClass */
  override def getHierarchy(): js.Any = js.native
  /**
    * Get the key property
    * @returns The DataJS object representing the property for the         dimension key
    */
  /* CompleteClass */
  override def getKeyProperty(): js.Any = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         dimension
    */
  /* CompleteClass */
  override def getLabelText(): String = js.native
  /**
    * Get master data entity set for this dimension
    * @returns The master data entity set        for this dimension, or null, if it does not exist
    */
  /* CompleteClass */
  override def getMasterDataEntitySet(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet = js.native
  /**
    * Get the name of the dimension
    * @returns The name of this dimension, which is identical to the         name of the dimension key
    * property in the entity type
    */
  /* CompleteClass */
  override def getName(): String = js.native
  /**
    * Get super-ordinate dimension
    * @returns The super-ordinate dimension or null if there is none
    */
  /* CompleteClass */
  override def getSuperOrdinateDimension(): js.Any = js.native
  /**
    * Get text property related to this dimension
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  /* CompleteClass */
  override def getTextProperty(): js.Any = js.native
  /**
    * Get indicator whether or not master data is available for this dimension
    * @returns True iff master data is available
    */
  /* CompleteClass */
  override def hasMasterData(): Boolean = js.native
}

