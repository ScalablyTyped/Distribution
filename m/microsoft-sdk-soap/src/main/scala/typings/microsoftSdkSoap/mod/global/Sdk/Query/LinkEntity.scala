package typings.microsoftSdkSoap.mod.global.Sdk.Query

import typings.microsoftSdkSoap.mod.global.Sdk.Collection
import typings.microsoftSdkSoap.mod.global.Sdk.ColumnSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Query.LinkEntity")
@js.native
class LinkEntity protected () extends StObject {
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
    linkFromEntityName: String,
    linkToEntityName: String,
    linkFromAttributeName: String,
    linkToAttributeName: String,
    joinOperator: JoinOperator,
    entityAlias: String
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
  def getEntityAlias(): String = js.native
  
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
  def getLinkFromAttributeName(): String = js.native
  
  /**
    * Gets the logical name of the entity that you are linking from.
    */
  def getLinkFromEntityName(): String = js.native
  
  /**
    * Gets the logical name of the attribute of the entity that you are linking to
    */
  def getLinkToAttributeName(): String = js.native
  
  /**
    * Gets the logical name of the entity that you are linking to.
    */
  def getLinkToEntityName(): String = js.native
  
  /**
    * Sets the columns to include.
    * @param columns Pass each attribute logical name as an argument.
    */
  def setColumns(columns: String*): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An Array of attribute logical names for the columns to return.
    */
  def setColumns(columns: js.Array[String]): Unit = js.native
  /**
    * Sets the columns to include.
    * @param columns An Sdk.ColumnSet instance.
    */
  def setColumns(columns: ColumnSet): Unit = js.native
  
  /**
    * Sets the alias for the entity.
    * @param alias The alias for the entity.
    */
  def setEntityAlias(alias: String): Unit = js.native
  
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
  def setLinkFromAttributeName(name: String): Unit = js.native
  
  /**
    * Sets the logical name of the entity that you are linking from.
    * @param name The logical name of the entity that you are linking from.
    */
  def setLinkFromEntityName(name: String): Unit = js.native
  
  /**
    * Sets the logical name of the attribute of the entity that you are linking to.
    * @param name The logical name of the attribute of the entity that you are linking to.
    */
  def setLinkToAttributeName(name: String): Unit = js.native
  
  /**
    * Sets the logical name of the entity that you are linking to.
    * @param name The logical name of the entity that you are linking to.
    */
  def setLinkToEntityName(name: String): Unit = js.native
  
  /**
    * Gets the serialized link entity values.
    */
  def toValueXml(): String = js.native
  
  /**
    * Gets the serialized link entity.
    */
  def toXml(): String = js.native
}
