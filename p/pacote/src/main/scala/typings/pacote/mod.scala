package typings.pacote

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.npmlog.mod.Logger
import typings.pacote.anon.Created
import typings.pacote.anon.Directory
import typings.pacote.anon.Email
import typings.pacote.anon.Latest
import typings.pacote.pacoteBooleans.`false`
import typings.ssri.mod.Integrity
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pacote", "extract")
  @js.native
  def extract(spec: String): js.Promise[FetchResult] = js.native
  @JSImport("pacote", "extract")
  @js.native
  def extract(spec: String, dest: js.UndefOr[scala.Nothing], opts: Options): js.Promise[FetchResult] = js.native
  @JSImport("pacote", "extract")
  @js.native
  def extract(spec: String, dest: String): js.Promise[FetchResult] = js.native
  @JSImport("pacote", "extract")
  @js.native
  def extract(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = js.native
  
  @JSImport("pacote", "manifest")
  @js.native
  def manifest(spec: String): js.Promise[ManifestResult] = js.native
  @JSImport("pacote", "manifest")
  @js.native
  def manifest(spec: String, opts: Options): js.Promise[ManifestResult] = js.native
  
  @JSImport("pacote", "packument")
  @js.native
  def packument(spec: String): js.Promise[Packument_] = js.native
  @JSImport("pacote", "packument")
  @js.native
  def packument(spec: String, opts: Options): js.Promise[Packument_] = js.native
  
  @JSImport("pacote", "resolve")
  @js.native
  def resolve(spec: String): js.Promise[String] = js.native
  @JSImport("pacote", "resolve")
  @js.native
  def resolve(spec: String, opts: Options): js.Promise[String] = js.native
  
  object tarball {
    
    @JSImport("pacote", "tarball")
    @js.native
    def apply(spec: String): js.Promise[Buffer with FetchResult] = js.native
    @JSImport("pacote", "tarball")
    @js.native
    def apply(spec: String, opts: Options): js.Promise[Buffer with FetchResult] = js.native
    
    /**
      * Save a package tarball data to a file on disk.
      */
    @JSImport("pacote", "tarball.file")
    @js.native
    def file(spec: String, dest: String): js.Promise[FetchResult] = js.native
    @JSImport("pacote", "tarball.file")
    @js.native
    def file(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = js.native
    
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
    @JSImport("pacote", "tarball.stream")
    @js.native
    def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]]): js.Promise[T] = js.native
    @JSImport("pacote", "tarball.stream")
    @js.native
    def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]], opts: Options): js.Promise[T] = js.native
  }
  
  @js.native
  trait CommonMetadata extends StObject {
    
    var author: js.UndefOr[Person] = js.native
    
    var bugs: js.UndefOr[Email] = js.native
    
    var contributors: js.UndefOr[js.Array[Person]] = js.native
    
    var homepage: js.UndefOr[String] = js.native
    
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    var license: js.UndefOr[String] = js.native
    
    var maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    var readme: js.UndefOr[String] = js.native
    
    var readmeFilename: js.UndefOr[String] = js.native
    
    var repository: js.UndefOr[Directory] = js.native
    
    var users: js.UndefOr[Record[String, Boolean]] = js.native
  }
  object CommonMetadata {
    
    @scala.inline
    def apply(): CommonMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonMetadata]
    }
    
    @scala.inline
    implicit class CommonMetadataMutableBuilder[Self <: CommonMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBugs(value: Email): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeFilename(value: String): Self = StObject.set(x, "readmeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadmeFilenameUndefined: Self = StObject.set(x, "readmeFilename", js.undefined)
      
      @scala.inline
      def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
      
      @scala.inline
      def setRepository(value: Directory): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setUsers(value: Record[String, Boolean]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    }
  }
  
  @js.native
  trait FetchResult extends StObject {
    
    /**
      * A normalized form of the spec passed in as an argument.
      */
    var from: String = js.native
    
    /**
      * The integrity value for the package artifact.
      */
    var integrity: String = js.native
    
    /**
      * The tarball url or file path where the package artifact can be found.
      */
    var resolved: String = js.native
  }
  object FetchResult {
    
    @scala.inline
    def apply(from: String, integrity: String, resolved: String): FetchResult = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResult]
    }
    
    @scala.inline
    implicit class FetchResultMutableBuilder[Self <: FetchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManifestResult extends Manifest_ {
    
    /**
      * A normalized form of the spec passed in as an argument.
      */
    var _from: String = js.native
    
    /**
      * The integrity value for the package artifact.
      */
    var _integrity: String = js.native
    
    /**
      * The tarball url or file path where the package artifact can be found.
      */
    var _resolved: String = js.native
  }
  object ManifestResult {
    
    @scala.inline
    def apply(
      _from: String,
      _integrity: String,
      _resolved: String,
      dist: PackageDist,
      name: String,
      version: String
    ): ManifestResult = {
      val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _integrity = _integrity.asInstanceOf[js.Any], _resolved = _resolved.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestResult]
    }
    
    @scala.inline
    implicit class ManifestResultMutableBuilder[Self <: ManifestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_integrity(value: String): Self = StObject.set(x, "_integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_resolved(value: String): Self = StObject.set(x, "_resolved", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Manifest_
    extends CommonMetadata
       with // Non-standard properties may also appear when fullMetadata = true.
  /* key */ StringDictionary[js.Any] {
    
    var _id: js.UndefOr[String] = js.native
    
    var _nodeVersion: js.UndefOr[String] = js.native
    
    var _npmUser: js.UndefOr[Person] = js.native
    
    var _npmVersion: js.UndefOr[String] = js.native
    
    var bin: js.UndefOr[Record[String, String]] = js.native
    
    // These properties usually only appear when fullMetadata = true.
    var browser: js.UndefOr[String] = js.native
    
    var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.native
    
    var config: js.UndefOr[Record[String, _]] = js.native
    
    var cpu: js.UndefOr[js.Array[String]] = js.native
    
    // These properties usually appear in all requests.
    var dependencies: js.UndefOr[Record[String, String]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var devDependencies: js.UndefOr[Record[String, String]] = js.native
    
    var directories: js.UndefOr[Record[String, String]] = js.native
    
    var dist: PackageDist = js.native
    
    var engines: js.UndefOr[Record[String, String]] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
    
    var main: js.UndefOr[String] = js.native
    
    var man: js.UndefOr[String | js.Array[String]] = js.native
    
    var name: String = js.native
    
    var optionalDependencies: js.UndefOr[Record[String, String]] = js.native
    
    var os: js.UndefOr[js.Array[String]] = js.native
    
    var peerDependencies: js.UndefOr[Record[String, String]] = js.native
    
    var publishConfig: js.UndefOr[Record[String, _]] = js.native
    
    var scripts: js.UndefOr[Record[String, String]] = js.native
    
    var version: String = js.native
  }
  object Manifest_ {
    
    @scala.inline
    def apply(dist: PackageDist, name: String, version: String): Manifest_ = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest_]
    }
    
    @scala.inline
    implicit class Manifest_MutableBuilder[Self <: Manifest_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBin(value: Record[String, String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setBundledDependencies(value: `false` | js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      @scala.inline
      def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: Record[String, _]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCpu(value: js.Array[String]): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      @scala.inline
      def setCpuVarargs(value: String*): Self = StObject.set(x, "cpu", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setDirectories(value: Record[String, String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setDist(value: PackageDist): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngines(value: Record[String, String]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      @scala.inline
      def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependencies(value: Record[String, String]): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setOs(value: js.Array[String]): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setOsVarargs(value: String*): Self = StObject.set(x, "os", js.Array(value :_*))
      
      @scala.inline
      def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      @scala.inline
      def setPublishConfig(value: Record[String, _]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      @scala.inline
      def setScripts(value: Record[String, String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      
      @scala.inline
      def set_nodeVersion(value: String): Self = StObject.set(x, "_nodeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_nodeVersionUndefined: Self = StObject.set(x, "_nodeVersion", js.undefined)
      
      @scala.inline
      def set_npmUser(value: Person): Self = StObject.set(x, "_npmUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_npmUserUndefined: Self = StObject.set(x, "_npmUser", js.undefined)
      
      @scala.inline
      def set_npmVersion(value: String): Self = StObject.set(x, "_npmVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_npmVersionUndefined: Self = StObject.set(x, "_npmVersion", js.undefined)
    }
  }
  
  type Options = PacoteOptions with typings.npmRegistryFetch.mod.Options
  
  @js.native
  trait PackageDist extends StObject {
    
    /**
      * Number of files in the tarball.
      */
    var fileCount: js.UndefOr[Double] = js.native
    
    /**
      * The integrity SRI string for the artifact. This may not be present for
      * older packages on the npm registry. (Copied by Pacote to
      * `manifest._integrity`.)
      */
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * A signature of the package by the
      * [`npmregistry`](https://keybase.io/npmregistry) Keybase account.
      * (Obviously only present for packages published to
      * https://registry.npmjs.org.)
      */
    var `npm-signature`: js.UndefOr[String] = js.native
    
    /**
      * Legacy integrity value. Hexadecimal-encoded sha1 hash. (Converted to an
      * SRI string and copied by Pacote to `manifest._integrity` when
      * `dist.integrity` is not present.)
      */
    var shasum: js.UndefOr[String] = js.native
    
    /**
      * The url to the associated package artifact. (Copied by Pacote to
      * `manifest._resolved`.)
      */
    var tarball: String = js.native
    
    /**
      * Size on disk of the package when unpacked.
      */
    var unpackedSize: js.UndefOr[Double] = js.native
  }
  object PackageDist {
    
    @scala.inline
    def apply(tarball: String): PackageDist = {
      val __obj = js.Dynamic.literal(tarball = tarball.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageDist]
    }
    
    @scala.inline
    implicit class PackageDistMutableBuilder[Self <: PackageDist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileCountUndefined: Self = StObject.set(x, "fileCount", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def `setNpm-signature`(value: String): Self = StObject.set(x, "npm-signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNpm-signatureUndefined`: Self = StObject.set(x, "npm-signature", js.undefined)
      
      @scala.inline
      def setShasum(value: String): Self = StObject.set(x, "shasum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShasumUndefined: Self = StObject.set(x, "shasum", js.undefined)
      
      @scala.inline
      def setTarball(value: String): Self = StObject.set(x, "tarball", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpackedSize(value: Double): Self = StObject.set(x, "unpackedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpackedSizeUndefined: Self = StObject.set(x, "unpackedSize", js.undefined)
    }
  }
  
  @js.native
  trait Packument_
    extends CommonMetadata
       with // Non-standard properties may also appear when fullMetadata = true.
  /* key */ StringDictionary[js.Any] {
    
    /**
      * An object mapping dist-tags to version numbers. This is how `foo@latest`
      * gets turned into `foo@1.2.3`.
      */
    var `dist-tags`: Latest with (Record[String, String]) = js.native
    
    var name: String = js.native
    
    /**
      * In the full packument, an object mapping version numbers to publication
      * times, for the `opts.before` functionality.
      */
    var time: js.UndefOr[(Record[String, String]) with Created] = js.native
    
    /**
      * An object where each key is a version, and each value is the manifest for
      * that version.
      */
    var versions: Record[String, Manifest_] = js.native
  }
  object Packument_ {
    
    @scala.inline
    def apply(
      `dist-tags`: Latest with (Record[String, String]),
      name: String,
      versions: Record[String, Manifest_]
    ): Packument_ = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packument_]
    }
    
    @scala.inline
    implicit class Packument_MutableBuilder[Self <: Packument_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setDist-tags`(value: Latest with (Record[String, String])): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: (Record[String, String]) with Created): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setVersions(value: Record[String, Manifest_]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PacoteOptions extends StObject {
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.UndefOr[Date | Null] = js.native
    
    /**
      * Where to store cache entries and temp files. Passed to
      * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
      * that npm will use by default, based on platform and environment.
      */
    var cache: js.UndefOr[String] = js.native
    
    /**
      * The default `dist-tag` to use when choosing a manifest from a packument.
      * Defaults to `latest`.
      */
    var defaultTag: js.UndefOr[String] = js.native
    
    /**
      * Minimum permission mode for extracted directories. Defaults to `0o777`.
      */
    var dmode: js.UndefOr[Double] = js.native
    
    /**
      * Minimum permission mode for extracted files. Defaults to `0o666`.
      */
    var fmode: js.UndefOr[Double] = js.native
    
    /**
      * Fetch the full metadata from the registry for packuments, including
      * information not strictly required for installation (author, description,
      * etc.) Defaults to `true` when `before` is set, since the version publish
      * time is part of the extended packument metadata.
      */
    var fullMetadata: js.UndefOr[Boolean] = js.native
    
    /**
      * Expected integrity of fetched package tarball. If specified, tarballs
      * with mismatched integrity values will raise an `EINTEGRITY` error.
      */
    var integrity: js.UndefOr[String | Integrity] = js.native
    
    /**
      * A logger object with methods for various log levels. Typically, this will
      * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
      * specified, the default is a logger that emits 'log' events on the process
      * object.
      */
    var log: js.UndefOr[Logger] = js.native
    
    /**
      * Prefer to revalidate cache entries, even when it would not be strictly
      * necessary. Default `false`.
      */
    var preferOnline: js.UndefOr[Boolean] = js.native
    
    /**
      * The npm registry to use by default. Defaults to
      * `https://registry.npmjs.org/`.
      */
    var registry: js.UndefOr[String] = js.native
    
    /**
      * Shortcut for looking up resolved values. Should be specified if known.
      */
    var resolved: js.UndefOr[String] = js.native
    
    /**
      * Permission mode mask for extracted files and directories. Defaults to
      * `0o22`.
      */
    var umask: js.UndefOr[Double] = js.native
    
    /**
      * Base folder for resolving relative `file:` dependencies.
      */
    var where: js.UndefOr[String] = js.native
  }
  object PacoteOptions {
    
    @scala.inline
    def apply(): PacoteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PacoteOptions]
    }
    
    @scala.inline
    implicit class PacoteOptionsMutableBuilder[Self <: PacoteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeNull: Self = StObject.set(x, "before", null)
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDefaultTag(value: String): Self = StObject.set(x, "defaultTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTagUndefined: Self = StObject.set(x, "defaultTag", js.undefined)
      
      @scala.inline
      def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      @scala.inline
      def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      @scala.inline
      def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setPreferOnline(value: Boolean): Self = StObject.set(x, "preferOnline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferOnlineUndefined: Self = StObject.set(x, "preferOnline", js.undefined)
      
      @scala.inline
      def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  @js.native
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Person {
    
    @scala.inline
    def apply(name: String): Person = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Person]
    }
    
    @scala.inline
    implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
