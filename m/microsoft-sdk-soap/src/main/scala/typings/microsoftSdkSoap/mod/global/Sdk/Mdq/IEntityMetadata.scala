package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessOwned
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessParented
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.`None    OrganizationOwned`
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.`TeamOwned    UserOwned`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntityMetadata extends StObject {
  
  var ActivityTypeMask: Double = js.native
  
  var Attributes: js.Array[IAttributeMetadata] = js.native
  
  var AutoCreateAccessTeams: js.Any = js.native
  
  var AutoRouteToOwnerQueue: Boolean = js.native
  
  var CanBeInManyToMany: ManagedProperty[Boolean] = js.native
  
  var CanBePrimaryEntityInRelationship: ManagedProperty[Boolean] = js.native
  
  var CanBeRelatedEntityInRelationship: ManagedProperty[Boolean] = js.native
  
  var CanCreateAttributes: ManagedProperty[Boolean] = js.native
  
  var CanCreateCharts: ManagedProperty[Boolean] = js.native
  
  var CanCreateForms: ManagedProperty[Boolean] = js.native
  
  var CanCreateViews: ManagedProperty[Boolean] = js.native
  
  var CanModifyAdditionalSettings: ManagedProperty[Boolean] = js.native
  
  var CanTriggerWorkflow: Boolean = js.native
  
  var Description: Label = js.native
  
  var DisplayCollectionName: Label = js.native
  
  var DisplayName: Label = js.native
  
  var IconLargeName: String = js.native
  
  var IconMediumName: String = js.native
  
  var IconSmallName: String = js.native
  
  var IntroducedVersion: js.Any = js.native
  
  var IsAIRUpdated: Boolean = js.native
  
  var IsActivity: Boolean = js.native
  
  var IsActivityParty: Boolean = js.native
  
  var IsAuditEnabled: ManagedProperty[Boolean] = js.native
  
  var IsAvailableOffline: Boolean = js.native
  
  var IsBusinessProcessEnabled: Boolean = js.native
  
  var IsChildEntity: Boolean = js.native
  
  var IsConnectionsEnabled: ManagedProperty[Boolean] = js.native
  
  var IsCustomEntity: Boolean = js.native
  
  var IsCustomizable: ManagedProperty[Boolean] = js.native
  
  var IsDocumentManagementEnabled: Boolean = js.native
  
  var IsDuplicateDetectionEnabled: ManagedProperty[Boolean] = js.native
  
  var IsEnabledForCharts: Boolean = js.native
  
  var IsImportable: Boolean = js.native
  
  var IsIntersect: Boolean = js.native
  
  var IsMailMergeEnabled: ManagedProperty[Boolean] = js.native
  
  var IsManaged: Boolean = js.native
  
  var IsMappable: ManagedProperty[Boolean] = js.native
  
  var IsQuickCreateEnabled: Boolean = js.native
  
  var IsReadingPaneEnabled: Boolean = js.native
  
  var IsRenameable: Boolean = js.native
  
  var IsValidForAdvancedFind: Boolean = js.native
  
  var IsValidForQueue: ManagedProperty[Boolean] = js.native
  
  var IsVisibleInMobile: ManagedProperty[Boolean] = js.native
  
  var IsVisibleInMobileClient: Boolean = js.native
  
  var LogicalName: String = js.native
  
  var ManyToManyRelationships: ManyToManyRelationshipMetadata = js.native
  
  var ManyToOneRelationships: OneToManyRelationshipMetadata = js.native
  
  var MetadataId: String = js.native
  
  var ObjectTypeCode: Double = js.native
  
  var OneToManyRelationships: OneToManyRelationshipMetadata = js.native
  
  var OwnershipType: BusinessOwned | BusinessParented | (`None    OrganizationOwned`) | (`TeamOwned    UserOwned`) = js.native
  
  var PrimaryIdAttribute: String = js.native
  
  var PrimaryImageAttribute: String = js.native
  
  var PrimaryNameAttribute: String = js.native
  
  var Privileges: js.Array[SecurityPrivilegeMetadata] = js.native
  
  var RecurrenceBaseEntityLogicalName: String = js.native
  
  var ReportViewName: String = js.native
  
  var SchemaName: String = js.native
}
object IEntityMetadata {
  
  @scala.inline
  def apply(
    ActivityTypeMask: Double,
    Attributes: js.Array[IAttributeMetadata],
    AutoCreateAccessTeams: js.Any,
    AutoRouteToOwnerQueue: Boolean,
    CanBeInManyToMany: ManagedProperty[Boolean],
    CanBePrimaryEntityInRelationship: ManagedProperty[Boolean],
    CanBeRelatedEntityInRelationship: ManagedProperty[Boolean],
    CanCreateAttributes: ManagedProperty[Boolean],
    CanCreateCharts: ManagedProperty[Boolean],
    CanCreateForms: ManagedProperty[Boolean],
    CanCreateViews: ManagedProperty[Boolean],
    CanModifyAdditionalSettings: ManagedProperty[Boolean],
    CanTriggerWorkflow: Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    IconLargeName: String,
    IconMediumName: String,
    IconSmallName: String,
    IntroducedVersion: js.Any,
    IsAIRUpdated: Boolean,
    IsActivity: Boolean,
    IsActivityParty: Boolean,
    IsAuditEnabled: ManagedProperty[Boolean],
    IsAvailableOffline: Boolean,
    IsBusinessProcessEnabled: Boolean,
    IsChildEntity: Boolean,
    IsConnectionsEnabled: ManagedProperty[Boolean],
    IsCustomEntity: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsDocumentManagementEnabled: Boolean,
    IsDuplicateDetectionEnabled: ManagedProperty[Boolean],
    IsEnabledForCharts: Boolean,
    IsImportable: Boolean,
    IsIntersect: Boolean,
    IsMailMergeEnabled: ManagedProperty[Boolean],
    IsManaged: Boolean,
    IsMappable: ManagedProperty[Boolean],
    IsQuickCreateEnabled: Boolean,
    IsReadingPaneEnabled: Boolean,
    IsRenameable: Boolean,
    IsValidForAdvancedFind: Boolean,
    IsValidForQueue: ManagedProperty[Boolean],
    IsVisibleInMobile: ManagedProperty[Boolean],
    IsVisibleInMobileClient: Boolean,
    LogicalName: String,
    ManyToManyRelationships: ManyToManyRelationshipMetadata,
    ManyToOneRelationships: OneToManyRelationshipMetadata,
    MetadataId: String,
    ObjectTypeCode: Double,
    OneToManyRelationships: OneToManyRelationshipMetadata,
    OwnershipType: BusinessOwned | BusinessParented | (`None    OrganizationOwned`) | (`TeamOwned    UserOwned`),
    PrimaryIdAttribute: String,
    PrimaryImageAttribute: String,
    PrimaryNameAttribute: String,
    Privileges: js.Array[SecurityPrivilegeMetadata],
    RecurrenceBaseEntityLogicalName: String,
    ReportViewName: String,
    SchemaName: String
  ): IEntityMetadata = {
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], AutoCreateAccessTeams = AutoCreateAccessTeams.asInstanceOf[js.Any], AutoRouteToOwnerQueue = AutoRouteToOwnerQueue.asInstanceOf[js.Any], CanBeInManyToMany = CanBeInManyToMany.asInstanceOf[js.Any], CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship.asInstanceOf[js.Any], CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship.asInstanceOf[js.Any], CanCreateAttributes = CanCreateAttributes.asInstanceOf[js.Any], CanCreateCharts = CanCreateCharts.asInstanceOf[js.Any], CanCreateForms = CanCreateForms.asInstanceOf[js.Any], CanCreateViews = CanCreateViews.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], CanTriggerWorkflow = CanTriggerWorkflow.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayCollectionName = DisplayCollectionName.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IconLargeName = IconLargeName.asInstanceOf[js.Any], IconMediumName = IconMediumName.asInstanceOf[js.Any], IconSmallName = IconSmallName.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsAIRUpdated = IsAIRUpdated.asInstanceOf[js.Any], IsActivity = IsActivity.asInstanceOf[js.Any], IsActivityParty = IsActivityParty.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsAvailableOffline = IsAvailableOffline.asInstanceOf[js.Any], IsBusinessProcessEnabled = IsBusinessProcessEnabled.asInstanceOf[js.Any], IsChildEntity = IsChildEntity.asInstanceOf[js.Any], IsConnectionsEnabled = IsConnectionsEnabled.asInstanceOf[js.Any], IsCustomEntity = IsCustomEntity.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsDocumentManagementEnabled = IsDocumentManagementEnabled.asInstanceOf[js.Any], IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled.asInstanceOf[js.Any], IsEnabledForCharts = IsEnabledForCharts.asInstanceOf[js.Any], IsImportable = IsImportable.asInstanceOf[js.Any], IsIntersect = IsIntersect.asInstanceOf[js.Any], IsMailMergeEnabled = IsMailMergeEnabled.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsMappable = IsMappable.asInstanceOf[js.Any], IsQuickCreateEnabled = IsQuickCreateEnabled.asInstanceOf[js.Any], IsReadingPaneEnabled = IsReadingPaneEnabled.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForQueue = IsValidForQueue.asInstanceOf[js.Any], IsVisibleInMobile = IsVisibleInMobile.asInstanceOf[js.Any], IsVisibleInMobileClient = IsVisibleInMobileClient.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], ManyToManyRelationships = ManyToManyRelationships.asInstanceOf[js.Any], ManyToOneRelationships = ManyToOneRelationships.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ObjectTypeCode = ObjectTypeCode.asInstanceOf[js.Any], OneToManyRelationships = OneToManyRelationships.asInstanceOf[js.Any], OwnershipType = OwnershipType.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute.asInstanceOf[js.Any], PrimaryImageAttribute = PrimaryImageAttribute.asInstanceOf[js.Any], PrimaryNameAttribute = PrimaryNameAttribute.asInstanceOf[js.Any], Privileges = Privileges.asInstanceOf[js.Any], RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName.asInstanceOf[js.Any], ReportViewName = ReportViewName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityMetadata]
  }
  
  @scala.inline
  implicit class IEntityMetadataMutableBuilder[Self <: IEntityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTypeMask(value: Double): Self = StObject.set(x, "ActivityTypeMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Array[IAttributeMetadata]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: IAttributeMetadata*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAutoCreateAccessTeams(value: js.Any): Self = StObject.set(x, "AutoCreateAccessTeams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRouteToOwnerQueue(value: Boolean): Self = StObject.set(x, "AutoRouteToOwnerQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeInManyToMany(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanBeInManyToMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBePrimaryEntityInRelationship(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanBePrimaryEntityInRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeRelatedEntityInRelationship(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanBeRelatedEntityInRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateAttributes(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanCreateAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateCharts(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanCreateCharts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateForms(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanCreateForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateViews(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanCreateViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanModifyAdditionalSettings(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanModifyAdditionalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTriggerWorkflow(value: Boolean): Self = StObject.set(x, "CanTriggerWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Label): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayCollectionName(value: Label): Self = StObject.set(x, "DisplayCollectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: Label): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLargeName(value: String): Self = StObject.set(x, "IconLargeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconMediumName(value: String): Self = StObject.set(x, "IconMediumName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSmallName(value: String): Self = StObject.set(x, "IconSmallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntroducedVersion(value: js.Any): Self = StObject.set(x, "IntroducedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAIRUpdated(value: Boolean): Self = StObject.set(x, "IsAIRUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActivity(value: Boolean): Self = StObject.set(x, "IsActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActivityParty(value: Boolean): Self = StObject.set(x, "IsActivityParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuditEnabled(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsAuditEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailableOffline(value: Boolean): Self = StObject.set(x, "IsAvailableOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBusinessProcessEnabled(value: Boolean): Self = StObject.set(x, "IsBusinessProcessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChildEntity(value: Boolean): Self = StObject.set(x, "IsChildEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnectionsEnabled(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsConnectionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomEntity(value: Boolean): Self = StObject.set(x, "IsCustomEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomizable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDocumentManagementEnabled(value: Boolean): Self = StObject.set(x, "IsDocumentManagementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDuplicateDetectionEnabled(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsDuplicateDetectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledForCharts(value: Boolean): Self = StObject.set(x, "IsEnabledForCharts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImportable(value: Boolean): Self = StObject.set(x, "IsImportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntersect(value: Boolean): Self = StObject.set(x, "IsIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMailMergeEnabled(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsMailMergeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMappable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsMappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsQuickCreateEnabled(value: Boolean): Self = StObject.set(x, "IsQuickCreateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadingPaneEnabled(value: Boolean): Self = StObject.set(x, "IsReadingPaneEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRenameable(value: Boolean): Self = StObject.set(x, "IsRenameable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForAdvancedFind(value: Boolean): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidForQueue(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsValidForQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleInMobile(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsVisibleInMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleInMobileClient(value: Boolean): Self = StObject.set(x, "IsVisibleInMobileClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManyToManyRelationships(value: ManyToManyRelationshipMetadata): Self = StObject.set(x, "ManyToManyRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManyToOneRelationships(value: OneToManyRelationshipMetadata): Self = StObject.set(x, "ManyToOneRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeCode(value: Double): Self = StObject.set(x, "ObjectTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneToManyRelationships(value: OneToManyRelationshipMetadata): Self = StObject.set(x, "OneToManyRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnershipType(
      value: BusinessOwned | BusinessParented | (`None    OrganizationOwned`) | (`TeamOwned    UserOwned`)
    ): Self = StObject.set(x, "OwnershipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryIdAttribute(value: String): Self = StObject.set(x, "PrimaryIdAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryImageAttribute(value: String): Self = StObject.set(x, "PrimaryImageAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryNameAttribute(value: String): Self = StObject.set(x, "PrimaryNameAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivileges(value: js.Array[SecurityPrivilegeMetadata]): Self = StObject.set(x, "Privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegesVarargs(value: SecurityPrivilegeMetadata*): Self = StObject.set(x, "Privileges", js.Array(value :_*))
    
    @scala.inline
    def setRecurrenceBaseEntityLogicalName(value: String): Self = StObject.set(x, "RecurrenceBaseEntityLogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportViewName(value: String): Self = StObject.set(x, "ReportViewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
  }
}
