package typings.ngtoolsWebpack

import typings.ngtoolsWebpack.anon.FnCall
import typings.ngtoolsWebpack.anon.TypeofimportedNgcc
import typings.ngtoolsWebpack.systemMod.InputFileSystem
import typings.std.ReturnType
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedTypeReferenceDirective
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccProcessorMod {
  
  @JSImport("@ngtools/webpack/src/ngcc_processor", "NgccProcessor")
  @js.native
  open class NgccProcessor protected () extends StObject {
    def this(
      compilerNgcc: TypeofimportedNgcc,
      propertiesToConsider: js.Array[String],
      compilationWarnings: js.Array[js.Error | String],
      compilationErrors: js.Array[js.Error | String],
      basePath: String,
      tsConfigPath: String,
      inputFileSystem: InputFileSystem,
      resolver: ResolverWithOptions
    ) = this()
    
    /* private */ var _logger: Any = js.native
    
    /* private */ var _nodeModulesDirectory: Any = js.native
    
    /* private */ var _processedModules: Any = js.native
    
    /* private */ val basePath: Any = js.native
    
    /* private */ val compilationErrors: Any = js.native
    
    /* private */ val compilationWarnings: Any = js.native
    
    /* private */ val compilerNgcc: Any = js.native
    
    /* private */ var findNodeModulesDirectory: Any = js.native
    
    /* private */ var findPackageManagerLockFile: Any = js.native
    
    /* private */ val inputFileSystem: Any = js.native
    
    def invalidate(fileName: String): Unit = js.native
    
    /** Process the entire node modules tree. */
    def process(): Unit = js.native
    
    /** Process a module and its dependencies. */
    def processModule(moduleName: String, resolvedModule: ResolvedModule): Unit = js.native
    def processModule(moduleName: String, resolvedModule: ResolvedTypeReferenceDirective): Unit = js.native
    
    /* private */ val propertiesToConsider: Any = js.native
    
    /* private */ val resolver: Any = js.native
    
    /**
      * Try resolve a package.json file from the resolved .d.ts file.
      */
    /* private */ var tryResolvePackage: Any = js.native
    
    /* private */ val tsConfigPath: Any = js.native
  }
  
  type ResolverWithOptions = ReturnType[FnCall]
}
