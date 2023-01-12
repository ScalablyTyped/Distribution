package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a data value type in the client type system. Can be used to get a concrete ValueType instance. */
trait ValueTypeDescriptor extends StObject {
  
  val binary: js.UndefOr[Boolean] = js.undefined
  
  val bool: js.UndefOr[Boolean] = js.undefined
  
  val dateTime: js.UndefOr[Boolean] = js.undefined
  
  val duration: js.UndefOr[Boolean] = js.undefined
  
  /*readonly*/ var enumeration: js.UndefOr[IEnumType] = js.undefined
  
  val formatting: js.UndefOr[FormattingTypeDescriptor] = js.undefined
  
  val geography: js.UndefOr[GeographyTypeDescriptor] = js.undefined
  
  val integer: js.UndefOr[Boolean] = js.undefined
  
  val misc: js.UndefOr[MiscellaneousTypeDescriptor] = js.undefined
  
  val none: js.UndefOr[Boolean] = js.undefined
  
  val numeric: js.UndefOr[Boolean] = js.undefined
  
  val operations: js.UndefOr[OperationalTypeDescriptor] = js.undefined
  
  val scripting: js.UndefOr[ScriptTypeDescriptor] = js.undefined
  
  // TODO: 5005022 remove none type when we introduce property categories.
  // Extended types
  val temporal: js.UndefOr[TemporalTypeDescriptor] = js.undefined
  
  // Simplified primitive types
  val text: js.UndefOr[Boolean] = js.undefined
  
  // variant types
  val variant: js.UndefOr[js.Array[ValueTypeDescriptor]] = js.undefined
}
object ValueTypeDescriptor {
  
  inline def apply(): ValueTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setDateTime(value: Boolean): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    inline def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnumeration(value: IEnumType): Self = StObject.set(x, "enumeration", value.asInstanceOf[js.Any])
    
    inline def setEnumerationUndefined: Self = StObject.set(x, "enumeration", js.undefined)
    
    inline def setFormatting(value: FormattingTypeDescriptor): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    inline def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    inline def setGeography(value: GeographyTypeDescriptor): Self = StObject.set(x, "geography", value.asInstanceOf[js.Any])
    
    inline def setGeographyUndefined: Self = StObject.set(x, "geography", js.undefined)
    
    inline def setInteger(value: Boolean): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setMisc(value: MiscellaneousTypeDescriptor): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
    
    inline def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setOperations(value: OperationalTypeDescriptor): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setScripting(value: ScriptTypeDescriptor): Self = StObject.set(x, "scripting", value.asInstanceOf[js.Any])
    
    inline def setScriptingUndefined: Self = StObject.set(x, "scripting", js.undefined)
    
    inline def setTemporal(value: TemporalTypeDescriptor): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
    
    inline def setTemporalUndefined: Self = StObject.set(x, "temporal", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVariant(value: js.Array[ValueTypeDescriptor]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    
    inline def setVariantVarargs(value: ValueTypeDescriptor*): Self = StObject.set(x, "variant", js.Array(value*))
  }
}
