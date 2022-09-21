package typings.parcelSourceMap

import typings.node.bufferMod.global.Buffer
import typings.parcelSourceMap.anon.ReadFile
import typings.parcelSourceMap.parcelSourceMapStrings.`inline`
import typings.parcelSourceMap.parcelSourceMapStrings.`object`
import typings.parcelSourceMap.parcelSourceMapStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/source-map", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SourceMap {
    def this(projectRoot: String) = this()
    def this(projectRoot: String, buffer: Buffer) = this()
    def this(projectRoot: Unit, buffer: Buffer) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@parcel/source-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateEmptyMap(opts: GenerateEmptyMapOptions): SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEmptyMap")(opts.asInstanceOf[js.Any]).asInstanceOf[SourceMap]
  }
  
  @JSImport("@parcel/source-map", "init")
  @js.native
  val init: js.Promise[Unit] = js.native
  
  trait GenerateEmptyMapOptions extends StObject {
    
    var lineOffset: js.UndefOr[Double] = js.undefined
    
    var projectRoot: String
    
    var sourceContent: String
    
    var sourceName: String
  }
  object GenerateEmptyMapOptions {
    
    inline def apply(projectRoot: String, sourceContent: String, sourceName: String): GenerateEmptyMapOptions = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any], sourceContent = sourceContent.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateEmptyMapOptions]
    }
    
    extension [Self <: GenerateEmptyMapOptions](x: Self) {
      
      inline def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
      
      inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceContent(value: String): Self = StObject.set(x, "sourceContent", value.asInstanceOf[js.Any])
      
      inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexedMapping[T] extends StObject {
    
    var generated: MappingPosition
    
    var name: js.UndefOr[T] = js.undefined
    
    var original: js.UndefOr[MappingPosition] = js.undefined
    
    var source: js.UndefOr[T] = js.undefined
  }
  object IndexedMapping {
    
    inline def apply[T](generated: MappingPosition): IndexedMapping[T] = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedMapping[T]]
    }
    
    extension [Self <: IndexedMapping[?], T](x: Self & IndexedMapping[T]) {
      
      inline def setGenerated(value: MappingPosition): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOriginal(value: MappingPosition): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait MappingPosition extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object MappingPosition {
    
    inline def apply(column: Double, line: Double): MappingPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingPosition]
    }
    
    extension [Self <: MappingPosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedMap extends StObject {
    
    var mappings: js.Array[IndexedMapping[Double]]
    
    var names: js.Array[String]
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String | Null]
  }
  object ParsedMap {
    
    inline def apply(
      mappings: js.Array[IndexedMapping[Double]],
      names: js.Array[String],
      sources: js.Array[String],
      sourcesContent: js.Array[String | Null]
    ): ParsedMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMap]
    }
    
    extension [Self <: ParsedMap](x: Self) {
      
      inline def setMappings(value: js.Array[IndexedMapping[Double]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: IndexedMapping[Double]*): Self = StObject.set(x, "mappings", js.Array(value*))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    }
  }
  
  @js.native
  trait SourceMap extends StObject {
    
    def addBuffer(buffer: Buffer): SourceMap = js.native
    def addBuffer(buffer: Buffer, lineOffset: Double): SourceMap = js.native
    
    def addEmptyMap(sourceName: String, sourceContent: String): SourceMap = js.native
    def addEmptyMap(sourceName: String, sourceContent: String, lineOffset: Double): SourceMap = js.native
    
    def addIndexedMapping(mapping: IndexedMapping[String]): Unit = js.native
    def addIndexedMapping(mapping: IndexedMapping[String], lineOffset: Double): Unit = js.native
    def addIndexedMapping(mapping: IndexedMapping[String], lineOffset: Double, columnOffset: Double): Unit = js.native
    def addIndexedMapping(mapping: IndexedMapping[String], lineOffset: Unit, columnOffset: Double): Unit = js.native
    
    def addIndexedMappings(mappings: js.Array[IndexedMapping[String]]): Unit = js.native
    def addIndexedMappings(mappings: js.Array[IndexedMapping[String]], lineOffset: Double): Unit = js.native
    def addIndexedMappings(mappings: js.Array[IndexedMapping[String]], lineOffset: Double, columnOffset: Double): Unit = js.native
    def addIndexedMappings(mappings: js.Array[IndexedMapping[String]], lineOffset: Unit, columnOffset: Double): Unit = js.native
    
    def addName(name: String): Double = js.native
    
    def addNames(names: js.Array[String]): js.Array[Double] = js.native
    
    def addSource(source: String): Double = js.native
    
    def addSources(sources: js.Array[String]): js.Array[Double] = js.native
    
    def addVLQMap(map: VLQMap): SourceMap = js.native
    def addVLQMap(map: VLQMap, lineOffset: Double): SourceMap = js.native
    def addVLQMap(map: VLQMap, lineOffset: Double, columnOffset: Double): SourceMap = js.native
    def addVLQMap(map: VLQMap, lineOffset: Unit, columnOffset: Double): SourceMap = js.native
    
    def delete(): Unit = js.native
    
    def `extends`(buffer: Buffer): SourceMap = js.native
    
    def findClosestMapping(line: Double, column: Double): js.UndefOr[IndexedMapping[String]] = js.native
    
    def getMap(): ParsedMap = js.native
    
    def getName(index: Double): String = js.native
    
    def getNameIndex(name: String): Double = js.native
    
    def getSource(index: Double): String = js.native
    
    def getSourceContent(sourceName: String): String = js.native
    
    def getSourceIndex(source: String): Double = js.native
    
    def offsetColumns(line: Double, column: Double, columnOffset: Double): js.UndefOr[IndexedMapping[String]] = js.native
    
    def offsetLines(line: Double, lineOffset: Double): js.UndefOr[IndexedMapping[String]] = js.native
    
    def setSourceContent(sourceName: String, sourceContent: String): Unit = js.native
    
    def stringify(options: SourceMapStringifyOptions): js.Promise[String | VLQMap] = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toVLQ(): VLQMap = js.native
  }
  
  trait SourceMapStringifyOptions extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[`inline` | string | `object`] = js.undefined
    
    var fs: js.UndefOr[ReadFile] = js.undefined
    
    var inlineSources: js.UndefOr[Boolean] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var sourceRoot: js.UndefOr[String] = js.undefined
  }
  object SourceMapStringifyOptions {
    
    inline def apply(): SourceMapStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapStringifyOptions]
    }
    
    extension [Self <: SourceMapStringifyOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormat(value: `inline` | string | `object`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFs(value: ReadFile): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setInlineSources(value: Boolean): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  sources :std.ReadonlyArray<string>,   sourcesContent :std.ReadonlyArray<string | null> | undefined,   names :std.ReadonlyArray<string>,   mappings :string,   version :number | undefined,   file :string | undefined,   sourceRoot :string | undefined}> */
  trait VLQMap extends StObject {
    
    val file: js.UndefOr[String] = js.undefined
    
    val mappings: String
    
    val names: js.Array[String]
    
    val sourceRoot: js.UndefOr[String] = js.undefined
    
    val sources: js.Array[String]
    
    val sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    val version: js.UndefOr[Double] = js.undefined
  }
  object VLQMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String]): VLQMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[VLQMap]
    }
    
    extension [Self <: VLQMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
