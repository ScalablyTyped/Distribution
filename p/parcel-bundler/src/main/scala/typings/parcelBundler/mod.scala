package typings.parcelBundler

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.Server
import typings.parcelBundler.parcelBundlerBooleans.`false`
import typings.parcelBundler.parcelBundlerBooleans.`true`
import typings.parcelBundler.parcelBundlerNumbers.`0`
import typings.parcelBundler.parcelBundlerNumbers.`1`
import typings.parcelBundler.parcelBundlerNumbers.`2`
import typings.parcelBundler.parcelBundlerNumbers.`3`
import typings.parcelBundler.parcelBundlerStrings.browser
import typings.parcelBundler.parcelBundlerStrings.buildEnd
import typings.parcelBundler.parcelBundlerStrings.buildError
import typings.parcelBundler.parcelBundlerStrings.buildStart
import typings.parcelBundler.parcelBundlerStrings.bundled
import typings.parcelBundler.parcelBundlerStrings.electron
import typings.parcelBundler.parcelBundlerStrings.node
import typings.qs.mod.ParsedQs
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parcel-bundler", JSImport.Namespace)
  @js.native
  class ^ () extends ParcelBundler {
    def this(entryFiles: String) = this()
    def this(entryFiles: js.Array[String]) = this()
    def this(entryFiles: js.UndefOr[scala.Nothing], options: ParcelOptions) = this()
    def this(entryFiles: String, options: ParcelOptions) = this()
    def this(entryFiles: js.Array[String], options: ParcelOptions) = this()
  }
  
  @js.native
  trait HttpsOptions extends StObject {
    
    /**
      * Path to custom certificate
      *
      * @default "./ssl/c.crt"
      */
    var cert: js.UndefOr[String] = js.native
    
    /**
      * Path to custom key
      *
      * @default "./ssl/k.key"
      */
    var key: js.UndefOr[String] = js.native
  }
  object HttpsOptions {
    
    @scala.inline
    def apply(): HttpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsOptions]
    }
    
    @scala.inline
    implicit class HttpsOptionsMutableBuilder[Self <: HttpsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type ParcelAsset = js.Any
  
  @js.native
  trait ParcelBundle extends StObject {
    
    /**
      * A Set of all assets inside the bundle
      */
    var assets: Set[_] = js.native
    
    /**
      * A Set of all child bundles
      */
    var childBundles: Set[_] = js.native
    
    /**
      * The entryPoint of the bundle, used for generating the name and gathering assets.
      */
    var entryAsset: js.Any = js.native
    
    /**
      * The name of the bundle (generated using Asset.generateBundleName() of entryAsset)
      */
    var name: String = js.native
    
    /**
      * A Map<Asset, number(line number inside the bundle)> of all the locations of the assets inside the bundle, used to generate accurate source maps
      */
    var offsets: Map[ParcelAsset, Double] = js.native
    
    /**
      * The parent bundle, is null in case of the entry bundleany
      */
    var parentBundle: js.UndefOr[js.Any] = js.native
    
    /**
      * A Set of all sibling bundles
      */
    var siblingBundles: Set[_] = js.native
    
    /**
      * A Map<String(Type: js, css, map, ...), Bundle> of all sibling bundles
      */
    var siblingBundlesMap: Map[String, ParcelBundle] = js.native
    
    /**
      * The type of assets it contains (e.g. js, css, map, ...)
      */
    var `type`: String = js.native
  }
  object ParcelBundle {
    
    @scala.inline
    def apply(
      assets: Set[_],
      childBundles: Set[_],
      entryAsset: js.Any,
      name: String,
      offsets: Map[ParcelAsset, Double],
      siblingBundles: Set[_],
      siblingBundlesMap: Map[String, ParcelBundle],
      `type`: String
    ): ParcelBundle = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], childBundles = childBundles.asInstanceOf[js.Any], entryAsset = entryAsset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], siblingBundles = siblingBundles.asInstanceOf[js.Any], siblingBundlesMap = siblingBundlesMap.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParcelBundle]
    }
    
    @scala.inline
    implicit class ParcelBundleMutableBuilder[Self <: ParcelBundle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssets(value: Set[_]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildBundles(value: Set[_]): Self = StObject.set(x, "childBundles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryAsset(value: js.Any): Self = StObject.set(x, "entryAsset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsets(value: Map[ParcelAsset, Double]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentBundle(value: js.Any): Self = StObject.set(x, "parentBundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentBundleUndefined: Self = StObject.set(x, "parentBundle", js.undefined)
      
      @scala.inline
      def setSiblingBundles(value: Set[_]): Self = StObject.set(x, "siblingBundles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiblingBundlesMap(value: Map[String, ParcelBundle]): Self = StObject.set(x, "siblingBundlesMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParcelBundler extends StObject {
    
    def addAssetType(extension: String, path: String): Unit = js.native
    
    def addPackager(`type`: String, packager: String): Unit = js.native
    
    def bundle(): js.Promise[ParcelBundle] = js.native
    
    def middleware(): js.Function3[
        /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
        /* res */ Response[_, Double], 
        /* next */ NextFunction, 
        _
      ] = js.native
    
    @JSName("off")
    def off_buildEnd(name: buildEnd, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("off")
    def off_buildError(name: buildError, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("off")
    def off_buildStart(name: buildStart, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("off")
    def off_bundled(name: bundled, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    @JSName("on")
    def on_buildEnd(name: buildEnd, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_buildError(name: buildError, cb: js.Function1[/* error */ Error, Unit]): Unit = js.native
    @JSName("on")
    def on_buildStart(name: buildStart, cb: js.Function1[/* entryPoints */ js.Array[String], Unit]): Unit = js.native
    @JSName("on")
    def on_bundled(name: bundled, cb: js.Function1[/* bundle */ ParcelBundle, Unit]): Unit = js.native
    
    def serve(): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: js.UndefOr[scala.Nothing], https: js.UndefOr[scala.Nothing], host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: js.UndefOr[scala.Nothing], https: HttpsOptions): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: js.UndefOr[scala.Nothing], https: HttpsOptions, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: Double): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: Double, https: js.UndefOr[scala.Nothing], host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: Double, https: HttpsOptions): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    def serve(port: Double, https: HttpsOptions, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_false(port: js.UndefOr[scala.Nothing], https: `false`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_false(port: js.UndefOr[scala.Nothing], https: `false`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_false(port: Double, https: `false`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_false(port: Double, https: `false`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_true(port: js.UndefOr[scala.Nothing], https: `true`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_true(port: js.UndefOr[scala.Nothing], https: `true`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_true(port: Double, https: `true`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
    @JSName("serve")
    def serve_true(port: Double, https: `true`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  }
  
  @js.native
  trait ParcelOptions extends StObject {
    
    /**
      * By default, package.json dependencies are not included when using 'node' or 'electron' with the 'target' option.
      *
      * Set to true to add them to the bundle.
      *
      * @default false
      */
    var bundleNodeModules: js.UndefOr[`true` | `false`] = js.native
    
    /**
      * Enabled or disables caching
      *
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.native
    
    /**
      * The directory cache gets put in
      *
      * @default ".cache"
      */
    var cacheDir: js.UndefOr[String] = js.native
    
    /**
      * Disable content hash from being included on the filename
      *
      * @default false
      */
    var contentHash: js.UndefOr[Boolean] = js.native
    
    /**
      * Prints a detailed report of the bundles, assets, filesizes and times
      *
      * Reports are only printed if watch is disabled
      *
      * @default false
      */
    var detailedReport: js.UndefOr[Boolean] = js.native
    
    /**
      * Expose modules as UMD under this name, disabled by default
      */
    var global: js.UndefOr[String] = js.native
    
    /**
      * Enable or disable HMR while watching
      *
      * @default false
      */
    var hmr: js.UndefOr[`true` | `false`] = js.native
    
    /**
      * A hostname for hot module reload
      *
      * @default ""
      */
    var hmrHostname: js.UndefOr[String] = js.native
    
    /**
      * The port the HMR socket runs on
      *
      * Defaults to a random free port (0 in node.js resolves to a random free port)
      *
      * @default 0
      */
    var hmrPort: js.UndefOr[`0` | Double] = js.native
    
    /**
      * Define a custom {key, cert} pair
      *
      * Use true to generate one or false to use http
      */
    var https: js.UndefOr[`true` | `false` | HttpsOptions] = js.native
    
    /**
      * 3 = log everything, 2 = log warnings & errors, 1 = log errors
      *
      * @default 3
      */
    var logLevel: js.UndefOr[`3` | `2` | `1`] = js.native
    
    /**
      * Minify files
      *
      * @default process.env.NODE_ENV === 'production'
      */
    var minify: js.UndefOr[Boolean] = js.native
    
    /**
      * The out directory to put the build files in
      *
      * @default "./dist"
      */
    var outDir: js.UndefOr[String] = js.native
    
    /**
      * The name of the outputFile
      *
      * @default "index.html"
      */
    var outFile: js.UndefOr[String] = js.native
    
    /**
      * The url to server on
      *
      * @default "./"
      */
    var publicUrl: js.UndefOr[String] = js.native
    
    /**
      * Turn on experimental scope hoisting/tree shaking flag, for smaller production bundles
      *
      * @default false
      */
    var scopeHoist: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable sourcemaps
      *
      * Defaults to enabled (not supported in minified builds yet)
      *
      * @default true
      */
    var sourceMaps: js.UndefOr[Boolean] = js.native
    
    /**
      * @default "browser"
      */
    var target: js.UndefOr[browser | node | electron] = js.native
    
    /**
      * Whether to watch the files and rebuild them on change
      *
      * @default process.env.NODE_ENV !== 'production'
      */
    var watch: js.UndefOr[Boolean] = js.native
  }
  object ParcelOptions {
    
    @scala.inline
    def apply(): ParcelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParcelOptions]
    }
    
    @scala.inline
    implicit class ParcelOptionsMutableBuilder[Self <: ParcelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundleNodeModules(value: `true` | `false`): Self = StObject.set(x, "bundleNodeModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleNodeModulesUndefined: Self = StObject.set(x, "bundleNodeModules", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContentHash(value: Boolean): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
      
      @scala.inline
      def setDetailedReport(value: Boolean): Self = StObject.set(x, "detailedReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailedReportUndefined: Self = StObject.set(x, "detailedReport", js.undefined)
      
      @scala.inline
      def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setHmr(value: `true` | `false`): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrHostname(value: String): Self = StObject.set(x, "hmrHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrHostnameUndefined: Self = StObject.set(x, "hmrHostname", js.undefined)
      
      @scala.inline
      def setHmrPort(value: `0` | Double): Self = StObject.set(x, "hmrPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrPortUndefined: Self = StObject.set(x, "hmrPort", js.undefined)
      
      @scala.inline
      def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      @scala.inline
      def setHttps(value: `true` | `false` | HttpsOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLogLevel(value: `3` | `2` | `1`): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      @scala.inline
      def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
      
      @scala.inline
      def setScopeHoist(value: Boolean): Self = StObject.set(x, "scopeHoist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeHoistUndefined: Self = StObject.set(x, "scopeHoist", js.undefined)
      
      @scala.inline
      def setSourceMaps(value: Boolean): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      @scala.inline
      def setTarget(value: browser | node | electron): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
