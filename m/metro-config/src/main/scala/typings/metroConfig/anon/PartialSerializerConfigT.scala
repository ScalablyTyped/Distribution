package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<metro-config.metro-config/src/configTypes.SerializerConfigT> */
trait PartialSerializerConfigT extends StObject {
  
  var createModuleIdFactory: js.UndefOr[js.Function0[js.Function1[/* path */ String, Double]]] = js.undefined
  
  var customSerializer: js.UndefOr[
    (js.Function4[
      /* entryPoint */ String, 
      /* preModules */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ /* graph */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializerOptions */ /* options */ Any, 
      js.Promise[String | Code]
    ]) | Null
  ] = js.undefined
  
  var experimentalSerializerHook: js.UndefOr[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ /* graph */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeltaResult */ /* delta */ Any, 
      Any
    ]
  ] = js.undefined
  
  var getModulesRunBeforeMainModule: js.UndefOr[js.Function1[/* entryFilePath */ String, js.Array[String]]] = js.undefined
  
  var getPolyfills: js.UndefOr[js.Function1[/* options */ Platform, js.Array[String]]] = js.undefined
  
  var getRunModuleStatement: js.UndefOr[js.Function1[/* moduleId */ Double | String, String]] = js.undefined
  
  var isThirdPartyModule: js.UndefOr[js.Function1[/* module */ Path, Boolean]] = js.undefined
  
  var polyfillModuleNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var processModuleFilter: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ /* modules */ Any, 
      Boolean
    ]
  ] = js.undefined
}
object PartialSerializerConfigT {
  
  inline def apply(): PartialSerializerConfigT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSerializerConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSerializerConfigT] (val x: Self) extends AnyVal {
    
    inline def setCreateModuleIdFactory(value: () => js.Function1[/* path */ String, Double]): Self = StObject.set(x, "createModuleIdFactory", js.Any.fromFunction0(value))
    
    inline def setCreateModuleIdFactoryUndefined: Self = StObject.set(x, "createModuleIdFactory", js.undefined)
    
    inline def setCustomSerializer(
      value: (/* entryPoint */ String, /* preModules */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
        ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ /* graph */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializerOptions */ /* options */ Any) => js.Promise[String | Code]
    ): Self = StObject.set(x, "customSerializer", js.Any.fromFunction4(value))
    
    inline def setCustomSerializerNull: Self = StObject.set(x, "customSerializer", null)
    
    inline def setCustomSerializerUndefined: Self = StObject.set(x, "customSerializer", js.undefined)
    
    inline def setExperimentalSerializerHook(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ /* graph */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeltaResult */ /* delta */ Any) => Any
    ): Self = StObject.set(x, "experimentalSerializerHook", js.Any.fromFunction2(value))
    
    inline def setExperimentalSerializerHookUndefined: Self = StObject.set(x, "experimentalSerializerHook", js.undefined)
    
    inline def setGetModulesRunBeforeMainModule(value: /* entryFilePath */ String => js.Array[String]): Self = StObject.set(x, "getModulesRunBeforeMainModule", js.Any.fromFunction1(value))
    
    inline def setGetModulesRunBeforeMainModuleUndefined: Self = StObject.set(x, "getModulesRunBeforeMainModule", js.undefined)
    
    inline def setGetPolyfills(value: /* options */ Platform => js.Array[String]): Self = StObject.set(x, "getPolyfills", js.Any.fromFunction1(value))
    
    inline def setGetPolyfillsUndefined: Self = StObject.set(x, "getPolyfills", js.undefined)
    
    inline def setGetRunModuleStatement(value: /* moduleId */ Double | String => String): Self = StObject.set(x, "getRunModuleStatement", js.Any.fromFunction1(value))
    
    inline def setGetRunModuleStatementUndefined: Self = StObject.set(x, "getRunModuleStatement", js.undefined)
    
    inline def setIsThirdPartyModule(value: /* module */ Path => Boolean): Self = StObject.set(x, "isThirdPartyModule", js.Any.fromFunction1(value))
    
    inline def setIsThirdPartyModuleUndefined: Self = StObject.set(x, "isThirdPartyModule", js.undefined)
    
    inline def setPolyfillModuleNames(value: js.Array[String]): Self = StObject.set(x, "polyfillModuleNames", value.asInstanceOf[js.Any])
    
    inline def setPolyfillModuleNamesUndefined: Self = StObject.set(x, "polyfillModuleNames", js.undefined)
    
    inline def setPolyfillModuleNamesVarargs(value: String*): Self = StObject.set(x, "polyfillModuleNames", js.Array(value*))
    
    inline def setProcessModuleFilter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ /* modules */ Any => Boolean
    ): Self = StObject.set(x, "processModuleFilter", js.Any.fromFunction1(value))
    
    inline def setProcessModuleFilterUndefined: Self = StObject.set(x, "processModuleFilter", js.undefined)
  }
}
