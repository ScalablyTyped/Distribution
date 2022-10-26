package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.distBuildWebpackPluginsFlightManifestPluginMod.FlightCSSManifest
import typings.next.distBuildWebpackPluginsFlightManifestPluginMod.FlightManifest
import typings.next.distBuildWebpackPluginsFontLoaderManifestPluginMod.FontLoaderManifest
import typings.next.distServerGetPageFilesMod.BuildManifest
import typings.next.distServerLoadComponentsMod.LoadComponentsReturnType
import typings.next.distServerLoadComponentsMod.ReactLoadableManifest
import typings.next.distServerRenderResultMod.default
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distSharedLibUtilsMod.AppType
import typings.next.distSharedLibUtilsMod.DocumentType
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.next.distSharedLibUtilsMod.NextPageContext
import typings.next.nextStrings.refetch
import typings.next.typesMod.PageConfig
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerAppRenderMod {
  
  @JSImport("next/dist/server/app-render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToHTMLOrFlight(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    pathname: String,
    query: NextParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[default | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToHTMLOrFlight")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], renderOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default | Null]]
  
  trait ChildProp extends StObject {
    
    /**
      * Null indicates that the tree is partial
      */
    var current: ReactNode | Null
    
    var segment: Segment
  }
  object ChildProp {
    
    inline def apply(segment: Segment): ChildProp = {
      val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildProp]
    }
    
    extension [Self <: ChildProp](x: Self) {
      
      inline def setCurrent(value: ReactNode): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setSegment(value: Segment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.c
    - typings.next.nextStrings.oc
    - typings.next.nextStrings.d
  */
  trait DynamicParamTypesShort extends StObject
  object DynamicParamTypesShort {
    
    inline def c: typings.next.nextStrings.c = "c".asInstanceOf[typings.next.nextStrings.c]
    
    inline def d: typings.next.nextStrings.d = "d".asInstanceOf[typings.next.nextStrings.d]
    
    inline def oc: typings.next.nextStrings.oc = "oc".asInstanceOf[typings.next.nextStrings.oc]
  }
  
  type FlightData = js.Array[FlightDataPath] | String
  
  type FlightDataPath = js.Array[
    Any | js.Array[Any] | (js.Tuple6[
      /* segment */ Segment, 
      /* parallelRouterKey */ String, 
      /* segment */ Segment, 
      /* parallelRouterKey */ String, 
      /* segment */ Segment, 
      /* parallelRouterKey */ String
    ])
  ]
  
  type FlightRouterState = js.Tuple5[
    /* segment */ Segment, 
    /* parallelRoutes */ StringDictionary[Any], 
    /* url */ js.UndefOr[String], 
    /* refresh */ js.UndefOr[refetch], 
    /* isRootLayout */ js.UndefOr[Boolean]
  ]
  
  type FlightSegmentPath = js.Array[Any] | (js.Tuple6[
    /* segment */ Segment, 
    /* parallelRouterKey */ String, 
    /* segment */ Segment, 
    /* parallelRouterKey */ String, 
    /* segment */ Segment, 
    /* parallelRouterKey */ String
  ])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.next.distServerAppRenderMod.RenderOptsPartial because var conflicts: serverComponentManifest. Inlined err, dev, serverCSSManifest, supportsDynamicHTML, runtime, serverComponents, assetPrefix, fontLoaderManifest, isBot */ trait RenderOpts
    extends StObject
       with LoadComponentsReturnType {
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var err: js.UndefOr[js.Error | Null] = js.undefined
    
    var fontLoaderManifest: js.UndefOr[FontLoaderManifest] = js.undefined
    
    var isBot: js.UndefOr[Boolean] = js.undefined
    
    var runtime: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
      ] = js.undefined
    
    var serverCSSManifest: js.UndefOr[FlightCSSManifest] = js.undefined
    
    var serverComponents: js.UndefOr[Boolean] = js.undefined
    
    var supportsDynamicHTML: js.UndefOr[Boolean] = js.undefined
  }
  object RenderOpts {
    
    inline def apply(
      App: AppType[js.Object],
      Component: NextComponentType[NextPageContext, js.Object, js.Object],
      ComponentMod: Any,
      Document: DocumentType,
      buildManifest: BuildManifest,
      pageConfig: PageConfig,
      pathname: String,
      reactLoadableManifest: ReactLoadableManifest
    ): RenderOpts = {
      val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], ComponentMod = ComponentMod.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOpts]
    }
    
    extension [Self <: RenderOpts](x: Self) {
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setFontLoaderManifest(value: FontLoaderManifest): Self = StObject.set(x, "fontLoaderManifest", value.asInstanceOf[js.Any])
      
      inline def setFontLoaderManifestUndefined: Self = StObject.set(x, "fontLoaderManifest", js.undefined)
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setIsBotUndefined: Self = StObject.set(x, "isBot", js.undefined)
      
      inline def setRuntime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
      ): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServerCSSManifest(value: FlightCSSManifest): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
      
      inline def setServerCSSManifestUndefined: Self = StObject.set(x, "serverCSSManifest", js.undefined)
      
      inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
      
      inline def setSupportsDynamicHTML(value: Boolean): Self = StObject.set(x, "supportsDynamicHTML", value.asInstanceOf[js.Any])
      
      inline def setSupportsDynamicHTMLUndefined: Self = StObject.set(x, "supportsDynamicHTML", js.undefined)
    }
  }
  
  trait RenderOptsPartial extends StObject {
    
    var assetPrefix: js.UndefOr[String] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var err: js.UndefOr[js.Error | Null] = js.undefined
    
    var fontLoaderManifest: js.UndefOr[FontLoaderManifest] = js.undefined
    
    var isBot: js.UndefOr[Boolean] = js.undefined
    
    var runtime: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
      ] = js.undefined
    
    var serverCSSManifest: js.UndefOr[FlightCSSManifest] = js.undefined
    
    var serverComponentManifest: js.UndefOr[FlightManifest] = js.undefined
    
    var serverComponents: js.UndefOr[Boolean] = js.undefined
    
    var supportsDynamicHTML: js.UndefOr[Boolean] = js.undefined
  }
  object RenderOptsPartial {
    
    inline def apply(): RenderOptsPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptsPartial]
    }
    
    extension [Self <: RenderOptsPartial](x: Self) {
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setFontLoaderManifest(value: FontLoaderManifest): Self = StObject.set(x, "fontLoaderManifest", value.asInstanceOf[js.Any])
      
      inline def setFontLoaderManifestUndefined: Self = StObject.set(x, "fontLoaderManifest", js.undefined)
      
      inline def setIsBot(value: Boolean): Self = StObject.set(x, "isBot", value.asInstanceOf[js.Any])
      
      inline def setIsBotUndefined: Self = StObject.set(x, "isBot", js.undefined)
      
      inline def setRuntime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServerRuntime */ Any
      ): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setServerCSSManifest(value: FlightCSSManifest): Self = StObject.set(x, "serverCSSManifest", value.asInstanceOf[js.Any])
      
      inline def setServerCSSManifestUndefined: Self = StObject.set(x, "serverCSSManifest", js.undefined)
      
      inline def setServerComponentManifest(value: FlightManifest): Self = StObject.set(x, "serverComponentManifest", value.asInstanceOf[js.Any])
      
      inline def setServerComponentManifestUndefined: Self = StObject.set(x, "serverComponentManifest", js.undefined)
      
      inline def setServerComponents(value: Boolean): Self = StObject.set(x, "serverComponents", value.asInstanceOf[js.Any])
      
      inline def setServerComponentsUndefined: Self = StObject.set(x, "serverComponents", js.undefined)
      
      inline def setSupportsDynamicHTML(value: Boolean): Self = StObject.set(x, "supportsDynamicHTML", value.asInstanceOf[js.Any])
      
      inline def setSupportsDynamicHTMLUndefined: Self = StObject.set(x, "supportsDynamicHTML", js.undefined)
    }
  }
  
  type Segment = String | (js.Tuple3[/* param */ String, /* value */ String, /* type */ DynamicParamTypesShort])
}
