package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.FieldKind
import typings.officeJsPreview.officeJsPreviewStrings.Cold
import typings.officeJsPreview.officeJsPreviewStrings.Hot
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Warm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `field.toJSON()`. */
trait FieldData extends StObject {
  
  /**
    * Gets or sets the field's code instruction.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets data in an "Addin" field. If the field isn't an "Addin" field, it is null and it will throw a general exception when code attempts to set it.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the field's kind.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var kind: js.UndefOr[FieldKind | None | Hot | Warm | Cold] = js.undefined
  
  /**
    * Gets or sets whether the field is locked. `true` if the field is locked, `false` otherwise.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the field's result data.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var result: js.UndefOr[RangeData] = js.undefined
  
  /**
    * Gets or sets whether the field codes are displayed for the specified field. `true` if the field codes are displayed, `false` otherwise.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showCodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the field's type.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92, starting with typings.officeJsPreview.Word.FieldType, typings.officeJsPreview.officeJsPreviewStrings.Addin, typings.officeJsPreview.officeJsPreviewStrings.AddressBlock */ Any
  ] = js.undefined
}
object FieldData {
  
  inline def apply(): FieldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: FieldKind | None | Hot | Warm | Cold): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setResult(value: RangeData): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setShowCodes(value: Boolean): Self = StObject.set(x, "showCodes", value.asInstanceOf[js.Any])
    
    inline def setShowCodesUndefined: Self = StObject.set(x, "showCodes", js.undefined)
    
    inline def setType(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92, starting with typings.officeJsPreview.Word.FieldType, typings.officeJsPreview.officeJsPreviewStrings.Addin, typings.officeJsPreview.officeJsPreviewStrings.AddressBlock */ Any
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
