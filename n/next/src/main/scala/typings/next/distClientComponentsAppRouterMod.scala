package typings.next

import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.nextBooleans.`true`
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsAppRouterMod {
  
  @JSImport("next/dist/client/components/app-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AppRouterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def fetchServerResponse(url: URL, flightRouterState: FlightRouterState): js.Promise[
    js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchServerResponse")(url.asInstanceOf[js.Any], flightRouterState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
  ]]
  
  inline def fetchServerResponse_true(url: URL, flightRouterState: FlightRouterState, prefetch: `true`): js.Promise[
    js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchServerResponse")(url.asInstanceOf[js.Any], flightRouterState.asInstanceOf[js.Any], prefetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
  ]]
  
  trait AppRouterProps extends StObject {
    
    var assetPrefix: String
    
    var children: ReactNode
    
    var initialCanonicalUrl: String
    
    var initialHead: ReactNode
    
    var initialTree: FlightRouterState
  }
  object AppRouterProps {
    
    inline def apply(assetPrefix: String, initialCanonicalUrl: String, initialTree: FlightRouterState): AppRouterProps = {
      val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], initialCanonicalUrl = initialCanonicalUrl.asInstanceOf[js.Any], initialTree = initialTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppRouterProps]
    }
    
    extension [Self <: AppRouterProps](x: Self) {
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialCanonicalUrl(value: String): Self = StObject.set(x, "initialCanonicalUrl", value.asInstanceOf[js.Any])
      
      inline def setInitialHead(value: ReactNode): Self = StObject.set(x, "initialHead", value.asInstanceOf[js.Any])
      
      inline def setInitialHeadUndefined: Self = StObject.set(x, "initialHead", js.undefined)
      
      inline def setInitialTree(value: FlightRouterState): Self = StObject.set(x, "initialTree", value.asInstanceOf[js.Any])
    }
  }
}
