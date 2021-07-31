package typings.pacote

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
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
import typings.pacote.pacoteBooleans.`false`
import typings.ssri.mod.Integrity
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pacote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extract(spec: String): js.Promise[FetchResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FetchResult]]
  @scala.inline
  def extract(spec: String, dest: String): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  @scala.inline
  def extract(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  @scala.inline
  def extract(spec: String, dest: Unit, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
  
  @scala.inline
  def manifest(spec: String): js.Promise[ManifestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ManifestResult]]
  @scala.inline
  def manifest(spec: String, opts: Options): js.Promise[ManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("manifest")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ManifestResult]]
  
  @scala.inline
  def packument(spec: String): js.Promise[Packument_] = ^.asInstanceOf[js.Dynamic].applyDynamic("packument")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Packument_]]
  @scala.inline
  def packument(spec: String, opts: Options): js.Promise[Packument_] = (^.asInstanceOf[js.Dynamic].applyDynamic("packument")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Packument_]]
  
  @scala.inline
  def resolve(spec: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def resolve(spec: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  object tarball {
    
    @scala.inline
    def apply(spec: String): js.Promise[Buffer & FetchResult] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer & FetchResult]]
    @scala.inline
    def apply(spec: String, opts: Options): js.Promise[Buffer & FetchResult] = (^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer & FetchResult]]
    
    @JSImport("pacote", "tarball")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Save a package tarball data to a file on disk.
      */
    @scala.inline
    def file(spec: String, dest: String): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
    @scala.inline
    def file(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(spec.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FetchResult]]
    
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
    @scala.inline
    def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(spec.asInstanceOf[js.Any], streamHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    @scala.inline
    def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]], opts: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(spec.asInstanceOf[js.Any], streamHandler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  }
  
  trait CommonMetadata extends StObject {
    
    var author: js.UndefOr[Person] = js.undefined
    
    var bugs: js.UndefOr[Email] = js.undefined
    
    var contributors: js.UndefOr[js.Array[Person]] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
    
    var maintainers: js.UndefOr[js.Array[Person]] = js.undefined
    
    var readme: js.UndefOr[String] = js.undefined
    
    var readmeFilename: js.UndefOr[String] = js.undefined
    
    var repository: js.UndefOr[Directory] = js.undefined
    
    var users: js.UndefOr[Record[String, Boolean]] = js.undefined
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
  
  trait ManifestResult
    extends StObject
       with Manifest_ {
    
    /**
      * A normalized form of the spec passed in as an argument.
      */
    var _from: String
    
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
  
  trait Manifest_
    extends StObject
       with CommonMetadata
       with // Non-standard properties may also appear when fullMetadata = true.
  /* key */ StringDictionary[js.Any] {
    
    var _id: js.UndefOr[String] = js.undefined
    
    var _nodeVersion: js.UndefOr[String] = js.undefined
    
    var _npmUser: js.UndefOr[Person] = js.undefined
    
    var _npmVersion: js.UndefOr[String] = js.undefined
    
    var bin: js.UndefOr[Record[String, String]] = js.undefined
    
    // These properties usually only appear when fullMetadata = true.
    var browser: js.UndefOr[String] = js.undefined
    
    var bundledDependencies: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var config: js.UndefOr[Record[String, js.Any]] = js.undefined
    
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
    
    var publishConfig: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var scripts: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: String
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
      def setConfig(value: Record[String, js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
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
      def setPublishConfig(value: Record[String, js.Any]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.npmRegistryFetch.mod.FetchOptions because var conflicts: cache, integrity, log, preferOnline, registry. Inlined strictSSL, userAgent, preferOffline, forceAuth, npmSession, spec, key, method, ca, scope, maxSockets, localAddress, ignoreBody, proxy, retry, projectScope, isFromCI, body, agent, mapJSON, offline, cert, headers, query, timeout, gzip, noproxy
  - typings.npmRegistryFetch.mod.Options because var conflicts: cache, integrity, log, preferOnline, registry. Inlined  */ trait Options
    extends StObject
       with PacoteOptions
       with FetchRetryOptions
       with AuthOptions
       with /* key */ StringDictionary[js.Any] {
    
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
    var mapJSON: js.UndefOr[js.Function1[/* v */ js.Any, js.Any]] = js.undefined
    
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: Buffer | Stream | js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaNull: Self = StObject.set(x, "ca", null)
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setForceAuth(value: PartialAuthOptions): Self = StObject.set(x, "forceAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAuthUndefined: Self = StObject.set(x, "forceAuth", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIgnoreBody(value: Boolean): Self = StObject.set(x, "ignoreBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBodyUndefined: Self = StObject.set(x, "ignoreBody", js.undefined)
      
      @scala.inline
      def setIsFromCI(value: Boolean): Self = StObject.set(x, "isFromCI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFromCIUndefined: Self = StObject.set(x, "isFromCI", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMapJSON(value: /* v */ js.Any => js.Any): Self = StObject.set(x, "mapJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapJSONUndefined: Self = StObject.set(x, "mapJSON", js.undefined)
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNoproxy(value: Boolean): Self = StObject.set(x, "noproxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoproxyUndefined: Self = StObject.set(x, "noproxy", js.undefined)
      
      @scala.inline
      def setNpmSession(value: String): Self = StObject.set(x, "npmSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmSessionUndefined: Self = StObject.set(x, "npmSession", js.undefined)
      
      @scala.inline
      def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      @scala.inline
      def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      @scala.inline
      def setProjectScope(value: String): Self = StObject.set(x, "projectScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectScopeUndefined: Self = StObject.set(x, "projectScope", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRetry(value: PartialFetchRetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSpec(value: String | Result): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      @scala.inline
      def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
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
  
  trait Packument_
    extends StObject
       with CommonMetadata
       with // Non-standard properties may also appear when fullMetadata = true.
  /* key */ StringDictionary[js.Any] {
    
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
    var time: js.UndefOr[(Record[String, String]) & Created] = js.undefined
    
    /**
      * An object where each key is a version, and each value is the manifest for
      * that version.
      */
    var versions: Record[String, Manifest_]
  }
  object Packument_ {
    
    @scala.inline
    def apply(`dist-tags`: Latest & (Record[String, String]), name: String, versions: Record[String, Manifest_]): Packument_ = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packument_]
    }
    
    @scala.inline
    implicit class Packument_MutableBuilder[Self <: Packument_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setDist-tags`(value: Latest & (Record[String, String])): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: (Record[String, String]) & Created): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setVersions(value: Record[String, Manifest_]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  trait PacoteOptions extends StObject {
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.UndefOr[Date | Null] = js.undefined
    
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
  
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
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
