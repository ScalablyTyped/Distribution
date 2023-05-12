package typings.metro

import typings.metro.anon.ReadonlyContextFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModuleGraphWorkerCollectDependenciesMod {
  
  trait ContextFilter extends StObject {
    
    var flags: String
    
    var pattern: String
  }
  object ContextFilter {
    
    inline def apply(flags: String, pattern: String): ContextFilter = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextFilter] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.metroStrings.sync
    - typings.metro.metroStrings.eager
    - typings.metro.metroStrings.`lazy`
    - typings.metro.metroStrings.`lazy-once`
  */
  trait ContextMode extends StObject
  object ContextMode {
    
    inline def eager: typings.metro.metroStrings.eager = "eager".asInstanceOf[typings.metro.metroStrings.eager]
    
    inline def `lazy`: typings.metro.metroStrings.`lazy` = "lazy".asInstanceOf[typings.metro.metroStrings.`lazy`]
    
    inline def `lazy-once`: typings.metro.metroStrings.`lazy-once` = "lazy-once".asInstanceOf[typings.metro.metroStrings.`lazy-once`]
    
    inline def sync: typings.metro.metroStrings.sync = "sync".asInstanceOf[typings.metro.metroStrings.sync]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.metroStrings.throwAtRuntime
    - typings.metro.metroStrings.reject
  */
  trait DynamicRequiresBehavior extends StObject
  object DynamicRequiresBehavior {
    
    inline def reject: typings.metro.metroStrings.reject = "reject".asInstanceOf[typings.metro.metroStrings.reject]
    
    inline def throwAtRuntime: typings.metro.metroStrings.throwAtRuntime = "throwAtRuntime".asInstanceOf[typings.metro.metroStrings.throwAtRuntime]
  }
  
  trait RequireContextParams extends StObject {
    
    /* Filename filter pattern for use in `require.context`. Optional, default `.*` (any file) when `require.context` is used */
    val filter: ReadonlyContextFilter
    
    /** Mode for resolving dynamic dependencies. Defaults to `sync` */
    val mode: ContextMode
    
    /* Should search for files recursively. Optional, default `true` when `require.context` is used */
    val recursive: Boolean
  }
  object RequireContextParams {
    
    inline def apply(filter: ReadonlyContextFilter, mode: ContextMode, recursive: Boolean): RequireContextParams = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireContextParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequireContextParams] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: ReadonlyContextFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setMode(value: ContextMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    }
  }
}
