package typings.ngtoolsWebpack

import typings.ngtoolsWebpack.anon.Issuer
import typings.std.IterableIterator
import typings.std.NonNullable
import typings.typescript.mod.MapLike
import typings.webpack.mod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsPluginMod {
  
  @JSImport("@ngtools/webpack/src/paths-plugin", "TypeScriptPathsPlugin")
  @js.native
  open class TypeScriptPathsPlugin () extends StObject {
    def this(options: TypeScriptPathsPluginOptions) = this()
    
    @JSName("apply")
    def apply(resolver: Resolver): Unit = js.native
    
    /* private */ var baseUrl: Any = js.native
    
    def createReplacementRequests(request: PathPluginResolverRequest, originalRequest: String): IterableIterator[PathPluginResolverRequest] = js.native
    
    def findReplacements(originalRequest: String): IterableIterator[String] = js.native
    
    /* private */ var patterns: Any = js.native
    
    /**
      * Update the plugin with new path mapping option values.
      * The options will also be preprocessed to reduce the overhead of individual resolve actions
      * during a build.
      *
      * @param options The `paths` and `baseUrl` options from TypeScript's `CompilerOptions`.
      */
    def update(options: TypeScriptPathsPluginOptions): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Parameters<std.Parameters<(context : object, path : string, request : string, resolveContext : webpack.webpack.ResolveContext, callback : (arg0 : null | std.Error, arg1 : string | false | undefined, arg2 : webpack.webpack.ResolveRequest | undefined): void): void>[4]>[2]
  - Lifted 0 members from Set(std.NonNullable<std.Parameters<std.Parameters<(context : object, path : string, request : string, resolveContext : webpack.webpack.ResolveContext, callback : (arg0 : null | std.Error, arg1 : string | false | undefined, arg2 : webpack.webpack.ResolveRequest | undefined): void): void>[4]>[2]>) */ trait PathPluginResolverRequest extends StObject {
    
    var context: js.UndefOr[Issuer] = js.undefined
    
    var typescriptPathMapped: js.UndefOr[Boolean] = js.undefined
  }
  object PathPluginResolverRequest {
    
    inline def apply(): PathPluginResolverRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathPluginResolverRequest]
    }
    
    extension [Self <: PathPluginResolverRequest](x: Self) {
      
      inline def setContext(value: Issuer): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTypescriptPathMapped(value: Boolean): Self = StObject.set(x, "typescriptPathMapped", value.asInstanceOf[js.Any])
      
      inline def setTypescriptPathMappedUndefined: Self = StObject.set(x, "typescriptPathMapped", js.undefined)
    }
  }
  
  type ResolverRequest = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Parameters<(context : object, path : string, request : string, resolveContext : webpack.webpack.ResolveContext, callback : (arg0 : null | std.Error, arg1 : string | false | undefined, arg2 : webpack.webpack.ResolveRequest | undefined): void): void>[4]>[2] */ js.Any
  ]
  
  /* Inlined parent std.Pick<typescript.typescript.CompilerOptions, 'paths' | 'baseUrl'> */
  trait TypeScriptPathsPluginOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var paths: js.UndefOr[MapLike[js.Array[String]]] = js.undefined
  }
  object TypeScriptPathsPluginOptions {
    
    inline def apply(): TypeScriptPathsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeScriptPathsPluginOptions]
    }
    
    extension [Self <: TypeScriptPathsPluginOptions](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setPaths(value: MapLike[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    }
  }
}
