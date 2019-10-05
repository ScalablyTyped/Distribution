package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BigIntType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.BooleanType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.CalendarRulesType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Customer
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.CustomerType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DateTimeType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DecimalType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DoubleType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.EntityName
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.EntityNameType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ImageType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Integer
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.IntegerType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.LookupType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedPropertyType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Memo
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.MemoType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.MoneyType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Owner
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.OwnerType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PartyListType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Picklist
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PicklistType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.State
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.StateTypeBACKSLASHtStatusType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Status
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.StringType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Uniqueidentifier
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.UniqueidentifierType
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Virtual
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.VirtualType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttributeMetadata extends js.Object {
  var AttributeOf: java.lang.String
  var AttributeType: Customer | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DateTime | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Decimal | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Double | EntityName | Integer | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Lookup | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedProperty | Memo | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Money | Owner | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
  var AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeBACKSLASHtStatusType | StringType | UniqueidentifierType | VirtualType
  var CalculationOf: js.Any
  var CanBeSecuredForCreate: scala.Boolean
  var CanBeSecuredForRead: scala.Boolean
  var CanBeSecuredForUpdate: scala.Boolean
  var CanModifyAdditionalSettings: ManagedProperty[scala.Boolean]
  var ColumnNumber: scala.Double
  var DefaultFormValue: js.Any
  var DefaultValue: js.Any
  var DeprecatedVersion: js.Any
  var Description: Label
  var DisplayName: Label
  var EntityLogicalName: java.lang.String
  var Format: js.Any
  var FormatName: java.lang.String
  var ImeMode: js.Any
  var IntroducedVersion: js.Any
  var IsAuditEnabled: scala.Boolean
  var IsCustomAttribute: scala.Boolean
  var IsCustomizable: ManagedProperty[scala.Boolean]
  var IsManaged: scala.Boolean
  var IsPrimaryId: scala.Boolean
  var IsPrimaryName: scala.Boolean
  var IsRenameable: ManagedProperty[scala.Boolean]
  var IsSecured: scala.Boolean
  var IsValidForAdvancedFind: ManagedProperty[scala.Boolean]
  var IsValidForCreate: scala.Boolean
  var IsValidForRead: scala.Boolean
  var IsValidForUpdate: scala.Boolean
  var LinkedAttributeId: java.lang.String
  var LogicalName: java.lang.String
  var MaxLength: scala.Double
  var MaxValue: js.Any
  var MetadataId: java.lang.String
  var MinValue: scala.Double
  var OptionSet: js.Any
  var Precision: js.Any
  var PrecisionSource: js.Any
  var RequiredLevel: ManagedProperty[java.lang.String]
  var SchemaName: java.lang.String
  var Targets: js.Array[java.lang.String]
  var YomiOf: js.Any
}

object IAttributeMetadata {
  @scala.inline
  def apply(
    AttributeOf: java.lang.String,
    AttributeType: Customer | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.DateTime | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Decimal | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Double | EntityName | Integer | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Lookup | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.ManagedProperty | Memo | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.Money | Owner | typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapStrings.PartyList | Picklist | State | Status | Uniqueidentifier | Virtual,
    AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | StateTypeBACKSLASHtStatusType | StringType | UniqueidentifierType | VirtualType,
    CalculationOf: js.Any,
    CanBeSecuredForCreate: scala.Boolean,
    CanBeSecuredForRead: scala.Boolean,
    CanBeSecuredForUpdate: scala.Boolean,
    CanModifyAdditionalSettings: ManagedProperty[scala.Boolean],
    ColumnNumber: scala.Double,
    DefaultFormValue: js.Any,
    DefaultValue: js.Any,
    DeprecatedVersion: js.Any,
    Description: Label,
    DisplayName: Label,
    EntityLogicalName: java.lang.String,
    Format: js.Any,
    FormatName: java.lang.String,
    ImeMode: js.Any,
    IntroducedVersion: js.Any,
    IsAuditEnabled: scala.Boolean,
    IsCustomAttribute: scala.Boolean,
    IsCustomizable: ManagedProperty[scala.Boolean],
    IsManaged: scala.Boolean,
    IsPrimaryId: scala.Boolean,
    IsPrimaryName: scala.Boolean,
    IsRenameable: ManagedProperty[scala.Boolean],
    IsSecured: scala.Boolean,
    IsValidForAdvancedFind: ManagedProperty[scala.Boolean],
    IsValidForCreate: scala.Boolean,
    IsValidForRead: scala.Boolean,
    IsValidForUpdate: scala.Boolean,
    LinkedAttributeId: java.lang.String,
    LogicalName: java.lang.String,
    MaxLength: scala.Double,
    MaxValue: js.Any,
    MetadataId: java.lang.String,
    MinValue: scala.Double,
    OptionSet: js.Any,
    Precision: js.Any,
    PrecisionSource: js.Any,
    RequiredLevel: ManagedProperty[java.lang.String],
    SchemaName: java.lang.String,
    Targets: js.Array[java.lang.String],
    YomiOf: js.Any
  ): IAttributeMetadata = {
    val __obj = js.Dynamic.literal(AttributeOf = AttributeOf, AttributeType = AttributeType.asInstanceOf[js.Any], AttributeTypeName = AttributeTypeName.asInstanceOf[js.Any], CalculationOf = CalculationOf, CanBeSecuredForCreate = CanBeSecuredForCreate, CanBeSecuredForRead = CanBeSecuredForRead, CanBeSecuredForUpdate = CanBeSecuredForUpdate, CanModifyAdditionalSettings = CanModifyAdditionalSettings, ColumnNumber = ColumnNumber, DefaultFormValue = DefaultFormValue, DefaultValue = DefaultValue, DeprecatedVersion = DeprecatedVersion, Description = Description, DisplayName = DisplayName, EntityLogicalName = EntityLogicalName, Format = Format, FormatName = FormatName, ImeMode = ImeMode, IntroducedVersion = IntroducedVersion, IsAuditEnabled = IsAuditEnabled, IsCustomAttribute = IsCustomAttribute, IsCustomizable = IsCustomizable, IsManaged = IsManaged, IsPrimaryId = IsPrimaryId, IsPrimaryName = IsPrimaryName, IsRenameable = IsRenameable, IsSecured = IsSecured, IsValidForAdvancedFind = IsValidForAdvancedFind, IsValidForCreate = IsValidForCreate, IsValidForRead = IsValidForRead, IsValidForUpdate = IsValidForUpdate, LinkedAttributeId = LinkedAttributeId, LogicalName = LogicalName, MaxLength = MaxLength, MaxValue = MaxValue, MetadataId = MetadataId, MinValue = MinValue, OptionSet = OptionSet, Precision = Precision, PrecisionSource = PrecisionSource, RequiredLevel = RequiredLevel, SchemaName = SchemaName, Targets = Targets, YomiOf = YomiOf)
  
    __obj.asInstanceOf[IAttributeMetadata]
  }
}

