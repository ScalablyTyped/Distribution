package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveResult extends StObject {
  
  /** Whether this dependency can be deferred by Parcel itself (true by default). */
  val canDefer: js.UndefOr[Boolean] = js.undefined
  
  /** The code of the resolved asset. If provided, this is used rather than reading the file from disk. */
  val code: js.UndefOr[String] = js.undefined
  
  /** A resolver might return diagnostics to also run subsequent resolvers while still providing a reason why it failed. */
  val diagnostics: js.UndefOr[Diagnostic | js.Array[Diagnostic]] = js.undefined
  
  /** An absolute path to the resolved file. */
  val filePath: js.UndefOr[FilePath] = js.undefined
  
  /** Invalidates the resolution when the given environment variable changes.*/
  val invalidateOnEnvChange: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of files that should invalidate the resolution if modified or deleted. */
  val invalidateOnFileChange: js.UndefOr[js.Array[FilePath]] = js.undefined
  
  /** A list of file paths or patterns that should invalidate the resolution if created. */
  val invalidateOnFileCreate: js.UndefOr[js.Array[FileCreateInvalidation]] = js.undefined
  
  /** Whether the resolved file should be excluded from the build. */
  val isExcluded: js.UndefOr[Boolean] = js.undefined
  
  /** Is spread (shallowly merged) onto the request's dependency.meta */
  val meta: js.UndefOr[JSONObject] = js.undefined
  
  /** An optional named pipeline to use to compile the resolved file. */
  val pipeline: js.UndefOr[String | Null] = js.undefined
  
  /** Overrides the priority set on the dependency. */
  val priority: js.UndefOr[DependencyPriority] = js.undefined
  
  /** Query parameters to be used by transformers when compiling the resolved file. */
  val query: js.UndefOr[URLSearchParams] = js.undefined
  
  /** Corresponds to BaseAsset's <code>sideEffects</code>. */
  val sideEffects: js.UndefOr[Boolean] = js.undefined
}
object ResolveResult {
  
  inline def apply(): ResolveResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveResult] (val x: Self) extends AnyVal {
    
    inline def setCanDefer(value: Boolean): Self = StObject.set(x, "canDefer", value.asInstanceOf[js.Any])
    
    inline def setCanDeferUndefined: Self = StObject.set(x, "canDefer", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDiagnostics(value: Diagnostic | js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setInvalidateOnEnvChange(value: js.Array[String]): Self = StObject.set(x, "invalidateOnEnvChange", value.asInstanceOf[js.Any])
    
    inline def setInvalidateOnEnvChangeUndefined: Self = StObject.set(x, "invalidateOnEnvChange", js.undefined)
    
    inline def setInvalidateOnEnvChangeVarargs(value: String*): Self = StObject.set(x, "invalidateOnEnvChange", js.Array(value*))
    
    inline def setInvalidateOnFileChange(value: js.Array[FilePath]): Self = StObject.set(x, "invalidateOnFileChange", value.asInstanceOf[js.Any])
    
    inline def setInvalidateOnFileChangeUndefined: Self = StObject.set(x, "invalidateOnFileChange", js.undefined)
    
    inline def setInvalidateOnFileChangeVarargs(value: FilePath*): Self = StObject.set(x, "invalidateOnFileChange", js.Array(value*))
    
    inline def setInvalidateOnFileCreate(value: js.Array[FileCreateInvalidation]): Self = StObject.set(x, "invalidateOnFileCreate", value.asInstanceOf[js.Any])
    
    inline def setInvalidateOnFileCreateUndefined: Self = StObject.set(x, "invalidateOnFileCreate", js.undefined)
    
    inline def setInvalidateOnFileCreateVarargs(value: FileCreateInvalidation*): Self = StObject.set(x, "invalidateOnFileCreate", js.Array(value*))
    
    inline def setIsExcluded(value: Boolean): Self = StObject.set(x, "isExcluded", value.asInstanceOf[js.Any])
    
    inline def setIsExcludedUndefined: Self = StObject.set(x, "isExcluded", js.undefined)
    
    inline def setMeta(value: JSONObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPriority(value: DependencyPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuery(value: URLSearchParams): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
  }
}
