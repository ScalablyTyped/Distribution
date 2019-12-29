package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResult")
@js.native
class QueryResult protected () extends js.Object {
  /**
    * Create a representation of an analytic query. Do not create your own instances.
    * @param oModel The analytical model containing this query result entity           set
    * @param oEntityType The OData entity type for this query
    * @param oEntitySet The OData entity set for this query offered by the           OData service
    * @param oParameterization The parameterization of this query, if any
    */
  def this(oModel: Model, oEntityType: EntityType, oEntitySet: EntitySet, oParameterization: Parameterization) = this()
  /**
    * Find dimension by name
    * @param sName Dimension name
    * @returns The dimension object with         this name or null if it does not exist
    */
  def findDimensionByName(sName: String): Dimension = js.native
  /**
    * Find dimension by property name
    * @param sName Property name
    * @returns The dimension object to         which the given property name is related, because the
    * property         holds the dimension key, its text, or is an attribute of this         dimension. If
    * no such dimension exists, null is returned.
    */
  def findDimensionByPropertyName(sName: String): Dimension = js.native
  /**
    * Find measure by name
    * @param sName Measure name
    * @returns The measure object with this         name or null if it does not exist
    */
  def findMeasureByName(sName: String): Measure = js.native
  /**
    * Find measure by property name
    * @param sName Property name
    * @returns The measure object to which         the given property name is related, because the
    * property holds         the raw measure value or its formatted value. If no such measure        
    * exists, null is returned.
    */
  def findMeasureByPropertyName(sName: String): Measure = js.native
  /**
    * Get the names of all dimensions included in the query result
    * @returns List of all dimension names
    */
  def getAllDimensionNames(): js.Array[String] = js.native
  /**
    * Get all dimensions included in this query result
    * @returns An object with individual JS properties for each         dimension included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Dimension. The     
    *    names of the JS object properties are given by the OData entity         type property names
    * representing the dimension keys.
    */
  def getAllDimensions(): js.Any = js.native
  /**
    * Get the names of all measures included in the query result
    * @returns List of all measure names
    */
  def getAllMeasureNames(): js.Array[String] = js.native
  /**
    * Get all measures included in this query result
    * @returns An object with individual JS properties for each         measure included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Measure. The       
    *  names of the JS object properties are given by the OData entity         type property names
    * representing the measure raw values.
    */
  def getAllMeasures(): js.Any = js.native
  /**
    * Get the entity set representing this query result in the OData model
    * @returns The OData entity set         representing this query result
    */
  def getEntitySet(): EntitySet = js.native
  /**
    * Get the entity type defining the type of this query result in the ODatamodel
    * @returns The OData entity type for         this query result
    */
  def getEntityType(): EntityType = js.native
  /**
    * Get the analytical model containing the entity set for this query result
    * @returns The analytical representation of the OData model
    */
  def getModel(): js.Any = js.native
  /**
    * Get the name of the query result
    * @returns The fully qualified name of the query result, which is         identical with the name of
    * the entity set representing the query         result in the OData service
    */
  def getName(): String = js.native
  /**
    * Get the parameterization of this query result
    * @returns The object for the         parameterization or null if the query result is not        
    * parameterized
    */
  def getParameterization(): Parameterization = js.native
  /**
    * Get property holding the totaled property list
    * @returns The DataJS object representing this property
    */
  def getTotaledPropertiesListProperty(): js.Any = js.native
}

