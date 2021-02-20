package typings.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.urlMod.URL_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod extends Shortcut {
  
  @JSImport("module", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
  }
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = js.native
  
  /* static member */
  @JSImport("module", "Module")
  @js.native
  def Module: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = js.native
  type Module = NodeModule
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("module", "Module")
  @js.native
  class ModuleCls protected ()
    extends typings.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
  }
  
  @scala.inline
  def Module_=(x: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  @JSImport("module", "SourceMap")
  @js.native
  class SourceMap protected () extends StObject {
    def this(payload: SourceMapPayload) = this()
    
    def findEntry(line: Double, column: Double): SourceMapping = js.native
    
    val payload: SourceMapPayload = js.native
  }
  
  /* static member */
  @JSImport("module", "builtinModules")
  @js.native
  def builtinModules: js.Array[java.lang.String] = js.native
  @scala.inline
  def builtinModules_=(x: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("module", "createRequire")
  @js.native
  def createRequire(path: java.lang.String): NodeRequire = js.native
  @JSImport("module", "createRequire")
  @js.native
  def createRequire(path: URL_): NodeRequire = js.native
  
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  /* static member */
  @JSImport("module", "createRequireFromPath")
  @js.native
  def createRequireFromPath(path: java.lang.String): NodeRequire = js.native
  
  @JSImport("module", "findSourceMap")
  @js.native
  def findSourceMap(path: java.lang.String): SourceMap = js.native
  @JSImport("module", "findSourceMap")
  @js.native
  def findSourceMap(path: java.lang.String, error: Error): SourceMap = js.native
  
  /* static member */
  @JSImport("module", "runMain")
  @js.native
  def runMain(): Unit = js.native
  
  /**
    * Updates all the live bindings for builtin ES Modules to match the properties of the CommonJS exports.
    * It does not add or remove exported names from the ES Modules.
    */
  @JSImport("module", "syncBuiltinESMExports")
  @js.native
  def syncBuiltinESMExports(): Unit = js.native
  
  /* static member */
  @JSImport("module", "wrap")
  @js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
  
  @js.native
  trait SourceMapPayload extends StObject {
    
    var file: java.lang.String = js.native
    
    var mappings: java.lang.String = js.native
    
    var names: js.Array[java.lang.String] = js.native
    
    var sourceRoot: java.lang.String = js.native
    
    var sources: js.Array[java.lang.String] = js.native
    
    var sourcesContent: js.Array[java.lang.String] = js.native
    
    var version: Double = js.native
  }
  object SourceMapPayload {
    
    @scala.inline
    def apply(
      file: java.lang.String,
      mappings: java.lang.String,
      names: js.Array[java.lang.String],
      sourceRoot: java.lang.String,
      sources: js.Array[java.lang.String],
      sourcesContent: js.Array[java.lang.String],
      version: Double
    ): SourceMapPayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapPayload]
    }
    
    @scala.inline
    implicit class SourceMapPayloadMutableBuilder[Self <: SourceMapPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: java.lang.String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: java.lang.String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSourceRoot(value: java.lang.String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[java.lang.String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[java.lang.String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: java.lang.String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: java.lang.String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceMapping extends StObject {
    
    var generatedColumn: Double = js.native
    
    var generatedLine: Double = js.native
    
    var originalColumn: Double = js.native
    
    var originalLine: Double = js.native
    
    var originalSource: java.lang.String = js.native
  }
  object SourceMapping {
    
    @scala.inline
    def apply(
      generatedColumn: Double,
      generatedLine: Double,
      originalColumn: Double,
      originalLine: Double,
      originalSource: java.lang.String
    ): SourceMapping = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapping]
    }
    
    @scala.inline
    implicit class SourceMappingMutableBuilder[Self <: SourceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalSource(value: java.lang.String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]
  
  /* This means you don't have to write `^`, but can instead just say `moduleMod.foo` */
  override def _to: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = ^
}
