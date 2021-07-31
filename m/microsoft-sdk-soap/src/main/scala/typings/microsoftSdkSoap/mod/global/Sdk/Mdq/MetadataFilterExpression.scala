package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sdk.Mdq.MetadataFilterExpression")
@js.native
class MetadataFilterExpression protected () extends StObject {
  def this(filterOperator: LogicalOperator) = this()
  
  def addCondition(propertyName: SearchableAttributeMetadataProperties, conditionOperator: MetadataConditionOperator): Unit = js.native
  def addCondition(
    propertyName: SearchableAttributeMetadataProperties,
    conditionOperator: MetadataConditionOperator,
    value: js.Any
  ): Unit = js.native
  def addCondition(
    propertyName: SearchableAttributeMetadataProperties,
    conditionOperator: MetadataConditionOperator,
    value: js.Object
  ): Unit = js.native
  /**
    * Adds a condition. This method accepts either the properties to create a new Sdk.Mdq.MetadataConditionExpression or a Sdk.Mdq.MetadataConditionExpression as the first argument.
    * @param propertyName The metadata property to evaluate.
    * @param conditionOperator The condition operator.
    * @param value The metadata value to evaluate.
    */
  def addCondition(
    propertyName: SearchableEntityMetadataProperties,
    conditionOperator: MetadataConditionOperator,
    value: js.Object
  ): Unit = js.native
  def addCondition(
    propertyName: SearchableRelationshipMetadataProperties,
    conditionOperator: MetadataConditionOperator,
    value: js.Object
  ): Unit = js.native
}
