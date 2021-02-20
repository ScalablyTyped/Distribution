package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.Dictionary
import typings.powerappsComponentFramework.ComponentFramework.FormattingApi.Types.DateTimeFieldBehavior
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldPropertyMetadata {
  
  @js.native
  trait DateTimeMetadata extends Metadata {
    
    var Behavior: DateTimeFieldBehavior = js.native
    
    var Format: String = js.native
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode = js.native
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
  
  @js.native
  trait DecimalNumberMetadata extends NumberMetadata {
    
    var Precision: Double = js.native
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
  
  @js.native
  trait FloatingNumberMetadata extends NumberMetadata {
    
    var Precision: Double = js.native
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
  
  @js.native
  trait LookupMetadata extends Metadata {
    
    var Targets: js.Array[String] = js.native
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
  
  @js.native
  trait Metadata extends StObject {
    
    var Description: String = js.native
    
    var DisplayName: String = js.native
    
    var IsSecured: Boolean = js.native
    
    var LogicalName: String = js.native
    
    var RequiredLevel: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel = js.native
    
    var SourceType: Double = js.native
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
  
  @js.native
  trait NumberMetadata extends Metadata {
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode = js.native
    
    var MaxValue: Double = js.native
    
    var MinValue: Double = js.native
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
  
  @js.native
  trait OptionSetMetadata extends Metadata {
    
    var DefaultValue: Double = js.native
    
    var Options: js.Array[OptionMetadata] = js.native
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
  
  @js.native
  trait StringMetadata extends Metadata {
    
    var Format: String = js.native
    
    var ImeMode: typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode = js.native
    
    var MaxLength: Double = js.native
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
  
  @js.native
  trait TwoOptionMetadata extends Metadata {
    
    var DefaultValue: Boolean = js.native
    
    var Options: js.Tuple2[OptionMetadata, OptionMetadata] = js.native
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
  
  @js.native
  trait WholeNumberMetadata extends NumberMetadata {
    
    var Format: String = js.native
    
    var LanguageByCode: js.UndefOr[Dictionary] = js.native
    
    var TimeZoneByCode: js.UndefOr[Dictionary] = js.native
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
