package typings.metro.anon

import typings.metro.srcDeltaBundlerTypesMod.AsyncDependencyType
import typings.metro.srcModuleGraphWorkerCollectDependenciesMod.RequireContextParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncType extends StObject {
  
  /**
    * If not null, this dependency is due to a dynamic `import()` or `__prefetchImport()` call.
    */
  val asyncType: AsyncDependencyType | Null
  
  /** Context for requiring a collection of modules. */
  val contextParams: js.UndefOr[RequireContextParams] = js.undefined
  
  /**
    * The dependency is enclosed in a try/catch block.
    */
  val isOptional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A locally unique key for this dependency within the current module.
    */
  val key: String
  
  val locs: js.Array[End]
  
  /**
    * The condition for splitting on this dependency edge.
    */
  val splitCondition: js.UndefOr[MobileConfigName] = js.undefined
}
object AsyncType {
  
  inline def apply(key: String, locs: js.Array[End]): AsyncType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], locs = locs.asInstanceOf[js.Any], asyncType = null)
    __obj.asInstanceOf[AsyncType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncType] (val x: Self) extends AnyVal {
    
    inline def setAsyncType(value: AsyncDependencyType): Self = StObject.set(x, "asyncType", value.asInstanceOf[js.Any])
    
    inline def setAsyncTypeNull: Self = StObject.set(x, "asyncType", null)
    
    inline def setContextParams(value: RequireContextParams): Self = StObject.set(x, "contextParams", value.asInstanceOf[js.Any])
    
    inline def setContextParamsUndefined: Self = StObject.set(x, "contextParams", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLocs(value: js.Array[End]): Self = StObject.set(x, "locs", value.asInstanceOf[js.Any])
    
    inline def setLocsVarargs(value: End*): Self = StObject.set(x, "locs", js.Array(value*))
    
    inline def setSplitCondition(value: MobileConfigName): Self = StObject.set(x, "splitCondition", value.asInstanceOf[js.Any])
    
    inline def setSplitConditionUndefined: Self = StObject.set(x, "splitCondition", js.undefined)
  }
}
