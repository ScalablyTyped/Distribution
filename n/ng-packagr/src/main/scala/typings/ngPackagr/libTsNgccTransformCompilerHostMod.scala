package typings.ngPackagr

import typings.ngPackagr.libNgcNgccProcessorMod.NgccProcessor
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTsNgccTransformCompilerHostMod {
  
  @JSImport("ng-packagr/lib/ts/ngcc-transform-compiler-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngccTransformCompilerHost(
    compilerHost: CompilerHost,
    compilerOptions: CompilerOptions,
    ngccProcessor: NgccProcessor,
    moduleResolutionCache: ModuleResolutionCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("ngccTransformCompilerHost")(compilerHost.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], ngccProcessor.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
}
