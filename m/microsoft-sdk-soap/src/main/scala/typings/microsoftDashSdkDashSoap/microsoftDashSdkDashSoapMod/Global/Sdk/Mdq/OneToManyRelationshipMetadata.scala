package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneToManyRelationshipMetadata extends js.Object {
  var AssociatedMenuConfiguration: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.AssociatedMenuConfiguration
  var CascadeConfiguration: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.CascadeConfiguration
  var HasChanged: js.Any
  var IntroducedVersion: js.Any
  var IsCustomRelationship: scala.Boolean
  var IsCustomizable: ManagedProperty[scala.Boolean]
  var IsHierarchical: js.Any
  var IsManaged: scala.Boolean
  var IsValidForAdvancedFind: scala.Boolean
  var MetadataId: java.lang.String
  var ReferencedAttribute: java.lang.String
  var ReferencedEntity: java.lang.String
  var ReferencingAttribute: java.lang.String
  var ReferencingEntity: java.lang.String
  var RelationshipType: java.lang.String
  var SchemaName: java.lang.String
  var SecurityTypes: js.Any
}

object OneToManyRelationshipMetadata {
  @scala.inline
  def apply(
    AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    CascadeConfiguration: CascadeConfiguration,
    HasChanged: js.Any,
    IntroducedVersion: js.Any,
    IsCustomRelationship: scala.Boolean,
    IsCustomizable: ManagedProperty[scala.Boolean],
    IsHierarchical: js.Any,
    IsManaged: scala.Boolean,
    IsValidForAdvancedFind: scala.Boolean,
    MetadataId: java.lang.String,
    ReferencedAttribute: java.lang.String,
    ReferencedEntity: java.lang.String,
    ReferencingAttribute: java.lang.String,
    ReferencingEntity: java.lang.String,
    RelationshipType: java.lang.String,
    SchemaName: java.lang.String,
    SecurityTypes: js.Any
  ): OneToManyRelationshipMetadata = {
    val __obj = js.Dynamic.literal(AssociatedMenuConfiguration = AssociatedMenuConfiguration, CascadeConfiguration = CascadeConfiguration, HasChanged = HasChanged, IntroducedVersion = IntroducedVersion, IsCustomRelationship = IsCustomRelationship, IsCustomizable = IsCustomizable, IsHierarchical = IsHierarchical, IsManaged = IsManaged, IsValidForAdvancedFind = IsValidForAdvancedFind, MetadataId = MetadataId, ReferencedAttribute = ReferencedAttribute, ReferencedEntity = ReferencedEntity, ReferencingAttribute = ReferencingAttribute, ReferencingEntity = ReferencingEntity, RelationshipType = RelationshipType, SchemaName = SchemaName, SecurityTypes = SecurityTypes)
  
    __obj.asInstanceOf[OneToManyRelationshipMetadata]
  }
}

