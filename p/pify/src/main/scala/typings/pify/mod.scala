package typings.pify

import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(input: js.Any, options: PifyOptions): js.Any = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(input: js.Function): js.Function1[/* repeated */ js.Any, js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]]
  inline def apply(input: js.Function, options: PifyOptions): js.Function1[/* repeated */ js.Any, js.Promise[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]]
  
  @JSImport("pify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PifyOptions extends StObject {
    
    var errorFirst: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var excludeMain: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var multiArgs: js.UndefOr[Boolean] = js.undefined
    
    var promiseModule: js.UndefOr[PromiseModule] = js.undefined
  }
  object PifyOptions {
    
    inline def apply(): PifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PifyOptions]
    }
    
    extension [Self <: PifyOptions](x: Self) {
      
      inline def setErrorFirst(value: Boolean): Self = StObject.set(x, "errorFirst", value.asInstanceOf[js.Any])
      
      inline def setErrorFirstUndefined: Self = StObject.set(x, "errorFirst", js.undefined)
      
      inline def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeMain(value: Boolean): Self = StObject.set(x, "excludeMain", value.asInstanceOf[js.Any])
      
      inline def setExcludeMainUndefined: Self = StObject.set(x, "excludeMain", js.undefined)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      inline def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
      
      inline def setPromiseModule(value: PromiseModule): Self = StObject.set(x, "promiseModule", value.asInstanceOf[js.Any])
      
      inline def setPromiseModuleUndefined: Self = StObject.set(x, "promiseModule", js.undefined)
    }
  }
  
  @js.native
  trait PromiseModule
    extends StObject
       with Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          js.Any
        ]
}
