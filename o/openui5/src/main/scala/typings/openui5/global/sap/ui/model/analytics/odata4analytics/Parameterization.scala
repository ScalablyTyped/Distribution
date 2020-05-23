package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Parameterization")
@js.native
class Parameterization protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization {
  /**
    * Create a representation of a parameterization for an analytic query. Do not create your own
    * instances.
    * @param oEntityType The OData entity type for this parameterization
    * @param oEntitySet The OData entity set for this parameterization offered           by the OData
    * service
    */
  def this(
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
    oEntitySet: typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet
  ) = this()
  /**
    * Find parameter by name
    * @param sName Parameter name
    * @returns The parameter object with         this name or null if it does not exist
    */
  /* CompleteClass */
  override def findParameterByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter = js.native
  /**
    * Get the names of all parameters part of the parameterization
    * @returns List of all parameter names
    */
  /* CompleteClass */
  override def getAllParameterNames(): js.Array[String] = js.native
  /**
    * Get all parameters included in this parameterization
    * @returns An object with individual JS properties for each         parameter included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Parameter. The     
    *    names of the JS object properties are given by the OData entity         type property names
    * representing the parameter keys.
    */
  /* CompleteClass */
  override def getAllParameters(): js.Any = js.native
  /**
    * Get the entity set representing this query result in the OData model
    * @returns The OData entity set         representing this query result
    */
  /* CompleteClass */
  override def getEntitySet(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet = js.native
  /**
    * Get the entity type defining the type of this query result in the ODatamodel
    * @returns The OData entity type for         this query result
    */
  /* CompleteClass */
  override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
  /**
    * Get the name of the parameter
    * @returns The name of the parameterization, which is identical         with the name of the entity
    * set representing the         parameterization in the OData service
    */
  /* CompleteClass */
  override def getName(): String = js.native
  /**
    * Get navigation property to query result
    * @returns The parameter object with         this name or null if it does not exist
    */
  /* CompleteClass */
  override def getNavigationPropertyToQueryResult(): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
}

