package typings.msportalfxMock

import typings.express.mod.Request_
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Context
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Request
import typings.msportalfxMock.libSrcMockFxMod.MockFx.TargetDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxTargetsStorageMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/Storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStorageTarget(
    hasStorageEndpointSuffixLoadRequestsStoreRequestsOnBeforeRequestMatch: StorageDefinitionConfiguration
  ): TargetDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createStorageTarget")(hasStorageEndpointSuffixLoadRequestsStoreRequestsOnBeforeRequestMatch.asInstanceOf[js.Any]).asInstanceOf[TargetDefinition]
  
  /* Inlined parent std.Pick<msportalfx-mock.msportalfx-mock/lib/src/MockFx.MockFx.TargetDefinition, 'loadRequests' | 'storeRequests' | 'onBeforeRequestMatch'> */
  trait StorageDefinitionConfiguration extends StObject {
    
    def loadRequests(context: Context): js.Promise[js.Array[Request]]
    @JSName("loadRequests")
    var loadRequests_Original: js.Function1[/* context */ Context, js.Promise[js.Array[Request]]]
    
    var onBeforeRequestMatch: js.UndefOr[
        js.Function3[
          /* request */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* context */ Context, 
          /* storedRequests */ js.Array[Request], 
          js.Promise[js.Array[Request]]
        ]
      ] = js.undefined
    
    var storageEndpointSuffix: String
    
    def storeRequests(context: Context, requests: js.Array[Request]): js.Promise[Unit]
    @JSName("storeRequests")
    var storeRequests_Original: js.Function2[/* context */ Context, /* requests */ js.Array[Request], js.Promise[Unit]]
  }
  object StorageDefinitionConfiguration {
    
    inline def apply(
      loadRequests: /* context */ Context => js.Promise[js.Array[Request]],
      storageEndpointSuffix: String,
      storeRequests: (/* context */ Context, /* requests */ js.Array[Request]) => js.Promise[Unit]
    ): StorageDefinitionConfiguration = {
      val __obj = js.Dynamic.literal(loadRequests = js.Any.fromFunction1(loadRequests), storageEndpointSuffix = storageEndpointSuffix.asInstanceOf[js.Any], storeRequests = js.Any.fromFunction2(storeRequests))
      __obj.asInstanceOf[StorageDefinitionConfiguration]
    }
    
    extension [Self <: StorageDefinitionConfiguration](x: Self) {
      
      inline def setLoadRequests(value: /* context */ Context => js.Promise[js.Array[Request]]): Self = StObject.set(x, "loadRequests", js.Any.fromFunction1(value))
      
      inline def setOnBeforeRequestMatch(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* context */ Context, /* storedRequests */ js.Array[Request]) => js.Promise[js.Array[Request]]
      ): Self = StObject.set(x, "onBeforeRequestMatch", js.Any.fromFunction3(value))
      
      inline def setOnBeforeRequestMatchUndefined: Self = StObject.set(x, "onBeforeRequestMatch", js.undefined)
      
      inline def setStorageEndpointSuffix(value: String): Self = StObject.set(x, "storageEndpointSuffix", value.asInstanceOf[js.Any])
      
      inline def setStoreRequests(value: (/* context */ Context, /* requests */ js.Array[Request]) => js.Promise[Unit]): Self = StObject.set(x, "storeRequests", js.Any.fromFunction2(value))
    }
  }
}
