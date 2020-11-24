package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneToManyRelationshipMetadata extends js.Object {
  
  var AssociatedMenuConfiguration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.AssociatedMenuConfiguration = js.native
  
  var CascadeConfiguration: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.CascadeConfiguration = js.native
  
  var HasChanged: js.Any = js.native
  
  var IntroducedVersion: js.Any = js.native
  
  var IsCustomRelationship: Boolean = js.native
  
  var IsCustomizable: ManagedProperty[Boolean] = js.native
  
  var IsHierarchical: js.Any = js.native
  
  var IsManaged: Boolean = js.native
  
  var IsValidForAdvancedFind: Boolean = js.native
  
  var MetadataId: String = js.native
  
  var ReferencedAttribute: String = js.native
  
  var ReferencedEntity: String = js.native
  
  var ReferencingAttribute: String = js.native
  
  var ReferencingEntity: String = js.native
  
  var RelationshipType: String = js.native
  
  var SchemaName: String = js.native
  
  var SecurityTypes: js.Any = js.native
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
  implicit class OneToManyRelationshipMetadataOps[Self <: OneToManyRelationshipMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedMenuConfiguration(value: AssociatedMenuConfiguration): Self = this.set("AssociatedMenuConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeConfiguration(value: CascadeConfiguration): Self = this.set("CascadeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChanged(value: js.Any): Self = this.set("HasChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroducedVersion(value: js.Any): Self = this.set("IntroducedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomRelationship(value: Boolean): Self = this.set("IsCustomRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomizable(value: ManagedProperty[Boolean]): Self = this.set("IsCustomizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHierarchical(value: js.Any): Self = this.set("IsHierarchical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForAdvancedFind(value: Boolean): Self = this.set("IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = this.set("MetadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedAttribute(value: String): Self = this.set("ReferencedAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedEntity(value: String): Self = this.set("ReferencedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingAttribute(value: String): Self = this.set("ReferencingAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingEntity(value: String): Self = this.set("ReferencingEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipType(value: String): Self = this.set("RelationshipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityTypes(value: js.Any): Self = this.set("SecurityTypes", value.asInstanceOf[js.Any])
  }
}
