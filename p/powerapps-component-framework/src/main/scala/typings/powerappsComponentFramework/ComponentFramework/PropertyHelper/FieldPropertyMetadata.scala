package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.Dictionary
import typings.powerappsComponentFramework.ComponentFramework.FormattingApi.Types.DateTimeFieldBehavior
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldPropertyMetadata {
  
  trait DateTimeMetadata
    extends StObject
       with Metadata {
    
    var Behavior: DateTimeFieldBehavior
    
    var Format: String
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
  }
  object DateTimeMetadata {
    
    @scala.inline
    def apply(
      Behavior: DateTimeFieldBehavior,
      Description: String,
      DisplayName: String,
      Format: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): DateTimeMetadata = {
      val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeMetadata]
    }
    
    @scala.inline
    implicit class DateTimeMetadataMutableBuilder[Self <: DateTimeMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehavior(value: DateTimeFieldBehavior): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeMode(value: ImeMode): Self = StObject.set(x, "ImeMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecimalNumberMetadata
    extends StObject
       with NumberMetadata {
    
    var Precision: Double
  }
  object DecimalNumberMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      MaxValue: Double,
      MinValue: Double,
      Precision: Double,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): DecimalNumberMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecimalNumberMetadata]
    }
    
    @scala.inline
    implicit class DecimalNumberMetadataMutableBuilder[Self <: DecimalNumberMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    }
  }
  
  trait FloatingNumberMetadata
    extends StObject
       with NumberMetadata {
    
    var Precision: Double
  }
  object FloatingNumberMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      MaxValue: Double,
      MinValue: Double,
      Precision: Double,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): FloatingNumberMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingNumberMetadata]
    }
    
    @scala.inline
    implicit class FloatingNumberMetadataMutableBuilder[Self <: FloatingNumberMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    }
  }
  
  trait LookupMetadata
    extends StObject
       with Metadata {
    
    var Targets: js.Array[String]
  }
  object LookupMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      IsSecured: Boolean,
      LogicalName: String,
      RequiredLevel: RequiredLevel,
      SourceType: Double,
      Targets: js.Array[String]
    ): LookupMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupMetadata]
    }
    
    @scala.inline
    implicit class LookupMetadataMutableBuilder[Self <: LookupMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTargets(value: js.Array[String]): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: String*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    }
  }
  
  trait Metadata extends StObject {
    
    var Description: String
    
    var DisplayName: String
    
    var IsSecured: Boolean
    
    var LogicalName: String
    
    var RequiredLevel: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
    
    var SourceType: Double
  }
  object Metadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      IsSecured: Boolean,
      LogicalName: String,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): Metadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSecured(value: Boolean): Self = StObject.set(x, "IsSecured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalName(value: String): Self = StObject.set(x, "LogicalName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredLevel(value: RequiredLevel): Self = StObject.set(x, "RequiredLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: Double): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberMetadata
    extends StObject
       with Metadata {
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
    
    var MaxValue: Double
    
    var MinValue: Double
  }
  object NumberMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      MaxValue: Double,
      MinValue: Double,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): NumberMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberMetadata]
    }
    
    @scala.inline
    implicit class NumberMetadataMutableBuilder[Self <: NumberMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImeMode(value: ImeMode): Self = StObject.set(x, "ImeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionSetMetadata
    extends StObject
       with Metadata {
    
    var DefaultValue: Double
    
    var Options: js.Array[OptionMetadata]
  }
  object OptionSetMetadata {
    
    @scala.inline
    def apply(
      DefaultValue: Double,
      Description: String,
      DisplayName: String,
      IsSecured: Boolean,
      LogicalName: String,
      Options: js.Array[OptionMetadata],
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): OptionSetMetadata = {
      val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionSetMetadata]
    }
    
    @scala.inline
    implicit class OptionSetMetadataMutableBuilder[Self <: OptionSetMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[OptionMetadata]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionMetadata*): Self = StObject.set(x, "Options", js.Array(value :_*))
    }
  }
  
  trait StringMetadata
    extends StObject
       with Metadata {
    
    var Format: String
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
    
    var MaxLength: Double
  }
  object StringMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      Format: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      MaxLength: Double,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): StringMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringMetadata]
    }
    
    @scala.inline
    implicit class StringMetadataMutableBuilder[Self <: StringMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeMode(value: ImeMode): Self = StObject.set(x, "ImeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwoOptionMetadata
    extends StObject
       with Metadata {
    
    var DefaultValue: Boolean
    
    var Options: js.Tuple2[OptionMetadata, OptionMetadata]
  }
  object TwoOptionMetadata {
    
    @scala.inline
    def apply(
      DefaultValue: Boolean,
      Description: String,
      DisplayName: String,
      IsSecured: Boolean,
      LogicalName: String,
      Options: js.Tuple2[OptionMetadata, OptionMetadata],
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): TwoOptionMetadata = {
      val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoOptionMetadata]
    }
    
    @scala.inline
    implicit class TwoOptionMetadataMutableBuilder[Self <: TwoOptionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Boolean): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Tuple2[OptionMetadata, OptionMetadata]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    }
  }
  
  trait WholeNumberMetadata
    extends StObject
       with NumberMetadata {
    
    var Format: String
    
    var LanguageByCode: js.UndefOr[Dictionary] = js.undefined
    
    var TimeZoneByCode: js.UndefOr[Dictionary] = js.undefined
  }
  object WholeNumberMetadata {
    
    @scala.inline
    def apply(
      Description: String,
      DisplayName: String,
      Format: String,
      ImeMode: ImeMode,
      IsSecured: Boolean,
      LogicalName: String,
      MaxValue: Double,
      MinValue: Double,
      RequiredLevel: RequiredLevel,
      SourceType: Double
    ): WholeNumberMetadata = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WholeNumberMetadata]
    }
    
    @scala.inline
    implicit class WholeNumberMetadataMutableBuilder[Self <: WholeNumberMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageByCode(value: Dictionary): Self = StObject.set(x, "LanguageByCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageByCodeUndefined: Self = StObject.set(x, "LanguageByCode", js.undefined)
      
      @scala.inline
      def setTimeZoneByCode(value: Dictionary): Self = StObject.set(x, "TimeZoneByCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneByCodeUndefined: Self = StObject.set(x, "TimeZoneByCode", js.undefined)
    }
  }
}
