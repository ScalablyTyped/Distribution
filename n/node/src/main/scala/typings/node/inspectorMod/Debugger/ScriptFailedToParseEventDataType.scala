package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ExecutionContextId
import typings.node.inspectorMod.Runtime.ScriptId
import typings.node.inspectorMod.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptFailedToParseEventDataType extends StObject {
  
  /**
    * Length of the last line of the script.
    */
  var endColumn: Double = js.native
  
  /**
    * Last line of the script.
    */
  var endLine: Double = js.native
  
  /**
    * Embedder-specific auxiliary data.
    */
  var executionContextAuxData: js.UndefOr[js.Object] = js.native
  
  /**
    * Specifies script creation context.
    */
  var executionContextId: ExecutionContextId = js.native
  
  /**
    * True, if this script has sourceURL.
    */
  var hasSourceURL: js.UndefOr[Boolean] = js.native
  
  /**
    * Content hash of the script.
    */
  var hash: String = js.native
  
  /**
    * True, if this script is ES6 module.
    */
  var isModule: js.UndefOr[Boolean] = js.native
  
  /**
    * This script length.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Identifier of the script parsed.
    */
  var scriptId: ScriptId = js.native
  
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
  
  /**
    * JavaScript top stack frame of where the script parsed event was triggered if available.
    * @experimental
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Column offset of the script within the resource with given URL.
    */
  var startColumn: Double = js.native
  
  /**
    * Line offset of the script within the resource with given URL (for script tags).
    */
  var startLine: Double = js.native
  
  /**
    * URL or name of the script parsed (if any).
    */
  var url: String = js.native
}
object ScriptFailedToParseEventDataType {
  
  @scala.inline
  def apply(
    endColumn: Double,
    endLine: Double,
    executionContextId: ExecutionContextId,
    hash: String,
    scriptId: ScriptId,
    startColumn: Double,
    startLine: Double,
    url: String
  ): ScriptFailedToParseEventDataType = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptFailedToParseEventDataType]
  }
  
  @scala.inline
  implicit class ScriptFailedToParseEventDataTypeMutableBuilder[Self <: ScriptFailedToParseEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextAuxData(value: js.Object): Self = StObject.set(x, "executionContextAuxData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextAuxDataUndefined: Self = StObject.set(x, "executionContextAuxData", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSourceURL(value: Boolean): Self = StObject.set(x, "hasSourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSourceURLUndefined: Self = StObject.set(x, "hasSourceURL", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModule(value: Boolean): Self = StObject.set(x, "isModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModuleUndefined: Self = StObject.set(x, "isModule", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapURL(value: String): Self = StObject.set(x, "sourceMapURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapURLUndefined: Self = StObject.set(x, "sourceMapURL", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
