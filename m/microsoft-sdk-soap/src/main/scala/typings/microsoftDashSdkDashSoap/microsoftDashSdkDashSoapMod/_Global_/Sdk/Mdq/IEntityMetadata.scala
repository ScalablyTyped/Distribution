package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BusinessOwned
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BusinessParented
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.NoneBACKSLASHtOrganizationOwned
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.TeamOwnedBACKSLASHtUserOwned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityMetadata extends js.Object {
  var ActivityTypeMask: scala.Double
  var Attributes: js.Array[IAttributeMetadata]
  var AutoCreateAccessTeams: js.Any
  var AutoRouteToOwnerQueue: scala.Boolean
  var CanBeInManyToMany: ManagedProperty[scala.Boolean]
  var CanBePrimaryEntityInRelationship: ManagedProperty[scala.Boolean]
  var CanBeRelatedEntityInRelationship: ManagedProperty[scala.Boolean]
  var CanCreateAttributes: ManagedProperty[scala.Boolean]
  var CanCreateCharts: ManagedProperty[scala.Boolean]
  var CanCreateForms: ManagedProperty[scala.Boolean]
  var CanCreateViews: ManagedProperty[scala.Boolean]
  var CanModifyAdditionalSettings: ManagedProperty[scala.Boolean]
  var CanTriggerWorkflow: scala.Boolean
  var Description: Label
  var DisplayCollectionName: Label
  var DisplayName: Label
  var IconLargeName: java.lang.String
  var IconMediumName: java.lang.String
  var IconSmallName: java.lang.String
  var IntroducedVersion: js.Any
  var IsAIRUpdated: scala.Boolean
  var IsActivity: scala.Boolean
  var IsActivityParty: scala.Boolean
  var IsAuditEnabled: ManagedProperty[scala.Boolean]
  var IsAvailableOffline: scala.Boolean
  var IsBusinessProcessEnabled: scala.Boolean
  var IsChildEntity: scala.Boolean
  var IsConnectionsEnabled: ManagedProperty[scala.Boolean]
  var IsCustomEntity: scala.Boolean
  var IsCustomizable: ManagedProperty[scala.Boolean]
  var IsDocumentManagementEnabled: scala.Boolean
  var IsDuplicateDetectionEnabled: ManagedProperty[scala.Boolean]
  var IsEnabledForCharts: scala.Boolean
  var IsImportable: scala.Boolean
  var IsIntersect: scala.Boolean
  var IsMailMergeEnabled: ManagedProperty[scala.Boolean]
  var IsManaged: scala.Boolean
  var IsMappable: ManagedProperty[scala.Boolean]
  var IsQuickCreateEnabled: scala.Boolean
  var IsReadingPaneEnabled: scala.Boolean
  var IsRenameable: scala.Boolean
  var IsValidForAdvancedFind: scala.Boolean
  var IsValidForQueue: ManagedProperty[scala.Boolean]
  var IsVisibleInMobile: ManagedProperty[scala.Boolean]
  var IsVisibleInMobileClient: scala.Boolean
  var LogicalName: java.lang.String
  var ManyToManyRelationships: ManyToManyRelationshipMetadata
  var ManyToOneRelationships: OneToManyRelationshipMetadata
  var MetadataId: java.lang.String
  var ObjectTypeCode: scala.Double
  var OneToManyRelationships: OneToManyRelationshipMetadata
  var OwnershipType: BusinessOwned | BusinessParented | NoneBACKSLASHtOrganizationOwned | TeamOwnedBACKSLASHtUserOwned
  var PrimaryIdAttribute: java.lang.String
  var PrimaryImageAttribute: java.lang.String
  var PrimaryNameAttribute: java.lang.String
  var Privileges: js.Array[SecurityPrivilegeMetadata]
  var RecurrenceBaseEntityLogicalName: java.lang.String
  var ReportViewName: java.lang.String
  var SchemaName: java.lang.String
}

object IEntityMetadata {
  @scala.inline
  def apply(
    ActivityTypeMask: scala.Double,
    Attributes: js.Array[IAttributeMetadata],
    AutoCreateAccessTeams: js.Any,
    AutoRouteToOwnerQueue: scala.Boolean,
    CanBeInManyToMany: ManagedProperty[scala.Boolean],
    CanBePrimaryEntityInRelationship: ManagedProperty[scala.Boolean],
    CanBeRelatedEntityInRelationship: ManagedProperty[scala.Boolean],
    CanCreateAttributes: ManagedProperty[scala.Boolean],
    CanCreateCharts: ManagedProperty[scala.Boolean],
    CanCreateForms: ManagedProperty[scala.Boolean],
    CanCreateViews: ManagedProperty[scala.Boolean],
    CanModifyAdditionalSettings: ManagedProperty[scala.Boolean],
    CanTriggerWorkflow: scala.Boolean,
    Description: Label,
    DisplayCollectionName: Label,
    DisplayName: Label,
    IconLargeName: java.lang.String,
    IconMediumName: java.lang.String,
    IconSmallName: java.lang.String,
    IntroducedVersion: js.Any,
    IsAIRUpdated: scala.Boolean,
    IsActivity: scala.Boolean,
    IsActivityParty: scala.Boolean,
    IsAuditEnabled: ManagedProperty[scala.Boolean],
    IsAvailableOffline: scala.Boolean,
    IsBusinessProcessEnabled: scala.Boolean,
    IsChildEntity: scala.Boolean,
    IsConnectionsEnabled: ManagedProperty[scala.Boolean],
    IsCustomEntity: scala.Boolean,
    IsCustomizable: ManagedProperty[scala.Boolean],
    IsDocumentManagementEnabled: scala.Boolean,
    IsDuplicateDetectionEnabled: ManagedProperty[scala.Boolean],
    IsEnabledForCharts: scala.Boolean,
    IsImportable: scala.Boolean,
    IsIntersect: scala.Boolean,
    IsMailMergeEnabled: ManagedProperty[scala.Boolean],
    IsManaged: scala.Boolean,
    IsMappable: ManagedProperty[scala.Boolean],
    IsQuickCreateEnabled: scala.Boolean,
    IsReadingPaneEnabled: scala.Boolean,
    IsRenameable: scala.Boolean,
    IsValidForAdvancedFind: scala.Boolean,
    IsValidForQueue: ManagedProperty[scala.Boolean],
    IsVisibleInMobile: ManagedProperty[scala.Boolean],
    IsVisibleInMobileClient: scala.Boolean,
    LogicalName: java.lang.String,
    ManyToManyRelationships: ManyToManyRelationshipMetadata,
    ManyToOneRelationships: OneToManyRelationshipMetadata,
    MetadataId: java.lang.String,
    ObjectTypeCode: scala.Double,
    OneToManyRelationships: OneToManyRelationshipMetadata,
    OwnershipType: BusinessOwned | BusinessParented | NoneBACKSLASHtOrganizationOwned | TeamOwnedBACKSLASHtUserOwned,
    PrimaryIdAttribute: java.lang.String,
    PrimaryImageAttribute: java.lang.String,
    PrimaryNameAttribute: java.lang.String,
    Privileges: js.Array[SecurityPrivilegeMetadata],
    RecurrenceBaseEntityLogicalName: java.lang.String,
    ReportViewName: java.lang.String,
    SchemaName: java.lang.String
  ): IEntityMetadata = {
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask.asInstanceOf[js.Any], Attributes = Attributes.asInstanceOf[js.Any], AutoCreateAccessTeams = AutoCreateAccessTeams.asInstanceOf[js.Any], AutoRouteToOwnerQueue = AutoRouteToOwnerQueue.asInstanceOf[js.Any], CanBeInManyToMany = CanBeInManyToMany.asInstanceOf[js.Any], CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship.asInstanceOf[js.Any], CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship.asInstanceOf[js.Any], CanCreateAttributes = CanCreateAttributes.asInstanceOf[js.Any], CanCreateCharts = CanCreateCharts.asInstanceOf[js.Any], CanCreateForms = CanCreateForms.asInstanceOf[js.Any], CanCreateViews = CanCreateViews.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], CanTriggerWorkflow = CanTriggerWorkflow.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayCollectionName = DisplayCollectionName.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IconLargeName = IconLargeName.asInstanceOf[js.Any], IconMediumName = IconMediumName.asInstanceOf[js.Any], IconSmallName = IconSmallName.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsAIRUpdated = IsAIRUpdated.asInstanceOf[js.Any], IsActivity = IsActivity.asInstanceOf[js.Any], IsActivityParty = IsActivityParty.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsAvailableOffline = IsAvailableOffline.asInstanceOf[js.Any], IsBusinessProcessEnabled = IsBusinessProcessEnabled.asInstanceOf[js.Any], IsChildEntity = IsChildEntity.asInstanceOf[js.Any], IsConnectionsEnabled = IsConnectionsEnabled.asInstanceOf[js.Any], IsCustomEntity = IsCustomEntity.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsDocumentManagementEnabled = IsDocumentManagementEnabled.asInstanceOf[js.Any], IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled.asInstanceOf[js.Any], IsEnabledForCharts = IsEnabledForCharts.asInstanceOf[js.Any], IsImportable = IsImportable.asInstanceOf[js.Any], IsIntersect = IsIntersect.asInstanceOf[js.Any], IsMailMergeEnabled = IsMailMergeEnabled.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsMappable = IsMappable.asInstanceOf[js.Any], IsQuickCreateEnabled = IsQuickCreateEnabled.asInstanceOf[js.Any], IsReadingPaneEnabled = IsReadingPaneEnabled.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForQueue = IsValidForQueue.asInstanceOf[js.Any], IsVisibleInMobile = IsVisibleInMobile.asInstanceOf[js.Any], IsVisibleInMobileClient = IsVisibleInMobileClient.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], ManyToManyRelationships = ManyToManyRelationships.asInstanceOf[js.Any], ManyToOneRelationships = ManyToOneRelationships.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], ObjectTypeCode = ObjectTypeCode.asInstanceOf[js.Any], OneToManyRelationships = OneToManyRelationships.asInstanceOf[js.Any], OwnershipType = OwnershipType.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute.asInstanceOf[js.Any], PrimaryImageAttribute = PrimaryImageAttribute.asInstanceOf[js.Any], PrimaryNameAttribute = PrimaryNameAttribute.asInstanceOf[js.Any], Privileges = Privileges.asInstanceOf[js.Any], RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName.asInstanceOf[js.Any], ReportViewName = ReportViewName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityMetadata]
  }
}

