package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManyToManyRelationshipMetadata extends StObject {
  
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
  
  var RelationshipType: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.RelationshipType
  
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
  
  @scala.inline
  implicit class ManyToManyRelationshipMetadataMutableBuilder[Self <: ManyToManyRelationshipMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity1AssociatedMenuConfiguration(value: AssociatedMenuConfiguration): Self = StObject.set(x, "Entity1AssociatedMenuConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity1IntersectAttribute(value: String): Self = StObject.set(x, "Entity1IntersectAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity1LogicalName(value: String): Self = StObject.set(x, "Entity1LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity2AssociatedMenuConfiguration(value: AssociatedMenuConfiguration): Self = StObject.set(x, "Entity2AssociatedMenuConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity2IntersectAttribute(value: String): Self = StObject.set(x, "Entity2IntersectAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity2LogicalName(value: String): Self = StObject.set(x, "Entity2LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChanged(value: Boolean): Self = StObject.set(x, "HasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectEntityName(value: String): Self = StObject.set(x, "IntersectEntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroducedVersion(value: js.Any): Self = StObject.set(x, "IntroducedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomRelationship(value: Boolean): Self = StObject.set(x, "IsCustomRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomizable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForAdvancedFind(value: Boolean): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypes(value: SecurityType): Self = StObject.set(x, "SecurityTypes", value.asInstanceOf[js.Any])
  }
}
