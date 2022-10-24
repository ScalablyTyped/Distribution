package typings.msportalfxMock

import typings.express.mod.Request_
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Context
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Request
import typings.msportalfxMock.libSrcMockFxMod.MockFx.TargetDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxTargetsArmMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/ARM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createARMTarget(param0: ARMDefinitionConfiguration): TargetDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createARMTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[TargetDefinition]
  
  inline def getNormalizedUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined parent std.Pick<msportalfx-mock.msportalfx-mock/lib/src/MockFx.MockFx.TargetDefinition, 'loadRequests' | 'storeRequests' | 'onBeforeRequestMatch'> */
  trait ARMDefinitionConfiguration extends StObject {
    
    /**
      * *Replay mode*
      *
      * Called on incoming request to match it against a stored request
      *
      * @param {Express.Request} request - the incoming request
      * @param {string} normalizedUrl - the normalized URL for the incoming request with
      * @param {MockFx.Request[]} mockRequest - the stored mock request to compare against the incoming request
      * @param {MockFx.Context} context - the mock context object for the currently running test
      * @returns {boolean} if the stored mock request matches the incoming request
      */
    var customMatchRequest: js.UndefOr[
        js.Function4[
          /* request */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* normalizedUrl */ String, 
          /* mockRequest */ Request, 
          /* context */ Context, 
          Boolean
        ]
      ] = js.undefined
    
    var host: String
    
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
    
    def storeRequests(context: Context, requests: js.Array[Request]): js.Promise[Unit]
    @JSName("storeRequests")
    var storeRequests_Original: js.Function2[/* context */ Context, /* requests */ js.Array[Request], js.Promise[Unit]]
  }
  object ARMDefinitionConfiguration {
    
    inline def apply(
      host: String,
      loadRequests: /* context */ Context => js.Promise[js.Array[Request]],
      storeRequests: (/* context */ Context, /* requests */ js.Array[Request]) => js.Promise[Unit]
    ): ARMDefinitionConfiguration = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], loadRequests = js.Any.fromFunction1(loadRequests), storeRequests = js.Any.fromFunction2(storeRequests))
      __obj.asInstanceOf[ARMDefinitionConfiguration]
    }
    
    extension [Self <: ARMDefinitionConfiguration](x: Self) {
      
      inline def setCustomMatchRequest(
        value: (/* request */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* normalizedUrl */ String, /* mockRequest */ Request, /* context */ Context) => Boolean
      ): Self = StObject.set(x, "customMatchRequest", js.Any.fromFunction4(value))
      
      inline def setCustomMatchRequestUndefined: Self = StObject.set(x, "customMatchRequest", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
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
      
      inline def setStoreRequests(value: (/* context */ Context, /* requests */ js.Array[Request]) => js.Promise[Unit]): Self = StObject.set(x, "storeRequests", js.Any.fromFunction2(value))
    }
  }
}
