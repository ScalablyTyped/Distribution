package typings.pacote

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.streamMod.Stream
import typings.node.streamMod.Transform
import typings.npmPackageArg.mod.Result
import typings.npmRegistryFetch.anon.PartialAuthOptions
import typings.npmRegistryFetch.anon.PartialFetchRetryOptions
import typings.npmRegistryFetch.mod.AuthOptions
import typings.npmRegistryFetch.mod.FetchRetryOptions
import typings.npmlog.mod.Logger
import typings.pacote.anon.Created
import typings.pacote.anon.Directory
import typings.pacote.anon.Email
import typings.pacote.anon.Latest
import typings.pacote.anon.OptionsfullMetadatatrue
import typings.pacote.anon.beforeDateOptions
import typings.pacote.anon.fullMetadatatrueOptions
import typings.pacote.pacoteBooleans.`false`
import typings.ssri.mod.Integrity
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pacote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(spec: String): js.Promise[FetchResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FetchResult]]
  inline def extract(spec: String, dest: String): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  inline def extract(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  inline def extract(spec: String, dest: Unit, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  
  inline def manifest(spec: String): js.Promise[AbbreviatedManifest & ManifestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AbbreviatedManifest & ManifestResult]]
  inline def manifest(spec: String, opts: beforeDateOptions): js.Promise[Manifest_ & ManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Manifest_ & ManifestResult]]
  inline def manifest(spec: String, opts: fullMetadatatrueOptions): js.Promise[Manifest_ & ManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Manifest_ & ManifestResult]]
  inline def manifest(spec: String, opts: Options): js.Promise[AbbreviatedManifest & ManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AbbreviatedManifest & ManifestResult]]
  
  inline def packument(spec: String): js.Promise[AbbreviatedPackument & PackumentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("packument")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AbbreviatedPackument & PackumentResult]]
  inline def packument(spec: String, opts: OptionsfullMetadatatrue): js.Promise[Packument_ & PackumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("packument")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Packument_ & PackumentResult]]
  inline def packument(spec: String, opts: Options): js.Promise[AbbreviatedPackument & PackumentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("packument")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AbbreviatedPackument & PackumentResult]]
  
  inline def resolve(spec: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def resolve(spec: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  object tarball {
    
    inline def apply(spec: String): js.Promise[Buffer & FetchResult] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer & FetchResult]]
    inline def apply(spec: String, opts: Options): js.Promise[Buffer & FetchResult] = (^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer & FetchResult]]
    
    @JSImport("pacote", "tarball")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Save a package tarball data to a file on disk.
      */
    inline def file(spec: String, dest: String): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
    inline def file(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
    
    /**
      * Fetch a tarball and make the stream available to the streamHandler
      * function.
      *
      * This is mostly an internal function, but it is exposed because it does
      * provide some functionality that may be difficult to achieve otherwise.
      *
      * The `streamHandler` function MUST return a Promise that resolves when the
      * stream (and all associated work) is ended, or rejects if the stream has
      * an error.
      *
      * The `streamHandler` function MAY be called multiple times, as Pacote
      * retries requests in some scenarios, such as cache corruption or retriable
      * network failures.
      */
    inline def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(spec.asInstanceOf[js.Any], streamHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    inline def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]], opts: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(spec.asInstanceOf[js.Any], streamHandler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  }
  
  /* Inlined std.Pick<pacote.pacote.Manifest, 'name' | 'version' | 'bin' | 'directories' | 'dependencies' | 'devDependencies' | 'peerDependencies' | 'bundledDependencies' | 'optionalDependencies' | 'engines' | 'dist' | 'deprecated'> */
  trait AbbreviatedManifest extends StObject {
    
    var bin: js.UndefOr[Record[String, String]] = js.undefined
    
    var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var deprecated: js.UndefOr[Any] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var directories: js.UndefOr[Record[String, String]] = js.undefined
    
    var dist: PackageDist
    
    var engines: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
  }
  object AbbreviatedManifest {
    
    inline def apply(dist: PackageDist, name: String, version: String): AbbreviatedManifest = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbbreviatedManifest]
    }
    
    extension [Self <: AbbreviatedManifest](x: Self) {
      
      inline def setBin(value: Record[String, String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBundledDependencies(value: `false` | js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDeprecated(value: Any): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDirectories(value: Record[String, String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDist(value: PackageDist): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setEngines(value: Record[String, String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: Record[String, String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  versions :std.Record<string, pacote.pacote.AbbreviatedManifest>} & std.Pick<pacote.pacote.Packument, 'name' | 'dist-tags'> */
  trait AbbreviatedPackument extends StObject {
    
    var `dist-tags`: Latest & (Record[String, String])
    
    var name: String
    
    var versions: Record[String, AbbreviatedManifest]
  }
  object AbbreviatedPackument {
    
    inline def apply(
      `dist-tags`: Latest & (Record[String, String]),
      name: String,
      versions: Record[String, AbbreviatedManifest]
    ): AbbreviatedPackument = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbbreviatedPackument]
    }
    
    extension [Self <: AbbreviatedPackument](x: Self) {
      
      inline def `setDist-tags`(value: Latest & (Record[String, String])): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: Record[String, AbbreviatedManifest]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonMetadata extends StObject {
    
    var author: js.UndefOr[Person] = js.undefined
    
    var bugs: js.UndefOr[Email] = js.undefined
    
    var contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
    
    var maintainers: js.Array[Person]
    
    var readme: js.UndefOr[String] = js.undefined
    
    var readmeFilename: js.UndefOr[String] = js.undefined
    
    var repository: js.UndefOr[Directory] = js.undefined
    
    var users: js.UndefOr[Record[String, Boolean]] = js.undefined
  }
  object CommonMetadata {
    
    inline def apply(maintainers: js.Array[Person]): CommonMetadata = {
      val __obj = js.Dynamic.literal(maintainers = maintainers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonMetadata]
    }
    
    extension [Self <: CommonMetadata](x: Self) {
      
      inline def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBugs(value: Email): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      inline def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      inline def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      inline def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value*))
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      inline def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value*))
      
      inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      inline def setReadmeFilename(value: String): Self = StObject.set(x, "readmeFilename", value.asInstanceOf[js.Any])
      
      inline def setReadmeFilenameUndefined: Self = StObject.set(x, "readmeFilename", js.undefined)
      
      inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      inline def setRepository(value: Directory): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setUsers(value: Record[String, Boolean]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    }
  }
  
  trait FetchResult extends StObject {
    
    /**
      * A normalized form of the spec passed in as an argument.
      */
    var from: String
    
    /**
      * The integrity value for the package artifact.
      */
    var integrity: String
    
    /**
      * The tarball url or file path where the package artifact can be found.
      */
    var resolved: String
  }
  object FetchResult {
    
    inline def apply(from: String, integrity: String, resolved: String): FetchResult = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResult]
    }
    
    extension [Self <: FetchResult](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  trait ManifestResult extends StObject {
    
    /**
      * A normalized form of the spec passed in as an argument.
      */
    var _from: String
    
    /**
      * The canonical spec of this package version: name@version.
      */
    var _id: String
    
    /**
      * The integrity value for the package artifact.
      */
    var _integrity: String
    
    /**
      * The tarball url or file path where the package artifact can be found.
      */
    var _resolved: String
  }
  object ManifestResult {
    
    inline def apply(_from: String, _id: String, _integrity: String, _resolved: String): ManifestResult = {
      val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any], _integrity = _integrity.asInstanceOf[js.Any], _resolved = _resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestResult]
    }
    
    extension [Self <: ManifestResult](x: Self) {
      
      inline def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_integrity(value: String): Self = StObject.set(x, "_integrity", value.asInstanceOf[js.Any])
      
      inline def set_resolved(value: String): Self = StObject.set(x, "_resolved", value.asInstanceOf[js.Any])
    }
  }
  
  trait Manifest_
    extends StObject
       with CommonMetadata
       with // Non-standard properties from package.json may also appear.
  /* key */ StringDictionary[Any] {
    
    var _id: String
    
    var _nodeVersion: String
    
    var _npmUser: Person
    
    var _npmVersion: String
    
    var bin: js.UndefOr[Record[String, String]] = js.undefined
    
    // These properties usually only appear when fullMetadata = true.
    var browser: js.UndefOr[String] = js.undefined
    
    var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var config: js.UndefOr[Record[String, Any]] = js.undefined
    
    var cpu: js.UndefOr[js.Array[String]] = js.undefined
    
    // These properties usually appear in all requests.
    var dependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var directories: js.UndefOr[Record[String, String]] = js.undefined
    
    var dist: PackageDist
    
    var engines: js.UndefOr[Record[String, String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var man: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var name: String
    
    var optionalDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var os: js.UndefOr[js.Array[String]] = js.undefined
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
    
    var publishConfig: js.UndefOr[Record[String, Any]] = js.undefined
    
    var scripts: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
  }
  object Manifest_ {
    
    inline def apply(
      _id: String,
      _nodeVersion: String,
      _npmUser: Person,
      _npmVersion: String,
      dist: PackageDist,
      maintainers: js.Array[Person],
      name: String,
      version: String
    ): Manifest_ = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest_]
    }
    
    extension [Self <: Manifest_](x: Self) {
      
      inline def setBin(value: Record[String, String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setBundledDependencies(value: `false` | js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      inline def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value*))
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCpu(value: js.Array[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setCpuVarargs(value: String*): Self = StObject.set(x, "cpu", js.Array(value*))
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDirectories(value: Record[String, String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDist(value: PackageDist): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setEngines(value: Record[String, String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      inline def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      inline def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependencies(value: Record[String, String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setOs(value: js.Array[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      inline def setOsVarargs(value: String*): Self = StObject.set(x, "os", js.Array(value*))
      
      inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      inline def setPublishConfig(value: Record[String, Any]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setScripts(value: Record[String, String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_nodeVersion(value: String): Self = StObject.set(x, "_nodeVersion", value.asInstanceOf[js.Any])
      
      inline def set_npmUser(value: Person): Self = StObject.set(x, "_npmUser", value.asInstanceOf[js.Any])
      
      inline def set_npmVersion(value: String): Self = StObject.set(x, "_npmVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.npmRegistryFetch.mod.FetchOptions because var conflicts: cache, integrity, log, preferOnline, registry. Inlined strictSSL, userAgent, preferOffline, forceAuth, npmSession, spec, key, method, ca, scope, maxSockets, localAddress, ignoreBody, proxy, retry, projectScope, isFromCI, body, agent, mapJSON, offline, cert, headers, query, timeout, gzip, noproxy
  - typings.npmRegistryFetch.mod.Options because var conflicts: cache, integrity, log, preferOnline, registry. Inlined  */ trait Options
    extends StObject
       with PacoteOptions
       with FetchRetryOptions
       with AuthOptions
       with /* key */ StringDictionary[Any] {
    
    /**
      * An `Agent` instance to be shared across requests. This allows
      * multiple concurrent fetch requests to happen on the same socket.
      *
      * You do not need to provide this option unless you want something
      * particularly specialized, since proxy configurations and http/https
      * agents are already automatically managed internally when this option
      * is not passed through.
      */
    var agent: js.UndefOr[Agent] = js.undefined
    
    /**
      * Request body to send through the outgoing request. Buffers and
      * Streams will be passed through as-is, with a default `content-type`
      * of `application/octet-stream`. Plain JavaScript objects will be
      * `JSON.stringify`ed and the `content-type` will default to
      * `application/json`.
      *
      * Use `opts.headers` to set the content-type to something else.
      */
    var body: js.UndefOr[Buffer | Stream | js.Object | String] = js.undefined
    
    /**
      * The Certificate Authority signing certificate that is trusted for SSL
      * connections to the registry. Values should be in PEM format (Windows
      * calls it "Base-64 encoded X.509 (.CER)") with newlines replaced by
      * the string `'\n'`. For example:
      *
      * ```typescript
      * {
      * ca: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
      * }
      * ```
      *
      * Set to `null` to only allow "known" registrars, or to a specific CA
      * cert to trust only that specific signing authority.
      *
      * Multiple CAs can be trusted by specifying an array of certificates
      * instead of a single string.
      *
      * See also `opts.strictSSL`, `opts.ca` and `opts.key`
      */
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer]) | Null] = js.undefined
    
    /**
      * A client certificate to pass when accessing the registry. Values
      * should be in PEM format (Windows calls it "Base-64 encoded X.509
      * (.CER)") with newlines replaced by the string `'\n'`. For example:
      *
      * ```typescript
      * {
      * cert: '-----BEGIN CERTIFICATE-----\nXXXX\nXXXX\n-----END CERTIFICATE-----'
      * }
      * ```
      *
      * It is *not* the path to a certificate file (and there is no "certfile"
      * option).
      *
      * See also: `opts.ca` and `opts.key`
      */
    var cert: js.UndefOr[String] = js.undefined
    
    /**
      * If present, other auth-related values in `opts` will be completely
      * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
      * auth for a request, and the auth details in `opts.forceAuth` will be
      * used instead.
      */
    var forceAuth: js.UndefOr[PartialAuthOptions] = js.undefined
    
    /**
      * If true, `npm-registry-fetch` will set the `Content-Encoding` header
      * to `gzip` and use `zlib.gzip()` or `zlib.createGzip()` to gzip-encode
      * `opts.body`.
      */
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional headers for the outgoing request. This option can also be
      * used to override headers automatically generated by
      * `npm-registry-fetch`, such as `Content-Type`.
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * If true, the response body will be thrown away and `res.body` set to
      * `null`. This will prevent dangling response sockets for requests
      * where you don't usually care what the response body is.
      */
    var ignoreBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is used to populate the `npm-in-ci` request header sent to the
      * registry.
      */
    var isFromCI: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A client key to pass when accessing the registry. Values should be in
      * PEM format with newlines replaced by the string `'\n'`. For example:
      *
      * ```typescript
      * {
      * key: '-----BEGIN PRIVATE KEY-----\nXXXX\nXXXX\n-----END PRIVATE KEY-----'
      * }
      * ```
      *
      * It is *not* the path to a key file (and there is no "keyfile"
      * option).
      *
      * See also: `opts.ca` and `opts.cert`
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The IP address of the local interface to use when making connections
      * to the registry.
      *
      * See also `opts.proxy`
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * When using `fetch.json.stream()` (NOT `fetch.json()`), this will be
      * passed down to `JSONStream` as the second argument to
      * `JSONStream.parse`, and can be used to transform stream data before
      * output.
      */
    var mapJSON: js.UndefOr[js.Function1[/* v */ Any, Any]] = js.undefined
    
    /**
      * Maximum number of sockets to keep open during requests. Has no effect
      * if `opts.agent` is used.
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * HTTP method to use for the outgoing request. Case-insensitive.
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * If true, proxying will be disabled even if `opts.proxy` is used.
      */
    var noproxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, will be sent in the `npm-session` header. This header is
      * used by the npm registry to identify individual user sessions
      * (usually individual invocations of the CLI).
      */
    var npmSession: js.UndefOr[String] = js.undefined
    
    /**
      * Force offline mode: no network requests will be done during install.
      * To allow `npm-registry-fetch` to fill in missing cache data, see
      * `opts.preferOffline`.
      *
      * This option is only really useful if you're also using `opts.cache`.
      */
    var offline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, staleness checks for cached data will be bypassed, but
      * missing data will be requested from the server. To force full offline
      * mode, use `opts.offline`.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOffline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, will be sent in the npm-scope header. This header is
      * used by the npm registry to identify the toplevel package scope that
      * a particular project installation is using.
      */
    var projectScope: js.UndefOr[String] = js.undefined
    
    /**
      * A proxy to use for outgoing http requests. If not passed in, the
      * `HTTP(S)_PROXY` environment variable will be used.
      */
    var proxy: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, the request URI will have a query string appended to it
      * using this query. If `opts.query` is an object, it will be converted
      * to a query string using [`querystring.stringify()`](https://nodejs.org/api/querystring.html#querystring_querystring_stringify_obj_sep_eq_options).
      *
      * If the request URI already has a query string, it will be merged with
      * `opts.query`, preferring `opts.query` values.
      */
    var query: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * Single-object configuration for request retry settings. If passed in,
      * will override individually-passed `fetchRetry*` settings.
      */
    var retry: js.UndefOr[PartialFetchRetryOptions] = js.undefined
    
    /**
      * Associate an operation with a scope for a scoped registry. This
      * option can force lookup of scope-specific registries and
      * authentication.
      *
      * See also `opts.<scope>:registry` and `opts.spec` for interactions
      * with this option.
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, can be used to automatically configure `opts.scope`
      * based on a specific package name. Non-registry package specs will
      * throw an error.
      */
    var spec: js.UndefOr[String | Result] = js.undefined
    
    /**
      * Whether or not to do SSL key validation when making requests to the
      * registry via https.
      *
      * See also `opts.ca`.
      */
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time before a hanging request times out.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * User agent string to send in the `User-Agent` header.
      */
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: Buffer | Stream | js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaNull: Self = StObject.set(x, "ca", null)
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setForceAuth(value: PartialAuthOptions): Self = StObject.set(x, "forceAuth", value.asInstanceOf[js.Any])
      
      inline def setForceAuthUndefined: Self = StObject.set(x, "forceAuth", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreBody(value: Boolean): Self = StObject.set(x, "ignoreBody", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBodyUndefined: Self = StObject.set(x, "ignoreBody", js.undefined)
      
      inline def setIsFromCI(value: Boolean): Self = StObject.set(x, "isFromCI", value.asInstanceOf[js.Any])
      
      inline def setIsFromCIUndefined: Self = StObject.set(x, "isFromCI", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMapJSON(value: /* v */ Any => Any): Self = StObject.set(x, "mapJSON", js.Any.fromFunction1(value))
      
      inline def setMapJSONUndefined: Self = StObject.set(x, "mapJSON", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNoproxy(value: Boolean): Self = StObject.set(x, "noproxy", value.asInstanceOf[js.Any])
      
      inline def setNoproxyUndefined: Self = StObject.set(x, "noproxy", js.undefined)
      
      inline def setNpmSession(value: String): Self = StObject.set(x, "npmSession", value.asInstanceOf[js.Any])
      
      inline def setNpmSessionUndefined: Self = StObject.set(x, "npmSession", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      inline def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      inline def setProjectScope(value: String): Self = StObject.set(x, "projectScope", value.asInstanceOf[js.Any])
      
      inline def setProjectScopeUndefined: Self = StObject.set(x, "projectScope", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRetry(value: PartialFetchRetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSpec(value: String | Result): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait PackageDist extends StObject {
    
    /**
      * Number of files in the tarball.
      */
    var fileCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The integrity SRI string for the artifact. This may not be present for
      * older packages on the npm registry. (Copied by Pacote to
      * `manifest._integrity`.)
      */
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      * A signature of the package by the
      * [`npmregistry`](https://keybase.io/npmregistry) Keybase account.
      * (Obviously only present for packages published to
      * https://registry.npmjs.org.)
      */
    var `npm-signature`: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy integrity value. Hexadecimal-encoded sha1 hash. (Converted to an
      * SRI string and copied by Pacote to `manifest._integrity` when
      * `dist.integrity` is not present.)
      */
    var shasum: js.UndefOr[String] = js.undefined
    
    /**
      * The url to the associated package artifact. (Copied by Pacote to
      * `manifest._resolved`.)
      */
    var tarball: String
    
    /**
      * Size on disk of the package when unpacked.
      */
    var unpackedSize: js.UndefOr[Double] = js.undefined
  }
  object PackageDist {
    
    inline def apply(tarball: String): PackageDist = {
      val __obj = js.Dynamic.literal(tarball = tarball.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDist]
    }
    
    extension [Self <: PackageDist](x: Self) {
      
      inline def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
      
      inline def setFileCountUndefined: Self = StObject.set(x, "fileCount", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def `setNpm-signature`(value: String): Self = StObject.set(x, "npm-signature", value.asInstanceOf[js.Any])
      
      inline def `setNpm-signatureUndefined`: Self = StObject.set(x, "npm-signature", js.undefined)
      
      inline def setShasum(value: String): Self = StObject.set(x, "shasum", value.asInstanceOf[js.Any])
      
      inline def setShasumUndefined: Self = StObject.set(x, "shasum", js.undefined)
      
      inline def setTarball(value: String): Self = StObject.set(x, "tarball", value.asInstanceOf[js.Any])
      
      inline def setUnpackedSize(value: Double): Self = StObject.set(x, "unpackedSize", value.asInstanceOf[js.Any])
      
      inline def setUnpackedSizeUndefined: Self = StObject.set(x, "unpackedSize", js.undefined)
    }
  }
  
  trait PackumentResult extends StObject {
    
    /**
      * The size of the packument.
      */
    var _contentLength: Double
  }
  object PackumentResult {
    
    inline def apply(_contentLength: Double): PackumentResult = {
      val __obj = js.Dynamic.literal(_contentLength = _contentLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackumentResult]
    }
    
    extension [Self <: PackumentResult](x: Self) {
      
      inline def set_contentLength(value: Double): Self = StObject.set(x, "_contentLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packument_
    extends StObject
       with CommonMetadata {
    
    /**
      * An object mapping dist-tags to version numbers. This is how `foo@latest`
      * gets turned into `foo@1.2.3`.
      */
    var `dist-tags`: Latest & (Record[String, String])
    
    var name: String
    
    /**
      * In the full packument, an object mapping version numbers to publication
      * times, for the `opts.before` functionality.
      */
    var time: (Record[String, String]) & Created
    
    /**
      * An object where each key is a version, and each value is the manifest for
      * that version.
      */
    var versions: Record[String, Manifest_]
  }
  object Packument_ {
    
    inline def apply(
      `dist-tags`: Latest & (Record[String, String]),
      maintainers: js.Array[Person],
      name: String,
      time: (Record[String, String]) & Created,
      versions: Record[String, Manifest_]
    ): Packument_ = {
      val __obj = js.Dynamic.literal(maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packument_]
    }
    
    extension [Self <: Packument_](x: Self) {
      
      inline def `setDist-tags`(value: Latest & (Record[String, String])): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: (Record[String, String]) & Created): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: Record[String, Manifest_]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait PacoteOptions extends StObject {
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.UndefOr[js.Date | Null] = js.undefined
    
    /**
      * Where to store cache entries and temp files. Passed to
      * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
      * that npm will use by default, based on platform and environment.
      */
    var cache: js.UndefOr[String] = js.undefined
    
    /**
      * The default `dist-tag` to use when choosing a manifest from a packument.
      * Defaults to `latest`.
      */
    var defaultTag: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum permission mode for extracted directories. Defaults to `0o777`.
      */
    var dmode: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum permission mode for extracted files. Defaults to `0o666`.
      */
    var fmode: js.UndefOr[Double] = js.undefined
    
    /**
      * Fetch the full metadata from the registry for packuments, including
      * information not strictly required for installation (author, description,
      * etc.) Defaults to `true` when `before` is set, since the version publish
      * time is part of the extended packument metadata.
      */
    var fullMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expected integrity of fetched package tarball. If specified, tarballs
      * with mismatched integrity values will raise an `EINTEGRITY` error.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
    /**
      * A logger object with methods for various log levels. Typically, this will
      * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
      * specified, the default is a logger that emits 'log' events on the process
      * object.
      */
    var log: js.UndefOr[Logger] = js.undefined
    
    /**
      * you usually don't want to fetch the same packument multiple times in
      * the span of a given script or command, no matter how many pacote calls
      * are made, so this lets us avoid doing that.  It's only relevant for
      * registry fetchers, because other types simulate their packument from
      * the manifest, which they memoize on this.package, so it's very cheap
      * already.
      */
    var packumentCache: js.UndefOr[Map[String, Packument_]] = js.undefined
    
    /**
      * Prefer to revalidate cache entries, even when it would not be strictly
      * necessary. Default `false`.
      */
    var preferOnline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The npm registry to use by default. Defaults to
      * `https://registry.npmjs.org/`.
      */
    var registry: js.UndefOr[String] = js.undefined
    
    /**
      * Shortcut for looking up resolved values. Should be specified if known.
      */
    var resolved: js.UndefOr[String] = js.undefined
    
    /**
      * Permission mode mask for extracted files and directories. Defaults to
      * `0o22`.
      */
    var umask: js.UndefOr[Double] = js.undefined
    
    /**
      * Base folder for resolving relative `file:` dependencies.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object PacoteOptions {
    
    inline def apply(): PacoteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacoteOptions]
    }
    
    extension [Self <: PacoteOptions](x: Self) {
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeNull: Self = StObject.set(x, "before", null)
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDefaultTag(value: String): Self = StObject.set(x, "defaultTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultTagUndefined: Self = StObject.set(x, "defaultTag", js.undefined)
      
      inline def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      inline def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      inline def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      inline def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      inline def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      inline def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPackumentCache(value: Map[String, Packument_]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
      
      inline def setPackumentCacheUndefined: Self = StObject.set(x, "packumentCache", js.undefined)
      
      inline def setPreferOnline(value: Boolean): Self = StObject.set(x, "preferOnline", value.asInstanceOf[js.Any])
      
      inline def setPreferOnlineUndefined: Self = StObject.set(x, "preferOnline", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Person {
    
    inline def apply(name: String): Person = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Person]
    }
    
    extension [Self <: Person](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
