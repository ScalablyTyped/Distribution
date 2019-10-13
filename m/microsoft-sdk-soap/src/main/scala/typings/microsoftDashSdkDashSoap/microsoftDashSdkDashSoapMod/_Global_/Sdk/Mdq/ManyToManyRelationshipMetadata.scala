package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManyToManyRelationshipMetadata extends js.Object {
  var Entity1AssociatedMenuConfiguration: AssociatedMenuConfiguration
  var Entity1IntersectAttribute: java.lang.String
  var Entity1LogicalName: java.lang.String
  var Entity2AssociatedMenuConfiguration: AssociatedMenuConfiguration
  var Entity2IntersectAttribute: java.lang.String
  var Entity2LogicalName: java.lang.String
  var HasChanged: scala.Boolean
  var IntersectEntityName: java.lang.String
  var IntroducedVersion: js.Any
  var IsCustomRelationship: scala.Boolean
  var IsCustomizable: ManagedProperty[scala.Boolean]
  var IsManaged: scala.Boolean
  var IsValidForAdvancedFind: scala.Boolean
  var MetadataId: java.lang.String
  var RelationshipType: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.RelationshipType
  var SchemaName: java.lang.String
  var SecurityTypes: SecurityType
}

object ManyToManyRelationshipMetadata {
  @scala.inline
  def apply(
    Entity1AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    Entity1IntersectAttribute: java.lang.String,
    Entity1LogicalName: java.lang.String,
    Entity2AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    Entity2IntersectAttribute: java.lang.String,
    Entity2LogicalName: java.lang.String,
    HasChanged: scala.Boolean,
    IntersectEntityName: java.lang.String,
    IntroducedVersion: js.Any,
    IsCustomRelationship: scala.Boolean,
    IsCustomizable: ManagedProperty[scala.Boolean],
    IsManaged: scala.Boolean,
    IsValidForAdvancedFind: scala.Boolean,
    MetadataId: java.lang.String,
    RelationshipType: RelationshipType,
    SchemaName: java.lang.String,
    SecurityTypes: SecurityType
  ): ManyToManyRelationshipMetadata = {
    val __obj = js.Dynamic.literal(Entity1AssociatedMenuConfiguration = Entity1AssociatedMenuConfiguration, Entity1IntersectAttribute = Entity1IntersectAttribute, Entity1LogicalName = Entity1LogicalName, Entity2AssociatedMenuConfiguration = Entity2AssociatedMenuConfiguration, Entity2IntersectAttribute = Entity2IntersectAttribute, Entity2LogicalName = Entity2LogicalName, HasChanged = HasChanged, IntersectEntityName = IntersectEntityName, IntroducedVersion = IntroducedVersion, IsCustomRelationship = IsCustomRelationship, IsCustomizable = IsCustomizable, IsManaged = IsManaged, IsValidForAdvancedFind = IsValidForAdvancedFind, MetadataId = MetadataId, RelationshipType = RelationshipType, SchemaName = SchemaName, SecurityTypes = SecurityTypes)
  
    __obj.asInstanceOf[ManyToManyRelationshipMetadata]
  }
}

