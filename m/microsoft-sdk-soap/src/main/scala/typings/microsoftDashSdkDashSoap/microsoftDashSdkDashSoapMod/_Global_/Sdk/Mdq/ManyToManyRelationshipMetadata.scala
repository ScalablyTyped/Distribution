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
    val __obj = js.Dynamic.literal(Entity1AssociatedMenuConfiguration = Entity1AssociatedMenuConfiguration.asInstanceOf[js.Any], Entity1IntersectAttribute = Entity1IntersectAttribute.asInstanceOf[js.Any], Entity1LogicalName = Entity1LogicalName.asInstanceOf[js.Any], Entity2AssociatedMenuConfiguration = Entity2AssociatedMenuConfiguration.asInstanceOf[js.Any], Entity2IntersectAttribute = Entity2IntersectAttribute.asInstanceOf[js.Any], Entity2LogicalName = Entity2LogicalName.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IntersectEntityName = IntersectEntityName.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsCustomRelationship = IsCustomRelationship.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], RelationshipType = RelationshipType.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SecurityTypes = SecurityTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManyToManyRelationshipMetadata]
  }
}

