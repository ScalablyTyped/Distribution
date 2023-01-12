package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridRecordBufferMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/RecordBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RecordBuffer {
    
    /* CompleteClass */
    var bookmark: Any = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    /* CompleteClass */
    override def field(idx: Double): typings.nginstackWebFramework.libGridFieldBufferMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var fieldBuffers_ : Any = js.native
    
    /* CompleteClass */
    var fieldsValues: js.Array[Any] = js.native
    
    /* CompleteClass */
    var hintValue: Any = js.native
    
    /* CompleteClass */
    var newFieldsValues: js.Array[Any] = js.native
    
    /* CompleteClass */
    var recNo: Double = js.native
    
    /* CompleteClass */
    var resendRecord: Boolean = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var selected: Boolean = js.native
    
    /* CompleteClass */
    override def setLength(len: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FRecordBuffer: Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/RecordBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RecordBuffer extends StObject {
    
    var bookmark: Any
    
    var disabled: Boolean
    
    def field(idx: Double): typings.nginstackWebFramework.libGridFieldBufferMod.^
    
    /* private */ var fieldBuffers_ : Any
    
    var fieldsValues: js.Array[Any]
    
    var hintValue: Any
    
    var newFieldsValues: js.Array[Any]
    
    var recNo: Double
    
    var resendRecord: Boolean
    
    def reset(): Unit
    
    var selected: Boolean
    
    def setLength(len: Double): Unit
    
    /* private */ @JSName("toString")
    var toString_FRecordBuffer: Any
    
    var version: Double
  }
  object RecordBuffer {
    
    inline def apply(
      bookmark: Any,
      disabled: Boolean,
      field: Double => typings.nginstackWebFramework.libGridFieldBufferMod.^,
      fieldBuffers_ : Any,
      fieldsValues: js.Array[Any],
      hintValue: Any,
      newFieldsValues: js.Array[Any],
      recNo: Double,
      resendRecord: Boolean,
      reset: () => Unit,
      selected: Boolean,
      setLength: Double => Unit,
      toString_ : Any,
      version: Double
    ): RecordBuffer = {
      val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], field = js.Any.fromFunction1(field), fieldBuffers_ = fieldBuffers_.asInstanceOf[js.Any], fieldsValues = fieldsValues.asInstanceOf[js.Any], hintValue = hintValue.asInstanceOf[js.Any], newFieldsValues = newFieldsValues.asInstanceOf[js.Any], recNo = recNo.asInstanceOf[js.Any], resendRecord = resendRecord.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), selected = selected.asInstanceOf[js.Any], setLength = js.Any.fromFunction1(setLength), version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordBuffer] (val x: Self) extends AnyVal {
      
      inline def setBookmark(value: Any): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setField(value: Double => typings.nginstackWebFramework.libGridFieldBufferMod.^): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
      
      inline def setFieldBuffers_(value: Any): Self = StObject.set(x, "fieldBuffers_", value.asInstanceOf[js.Any])
      
      inline def setFieldsValues(value: js.Array[Any]): Self = StObject.set(x, "fieldsValues", value.asInstanceOf[js.Any])
      
      inline def setFieldsValuesVarargs(value: Any*): Self = StObject.set(x, "fieldsValues", js.Array(value*))
      
      inline def setHintValue(value: Any): Self = StObject.set(x, "hintValue", value.asInstanceOf[js.Any])
      
      inline def setNewFieldsValues(value: js.Array[Any]): Self = StObject.set(x, "newFieldsValues", value.asInstanceOf[js.Any])
      
      inline def setNewFieldsValuesVarargs(value: Any*): Self = StObject.set(x, "newFieldsValues", js.Array(value*))
      
      inline def setRecNo(value: Double): Self = StObject.set(x, "recNo", value.asInstanceOf[js.Any])
      
      inline def setResendRecord(value: Boolean): Self = StObject.set(x, "resendRecord", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSetLength(value: Double => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
