package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Query

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Collection
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.ColumnSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Sdk.Query.LinkEntity")
@js.native
class LinkEntity protected () extends js.Object {
  /**
    * Initializes a new instance of the Sdk.Query.LinkEntity class setting the required properties.
    * @param linkFromEntityName The logical name of the entity to link from.
    * @param linkToEntityName The logical name of the entity to link to.
    * @param linkFromAttributeName The name of the attribute to link from.
    * @param linkToAttributeName The name of the attribute to link to.
    * @param joinOperator The join operator.
    * @param entityAlias The string representing an alias for the linkToEntityName.
    */
  def this(
    linkFromEntityName: java.lang.String,
    linkToEntityName: java.lang.String,
    linkFromAttributeName: java.lang.String,
    linkToAttributeName: java.lang.String,
    joinOperator: JoinOperator,
    entityAlias: java.lang.String
  ) = this()
  /**
    * Adds a linked entity.
    * @param linkEntity An Sdk.Query.LinkEntity to add.
    */
  def addLink(linkEntity: LinkEntity): Unit = js.native
  /**
    * Gets the column set.
    */
  def getColumns(): ColumnSet = js.native
  /**
    * Gets the alias for the entity.
    */
  def getEntityAlias(): java.lang.String = js.native
  /**
    * Gets the join operator.
    */
  def getJoinOperator(): JoinOperator = js.native
  /**
    * Gets the complex condition and logical filter expressions that filter the results of the query.
    */
  def getLinkCriteria(): FilterExpression = js.native
  /**
    * Gets the collection of Sdk.Query.LinkEntity that define links between multiple entity types.
    */
  def getLinkEntities(): Collection[LinkEntity] = js.native
  /**
    * Gets the logical name of the attribute of the entity that you are linking from.
    */
  def getLinkFromAttributeName(): java.lang.String = js.native
  /**
    * Gets the logical name of the entity that you are linking from.
    */
  def getLinkFromEntityName(): java.lang.String = js.native
  /**
    * Gets the logical name of the attribute of the entity that you are linking to
    */
  def getLinkToAttributeName(): java.lang.String = js.native
  /**
    * Gets the logical name of the entity that you are linking to.
    */
  def getLinkToEntityName(): java.lang.String = js.native
  /**
    * Sets the columns to include.
    * @param columns Pass each attribute logical name as an argument.
    */
  def setColumns(columns: java.lang.String*): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An Array of attribute logical names for the columns to return.
    */
  def setColumns(columns: js.Array[java.lang.String]): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An Sdk.ColumnSet instance.
    */
  def setColumns(columns: ColumnSet): Unit = js.native
  /**
    * Sets the alias for the entity.
    * @param alias The alias for the entity.
    */
  def setEntityAlias(alias: java.lang.String): Unit = js.native
  /**
    * Sets the join operator.
    * @param operator The join operator.
    */
  def setJoinOperator(operator: JoinOperator): Unit = js.native
  /**
    * Sets the complex condition and logical filter expressions that filter the results of the query.
    * @param criteria The complex condition and logical filter expressions that filter the results of the query.
    */
  def setLinkCriteria(criteria: FilterExpression): Unit = js.native
  /**
    * Sets the logical name of the attribute of the entity that you are linking from.
    * @param name The logical name of the attribute of the entity that you are linking from.
    */
  def setLinkFromAttributeName(name: java.lang.String): Unit = js.native
  /**
    * Sets the logical name of the entity that you are linking from.
    * @param name The logical name of the entity that you are linking from.
    */
  def setLinkFromEntityName(name: java.lang.String): Unit = js.native
  /**
    * Sets the logical name of the attribute of the entity that you are linking to.
    * @param name The logical name of the attribute of the entity that you are linking to.
    */
  def setLinkToAttributeName(name: java.lang.String): Unit = js.native
  /**
    * Sets the logical name of the entity that you are linking to.
    * @param name The logical name of the entity that you are linking to.
    */
  def setLinkToEntityName(name: java.lang.String): Unit = js.native
  /**
    * Gets the serialized link entity values.
    */
  def toValueXml(): java.lang.String = js.native
  /**
    * Gets the serialized link entity.
    */
  def toXml(): java.lang.String = js.native
}

