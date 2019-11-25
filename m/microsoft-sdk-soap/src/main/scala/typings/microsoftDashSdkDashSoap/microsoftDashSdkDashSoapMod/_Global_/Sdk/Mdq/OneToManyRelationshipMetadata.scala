package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneToManyRelationshipMetadata extends js.Object {
  var AssociatedMenuConfiguration: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.AssociatedMenuConfiguration
  var CascadeConfiguration: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.CascadeConfiguration
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
    val __obj = js.Dynamic.literal(AssociatedMenuConfiguration = AssociatedMenuConfiguration.asInstanceOf[js.Any], CascadeConfiguration = CascadeConfiguration.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsCustomRelationship = IsCustomRelationship.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsHierarchical = IsHierarchical.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ReferencedAttribute = ReferencedAttribute.asInstanceOf[js.Any], ReferencedEntity = ReferencedEntity.asInstanceOf[js.Any], ReferencingAttribute = ReferencingAttribute.asInstanceOf[js.Any], ReferencingEntity = ReferencingEntity.asInstanceOf[js.Any], RelationshipType = RelationshipType.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SecurityTypes = SecurityTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OneToManyRelationshipMetadata]
  }
}

