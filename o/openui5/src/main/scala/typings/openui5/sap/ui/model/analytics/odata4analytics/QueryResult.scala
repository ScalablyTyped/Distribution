package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
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

object QueryResult {
  @scala.inline
  def apply(
    findDimensionByName: String => Dimension,
    findDimensionByPropertyName: String => Dimension,
    findMeasureByName: String => Measure,
    findMeasureByPropertyName: String => Measure,
    getAllDimensionNames: () => js.Array[String],
    getAllDimensions: () => js.Any,
    getAllMeasureNames: () => js.Array[String],
    getAllMeasures: () => js.Any,
    getEntitySet: () => EntitySet,
    getEntityType: () => EntityType,
    getModel: () => js.Any,
    getName: () => String,
    getParameterization: () => Parameterization,
    getTotaledPropertiesListProperty: () => js.Any
  ): QueryResult = {
    val __obj = js.Dynamic.literal(findDimensionByName = js.Any.fromFunction1(findDimensionByName), findDimensionByPropertyName = js.Any.fromFunction1(findDimensionByPropertyName), findMeasureByName = js.Any.fromFunction1(findMeasureByName), findMeasureByPropertyName = js.Any.fromFunction1(findMeasureByPropertyName), getAllDimensionNames = js.Any.fromFunction0(getAllDimensionNames), getAllDimensions = js.Any.fromFunction0(getAllDimensions), getAllMeasureNames = js.Any.fromFunction0(getAllMeasureNames), getAllMeasures = js.Any.fromFunction0(getAllMeasures), getEntitySet = js.Any.fromFunction0(getEntitySet), getEntityType = js.Any.fromFunction0(getEntityType), getModel = js.Any.fromFunction0(getModel), getName = js.Any.fromFunction0(getName), getParameterization = js.Any.fromFunction0(getParameterization), getTotaledPropertiesListProperty = js.Any.fromFunction0(getTotaledPropertiesListProperty))
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
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
    def setFindDimensionByName(value: String => Dimension): Self = this.set("findDimensionByName", js.Any.fromFunction1(value))
    @scala.inline
    def setFindDimensionByPropertyName(value: String => Dimension): Self = this.set("findDimensionByPropertyName", js.Any.fromFunction1(value))
    @scala.inline
    def setFindMeasureByName(value: String => Measure): Self = this.set("findMeasureByName", js.Any.fromFunction1(value))
    @scala.inline
    def setFindMeasureByPropertyName(value: String => Measure): Self = this.set("findMeasureByPropertyName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllDimensionNames(value: () => js.Array[String]): Self = this.set("getAllDimensionNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllDimensions(value: () => js.Any): Self = this.set("getAllDimensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllMeasureNames(value: () => js.Array[String]): Self = this.set("getAllMeasureNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllMeasures(value: () => js.Any): Self = this.set("getAllMeasures", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntitySet(value: () => EntitySet): Self = this.set("getEntitySet", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEntityType(value: () => EntityType): Self = this.set("getEntityType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetModel(value: () => js.Any): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameterization(value: () => Parameterization): Self = this.set("getParameterization", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTotaledPropertiesListProperty(value: () => js.Any): Self = this.set("getTotaledPropertiesListProperty", js.Any.fromFunction0(value))
  }
  
}

