package typings.ngtoolsWebpack

import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.ngtoolsWebpack.anon.PartialAngularWebpackPlug
import typings.std.Record
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyPluginMod {
  
  @JSImport("@ngtools/webpack/src/ivy/plugin", "AngularWebpackPlugin")
  @js.native
  open class AngularWebpackPlugin () extends StObject {
    def this(options: PartialAngularWebpackPlug) = this()
    
    /* private */ var addFileEmitHistory: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var builder: Any = js.native
    
    /* private */ def compilerCli: Any = js.native
    
    /* private */ var compilerCliModule: Any = js.native
    
    /* private */ var compilerNgccModule: Any = js.native
    
    /* private */ var createFileEmitter: Any = js.native
    
    /* private */ val fileDependencies: Any = js.native
    
    /* private */ val fileEmitHistory: Any = js.native
    
    /* private */ var getFileEmitHistory: Any = js.native
    
    /* private */ var initializeCompilerCli: Any = js.native
    
    /* private */ var loadConfiguration: Any = js.native
    
    /* private */ var markResourceUsed: Any = js.native
    
    /* private */ var ngtscNextProgram: Any = js.native
    
    def options: AngularWebpackPluginOptions = js.native
    
    /* private */ val pluginOptions: Any = js.native
    
    /* private */ var rebuildRequiredFiles: Any = js.native
    
    /* private */ var registerWithCompilation: Any = js.native
    
    /* private */ val requiredFilesToEmit: Any = js.native
    
    /* private */ val requiredFilesToEmitCache: Any = js.native
    
    /* private */ var setupCompilation: Any = js.native
    
    /* private */ var sourceFileCache: Any = js.native
    
    /* private */ var updateAotProgram: Any = js.native
    
    /* private */ var updateJitProgram: Any = js.native
    
    /* private */ var watchMode: Any = js.native
    
    /* private */ var webpackCache: Any = js.native
    
    /* private */ var webpackCreateHash: Any = js.native
  }
  
  trait AngularWebpackPluginOptions extends StObject {
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var directTemplateLoading: Boolean
    
    var emitClassMetadata: Boolean
    
    var emitNgModuleScope: Boolean
    
    var fileReplacements: Record[String, String]
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
    
    var jitMode: Boolean
    
    var substitutions: Record[String, String]
    
    var tsconfig: String
  }
  object AngularWebpackPluginOptions {
    
    inline def apply(
      directTemplateLoading: Boolean,
      emitClassMetadata: Boolean,
      emitNgModuleScope: Boolean,
      fileReplacements: Record[String, String],
      jitMode: Boolean,
      substitutions: Record[String, String],
      tsconfig: String
    ): AngularWebpackPluginOptions = {
      val __obj = js.Dynamic.literal(directTemplateLoading = directTemplateLoading.asInstanceOf[js.Any], emitClassMetadata = emitClassMetadata.asInstanceOf[js.Any], emitNgModuleScope = emitNgModuleScope.asInstanceOf[js.Any], fileReplacements = fileReplacements.asInstanceOf[js.Any], jitMode = jitMode.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularWebpackPluginOptions]
    }
    
    extension [Self <: AngularWebpackPluginOptions](x: Self) {
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setDirectTemplateLoading(value: Boolean): Self = StObject.set(x, "directTemplateLoading", value.asInstanceOf[js.Any])
      
      inline def setEmitClassMetadata(value: Boolean): Self = StObject.set(x, "emitClassMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitNgModuleScope(value: Boolean): Self = StObject.set(x, "emitNgModuleScope", value.asInstanceOf[js.Any])
      
      inline def setFileReplacements(value: Record[String, String]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
      
      inline def setJitMode(value: Boolean): Self = StObject.set(x, "jitMode", value.asInstanceOf[js.Any])
      
      inline def setSubstitutions(value: Record[String, String]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    }
  }
}
