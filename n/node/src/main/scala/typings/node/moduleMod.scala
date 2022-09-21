package typings.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod extends Shortcut {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeModule * / any */ @JSImport("module", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(id: String) = this()
    def this(id: String, parent: Module) = this()
  }
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = js.native
  
  /* static member */
  @JSImport("module", "Module")
  @js.native
  def Module: Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module] = js.native
  type Module = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeModule */ Any
  inline def Module_=(x: Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  /**
    * @since v13.7.0, v12.17.0
    */
  @JSImport("module", "SourceMap")
  @js.native
  open class SourceMap protected () extends StObject {
    def this(payload: SourceMapPayload) = this()
    
    /**
      * Given a line number and column number in the generated source file, returns
      * an object representing the position in the original file. The object returned
      * consists of the following keys:
      */
    def findEntry(line: Double, column: Double): SourceMapping = js.native
    
    /**
      * Getter for the payload used to construct the `SourceMap` instance.
      */
    val payload: SourceMapPayload = js.native
  }
  
  /* static member */
  @JSImport("module", "builtinModules")
  @js.native
  def builtinModules: js.Array[String] = js.native
  inline def builtinModules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def createRequire(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createRequire(path: URL): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * `path` is the resolved path for the file for which a corresponding source map
    * should be fetched.
    * @since v13.7.0, v12.17.0
    */
  inline def findSourceMap(path: String): SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[SourceMap]
  inline def findSourceMap(path: String, error: js.Error): SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[SourceMap]
  
  /* static member */
  inline def runMain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMain")().asInstanceOf[Unit]
  
  /**
    * The `module.syncBuiltinESMExports()` method updates all the live bindings for
    * builtin `ES Modules` to match the properties of the `CommonJS` exports. It
    * does not add or remove exported names from the `ES Modules`.
    *
    * ```js
    * const fs = require('fs');
    * const assert = require('assert');
    * const { syncBuiltinESMExports } = require('module');
    *
    * fs.readFile = newAPI;
    *
    * delete fs.readFileSync;
    *
    * function newAPI() {
    *   // ...
    * }
    *
    * fs.newAPI = newAPI;
    *
    * syncBuiltinESMExports();
    *
    * import('fs').then((esmFS) => {
    *   // It syncs the existing readFile property with the new value
    *   assert.strictEqual(esmFS.readFile, newAPI);
    *   // readFileSync has been deleted from the required fs
    *   assert.strictEqual('readFileSync' in fs, false);
    *   // syncBuiltinESMExports() does not remove readFileSync from esmFS
    *   assert.strictEqual('readFileSync' in esmFS, true);
    *   // syncBuiltinESMExports() does not add names
    *   assert.strictEqual(esmFS.newAPI, undefined);
    * });
    * ```
    * @since v12.12.0
    */
  inline def syncBuiltinESMExports(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncBuiltinESMExports")().asInstanceOf[Unit]
  
  /* static member */
  inline def wrap(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SourceMapPayload extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: String
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String]
    
    var version: Double
  }
  object SourceMapPayload {
    
    inline def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sourceRoot: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String],
      version: Double
    ): SourceMapPayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapPayload]
    }
    
    extension [Self <: SourceMapPayload](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapping extends StObject {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var originalColumn: Double
    
    var originalLine: Double
    
    var originalSource: String
  }
  object SourceMapping {
    
    inline def apply(
      generatedColumn: Double,
      generatedLine: Double,
      originalColumn: Double,
      originalLine: Double,
      originalSource: String
    ): SourceMapping = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapping]
    }
    
    extension [Self <: SourceMapping](x: Self) {
      
      inline def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      inline def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      inline def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      inline def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      inline def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module])
  
  /* This means you don't have to write `^`, but can instead just say `moduleMod.foo` */
  override def _to: js.Object & (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = ^
  
  object global {
    
    trait ImportMeta extends StObject {
      
      /**
        * @experimental
        * This feature is only available with the `--experimental-import-meta-resolve`
        * command flag enabled.
        *
        * Provides a module-relative resolution function scoped to each module, returning
        * the URL string.
        *
        * @param specified The module specifier to resolve relative to `parent`.
        * @param parent The absolute parent module URL to resolve from. If none
        * is specified, the value of `import.meta.url` is used as the default.
        */
      var resolve: js.UndefOr[
            js.Function2[
              /* specified */ String, 
              /* parent */ js.UndefOr[String | typings.std.URL], 
              js.Promise[String]
            ]
          ] = js.undefined
      
      var url: String
    }
    object ImportMeta {
      
      inline def apply(url: String): ImportMeta = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImportMeta]
      }
      
      extension [Self <: ImportMeta](x: Self) {
        
        inline def setResolve(
          value: (/* specified */ String, /* parent */ js.UndefOr[String | typings.std.URL]) => js.Promise[String]
        ): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
        
        inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
