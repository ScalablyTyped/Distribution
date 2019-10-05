package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Parameterization")
@js.native
class Parameterization protected () extends js.Object {
  /**
    * Create a representation of a parameterization for an analytic query. Do not create your own
    * instances.
    * @param oEntityType The OData entity type for this parameterization
    * @param oEntitySet The OData entity set for this parameterization offered           by the OData
    * service
    */
  def this(oEntityType: EntityType, oEntitySet: EntitySet) = this()
  /**
    * Find parameter by name
    * @param sName Parameter name
    * @returns The parameter object with         this name or null if it does not exist
    */
  def findParameterByName(sName: String): Parameter = js.native
  /**
    * Get the names of all parameters part of the parameterization
    * @returns List of all parameter names
    */
  def getAllParameterNames(): js.Array[String] = js.native
  /**
    * Get all parameters included in this parameterization
    * @returns An object with individual JS properties for each         parameter included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Parameter. The     
    *    names of the JS object properties are given by the OData entity         type property names
    * representing the parameter keys.
    */
  def getAllParameters(): js.Any = js.native
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
    * Get the name of the parameter
    * @returns The name of the parameterization, which is identical         with the name of the entity
    * set representing the         parameterization in the OData service
    */
  def getName(): String = js.native
  /**
    * Get navigation property to query result
    * @returns The parameter object with         this name or null if it does not exist
    */
  def getNavigationPropertyToQueryResult(): QueryResult = js.native
}

