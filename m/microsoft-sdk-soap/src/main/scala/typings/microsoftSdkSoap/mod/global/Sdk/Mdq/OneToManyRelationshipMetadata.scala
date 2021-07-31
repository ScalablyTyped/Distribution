package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneToManyRelationshipMetadata extends StObject {
  
  var AssociatedMenuConfiguration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.AssociatedMenuConfiguration
  
  var CascadeConfiguration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.CascadeConfiguration
  
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
  
  @scala.inline
  implicit class OneToManyRelationshipMetadataMutableBuilder[Self <: OneToManyRelationshipMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedMenuConfiguration(value: AssociatedMenuConfiguration): Self = StObject.set(x, "AssociatedMenuConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeConfiguration(value: CascadeConfiguration): Self = StObject.set(x, "CascadeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChanged(value: js.Any): Self = StObject.set(x, "HasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroducedVersion(value: js.Any): Self = StObject.set(x, "IntroducedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomRelationship(value: Boolean): Self = StObject.set(x, "IsCustomRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomizable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHierarchical(value: js.Any): Self = StObject.set(x, "IsHierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForAdvancedFind(value: Boolean): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedAttribute(value: String): Self = StObject.set(x, "ReferencedAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedEntity(value: String): Self = StObject.set(x, "ReferencedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingAttribute(value: String): Self = StObject.set(x, "ReferencingAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingEntity(value: String): Self = StObject.set(x, "ReferencingEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipType(value: String): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypes(value: js.Any): Self = StObject.set(x, "SecurityTypes", value.asInstanceOf[js.Any])
  }
}
