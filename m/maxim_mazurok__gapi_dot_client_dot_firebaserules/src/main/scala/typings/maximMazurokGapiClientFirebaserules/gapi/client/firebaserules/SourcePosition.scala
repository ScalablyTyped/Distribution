package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourcePosition extends StObject {
  
  /** First column on the source line associated with the source fragment. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** Start position relative to the beginning of the file. */
  var currentOffset: js.UndefOr[Double] = js.undefined
  
  /** End position relative to the beginning of the file. */
  var endOffset: js.UndefOr[Double] = js.undefined
  
  /** Name of the `File`. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** Line number of the source fragment. 1-based. */
  var line: js.UndefOr[Double] = js.undefined
}
object SourcePosition {
  
  inline def apply(): SourcePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourcePosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourcePosition] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setCurrentOffset(value: Double): Self = StObject.set(x, "currentOffset", value.asInstanceOf[js.Any])
    
    inline def setCurrentOffsetUndefined: Self = StObject.set(x, "currentOffset", js.undefined)
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
