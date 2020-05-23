package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessOwned
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BusinessParented
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.`None    OrganizationOwned`
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.`TeamOwned    UserOwned`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityMetadata extends js.Object {
  var ActivityTypeMask: Double
  var Attributes: js.Array[IAttributeMetadata]
  var AutoCreateAccessTeams: js.Any
  var AutoRouteToOwnerQueue: Boolean
  var CanBeInManyToMany: ManagedProperty[Boolean]
  var CanBePrimaryEntityInRelationship: ManagedProperty[Boolean]
  var CanBeRelatedEntityInRelationship: ManagedProperty[Boolean]
  var CanCreateAttributes: ManagedProperty[Boolean]
  var CanCreateCharts: ManagedProperty[Boolean]
  var CanCreateForms: ManagedProperty[Boolean]
  var CanCreateViews: ManagedProperty[Boolean]
  var CanModifyAdditionalSettings: ManagedProperty[Boolean]
  var CanTriggerWorkflow: Boolean
  var Description: Label
  var DisplayCollectionName: Label
  var DisplayName: Label
  var IconLargeName: String
  var IconMediumName: String
  var IconSmallName: String
  var IntroducedVersion: js.Any
  var IsAIRUpdated: Boolean
  var IsActivity: Boolean
  var IsActivityParty: Boolean
  var IsAuditEnabled: ManagedProperty[Boolean]
  var IsAvailableOffline: Boolean
  var IsBusinessProcessEnabled: Boolean
  var IsChildEntity: Boolean
  var IsConnectionsEnabled: ManagedProperty[Boolean]
  var IsCustomEntity: Boolean
  var IsCustomizable: ManagedProperty[Boolean]
  var IsDocumentManagementEnabled: Boolean
  var IsDuplicateDetectionEnabled: ManagedProperty[Boolean]
  var IsEnabledForCharts: Boolean
  var IsImportable: Boolean
  var IsIntersect: Boolean
  var IsMailMergeEnabled: ManagedProperty[Boolean]
  var IsManaged: Boolean
  var IsMappable: ManagedProperty[Boolean]
  var IsQuickCreateEnabled: Boolean
  var IsReadingPaneEnabled: Boolean
  var IsRenameable: Boolean
  var IsValidForAdvancedFind: Boolean
  var IsValidForQueue: ManagedProperty[Boolean]
  var IsVisibleInMobile: ManagedProperty[Boolean]
  var IsVisibleInMobileClient: Boolean
  var LogicalName: String
  var ManyToManyRelationships: ManyToManyRelationshipMetadata
  var ManyToOneRelationships: OneToManyRelationshipMetadata
  var MetadataId: String
  var ObjectTypeCode: Double
  var OneToManyRelationships: OneToManyRelationshipMetadata
  var OwnershipType: BusinessOwned | BusinessParented | (`None    OrganizationOwned`) | (`TeamOwned    UserOwned`)
  var PrimaryIdAttribute: String
  var PrimaryImageAttribute: String
  var PrimaryNameAttribute: String
  var Privileges: js.Array[SecurityPrivilegeMetadata]
  var RecurrenceBaseEntityLogicalName: String
  var ReportViewName: String
  var SchemaName: String
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
}

