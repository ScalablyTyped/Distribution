package typings.ngtoolsWebpack

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularCompiler.mod.Version
import typings.angularCompilerCli.anon.BasePath
import typings.angularCompilerCli.anon.CustomTransformers
import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.anon.Host
import typings.angularCompilerCli.anon.Options
import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions
import typings.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions
import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typings.angularCompilerCli.srcPerformCompileMod.ConfigurationHost
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.angularCompilerCli.srcPerformCompileMod.PerformCompilationResult
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.ngtoolsWebpack.ngtoolsWebpackStrings.angular
import typings.std.Record
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import typings.webpack.mod.ResolveOptionsWithDependencyType
import typings.webpack.mod.ResolverWithOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompilerHost extends StObject {
    
    var compilerHost: typings.typescript.mod.CompilerHost
    
    var program: Program
  }
  object CompilerHost {
    
    inline def apply(compilerHost: typings.typescript.mod.CompilerHost, program: Program): CompilerHost = {
      val __obj = js.Dynamic.literal(compilerHost = compilerHost.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerHost] (val x: Self) extends AnyVal {
      
      inline def setCompilerHost(value: typings.typescript.mod.CompilerHost): Self = StObject.set(x, "compilerHost", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait DirectTemplateLoading extends StObject {
    
    var directTemplateLoading: js.UndefOr[Boolean] = js.undefined
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
  }
  object DirectTemplateLoading {
    
    inline def apply(): DirectTemplateLoading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectTemplateLoading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectTemplateLoading] (val x: Self) extends AnyVal {
      
      inline def setDirectTemplateLoading(value: Boolean): Self = StObject.set(x, "directTemplateLoading", value.asInstanceOf[js.Any])
      
      inline def setDirectTemplateLoadingUndefined: Self = StObject.set(x, "directTemplateLoading", js.undefined)
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
    }
  }
  
  trait EmitClassMetadata extends StObject {
    
    var emitClassMetadata: js.UndefOr[Boolean] = js.undefined
    
    var emitNgModuleScope: js.UndefOr[Boolean] = js.undefined
  }
  object EmitClassMetadata {
    
    inline def apply(): EmitClassMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmitClassMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitClassMetadata] (val x: Self) extends AnyVal {
      
      inline def setEmitClassMetadata(value: Boolean): Self = StObject.set(x, "emitClassMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitClassMetadataUndefined: Self = StObject.set(x, "emitClassMetadata", js.undefined)
      
      inline def setEmitNgModuleScope(value: Boolean): Self = StObject.set(x, "emitNgModuleScope", value.asInstanceOf[js.Any])
      
      inline def setEmitNgModuleScopeUndefined: Self = StObject.set(x, "emitNgModuleScope", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(`type`: String): ResolverWithOptions = js.native
    def apply(`type`: String, resolveOptions: ResolveOptionsWithDependencyType): ResolverWithOptions = js.native
  }
  
  trait InlineStyleFileExtension extends StObject {
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
  }
  object InlineStyleFileExtension {
    
    inline def apply(): InlineStyleFileExtension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineStyleFileExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineStyleFileExtension] (val x: Self) extends AnyVal {
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
    }
  }
  
  trait IsDirectory extends StObject {
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    var mtime: js.Date
    
    var size: Double
  }
  object IsDirectory {
    
    inline def apply(isDirectory: () => Boolean, isFile: () => Boolean, mtime: js.Date, size: Double): IsDirectory = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Issuer extends StObject {
    
    var issuer: js.UndefOr[String] = js.undefined
  }
  object Issuer {
    
    inline def apply(): Issuer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Issuer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Issuer] (val x: Self) extends AnyVal {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ngtools/webpack.@ngtools/webpack/src/ivy/plugin.AngularWebpackPluginOptions> */
  trait PartialAngularWebpackPlug extends StObject {
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var directTemplateLoading: js.UndefOr[Boolean] = js.undefined
    
    var emitClassMetadata: js.UndefOr[Boolean] = js.undefined
    
    var emitNgModuleScope: js.UndefOr[Boolean] = js.undefined
    
    var fileReplacements: js.UndefOr[Record[String, String]] = js.undefined
    
    var inlineStyleFileExtension: js.UndefOr[String] = js.undefined
    
    var jitMode: js.UndefOr[Boolean] = js.undefined
    
    var substitutions: js.UndefOr[Record[String, String]] = js.undefined
    
    var tsconfig: js.UndefOr[String] = js.undefined
  }
  object PartialAngularWebpackPlug {
    
    inline def apply(): PartialAngularWebpackPlug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAngularWebpackPlug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialAngularWebpackPlug] (val x: Self) extends AnyVal {
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setDirectTemplateLoading(value: Boolean): Self = StObject.set(x, "directTemplateLoading", value.asInstanceOf[js.Any])
      
      inline def setDirectTemplateLoadingUndefined: Self = StObject.set(x, "directTemplateLoading", js.undefined)
      
      inline def setEmitClassMetadata(value: Boolean): Self = StObject.set(x, "emitClassMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitClassMetadataUndefined: Self = StObject.set(x, "emitClassMetadata", js.undefined)
      
      inline def setEmitNgModuleScope(value: Boolean): Self = StObject.set(x, "emitNgModuleScope", value.asInstanceOf[js.Any])
      
      inline def setEmitNgModuleScopeUndefined: Self = StObject.set(x, "emitNgModuleScope", js.undefined)
      
      inline def setFileReplacements(value: Record[String, String]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
      
      inline def setInlineStyleFileExtension(value: String): Self = StObject.set(x, "inlineStyleFileExtension", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleFileExtensionUndefined: Self = StObject.set(x, "inlineStyleFileExtension", js.undefined)
      
      inline def setJitMode(value: Boolean): Self = StObject.set(x, "jitMode", value.asInstanceOf[js.Any])
      
      inline def setJitModeUndefined: Self = StObject.set(x, "jitMode", js.undefined)
      
      inline def setSubstitutions(value: Record[String, String]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "substitutions", js.undefined)
      
      inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    }
  }
  
  trait TypeofGLOBALDEFSFORTER extends StObject {
    
    var ngDevMode: Boolean
    
    var ngI18nClosureMode: Boolean
  }
  object TypeofGLOBALDEFSFORTER {
    
    inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean): TypeofGLOBALDEFSFORTER = {
      val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofGLOBALDEFSFORTER]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofGLOBALDEFSFORTER] (val x: Self) extends AnyVal {
      
      inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
      
      inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofGLOBALDEFSFORTERNgDevMode extends StObject {
    
    var ngDevMode: Boolean
    
    var ngI18nClosureMode: Boolean
    
    var ngJitMode: Boolean
  }
  object TypeofGLOBALDEFSFORTERNgDevMode {
    
    inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean, ngJitMode: Boolean): TypeofGLOBALDEFSFORTERNgDevMode = {
      val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any], ngJitMode = ngJitMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofGLOBALDEFSFORTERNgDevMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofGLOBALDEFSFORTERNgDevMode] (val x: Self) extends AnyVal {
      
      inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
      
      inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
      
      inline def setNgJitMode(value: Boolean): Self = StObject.set(x, "ngJitMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofLogicalProjectPath extends StObject {
    
    /**
      * Get the relative path between two `LogicalProjectPath`s.
      *
      * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
      * importing from `to`.
      */
    def relativePathBetween(from: LogicalProjectPath, to: LogicalProjectPath): PathSegment
  }
  object TypeofLogicalProjectPath {
    
    inline def apply(relativePathBetween: (LogicalProjectPath, LogicalProjectPath) => PathSegment): TypeofLogicalProjectPath = {
      val __obj = js.Dynamic.literal(relativePathBetween = js.Any.fromFunction2(relativePathBetween))
      __obj.asInstanceOf[TypeofLogicalProjectPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofLogicalProjectPath] (val x: Self) extends AnyVal {
      
      inline def setRelativePathBetween(value: (LogicalProjectPath, LogicalProjectPath) => PathSegment): Self = StObject.set(x, "relativePathBetween", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait TypeofimportedCompilerC extends StObject {
    
    var ConsoleLogger: Instantiable1[/* level */ LogLevel, typings.angularCompilerCli.mod.ConsoleLogger] = js.native
    
    val DEFAULT_ERROR_CODE: /* 100 */ Double = js.native
    
    val GLOBAL_DEFS_FOR_TERSER: TypeofGLOBALDEFSFORTER = js.native
    
    val GLOBAL_DEFS_FOR_TERSER_WITH_AOT: TypeofGLOBALDEFSFORTERNgDevMode = js.native
    
    var LogicalFileSystem: Instantiable2[
        /* rootDirs */ js.Array[AbsoluteFsPath], 
        /* compilerHost */ PickCompilerHostgetCanoni, 
        typings.angularCompilerCli.mod.LogicalFileSystem
      ] = js.native
    
    val LogicalProjectPath: TypeofLogicalProjectPath = js.native
    
    var NgTscPlugin: Instantiable1[/* ngOptions */ js.Object, typings.angularCompilerCli.mod.NgTscPlugin] = js.native
    
    var NgtscCompilerHost: Instantiable1[/* fs */ FileSystem, typings.angularCompilerCli.mod.NgtscCompilerHost] = js.native
    
    var NgtscProgram: Instantiable3[
        /* rootNames */ js.Array[String], 
        /* options */ NgCompilerOptions, 
        /* delegateHost */ typings.angularCompilerCli.srcTransformersApiMod.CompilerHost, 
        typings.angularCompilerCli.mod.NgtscProgram
      ] = js.native
    
    var NodeJSFileSystem: Instantiable0[typings.angularCompilerCli.mod.NodeJSFileSystem] = js.native
    
    val SOURCE: angular = js.native
    
    val UNKNOWN_ERROR_CODE: /* 500 */ Double = js.native
    
    val VERSION: Version = js.native
    
    def absoluteFrom(path: String): AbsoluteFsPath = js.native
    
    def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = js.native
    
    def basename(filePath: PathString): PathSegment = js.native
    def basename(filePath: PathString, `extension`: String): PathSegment = js.native
    
    def calcProjectFileAndBasePath(project: String): BasePath = js.native
    def calcProjectFileAndBasePath(project: String, host: ConfigurationHost): BasePath = js.native
    
    def constructorParametersDownlevelTransform(program: Program): TransformerFactory[SourceFile] = js.native
    
    def createCompilerHost(param0: Options): typings.angularCompilerCli.srcTransformersApiMod.CompilerHost = js.native
    
    def createProgram(param0: Host): typings.angularCompilerCli.srcTransformersApiMod.Program = js.native
    
    def defaultGatherDiagnostics(program: typings.angularCompilerCli.srcTransformersApiMod.Program): js.Array[Diagnostic] = js.native
    
    def dirname(file: String): String = js.native
    @JSName("dirname")
    def dirname_AbsoluteFsPath(file: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath]): BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath] = js.native
    @JSName("dirname")
    def dirname_PathSegment(file: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment]): BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment] = js.native
    
    def exitCodeFromResult(): Double = js.native
    def exitCodeFromResult(diags: js.Array[Diagnostic]): Double = js.native
    
    def formatDiagnostics(diags: js.Array[Diagnostic]): String = js.native
    def formatDiagnostics(diags: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = js.native
    
    def getFileSystem(): FileSystem = js.native
    
    def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = js.native
    
    def isLocalRelativePath(relativePath: String): Boolean = js.native
    
    def isRoot(path: AbsoluteFsPath): Boolean = js.native
    
    def isRooted(path: String): Boolean = js.native
    
    def isTsDiagnostic(diagnostic: Any): /* is typescript.typescript.Diagnostic */ Boolean = js.native
    
    def join(basePath: String, paths: String*): String = js.native
    @JSName("join")
    def join_AbsoluteFsPath(basePath: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath], paths: String*): BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath] = js.native
    @JSName("join")
    def join_PathSegment(basePath: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment], paths: String*): BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment] = js.native
    
    def performCompilation(param0: CustomTransformers): PerformCompilationResult = js.native
    
    def readConfiguration(project: String): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: Unit, host: ConfigurationHost): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: CompilerOptions): ParsedConfiguration = js.native
    def readConfiguration(project: String, existingOptions: CompilerOptions, host: ConfigurationHost): ParsedConfiguration = js.native
    
    def relative(from: String, to: String): PathSegment | AbsoluteFsPath = js.native
    
    def relativeFrom(path: String): PathSegment = js.native
    
    @JSName("relative")
    def relative_AbsoluteFsPath(
      from: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath],
      to: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.AbsoluteFsPath]
    ): PathSegment | AbsoluteFsPath = js.native
    @JSName("relative")
    def relative_PathSegment(
      from: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment],
      to: BrandedPath[typings.ngtoolsWebpack.ngtoolsWebpackStrings.PathSegment]
    ): PathSegment | AbsoluteFsPath = js.native
    
    def resolve(basePath: String, paths: String*): AbsoluteFsPath = js.native
    
    def setFileSystem(fileSystem: FileSystem): Unit = js.native
    
    def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = js.native
  }
  
  @js.native
  trait TypeofimportedNgcc extends StObject {
    
    var ConsoleLogger: Instantiable1[/* level */ LogLevel, typings.angularCompilerCli.ngccMod.ConsoleLogger] = js.native
    
    def clearTsConfigCache(): Unit = js.native
    
    val containingDirPath: String = js.native
    
    val ngccMainFilePath: String = js.native
    
    def process(options: AsyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
    def process(options: SyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
  }
}
