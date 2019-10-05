package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

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
    val __obj = js.Dynamic.literal(ActivityTypeMask = ActivityTypeMask, Attributes = Attributes, AutoCreateAccessTeams = AutoCreateAccessTeams, AutoRouteToOwnerQueue = AutoRouteToOwnerQueue, CanBeInManyToMany = CanBeInManyToMany, CanBePrimaryEntityInRelationship = CanBePrimaryEntityInRelationship, CanBeRelatedEntityInRelationship = CanBeRelatedEntityInRelationship, CanCreateAttributes = CanCreateAttributes, CanCreateCharts = CanCreateCharts, CanCreateForms = CanCreateForms, CanCreateViews = CanCreateViews, CanModifyAdditionalSettings = CanModifyAdditionalSettings, CanTriggerWorkflow = CanTriggerWorkflow, Description = Description, DisplayCollectionName = DisplayCollectionName, DisplayName = DisplayName, IconLargeName = IconLargeName, IconMediumName = IconMediumName, IconSmallName = IconSmallName, IntroducedVersion = IntroducedVersion, IsAIRUpdated = IsAIRUpdated, IsActivity = IsActivity, IsActivityParty = IsActivityParty, IsAuditEnabled = IsAuditEnabled, IsAvailableOffline = IsAvailableOffline, IsBusinessProcessEnabled = IsBusinessProcessEnabled, IsChildEntity = IsChildEntity, IsConnectionsEnabled = IsConnectionsEnabled, IsCustomEntity = IsCustomEntity, IsCustomizable = IsCustomizable, IsDocumentManagementEnabled = IsDocumentManagementEnabled, IsDuplicateDetectionEnabled = IsDuplicateDetectionEnabled, IsEnabledForCharts = IsEnabledForCharts, IsImportable = IsImportable, IsIntersect = IsIntersect, IsMailMergeEnabled = IsMailMergeEnabled, IsManaged = IsManaged, IsMappable = IsMappable, IsQuickCreateEnabled = IsQuickCreateEnabled, IsReadingPaneEnabled = IsReadingPaneEnabled, IsRenameable = IsRenameable, IsValidForAdvancedFind = IsValidForAdvancedFind, IsValidForQueue = IsValidForQueue, IsVisibleInMobile = IsVisibleInMobile, IsVisibleInMobileClient = IsVisibleInMobileClient, LogicalName = LogicalName, ManyToManyRelationships = ManyToManyRelationships, ManyToOneRelationships = ManyToOneRelationships, MetadataId = MetadataId, ObjectTypeCode = ObjectTypeCode, OneToManyRelationships = OneToManyRelationships, OwnershipType = OwnershipType.asInstanceOf[js.Any], PrimaryIdAttribute = PrimaryIdAttribute, PrimaryImageAttribute = PrimaryImageAttribute, PrimaryNameAttribute = PrimaryNameAttribute, Privileges = Privileges, RecurrenceBaseEntityLogicalName = RecurrenceBaseEntityLogicalName, ReportViewName = ReportViewName, SchemaName = SchemaName)
  
    __obj.asInstanceOf[IEntityMetadata]
  }
}

