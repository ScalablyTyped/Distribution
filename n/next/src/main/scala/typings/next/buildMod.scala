package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.nextBooleans.`false`
import typings.next.nextNumbers.`2`
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(dir: String): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(
    dir: String,
    conf: js.UndefOr[scala.Nothing],
    reactProductionProfiling: js.UndefOr[scala.Nothing],
    debugOutput: Boolean
  ): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(dir: String, conf: js.UndefOr[scala.Nothing], reactProductionProfiling: Boolean): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(
    dir: String,
    conf: js.UndefOr[scala.Nothing],
    reactProductionProfiling: Boolean,
    debugOutput: Boolean
  ): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(dir: String, conf: Null, reactProductionProfiling: js.UndefOr[scala.Nothing], debugOutput: Boolean): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(dir: String, conf: Null, reactProductionProfiling: Boolean): js.Promise[Unit] = js.native
  @JSImport("next/dist/build", JSImport.Default)
  @js.native
  def default(dir: String, conf: Null, reactProductionProfiling: Boolean, debugOutput: Boolean): js.Promise[Unit] = js.native
  
  type ClientSsgManifest = Set[String]
  
  @js.native
  trait DynamicSsgRoute extends StObject {
    
    var dataRoute: String = js.native
    
    var dataRouteRegex: String = js.native
    
    var fallback: String | Null | `false` = js.native
    
    var routeRegex: String = js.native
  }
  object DynamicSsgRoute {
    
    @scala.inline
    def apply(dataRoute: String, dataRouteRegex: String, routeRegex: String): DynamicSsgRoute = {
      val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], dataRouteRegex = dataRouteRegex.asInstanceOf[js.Any], routeRegex = routeRegex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicSsgRoute]
    }
    
    @scala.inline
    implicit class DynamicSsgRouteMutableBuilder[Self <: DynamicSsgRoute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataRoute(value: String): Self = StObject.set(x, "dataRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataRouteRegex(value: String): Self = StObject.set(x, "dataRouteRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallback(value: String | `false`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      @scala.inline
      def setRouteRegex(value: String): Self = StObject.set(x, "routeRegex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrerenderManifest extends StObject {
    
    var dynamicRoutes: StringDictionary[DynamicSsgRoute] = js.native
    
    var notFoundRoutes: js.Array[String] = js.native
    
    var preview: ApiPreviewProps = js.native
    
    var routes: StringDictionary[SsgRoute] = js.native
    
    var version: `2` = js.native
  }
  object PrerenderManifest {
    
    @scala.inline
    def apply(
      dynamicRoutes: StringDictionary[DynamicSsgRoute],
      notFoundRoutes: js.Array[String],
      preview: ApiPreviewProps,
      routes: StringDictionary[SsgRoute],
      version: `2`
    ): PrerenderManifest = {
      val __obj = js.Dynamic.literal(dynamicRoutes = dynamicRoutes.asInstanceOf[js.Any], notFoundRoutes = notFoundRoutes.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrerenderManifest]
    }
    
    @scala.inline
    implicit class PrerenderManifestMutableBuilder[Self <: PrerenderManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRoutes(value: StringDictionary[DynamicSsgRoute]): Self = StObject.set(x, "dynamicRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundRoutes(value: js.Array[String]): Self = StObject.set(x, "notFoundRoutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundRoutesVarargs(value: String*): Self = StObject.set(x, "notFoundRoutes", js.Array(value :_*))
      
      @scala.inline
      def setPreview(value: ApiPreviewProps): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: StringDictionary[SsgRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: `2`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SsgRoute extends StObject {
    
    var dataRoute: String = js.native
    
    var initialRevalidateSeconds: Double | `false` = js.native
    
    var srcRoute: String | Null = js.native
  }
  object SsgRoute {
    
    @scala.inline
    def apply(dataRoute: String, initialRevalidateSeconds: Double | `false`): SsgRoute = {
      val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], initialRevalidateSeconds = initialRevalidateSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[SsgRoute]
    }
    
    @scala.inline
    implicit class SsgRouteMutableBuilder[Self <: SsgRoute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataRoute(value: String): Self = StObject.set(x, "dataRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRevalidateSeconds(value: Double | `false`): Self = StObject.set(x, "initialRevalidateSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcRoute(value: String): Self = StObject.set(x, "srcRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcRouteNull: Self = StObject.set(x, "srcRoute", null)
    }
  }
}
