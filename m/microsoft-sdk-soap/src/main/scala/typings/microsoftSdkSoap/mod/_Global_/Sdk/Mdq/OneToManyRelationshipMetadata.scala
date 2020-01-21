package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneToManyRelationshipMetadata extends js.Object {
  var AssociatedMenuConfiguration: typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq.AssociatedMenuConfiguration
  var CascadeConfiguration: typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq.CascadeConfiguration
  var HasChanged: js.Any
  var IntroducedVersion: js.Any
  var IsCustomRelationship: Boolean
  var IsCustomizable: ManagedProperty[Boolean]
  var IsHierarchical: js.Any
  var IsManaged: Boolean
  var IsValidForAdvancedFind: Boolean
  var MetadataId: String
  var ReferencedAttribute: String
  var ReferencedEntity: String
  var ReferencingAttribute: String
  var ReferencingEntity: String
  var RelationshipType: String
  var SchemaName: String
  var SecurityTypes: js.Any
}

object OneToManyRelationshipMetadata {
  @scala.inline
  def apply(
    AssociatedMenuConfiguration: AssociatedMenuConfiguration,
    CascadeConfiguration: CascadeConfiguration,
    HasChanged: js.Any,
    IntroducedVersion: js.Any,
    IsCustomRelationship: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsHierarchical: js.Any,
    IsManaged: Boolean,
    IsValidForAdvancedFind: Boolean,
    MetadataId: String,
    ReferencedAttribute: String,
    ReferencedEntity: String,
    ReferencingAttribute: String,
    ReferencingEntity: String,
    RelationshipType: String,
    SchemaName: String,
    SecurityTypes: js.Any
  ): OneToManyRelationshipMetadata = {
    val __obj = js.Dynamic.literal(AssociatedMenuConfiguration = AssociatedMenuConfiguration.asInstanceOf[js.Any], CascadeConfiguration = CascadeConfiguration.asInstanceOf[js.Any], HasChanged = HasChanged.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsCustomRelationship = IsCustomRelationship.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsHierarchical = IsHierarchical.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ReferencedAttribute = ReferencedAttribute.asInstanceOf[js.Any], ReferencedEntity = ReferencedEntity.asInstanceOf[js.Any], ReferencingAttribute = ReferencingAttribute.asInstanceOf[js.Any], ReferencingEntity = ReferencingEntity.asInstanceOf[js.Any], RelationshipType = RelationshipType.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SecurityTypes = SecurityTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OneToManyRelationshipMetadata]
  }
}

