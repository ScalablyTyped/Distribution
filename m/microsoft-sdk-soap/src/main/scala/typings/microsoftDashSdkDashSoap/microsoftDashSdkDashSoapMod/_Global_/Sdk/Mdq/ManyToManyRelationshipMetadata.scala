package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManyToManyRelationshipMetadata extends js.Object {
  var Entity1AssociatedMenuConfiguration: AssociatedMenuConfiguration
  var Entity1IntersectAttribute: String
  var Entity1LogicalName: String
  var Entity2AssociatedMenuConfiguration: AssociatedMenuConfiguration
  var Entity2IntersectAttribute: String
  var Entity2LogicalName: String
  var HasChanged: Boolean
  var IntersectEntityName: String
  var IntroducedVersion: js.Any
  var IsCustomRelationship: Boolean
  var IsCustomizable: ManagedProperty[Boolean]
  var IsManaged: Boolean
  var IsValidForAdvancedFind: Boolean
  var MetadataId: String
  var RelationshipType: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.RelationshipType
  var SchemaName: String
  var SecurityTypes: SecurityType
}

object ManyToManyRelationshipMetadata {
  @scala.inline
  def apply(
    Entity1AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    Entity1IntersectAttribute: String,
    Entity1LogicalName: String,
    Entity2AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    Entity2IntersectAttribute: String,
    Entity2LogicalName: String,
    HasChanged: Boolean,
    IntersectEntityName: String,
    IntroducedVersion: js.Any,
    IsCustomRelationship: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsManaged: Boolean,
    IsValidForAdvancedFind: Boolean,
    MetadataId: String,
    RelationshipType: RelationshipType,
    SchemaName: String,
    SecurityTypes: SecurityType
  ): ManyToManyRelationshipMetadata = {
    val __obj = js.Dynamic.literal(Entity1AssociatedMenuConfiguration = Entity1AssociatedMenuConfiguration.asInstanceOf[js.Any], Entity1IntersectAttribute = Entity1IntersectAttribute.asInstanceOf[js.Any], Entity1LogicalName = Entity1LogicalName.asInstanceOf[js.Any], Entity2AssociatedMenuConfiguration = Entity2AssociatedMenuConfiguration.asInstanceOf[js.Any], Entity2IntersectAttribute = Entity2IntersectAttribute.asInstanceOf[js.Any], Entity2LogicalName = Entity2LogicalName.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IntersectEntityName = IntersectEntityName.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsCustomRelationship = IsCustomRelationship.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], RelationshipType = RelationshipType.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SecurityTypes = SecurityTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManyToManyRelationshipMetadata]
  }
}

