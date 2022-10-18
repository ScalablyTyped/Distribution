package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.distServerApiUtilsMod.ApiPreviewProps
import typings.next.nextBooleans.`false`
import typings.next.nextInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildMod {
  
  @JSImport("next/dist/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Boolean, debugOutput: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Boolean, debugOutput: Boolean, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Boolean, debugOutput: Unit, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Unit, debugOutput: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Unit, debugOutput: Boolean, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Null, reactProductionProfiling: Unit, debugOutput: Unit, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Boolean, debugOutput: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Boolean, debugOutput: Boolean, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Boolean, debugOutput: Unit, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Unit, debugOutput: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Unit, debugOutput: Boolean, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, conf: Unit, reactProductionProfiling: Unit, debugOutput: Unit, runLint: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], reactProductionProfiling.asInstanceOf[js.Any], debugOutput.asInstanceOf[js.Any], runLint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DynamicSsgRoute extends StObject {
    
    var dataRoute: String
    
    var dataRouteRegex: String
    
    var fallback: String | Null | `false`
    
    var routeRegex: String
  }
  object DynamicSsgRoute {
    
    inline def apply(dataRoute: String, dataRouteRegex: String, routeRegex: String): DynamicSsgRoute = {
      val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], dataRouteRegex = dataRouteRegex.asInstanceOf[js.Any], routeRegex = routeRegex.asInstanceOf[js.Any], fallback = null)
      __obj.asInstanceOf[DynamicSsgRoute]
    }
    
    extension [Self <: DynamicSsgRoute](x: Self) {
      
      inline def setDataRoute(value: String): Self = StObject.set(x, "dataRoute", value.asInstanceOf[js.Any])
      
      inline def setDataRouteRegex(value: String): Self = StObject.set(x, "dataRouteRegex", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: String | `false`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setRouteRegex(value: String): Self = StObject.set(x, "routeRegex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrerenderManifest extends StObject {
    
    var dynamicRoutes: StringDictionary[DynamicSsgRoute]
    
    var notFoundRoutes: js.Array[String]
    
    var preview: ApiPreviewProps
    
    var routes: StringDictionary[SsgRoute]
    
    var version: `3`
  }
  object PrerenderManifest {
    
    inline def apply(
      dynamicRoutes: StringDictionary[DynamicSsgRoute],
      notFoundRoutes: js.Array[String],
      preview: ApiPreviewProps,
      routes: StringDictionary[SsgRoute]
    ): PrerenderManifest = {
      val __obj = js.Dynamic.literal(dynamicRoutes = dynamicRoutes.asInstanceOf[js.Any], notFoundRoutes = notFoundRoutes.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[PrerenderManifest]
    }
    
    extension [Self <: PrerenderManifest](x: Self) {
      
      inline def setDynamicRoutes(value: StringDictionary[DynamicSsgRoute]): Self = StObject.set(x, "dynamicRoutes", value.asInstanceOf[js.Any])
      
      inline def setNotFoundRoutes(value: js.Array[String]): Self = StObject.set(x, "notFoundRoutes", value.asInstanceOf[js.Any])
      
      inline def setNotFoundRoutesVarargs(value: String*): Self = StObject.set(x, "notFoundRoutes", js.Array(value*))
      
      inline def setPreview(value: ApiPreviewProps): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: StringDictionary[SsgRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SsgRoute extends StObject {
    
    var dataRoute: String
    
    var initialRevalidateSeconds: Double | `false`
    
    var srcRoute: String | Null
  }
  object SsgRoute {
    
    inline def apply(dataRoute: String, initialRevalidateSeconds: Double | `false`): SsgRoute = {
      val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], initialRevalidateSeconds = initialRevalidateSeconds.asInstanceOf[js.Any], srcRoute = null)
      __obj.asInstanceOf[SsgRoute]
    }
    
    extension [Self <: SsgRoute](x: Self) {
      
      inline def setDataRoute(value: String): Self = StObject.set(x, "dataRoute", value.asInstanceOf[js.Any])
      
      inline def setInitialRevalidateSeconds(value: Double | `false`): Self = StObject.set(x, "initialRevalidateSeconds", value.asInstanceOf[js.Any])
      
      inline def setSrcRoute(value: String): Self = StObject.set(x, "srcRoute", value.asInstanceOf[js.Any])
      
      inline def setSrcRouteNull: Self = StObject.set(x, "srcRoute", null)
    }
  }
}
