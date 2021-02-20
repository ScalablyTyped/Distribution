package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcePosition extends StObject {
  
  /** First column on the source line associated with the source fragment. */
  var column: js.UndefOr[Double] = js.native
  
  /** Start position relative to the beginning of the file. */
  var currentOffset: js.UndefOr[Double] = js.native
  
  /** End position relative to the beginning of the file. */
  var endOffset: js.UndefOr[Double] = js.native
  
  /** Name of the `File`. */
  var fileName: js.UndefOr[String] = js.native
  
  /** Line number of the source fragment. 1-based. */
  var line: js.UndefOr[Double] = js.native
}
object SourcePosition {
  
  @scala.inline
  def apply(): SourcePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourcePosition]
  }
  
  @scala.inline
  implicit class SourcePositionMutableBuilder[Self <: SourcePosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setCurrentOffset(value: Double): Self = StObject.set(x, "currentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOffsetUndefined: Self = StObject.set(x, "currentOffset", js.undefined)
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
