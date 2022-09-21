package typings.ngPackagr

import typings.angularCompilerCli.performCompileMod.ParsedConfiguration
import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.Provider
import typings.ngPackagr.optionsDiMod.NgPackagrOptions
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagrMod {
  
  @JSImport("ng-packagr/lib/packagr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/packagr", "NgPackagr")
  @js.native
  open class NgPackagr_ protected () extends StObject {
    def this(providers: js.Array[Provider]) = this()
    
    /**
      * Builds the project by kick-starting the 'build' transform over an (initially) empty `BuildGraph``
      *
      * @return A promisified result of the transformation pipeline.
      */
    def build(): js.Promise[Unit] = js.native
    def build(options: NgPackagrOptions): js.Promise[Unit] = js.native
    
    /**
      * Builds the project by kick-starting the 'build' transform over an (initially) empty `BuildGraph``
      *
      * @return An observable result of the transformation pipeline.
      */
    def buildAsObservable(): Any = js.native
    
    /* private */ var buildTransform: Any = js.native
    
    /**
      * Sets the path to the user's "ng-package" file (either `package.json`, `ng-package.json`, or `ng-package.js`)
      *
      * @param project File path
      * @return Self instance for fluent API
      */
    def forProject(project: String): NgPackagr_ = js.native
    
    /* private */ var providers: Any = js.native
    
    /**
      * Builds and watch for changes by kick-starting the 'watch' transform over an (initially) empty `BuildGraph``
      *
      * @return An observable result of the transformation pipeline.
      */
    def watch(): Any = js.native
    def watch(options: NgPackagrOptions): Any = js.native
    
    /**
      * Overwrites the 'build' transform.
      *
      * @param transform
      * @return Self instance for fluent API
      */
    def withBuildTransform(transform: InjectionToken[Transform]): NgPackagr_ = js.native
    
    /**
      * Adds options to ng-packagr
      *
      * @param options Ng Packagr Options
      * @return Self instance for fluent API
      * @deprecated use the options parameter in 'build' and 'watch' methods
      */
    def withOptions(options: NgPackagrOptions): NgPackagr_ = js.native
    
    /**
      * Adds dependency injection providers.
      *
      * @param providers
      * @return Self instance for fluent API
      * @link https://github.com/mgechev/injection-js
      */
    def withProviders(providers: js.Array[Provider]): NgPackagr_ = js.native
    
    def withTsConfig(defaultValues: String): NgPackagr_ = js.native
    /**
      * Overwrites the default TypeScript configuration.
      *
      * @param defaultValues A tsconfig providing default values to the compilation.
      * @return Self instance for fluent API
      */
    def withTsConfig(defaultValues: ParsedConfiguration): NgPackagr_ = js.native
  }
  
  inline def ngPackagr(): NgPackagr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("ngPackagr")().asInstanceOf[NgPackagr_]
}
