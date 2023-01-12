package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BigIntType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.BooleanType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.CalendarRulesType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Customer
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.CustomerType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.DateTime
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.DateTimeType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Decimal
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.DecimalType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Double
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.DoubleType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.EntityName
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.EntityNameType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.ImageType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Integer
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.IntegerType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Lookup
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.LookupType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedPropertyType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Memo
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.MemoType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Money
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.MoneyType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Owner
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.OwnerType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.PartyList
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.PartyListType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Picklist
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.PicklistType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.State
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Status
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.StringType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Uniqueidentifier
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.UniqueidentifierType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.Virtual
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.VirtualType
import typings.microsoftSdkSoap.microsoftSdkSoapStrings.`StateType    StatusType`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttributeMetadata extends StObject {
  
  var AttributeOf: String
  
  var AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typings.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
  
  var AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType
  
  var CalculationOf: Any
  
  var CanBeSecuredForCreate: Boolean
  
  var CanBeSecuredForRead: Boolean
  
  var CanBeSecuredForUpdate: Boolean
  
  var CanModifyAdditionalSettings: ManagedProperty[Boolean]
  
  var ColumnNumber: scala.Double
  
  var DefaultFormValue: Any
  
  var DefaultValue: Any
  
  var DeprecatedVersion: Any
  
  var Description: Label
  
  var DisplayName: Label
  
  var EntityLogicalName: String
  
  var Format: Any
  
  var FormatName: String
  
  var ImeMode: Any
  
  var IntroducedVersion: Any
  
  var IsAuditEnabled: Boolean
  
  var IsCustomAttribute: Boolean
  
  var IsCustomizable: ManagedProperty[Boolean]
  
  var IsManaged: Boolean
  
  var IsPrimaryId: Boolean
  
  var IsPrimaryName: Boolean
  
  var IsRenameable: ManagedProperty[Boolean]
  
  var IsSecured: Boolean
  
  var IsValidForAdvancedFind: ManagedProperty[Boolean]
  
  var IsValidForCreate: Boolean
  
  var IsValidForRead: Boolean
  
  var IsValidForUpdate: Boolean
  
  var LinkedAttributeId: String
  
  var LogicalName: String
  
  var MaxLength: scala.Double
  
  var MaxValue: Any
  
  var MetadataId: String
  
  var MinValue: scala.Double
  
  var OptionSet: Any
  
  var Precision: Any
  
  var PrecisionSource: Any
  
  var RequiredLevel: ManagedProperty[String]
  
  var SchemaName: String
  
  var Targets: js.Array[String]
  
  var YomiOf: Any
}
object IAttributeMetadata {
  
  inline def apply(
    AttributeOf: String,
    AttributeType: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typings.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual,
    AttributeTypeName: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType,
    CalculationOf: Any,
    CanBeSecuredForCreate: Boolean,
    CanBeSecuredForRead: Boolean,
    CanBeSecuredForUpdate: Boolean,
    CanModifyAdditionalSettings: ManagedProperty[Boolean],
    ColumnNumber: scala.Double,
    DefaultFormValue: Any,
    DefaultValue: Any,
    DeprecatedVersion: Any,
    Description: Label,
    DisplayName: Label,
    EntityLogicalName: String,
    Format: Any,
    FormatName: String,
    ImeMode: Any,
    IntroducedVersion: Any,
    IsAuditEnabled: Boolean,
    IsCustomAttribute: Boolean,
    IsCustomizable: ManagedProperty[Boolean],
    IsManaged: Boolean,
    IsPrimaryId: Boolean,
    IsPrimaryName: Boolean,
    IsRenameable: ManagedProperty[Boolean],
    IsSecured: Boolean,
    IsValidForAdvancedFind: ManagedProperty[Boolean],
    IsValidForCreate: Boolean,
    IsValidForRead: Boolean,
    IsValidForUpdate: Boolean,
    LinkedAttributeId: String,
    LogicalName: String,
    MaxLength: scala.Double,
    MaxValue: Any,
    MetadataId: String,
    MinValue: scala.Double,
    OptionSet: Any,
    Precision: Any,
    PrecisionSource: Any,
    RequiredLevel: ManagedProperty[String],
    SchemaName: String,
    Targets: js.Array[String],
    YomiOf: Any
  ): IAttributeMetadata = {
    val __obj = js.Dynamic.literal(AttributeOf = AttributeOf.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], AttributeTypeName = AttributeTypeName.asInstanceOf[js.Any], CalculationOf = CalculationOf.asInstanceOf[js.Any], CanBeSecuredForCreate = CanBeSecuredForCreate.asInstanceOf[js.Any], CanBeSecuredForRead = CanBeSecuredForRead.asInstanceOf[js.Any], CanBeSecuredForUpdate = CanBeSecuredForUpdate.asInstanceOf[js.Any], CanModifyAdditionalSettings = CanModifyAdditionalSettings.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], DefaultFormValue = DefaultFormValue.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], DeprecatedVersion = DeprecatedVersion.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EntityLogicalName = EntityLogicalName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IntroducedVersion = IntroducedVersion.asInstanceOf[js.Any], IsAuditEnabled = IsAuditEnabled.asInstanceOf[js.Any], IsCustomAttribute = IsCustomAttribute.asInstanceOf[js.Any], IsCustomizable = IsCustomizable.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], IsPrimaryId = IsPrimaryId.asInstanceOf[js.Any], IsPrimaryName = IsPrimaryName.asInstanceOf[js.Any], IsRenameable = IsRenameable.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], IsValidForAdvancedFind = IsValidForAdvancedFind.asInstanceOf[js.Any], IsValidForCreate = IsValidForCreate.asInstanceOf[js.Any], IsValidForRead = IsValidForRead.asInstanceOf[js.Any], IsValidForUpdate = IsValidForUpdate.asInstanceOf[js.Any], LinkedAttributeId = LinkedAttributeId.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], OptionSet = OptionSet.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PrecisionSource = PrecisionSource.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], YomiOf = YomiOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttributeMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttributeMetadata] (val x: Self) extends AnyVal {
    
    inline def setAttributeOf(value: String): Self = StObject.set(x, "AttributeOf", value.asInstanceOf[js.Any])
    
    inline def setAttributeType(
      value: Customer | DateTime | Decimal | Double | EntityName | Integer | Lookup | typings.microsoftSdkSoap.microsoftSdkSoapStrings.ManagedProperty | Memo | Money | Owner | PartyList | Picklist | State | Status | Uniqueidentifier | Virtual
    ): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributeTypeName(
      value: BigIntType | BooleanType | CalendarRulesType | CustomerType | DateTimeType | DecimalType | DoubleType | EntityNameType | ImageType | IntegerType | LookupType | ManagedPropertyType | MemoType | MoneyType | OwnerType | PartyListType | PicklistType | (`StateType    StatusType`) | StringType | UniqueidentifierType | VirtualType
    ): Self = StObject.set(x, "AttributeTypeName", value.asInstanceOf[js.Any])
    
    inline def setCalculationOf(value: Any): Self = StObject.set(x, "CalculationOf", value.asInstanceOf[js.Any])
    
    inline def setCanBeSecuredForCreate(value: Boolean): Self = StObject.set(x, "CanBeSecuredForCreate", value.asInstanceOf[js.Any])
    
    inline def setCanBeSecuredForRead(value: Boolean): Self = StObject.set(x, "CanBeSecuredForRead", value.asInstanceOf[js.Any])
    
    inline def setCanBeSecuredForUpdate(value: Boolean): Self = StObject.set(x, "CanBeSecuredForUpdate", value.asInstanceOf[js.Any])
    
    inline def setCanModifyAdditionalSettings(value: ManagedProperty[Boolean]): Self = StObject.set(x, "CanModifyAdditionalSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnNumber(value: scala.Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
    
    inline def setDefaultFormValue(value: Any): Self = StObject.set(x, "DefaultFormValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedVersion(value: Any): Self = StObject.set(x, "DeprecatedVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Label): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: Label): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setEntityLogicalName(value: String): Self = StObject.set(x, "EntityLogicalName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Any): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatName(value: String): Self = StObject.set(x, "FormatName", value.asInstanceOf[js.Any])
    
    inline def setImeMode(value: Any): Self = StObject.set(x, "ImeMode", value.asInstanceOf[js.Any])
    
    inline def setIntroducedVersion(value: Any): Self = StObject.set(x, "IntroducedVersion", value.asInstanceOf[js.Any])
    
    inline def setIsAuditEnabled(value: Boolean): Self = StObject.set(x, "IsAuditEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsCustomAttribute(value: Boolean): Self = StObject.set(x, "IsCustomAttribute", value.asInstanceOf[js.Any])
    
    inline def setIsCustomizable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsCustomizable", value.asInstanceOf[js.Any])
    
    inline def setIsManaged(value: Boolean): Self = StObject.set(x, "IsManaged", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryId(value: Boolean): Self = StObject.set(x, "IsPrimaryId", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryName(value: Boolean): Self = StObject.set(x, "IsPrimaryName", value.asInstanceOf[js.Any])
    
    inline def setIsRenameable(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsRenameable", value.asInstanceOf[js.Any])
    
    inline def setIsSecured(value: Boolean): Self = StObject.set(x, "IsSecured", value.asInstanceOf[js.Any])
    
    inline def setIsValidForAdvancedFind(value: ManagedProperty[Boolean]): Self = StObject.set(x, "IsValidForAdvancedFind", value.asInstanceOf[js.Any])
    
    inline def setIsValidForCreate(value: Boolean): Self = StObject.set(x, "IsValidForCreate", value.asInstanceOf[js.Any])
    
    inline def setIsValidForRead(value: Boolean): Self = StObject.set(x, "IsValidForRead", value.asInstanceOf[js.Any])
    
    inline def setIsValidForUpdate(value: Boolean): Self = StObject.set(x, "IsValidForUpdate", value.asInstanceOf[js.Any])
    
    inline def setLinkedAttributeId(value: String): Self = StObject.set(x, "LinkedAttributeId", value.asInstanceOf[js.Any])
    
    inline def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: scala.Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataId(value: String): Self = StObject.set(x, "MetadataId", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: scala.Double): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setOptionSet(value: Any): Self = StObject.set(x, "OptionSet", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Any): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionSource(value: Any): Self = StObject.set(x, "PrecisionSource", value.asInstanceOf[js.Any])
    
    inline def setRequiredLevel(value: ManagedProperty[String]): Self = StObject.set(x, "RequiredLevel", value.asInstanceOf[js.Any])
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setYomiOf(value: Any): Self = StObject.set(x, "YomiOf", value.asInstanceOf[js.Any])
  }
}
