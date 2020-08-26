package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var allowJs: js.UndefOr[Boolean] = js.native
  var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.native
  var allowUmdGlobalAccess: js.UndefOr[Boolean] = js.native
  var allowUnreachableCode: js.UndefOr[Boolean] = js.native
  var allowUnusedLabels: js.UndefOr[Boolean] = js.native
  var alwaysStrict: js.UndefOr[Boolean] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var charset: js.UndefOr[String] = js.native
  var checkJs: js.UndefOr[Boolean] = js.native
  var composite: js.UndefOr[Boolean] = js.native
  var declaration: js.UndefOr[Boolean] = js.native
  var declarationDir: js.UndefOr[String] = js.native
  var declarationMap: js.UndefOr[Boolean] = js.native
  var disableSizeLimit: js.UndefOr[Boolean] = js.native
  var disableSourceOfProjectReferenceRedirect: js.UndefOr[Boolean] = js.native
  var downlevelIteration: js.UndefOr[Boolean] = js.native
  var emitBOM: js.UndefOr[Boolean] = js.native
  var emitDeclarationOnly: js.UndefOr[Boolean] = js.native
  var emitDecoratorMetadata: js.UndefOr[Boolean] = js.native
  var esModuleInterop: js.UndefOr[Boolean] = js.native
  var experimentalDecorators: js.UndefOr[Boolean] = js.native
  var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.native
  var importHelpers: js.UndefOr[Boolean] = js.native
  var inlineSourceMap: js.UndefOr[Boolean] = js.native
  var inlineSources: js.UndefOr[Boolean] = js.native
  var isolatedModules: js.UndefOr[Boolean] = js.native
  var jsx: js.UndefOr[JsxEmit] = js.native
  var jsxFactory: js.UndefOr[String] = js.native
  var keyofStringsOnly: js.UndefOr[Boolean] = js.native
  var lib: js.UndefOr[js.Array[String]] = js.native
  var locale: js.UndefOr[String] = js.native
  var mapRoot: js.UndefOr[String] = js.native
  var maxNodeModuleJsDepth: js.UndefOr[Double] = js.native
  var module: js.UndefOr[ModuleKind] = js.native
  var moduleResolution: js.UndefOr[ModuleResolutionKind] = js.native
  var newLine: js.UndefOr[NewLineKind] = js.native
  var noEmit: js.UndefOr[Boolean] = js.native
  var noEmitHelpers: js.UndefOr[Boolean] = js.native
  var noEmitOnError: js.UndefOr[Boolean] = js.native
  var noErrorTruncation: js.UndefOr[Boolean] = js.native
  var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.native
  var noImplicitAny: js.UndefOr[Boolean] = js.native
  var noImplicitReturns: js.UndefOr[Boolean] = js.native
  var noImplicitThis: js.UndefOr[Boolean] = js.native
  var noImplicitUseStrict: js.UndefOr[Boolean] = js.native
  var noLib: js.UndefOr[Boolean] = js.native
  var noResolve: js.UndefOr[Boolean] = js.native
  var noStrictGenericChecks: js.UndefOr[Boolean] = js.native
  var noUnusedLocals: js.UndefOr[Boolean] = js.native
  var noUnusedParameters: js.UndefOr[Boolean] = js.native
  var out: js.UndefOr[String] = js.native
  var outDir: js.UndefOr[String] = js.native
  var outFile: js.UndefOr[String] = js.native
  var paths: js.UndefOr[MapLike[js.Array[String]]] = js.native
  var preserveConstEnums: js.UndefOr[Boolean] = js.native
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  var project: js.UndefOr[String] = js.native
  var reactNamespace: js.UndefOr[String] = js.native
  var removeComments: js.UndefOr[Boolean] = js.native
  var resolveJsonModule: js.UndefOr[Boolean] = js.native
  var rootDir: js.UndefOr[String] = js.native
  var rootDirs: js.UndefOr[js.Array[String]] = js.native
  var skipDefaultLibCheck: js.UndefOr[Boolean] = js.native
  var skipLibCheck: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
  var sourceRoot: js.UndefOr[String] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var strictBindCallApply: js.UndefOr[Boolean] = js.native
  var strictFunctionTypes: js.UndefOr[Boolean] = js.native
  var strictNullChecks: js.UndefOr[Boolean] = js.native
  var strictPropertyInitialization: js.UndefOr[Boolean] = js.native
  var stripInternal: js.UndefOr[Boolean] = js.native
  var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.native
  var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[ScriptTarget] = js.native
  var traceResolution: js.UndefOr[Boolean] = js.native
  /** Paths used to compute primary types search locations */
  var typeRoots: js.UndefOr[js.Array[String]] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var useDefineForClassFields: js.UndefOr[Boolean] = js.native
}

object CompilerOptions {
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowJs(value: Boolean): Self = this.set("allowJs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowJs: Self = this.set("allowJs", js.undefined)
    @scala.inline
    def setAllowSyntheticDefaultImports(value: Boolean): Self = this.set("allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSyntheticDefaultImports: Self = this.set("allowSyntheticDefaultImports", js.undefined)
    @scala.inline
    def setAllowUmdGlobalAccess(value: Boolean): Self = this.set("allowUmdGlobalAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUmdGlobalAccess: Self = this.set("allowUmdGlobalAccess", js.undefined)
    @scala.inline
    def setAllowUnreachableCode(value: Boolean): Self = this.set("allowUnreachableCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnreachableCode: Self = this.set("allowUnreachableCode", js.undefined)
    @scala.inline
    def setAllowUnusedLabels(value: Boolean): Self = this.set("allowUnusedLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnusedLabels: Self = this.set("allowUnusedLabels", js.undefined)
    @scala.inline
    def setAlwaysStrict(value: Boolean): Self = this.set("alwaysStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysStrict: Self = this.set("alwaysStrict", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setCheckJs(value: Boolean): Self = this.set("checkJs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckJs: Self = this.set("checkJs", js.undefined)
    @scala.inline
    def setComposite(value: Boolean): Self = this.set("composite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposite: Self = this.set("composite", js.undefined)
    @scala.inline
    def setDeclaration(value: Boolean): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    @scala.inline
    def setDeclarationDir(value: String): Self = this.set("declarationDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarationDir: Self = this.set("declarationDir", js.undefined)
    @scala.inline
    def setDeclarationMap(value: Boolean): Self = this.set("declarationMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclarationMap: Self = this.set("declarationMap", js.undefined)
    @scala.inline
    def setDisableSizeLimit(value: Boolean): Self = this.set("disableSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSizeLimit: Self = this.set("disableSizeLimit", js.undefined)
    @scala.inline
    def setDisableSourceOfProjectReferenceRedirect(value: Boolean): Self = this.set("disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSourceOfProjectReferenceRedirect: Self = this.set("disableSourceOfProjectReferenceRedirect", js.undefined)
    @scala.inline
    def setDownlevelIteration(value: Boolean): Self = this.set("downlevelIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownlevelIteration: Self = this.set("downlevelIteration", js.undefined)
    @scala.inline
    def setEmitBOM(value: Boolean): Self = this.set("emitBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitBOM: Self = this.set("emitBOM", js.undefined)
    @scala.inline
    def setEmitDeclarationOnly(value: Boolean): Self = this.set("emitDeclarationOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitDeclarationOnly: Self = this.set("emitDeclarationOnly", js.undefined)
    @scala.inline
    def setEmitDecoratorMetadata(value: Boolean): Self = this.set("emitDecoratorMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitDecoratorMetadata: Self = this.set("emitDecoratorMetadata", js.undefined)
    @scala.inline
    def setEsModuleInterop(value: Boolean): Self = this.set("esModuleInterop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsModuleInterop: Self = this.set("esModuleInterop", js.undefined)
    @scala.inline
    def setExperimentalDecorators(value: Boolean): Self = this.set("experimentalDecorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentalDecorators: Self = this.set("experimentalDecorators", js.undefined)
    @scala.inline
    def setForceConsistentCasingInFileNames(value: Boolean): Self = this.set("forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceConsistentCasingInFileNames: Self = this.set("forceConsistentCasingInFileNames", js.undefined)
    @scala.inline
    def setImportHelpers(value: Boolean): Self = this.set("importHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportHelpers: Self = this.set("importHelpers", js.undefined)
    @scala.inline
    def setInlineSourceMap(value: Boolean): Self = this.set("inlineSourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineSourceMap: Self = this.set("inlineSourceMap", js.undefined)
    @scala.inline
    def setInlineSources(value: Boolean): Self = this.set("inlineSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineSources: Self = this.set("inlineSources", js.undefined)
    @scala.inline
    def setIsolatedModules(value: Boolean): Self = this.set("isolatedModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolatedModules: Self = this.set("isolatedModules", js.undefined)
    @scala.inline
    def setJsx(value: JsxEmit): Self = this.set("jsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    @scala.inline
    def setJsxFactory(value: String): Self = this.set("jsxFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsxFactory: Self = this.set("jsxFactory", js.undefined)
    @scala.inline
    def setKeyofStringsOnly(value: Boolean): Self = this.set("keyofStringsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyofStringsOnly: Self = this.set("keyofStringsOnly", js.undefined)
    @scala.inline
    def setLibVarargs(value: String*): Self = this.set("lib", js.Array(value :_*))
    @scala.inline
    def setLib(value: js.Array[String]): Self = this.set("lib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMapRoot(value: String): Self = this.set("mapRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapRoot: Self = this.set("mapRoot", js.undefined)
    @scala.inline
    def setMaxNodeModuleJsDepth(value: Double): Self = this.set("maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNodeModuleJsDepth: Self = this.set("maxNodeModuleJsDepth", js.undefined)
    @scala.inline
    def setModule(value: ModuleKind): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setModuleResolution(value: ModuleResolutionKind): Self = this.set("moduleResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleResolution: Self = this.set("moduleResolution", js.undefined)
    @scala.inline
    def setNewLine(value: NewLineKind): Self = this.set("newLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    @scala.inline
    def setNoEmit(value: Boolean): Self = this.set("noEmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEmit: Self = this.set("noEmit", js.undefined)
    @scala.inline
    def setNoEmitHelpers(value: Boolean): Self = this.set("noEmitHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEmitHelpers: Self = this.set("noEmitHelpers", js.undefined)
    @scala.inline
    def setNoEmitOnError(value: Boolean): Self = this.set("noEmitOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEmitOnError: Self = this.set("noEmitOnError", js.undefined)
    @scala.inline
    def setNoErrorTruncation(value: Boolean): Self = this.set("noErrorTruncation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoErrorTruncation: Self = this.set("noErrorTruncation", js.undefined)
    @scala.inline
    def setNoFallthroughCasesInSwitch(value: Boolean): Self = this.set("noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoFallthroughCasesInSwitch: Self = this.set("noFallthroughCasesInSwitch", js.undefined)
    @scala.inline
    def setNoImplicitAny(value: Boolean): Self = this.set("noImplicitAny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoImplicitAny: Self = this.set("noImplicitAny", js.undefined)
    @scala.inline
    def setNoImplicitReturns(value: Boolean): Self = this.set("noImplicitReturns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoImplicitReturns: Self = this.set("noImplicitReturns", js.undefined)
    @scala.inline
    def setNoImplicitThis(value: Boolean): Self = this.set("noImplicitThis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoImplicitThis: Self = this.set("noImplicitThis", js.undefined)
    @scala.inline
    def setNoImplicitUseStrict(value: Boolean): Self = this.set("noImplicitUseStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoImplicitUseStrict: Self = this.set("noImplicitUseStrict", js.undefined)
    @scala.inline
    def setNoLib(value: Boolean): Self = this.set("noLib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLib: Self = this.set("noLib", js.undefined)
    @scala.inline
    def setNoResolve(value: Boolean): Self = this.set("noResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResolve: Self = this.set("noResolve", js.undefined)
    @scala.inline
    def setNoStrictGenericChecks(value: Boolean): Self = this.set("noStrictGenericChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoStrictGenericChecks: Self = this.set("noStrictGenericChecks", js.undefined)
    @scala.inline
    def setNoUnusedLocals(value: Boolean): Self = this.set("noUnusedLocals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUnusedLocals: Self = this.set("noUnusedLocals", js.undefined)
    @scala.inline
    def setNoUnusedParameters(value: Boolean): Self = this.set("noUnusedParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUnusedParameters: Self = this.set("noUnusedParameters", js.undefined)
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setOutDir(value: String): Self = this.set("outDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutDir: Self = this.set("outDir", js.undefined)
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    @scala.inline
    def setPaths(value: MapLike[js.Array[String]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setPreserveConstEnums(value: Boolean): Self = this.set("preserveConstEnums", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveConstEnums: Self = this.set("preserveConstEnums", js.undefined)
    @scala.inline
    def setPreserveSymlinks(value: Boolean): Self = this.set("preserveSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveSymlinks: Self = this.set("preserveSymlinks", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setReactNamespace(value: String): Self = this.set("reactNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactNamespace: Self = this.set("reactNamespace", js.undefined)
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveComments: Self = this.set("removeComments", js.undefined)
    @scala.inline
    def setResolveJsonModule(value: Boolean): Self = this.set("resolveJsonModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveJsonModule: Self = this.set("resolveJsonModule", js.undefined)
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    @scala.inline
    def setRootDirsVarargs(value: String*): Self = this.set("rootDirs", js.Array(value :_*))
    @scala.inline
    def setRootDirs(value: js.Array[String]): Self = this.set("rootDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDirs: Self = this.set("rootDirs", js.undefined)
    @scala.inline
    def setSkipDefaultLibCheck(value: Boolean): Self = this.set("skipDefaultLibCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipDefaultLibCheck: Self = this.set("skipDefaultLibCheck", js.undefined)
    @scala.inline
    def setSkipLibCheck(value: Boolean): Self = this.set("skipLibCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLibCheck: Self = this.set("skipLibCheck", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setStrictBindCallApply(value: Boolean): Self = this.set("strictBindCallApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBindCallApply: Self = this.set("strictBindCallApply", js.undefined)
    @scala.inline
    def setStrictFunctionTypes(value: Boolean): Self = this.set("strictFunctionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictFunctionTypes: Self = this.set("strictFunctionTypes", js.undefined)
    @scala.inline
    def setStrictNullChecks(value: Boolean): Self = this.set("strictNullChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNullChecks: Self = this.set("strictNullChecks", js.undefined)
    @scala.inline
    def setStrictPropertyInitialization(value: Boolean): Self = this.set("strictPropertyInitialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictPropertyInitialization: Self = this.set("strictPropertyInitialization", js.undefined)
    @scala.inline
    def setStripInternal(value: Boolean): Self = this.set("stripInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripInternal: Self = this.set("stripInternal", js.undefined)
    @scala.inline
    def setSuppressExcessPropertyErrors(value: Boolean): Self = this.set("suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressExcessPropertyErrors: Self = this.set("suppressExcessPropertyErrors", js.undefined)
    @scala.inline
    def setSuppressImplicitAnyIndexErrors(value: Boolean): Self = this.set("suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressImplicitAnyIndexErrors: Self = this.set("suppressImplicitAnyIndexErrors", js.undefined)
    @scala.inline
    def setTarget(value: ScriptTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTraceResolution(value: Boolean): Self = this.set("traceResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceResolution: Self = this.set("traceResolution", js.undefined)
    @scala.inline
    def setTypeRootsVarargs(value: String*): Self = this.set("typeRoots", js.Array(value :_*))
    @scala.inline
    def setTypeRoots(value: js.Array[String]): Self = this.set("typeRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeRoots: Self = this.set("typeRoots", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setUseDefineForClassFields(value: Boolean): Self = this.set("useDefineForClassFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefineForClassFields: Self = this.set("useDefineForClassFields", js.undefined)
  }
  
}

