package typings.ngPackagr.anon

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
import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typings.angularCompilerCli.srcPerformCompileMod.ConfigurationHost
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.angularCompilerCli.srcPerformCompileMod.PerformCompilationResult
import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.ngPackagr.ngPackagrStrings.angular
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    /* delegateHost */ CompilerHost, 
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
  
  def createCompilerHost(hasOptionsTsHost: Options): CompilerHost = js.native
  
  def createProgram(hasRootNamesOptionsHostOldProgram: Host): typings.angularCompilerCli.srcTransformersApiMod.Program = js.native
  
  def defaultGatherDiagnostics(program: typings.angularCompilerCli.srcTransformersApiMod.Program): js.Array[Diagnostic] = js.native
  
  def dirname(file: String): String = js.native
  @JSName("dirname")
  def dirname_AbsoluteFsPath(file: BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath]): BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath] = js.native
  @JSName("dirname")
  def dirname_PathSegment(file: BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment]): BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment] = js.native
  
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
  def join_AbsoluteFsPath(basePath: BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath], paths: String*): BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath] = js.native
  @JSName("join")
  def join_PathSegment(basePath: BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment], paths: String*): BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment] = js.native
  
  def performCompilation(
    hasRootNamesOptionsHostOldProgramEmitCallbackMergeEmitResultsCallbackGatherDiagnosticsCustomTransformersEmitFlagsForceEmitModifiedResourceFiles: CustomTransformers
  ): PerformCompilationResult = js.native
  
  def readConfiguration(project: String): ParsedConfiguration = js.native
  def readConfiguration(project: String, existingOptions: Unit, host: ConfigurationHost): ParsedConfiguration = js.native
  def readConfiguration(project: String, existingOptions: CompilerOptions): ParsedConfiguration = js.native
  def readConfiguration(project: String, existingOptions: CompilerOptions, host: ConfigurationHost): ParsedConfiguration = js.native
  
  def relative(from: String, to: String): PathSegment | AbsoluteFsPath = js.native
  
  def relativeFrom(path: String): PathSegment = js.native
  
  @JSName("relative")
  def relative_AbsoluteFsPath(
    from: BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath],
    to: BrandedPath[typings.ngPackagr.ngPackagrStrings.AbsoluteFsPath]
  ): PathSegment | AbsoluteFsPath = js.native
  @JSName("relative")
  def relative_PathSegment(
    from: BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment],
    to: BrandedPath[typings.ngPackagr.ngPackagrStrings.PathSegment]
  ): PathSegment | AbsoluteFsPath = js.native
  
  def resolve(basePath: String, paths: String*): AbsoluteFsPath = js.native
  
  def setFileSystem(fileSystem: FileSystem): Unit = js.native
  
  def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = js.native
}
