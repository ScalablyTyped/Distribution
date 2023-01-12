package typings.pacote

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.streamMod.Stream
import typings.npmPackageArg.mod.Result
import typings.npmRegistryFetch.anon.PartialAuthOptions
import typings.npmRegistryFetch.anon.PartialFetchRetryOptions
import typings.npmlog.mod.Logger
import typings.pacote.mod.Packument_
import typings.pacote.pacoteBooleans.`true`
import typings.ssri.mod.Integrity
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Created extends StObject {
    
    var created: String
    
    var modified: String
  }
  object Created {
    
    inline def apply(created: String, modified: String): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  trait Directory extends StObject {
    
    var directory: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Directory {
    
    inline def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Latest extends StObject {
    
    var latest: String
  }
  object Latest {
    
    inline def apply(latest: String): Latest = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Latest] (val x: Self) extends AnyVal {
      
      inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pacote.pacote.Options & {  fullMetadata :true} */
  trait OptionsfullMetadatatrue
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * @deprecated
      * This is a legacy authentication token supported only for
      * compatibility. Please use `opts.token` instead.
      */
    var _auth: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `token`.
      */
    var _authToken: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `password`
      */
    var _password: js.UndefOr[String] = js.undefined
    
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
    
    var `always-auth`: js.UndefOr[Boolean] = js.undefined
    
    var alwaysAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.UndefOr[js.Date | Null] = js.undefined
    
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
      * Where to store cache entries and temp files. Passed to
      * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
      * that npm will use by default, based on platform and environment.
      */
    /**
      * The location of the http cache directory. If provided, certain
      * cachable requests will be cached according to
      * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
      * speed up future requests, as well as make the cached data available
      * offline if necessary/requested.
      *
      * See also `offline`, `preferOffline`, and `preferOnline`.
      */
    var cache: js.UndefOr[String] = js.undefined
    
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
      * The default `dist-tag` to use when choosing a manifest from a packument.
      * Defaults to `latest`.
      */
    var defaultTag: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum permission mode for extracted directories. Defaults to `0o777`.
      */
    var dmode: js.UndefOr[Double] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The "retries" config for `retry` to use when fetching packages from
      * the registry.
      *
      * See also `opts.retry` to provide all retry options as a single object.
      */
    var fetchRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The "factor" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The "maxTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The "minTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum permission mode for extracted files. Defaults to `0o666`.
      */
    var fmode: js.UndefOr[Double] = js.undefined
    
    /**
      * If present, other auth-related values in `opts` will be completely
      * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
      * auth for a request, and the auth details in `opts.forceAuth` will be
      * used instead.
      */
    var forceAuth: js.UndefOr[PartialAuthOptions] = js.undefined
    
    /**
      * Fetch the full metadata from the registry for packuments, including
      * information not strictly required for installation (author, description,
      * etc.) Defaults to `true` when `before` is set, since the version publish
      * time is part of the extended packument metadata.
      */
    var fullMetadata: js.UndefOr[Boolean] = js.undefined
    
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
      * Expected integrity of fetched package tarball. If specified, tarballs
      * with mismatched integrity values will raise an `EINTEGRITY` error.
      */
    /**
      * If provided, the response body's will be verified against this
      * integrity string, using [`ssri`](https://npm.im/ssri). If
      * verification succeeds, the response will complete as normal. If
      * verification fails, the response body will error with an `EINTEGRITY`
      * error.
      *
      * Body integrity is only verified if the body is actually consumed to
      * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
      * you consume the default `res` stream data to its end.
      *
      * Cached data will have its integrity automatically verified using the
      * previously-generated integrity hash for the saved request
      * information, so `EINTEGRITY` errors can happen if `opts.cache` is
      * used, even if `opts.integrity` is not passed in.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
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
      * A logger object with methods for various log levels. Typically, this will
      * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
      * specified, the default is a logger that emits 'log' events on the process
      * object.
      */
    /**
      * Logger object to use for logging operation details.
      */
    var log: js.UndefOr[Logger] = js.undefined
    
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
      * This is a one-time password from a two-factor authenticator. It is
      * required for certain registry interactions when two-factor auth is
      * enabled for a user account.
      */
    var otp: js.UndefOr[Double | String] = js.undefined
    
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
      * Password used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:password': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.username`
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * If true, staleness checks for cached data will be bypassed, but
      * missing data will be requested from the server. To force full offline
      * mode, use `opts.offline`.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOffline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer to revalidate cache entries, even when it would not be strictly
      * necessary. Default `false`.
      */
    /**
      * If true, staleness checks for cached data will be forced, making the
      * CLI look for updates immediately even for fresh package data.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOnline: js.UndefOr[Boolean] = js.undefined
    
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
      * The npm registry to use by default. Defaults to
      * `https://registry.npmjs.org/`.
      */
    /**
      * Registry configuration for a request. If a request URL only includes
      * the URL path, this registry setting will be prepended. This
      * configuration is also used to determine authentication details, so
      * even if the request URL references a completely different host,
      * `opts.registry` will be used to find the auth details for that
      * request.
      *
      * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
      * can all affect the actual registry URL used by the outgoing request.
      */
    var registry: js.UndefOr[String] = js.undefined
    
    /**
      * Shortcut for looking up resolved values. Should be specified if known.
      */
    var resolved: js.UndefOr[String] = js.undefined
    
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
      * Authentication token string.
      *
      * Can be scoped to a registry by using a "nerf dart" for that registry.
      * That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:token': 't0k3nH34r'
      * }
      * ```
      */
    var token: js.UndefOr[String] = js.undefined
    
    /**
      * Permission mode mask for extracted files and directories. Defaults to
      * `0o22`.
      */
    var umask: js.UndefOr[Double] = js.undefined
    
    /**
      * User agent string to send in the `User-Agent` header.
      */
    var userAgent: js.UndefOr[String] = js.undefined
    
    /**
      * Username used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:username': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.password`
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Base folder for resolving relative `file:` dependencies.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object OptionsfullMetadatatrue {
    
    inline def apply(): OptionsfullMetadatatrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsfullMetadatatrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsfullMetadatatrue] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
      
      inline def setAlwaysAuth(value: Boolean): Self = StObject.set(x, "alwaysAuth", value.asInstanceOf[js.Any])
      
      inline def setAlwaysAuthUndefined: Self = StObject.set(x, "alwaysAuth", js.undefined)
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeNull: Self = StObject.set(x, "before", null)
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBody(value: Buffer | Stream | js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaNull: Self = StObject.set(x, "ca", null)
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDefaultTag(value: String): Self = StObject.set(x, "defaultTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultTagUndefined: Self = StObject.set(x, "defaultTag", js.undefined)
      
      inline def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      inline def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchRetriesUndefined: Self = StObject.set(x, "fetchRetries", js.undefined)
      
      inline def setFetchRetryFactor(value: Double): Self = StObject.set(x, "fetchRetryFactor", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryFactorUndefined: Self = StObject.set(x, "fetchRetryFactor", js.undefined)
      
      inline def setFetchRetryMaxtimeout(value: Double): Self = StObject.set(x, "fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMaxtimeoutUndefined: Self = StObject.set(x, "fetchRetryMaxtimeout", js.undefined)
      
      inline def setFetchRetryMintimeout(value: Double): Self = StObject.set(x, "fetchRetryMintimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMintimeoutUndefined: Self = StObject.set(x, "fetchRetryMintimeout", js.undefined)
      
      inline def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      inline def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      inline def setForceAuth(value: PartialAuthOptions): Self = StObject.set(x, "forceAuth", value.asInstanceOf[js.Any])
      
      inline def setForceAuthUndefined: Self = StObject.set(x, "forceAuth", js.undefined)
      
      inline def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      inline def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreBody(value: Boolean): Self = StObject.set(x, "ignoreBody", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBodyUndefined: Self = StObject.set(x, "ignoreBody", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIsFromCI(value: Boolean): Self = StObject.set(x, "isFromCI", value.asInstanceOf[js.Any])
      
      inline def setIsFromCIUndefined: Self = StObject.set(x, "isFromCI", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
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
      
      inline def setOtp(value: Double | String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
      
      inline def setOtpUndefined: Self = StObject.set(x, "otp", js.undefined)
      
      inline def setPackumentCache(value: Map[String, Packument_]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
      
      inline def setPackumentCacheUndefined: Self = StObject.set(x, "packumentCache", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      inline def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      inline def setPreferOnline(value: Boolean): Self = StObject.set(x, "preferOnline", value.asInstanceOf[js.Any])
      
      inline def setPreferOnlineUndefined: Self = StObject.set(x, "preferOnline", js.undefined)
      
      inline def setProjectScope(value: String): Self = StObject.set(x, "projectScope", value.asInstanceOf[js.Any])
      
      inline def setProjectScopeUndefined: Self = StObject.set(x, "projectScope", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
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
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
      
      inline def set_auth(value: String): Self = StObject.set(x, "_auth", value.asInstanceOf[js.Any])
      
      inline def set_authToken(value: String): Self = StObject.set(x, "_authToken", value.asInstanceOf[js.Any])
      
      inline def set_authTokenUndefined: Self = StObject.set(x, "_authToken", js.undefined)
      
      inline def set_authUndefined: Self = StObject.set(x, "_auth", js.undefined)
      
      inline def set_password(value: String): Self = StObject.set(x, "_password", value.asInstanceOf[js.Any])
      
      inline def set_passwordUndefined: Self = StObject.set(x, "_password", js.undefined)
    }
  }
  
  /* Inlined {  before :std.Date} & pacote.pacote.Options */
  trait beforeDateOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * @deprecated
      * This is a legacy authentication token supported only for
      * compatibility. Please use `opts.token` instead.
      */
    var _auth: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `token`.
      */
    var _authToken: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `password`
      */
    var _password: js.UndefOr[String] = js.undefined
    
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
    
    var `always-auth`: js.UndefOr[Boolean] = js.undefined
    
    var alwaysAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.Date
    
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
      * Where to store cache entries and temp files. Passed to
      * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
      * that npm will use by default, based on platform and environment.
      */
    /**
      * The location of the http cache directory. If provided, certain
      * cachable requests will be cached according to
      * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
      * speed up future requests, as well as make the cached data available
      * offline if necessary/requested.
      *
      * See also `offline`, `preferOffline`, and `preferOnline`.
      */
    var cache: js.UndefOr[String] = js.undefined
    
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
      * The default `dist-tag` to use when choosing a manifest from a packument.
      * Defaults to `latest`.
      */
    var defaultTag: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum permission mode for extracted directories. Defaults to `0o777`.
      */
    var dmode: js.UndefOr[Double] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The "retries" config for `retry` to use when fetching packages from
      * the registry.
      *
      * See also `opts.retry` to provide all retry options as a single object.
      */
    var fetchRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The "factor" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The "maxTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The "minTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum permission mode for extracted files. Defaults to `0o666`.
      */
    var fmode: js.UndefOr[Double] = js.undefined
    
    /**
      * If present, other auth-related values in `opts` will be completely
      * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
      * auth for a request, and the auth details in `opts.forceAuth` will be
      * used instead.
      */
    var forceAuth: js.UndefOr[PartialAuthOptions] = js.undefined
    
    /**
      * Fetch the full metadata from the registry for packuments, including
      * information not strictly required for installation (author, description,
      * etc.) Defaults to `true` when `before` is set, since the version publish
      * time is part of the extended packument metadata.
      */
    var fullMetadata: js.UndefOr[Boolean] = js.undefined
    
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
      * Expected integrity of fetched package tarball. If specified, tarballs
      * with mismatched integrity values will raise an `EINTEGRITY` error.
      */
    /**
      * If provided, the response body's will be verified against this
      * integrity string, using [`ssri`](https://npm.im/ssri). If
      * verification succeeds, the response will complete as normal. If
      * verification fails, the response body will error with an `EINTEGRITY`
      * error.
      *
      * Body integrity is only verified if the body is actually consumed to
      * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
      * you consume the default `res` stream data to its end.
      *
      * Cached data will have its integrity automatically verified using the
      * previously-generated integrity hash for the saved request
      * information, so `EINTEGRITY` errors can happen if `opts.cache` is
      * used, even if `opts.integrity` is not passed in.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
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
      * A logger object with methods for various log levels. Typically, this will
      * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
      * specified, the default is a logger that emits 'log' events on the process
      * object.
      */
    /**
      * Logger object to use for logging operation details.
      */
    var log: js.UndefOr[Logger] = js.undefined
    
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
      * This is a one-time password from a two-factor authenticator. It is
      * required for certain registry interactions when two-factor auth is
      * enabled for a user account.
      */
    var otp: js.UndefOr[Double | String] = js.undefined
    
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
      * Password used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:password': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.username`
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * If true, staleness checks for cached data will be bypassed, but
      * missing data will be requested from the server. To force full offline
      * mode, use `opts.offline`.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOffline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer to revalidate cache entries, even when it would not be strictly
      * necessary. Default `false`.
      */
    /**
      * If true, staleness checks for cached data will be forced, making the
      * CLI look for updates immediately even for fresh package data.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOnline: js.UndefOr[Boolean] = js.undefined
    
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
      * The npm registry to use by default. Defaults to
      * `https://registry.npmjs.org/`.
      */
    /**
      * Registry configuration for a request. If a request URL only includes
      * the URL path, this registry setting will be prepended. This
      * configuration is also used to determine authentication details, so
      * even if the request URL references a completely different host,
      * `opts.registry` will be used to find the auth details for that
      * request.
      *
      * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
      * can all affect the actual registry URL used by the outgoing request.
      */
    var registry: js.UndefOr[String] = js.undefined
    
    /**
      * Shortcut for looking up resolved values. Should be specified if known.
      */
    var resolved: js.UndefOr[String] = js.undefined
    
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
      * Authentication token string.
      *
      * Can be scoped to a registry by using a "nerf dart" for that registry.
      * That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:token': 't0k3nH34r'
      * }
      * ```
      */
    var token: js.UndefOr[String] = js.undefined
    
    /**
      * Permission mode mask for extracted files and directories. Defaults to
      * `0o22`.
      */
    var umask: js.UndefOr[Double] = js.undefined
    
    /**
      * User agent string to send in the `User-Agent` header.
      */
    var userAgent: js.UndefOr[String] = js.undefined
    
    /**
      * Username used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:username': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.password`
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Base folder for resolving relative `file:` dependencies.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object beforeDateOptions {
    
    inline def apply(before: js.Date): beforeDateOptions = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[beforeDateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: beforeDateOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
      
      inline def setAlwaysAuth(value: Boolean): Self = StObject.set(x, "alwaysAuth", value.asInstanceOf[js.Any])
      
      inline def setAlwaysAuthUndefined: Self = StObject.set(x, "alwaysAuth", js.undefined)
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Buffer | Stream | js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaNull: Self = StObject.set(x, "ca", null)
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDefaultTag(value: String): Self = StObject.set(x, "defaultTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultTagUndefined: Self = StObject.set(x, "defaultTag", js.undefined)
      
      inline def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      inline def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchRetriesUndefined: Self = StObject.set(x, "fetchRetries", js.undefined)
      
      inline def setFetchRetryFactor(value: Double): Self = StObject.set(x, "fetchRetryFactor", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryFactorUndefined: Self = StObject.set(x, "fetchRetryFactor", js.undefined)
      
      inline def setFetchRetryMaxtimeout(value: Double): Self = StObject.set(x, "fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMaxtimeoutUndefined: Self = StObject.set(x, "fetchRetryMaxtimeout", js.undefined)
      
      inline def setFetchRetryMintimeout(value: Double): Self = StObject.set(x, "fetchRetryMintimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMintimeoutUndefined: Self = StObject.set(x, "fetchRetryMintimeout", js.undefined)
      
      inline def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      inline def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      inline def setForceAuth(value: PartialAuthOptions): Self = StObject.set(x, "forceAuth", value.asInstanceOf[js.Any])
      
      inline def setForceAuthUndefined: Self = StObject.set(x, "forceAuth", js.undefined)
      
      inline def setFullMetadata(value: Boolean): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      inline def setFullMetadataUndefined: Self = StObject.set(x, "fullMetadata", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreBody(value: Boolean): Self = StObject.set(x, "ignoreBody", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBodyUndefined: Self = StObject.set(x, "ignoreBody", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIsFromCI(value: Boolean): Self = StObject.set(x, "isFromCI", value.asInstanceOf[js.Any])
      
      inline def setIsFromCIUndefined: Self = StObject.set(x, "isFromCI", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
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
      
      inline def setOtp(value: Double | String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
      
      inline def setOtpUndefined: Self = StObject.set(x, "otp", js.undefined)
      
      inline def setPackumentCache(value: Map[String, Packument_]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
      
      inline def setPackumentCacheUndefined: Self = StObject.set(x, "packumentCache", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      inline def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      inline def setPreferOnline(value: Boolean): Self = StObject.set(x, "preferOnline", value.asInstanceOf[js.Any])
      
      inline def setPreferOnlineUndefined: Self = StObject.set(x, "preferOnline", js.undefined)
      
      inline def setProjectScope(value: String): Self = StObject.set(x, "projectScope", value.asInstanceOf[js.Any])
      
      inline def setProjectScopeUndefined: Self = StObject.set(x, "projectScope", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
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
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
      
      inline def set_auth(value: String): Self = StObject.set(x, "_auth", value.asInstanceOf[js.Any])
      
      inline def set_authToken(value: String): Self = StObject.set(x, "_authToken", value.asInstanceOf[js.Any])
      
      inline def set_authTokenUndefined: Self = StObject.set(x, "_authToken", js.undefined)
      
      inline def set_authUndefined: Self = StObject.set(x, "_auth", js.undefined)
      
      inline def set_password(value: String): Self = StObject.set(x, "_password", value.asInstanceOf[js.Any])
      
      inline def set_passwordUndefined: Self = StObject.set(x, "_password", js.undefined)
    }
  }
  
  /* Inlined {  fullMetadata :true} & pacote.pacote.Options */
  trait fullMetadatatrueOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * @deprecated
      * This is a legacy authentication token supported only for
      * compatibility. Please use `opts.token` instead.
      */
    var _auth: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `token`.
      */
    var _authToken: js.UndefOr[String] = js.undefined
    
    /**
      * Alias for `password`
      */
    var _password: js.UndefOr[String] = js.undefined
    
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
    
    var `always-auth`: js.UndefOr[Boolean] = js.undefined
    
    var alwaysAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When picking a manifest from a packument, only consider packages
      * published before the specified date. Default `null`.
      */
    var before: js.UndefOr[js.Date | Null] = js.undefined
    
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
      * Where to store cache entries and temp files. Passed to
      * [`cacache`](http://npm.im/cacache). Defaults to the same cache directory
      * that npm will use by default, based on platform and environment.
      */
    /**
      * The location of the http cache directory. If provided, certain
      * cachable requests will be cached according to
      * [IETF RFC 7234](https://tools.ietf.org/html/rfc7234) rules. This will
      * speed up future requests, as well as make the cached data available
      * offline if necessary/requested.
      *
      * See also `offline`, `preferOffline`, and `preferOnline`.
      */
    var cache: js.UndefOr[String] = js.undefined
    
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
      * The default `dist-tag` to use when choosing a manifest from a packument.
      * Defaults to `latest`.
      */
    var defaultTag: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum permission mode for extracted directories. Defaults to `0o777`.
      */
    var dmode: js.UndefOr[Double] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The "retries" config for `retry` to use when fetching packages from
      * the registry.
      *
      * See also `opts.retry` to provide all retry options as a single object.
      */
    var fetchRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The "factor" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The "maxTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMaxtimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The "minTimeout" config for `retry` to use when fetching packages.
      *
      * See also `opts.retry` to provide all retry options as a single
      * object.
      */
    var fetchRetryMintimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum permission mode for extracted files. Defaults to `0o666`.
      */
    var fmode: js.UndefOr[Double] = js.undefined
    
    /**
      * If present, other auth-related values in `opts` will be completely
      * ignored, including `alwaysAuth`, `email`, and `otp`, when calculating
      * auth for a request, and the auth details in `opts.forceAuth` will be
      * used instead.
      */
    var forceAuth: js.UndefOr[PartialAuthOptions] = js.undefined
    
    /**
      * Fetch the full metadata from the registry for packuments, including
      * information not strictly required for installation (author, description,
      * etc.) Defaults to `true` when `before` is set, since the version publish
      * time is part of the extended packument metadata.
      */
    var fullMetadata: `true`
    
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
      * Expected integrity of fetched package tarball. If specified, tarballs
      * with mismatched integrity values will raise an `EINTEGRITY` error.
      */
    /**
      * If provided, the response body's will be verified against this
      * integrity string, using [`ssri`](https://npm.im/ssri). If
      * verification succeeds, the response will complete as normal. If
      * verification fails, the response body will error with an `EINTEGRITY`
      * error.
      *
      * Body integrity is only verified if the body is actually consumed to
      * completion -- that is, if you use `res.json()`/`res.buffer()`, or if
      * you consume the default `res` stream data to its end.
      *
      * Cached data will have its integrity automatically verified using the
      * previously-generated integrity hash for the saved request
      * information, so `EINTEGRITY` errors can happen if `opts.cache` is
      * used, even if `opts.integrity` is not passed in.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
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
      * A logger object with methods for various log levels. Typically, this will
      * be [`npmlog`](http://npm.im/npmlog) in the npm CLI use case, but if not
      * specified, the default is a logger that emits 'log' events on the process
      * object.
      */
    /**
      * Logger object to use for logging operation details.
      */
    var log: js.UndefOr[Logger] = js.undefined
    
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
      * This is a one-time password from a two-factor authenticator. It is
      * required for certain registry interactions when two-factor auth is
      * enabled for a user account.
      */
    var otp: js.UndefOr[Double | String] = js.undefined
    
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
      * Password used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:password': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.username`
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * If true, staleness checks for cached data will be bypassed, but
      * missing data will be requested from the server. To force full offline
      * mode, use `opts.offline`.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOffline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer to revalidate cache entries, even when it would not be strictly
      * necessary. Default `false`.
      */
    /**
      * If true, staleness checks for cached data will be forced, making the
      * CLI look for updates immediately even for fresh package data.
      *
      * This option is generally only useful if you're also using `opts.cache`.
      */
    var preferOnline: js.UndefOr[Boolean] = js.undefined
    
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
      * The npm registry to use by default. Defaults to
      * `https://registry.npmjs.org/`.
      */
    /**
      * Registry configuration for a request. If a request URL only includes
      * the URL path, this registry setting will be prepended. This
      * configuration is also used to determine authentication details, so
      * even if the request URL references a completely different host,
      * `opts.registry` will be used to find the auth details for that
      * request.
      *
      * See also `opts.scope`, `opts.spec`, and `opts.<scope>:registry` which
      * can all affect the actual registry URL used by the outgoing request.
      */
    var registry: js.UndefOr[String] = js.undefined
    
    /**
      * Shortcut for looking up resolved values. Should be specified if known.
      */
    var resolved: js.UndefOr[String] = js.undefined
    
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
      * Authentication token string.
      *
      * Can be scoped to a registry by using a "nerf dart" for that registry.
      * That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:token': 't0k3nH34r'
      * }
      * ```
      */
    var token: js.UndefOr[String] = js.undefined
    
    /**
      * Permission mode mask for extracted files and directories. Defaults to
      * `0o22`.
      */
    var umask: js.UndefOr[Double] = js.undefined
    
    /**
      * User agent string to send in the `User-Agent` header.
      */
    var userAgent: js.UndefOr[String] = js.undefined
    
    /**
      * Username used for basic authentication. For the more modern
      * authentication method, please use the (more secure) `opts.token`
      *
      * Can optionally be scoped to a registry by using a "nerf dart" for
      * that registry. That is:
      *
      * ```typescript
      * {
      * '//registry.npmjs.org/:username': 't0k3nH34r'
      * }
      * ```
      *
      * See also `opts.password`
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Base folder for resolving relative `file:` dependencies.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  object fullMetadatatrueOptions {
    
    inline def apply(): fullMetadatatrueOptions = {
      val __obj = js.Dynamic.literal(fullMetadata = true)
      __obj.asInstanceOf[fullMetadatatrueOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fullMetadatatrueOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def `setAlways-auth`(value: Boolean): Self = StObject.set(x, "always-auth", value.asInstanceOf[js.Any])
      
      inline def `setAlways-authUndefined`: Self = StObject.set(x, "always-auth", js.undefined)
      
      inline def setAlwaysAuth(value: Boolean): Self = StObject.set(x, "alwaysAuth", value.asInstanceOf[js.Any])
      
      inline def setAlwaysAuthUndefined: Self = StObject.set(x, "alwaysAuth", js.undefined)
      
      inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeNull: Self = StObject.set(x, "before", null)
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBody(value: Buffer | Stream | js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaNull: Self = StObject.set(x, "ca", null)
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setDefaultTag(value: String): Self = StObject.set(x, "defaultTag", value.asInstanceOf[js.Any])
      
      inline def setDefaultTagUndefined: Self = StObject.set(x, "defaultTag", js.undefined)
      
      inline def setDmode(value: Double): Self = StObject.set(x, "dmode", value.asInstanceOf[js.Any])
      
      inline def setDmodeUndefined: Self = StObject.set(x, "dmode", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFetchRetries(value: Double): Self = StObject.set(x, "fetchRetries", value.asInstanceOf[js.Any])
      
      inline def setFetchRetriesUndefined: Self = StObject.set(x, "fetchRetries", js.undefined)
      
      inline def setFetchRetryFactor(value: Double): Self = StObject.set(x, "fetchRetryFactor", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryFactorUndefined: Self = StObject.set(x, "fetchRetryFactor", js.undefined)
      
      inline def setFetchRetryMaxtimeout(value: Double): Self = StObject.set(x, "fetchRetryMaxtimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMaxtimeoutUndefined: Self = StObject.set(x, "fetchRetryMaxtimeout", js.undefined)
      
      inline def setFetchRetryMintimeout(value: Double): Self = StObject.set(x, "fetchRetryMintimeout", value.asInstanceOf[js.Any])
      
      inline def setFetchRetryMintimeoutUndefined: Self = StObject.set(x, "fetchRetryMintimeout", js.undefined)
      
      inline def setFmode(value: Double): Self = StObject.set(x, "fmode", value.asInstanceOf[js.Any])
      
      inline def setFmodeUndefined: Self = StObject.set(x, "fmode", js.undefined)
      
      inline def setForceAuth(value: PartialAuthOptions): Self = StObject.set(x, "forceAuth", value.asInstanceOf[js.Any])
      
      inline def setForceAuthUndefined: Self = StObject.set(x, "forceAuth", js.undefined)
      
      inline def setFullMetadata(value: `true`): Self = StObject.set(x, "fullMetadata", value.asInstanceOf[js.Any])
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreBody(value: Boolean): Self = StObject.set(x, "ignoreBody", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBodyUndefined: Self = StObject.set(x, "ignoreBody", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIsFromCI(value: Boolean): Self = StObject.set(x, "isFromCI", value.asInstanceOf[js.Any])
      
      inline def setIsFromCIUndefined: Self = StObject.set(x, "isFromCI", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
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
      
      inline def setOtp(value: Double | String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
      
      inline def setOtpUndefined: Self = StObject.set(x, "otp", js.undefined)
      
      inline def setPackumentCache(value: Map[String, Packument_]): Self = StObject.set(x, "packumentCache", value.asInstanceOf[js.Any])
      
      inline def setPackumentCacheUndefined: Self = StObject.set(x, "packumentCache", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPreferOffline(value: Boolean): Self = StObject.set(x, "preferOffline", value.asInstanceOf[js.Any])
      
      inline def setPreferOfflineUndefined: Self = StObject.set(x, "preferOffline", js.undefined)
      
      inline def setPreferOnline(value: Boolean): Self = StObject.set(x, "preferOnline", value.asInstanceOf[js.Any])
      
      inline def setPreferOnlineUndefined: Self = StObject.set(x, "preferOnline", js.undefined)
      
      inline def setProjectScope(value: String): Self = StObject.set(x, "projectScope", value.asInstanceOf[js.Any])
      
      inline def setProjectScopeUndefined: Self = StObject.set(x, "projectScope", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery(value: String | js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
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
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUmask(value: Double): Self = StObject.set(x, "umask", value.asInstanceOf[js.Any])
      
      inline def setUmaskUndefined: Self = StObject.set(x, "umask", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
      
      inline def set_auth(value: String): Self = StObject.set(x, "_auth", value.asInstanceOf[js.Any])
      
      inline def set_authToken(value: String): Self = StObject.set(x, "_authToken", value.asInstanceOf[js.Any])
      
      inline def set_authTokenUndefined: Self = StObject.set(x, "_authToken", js.undefined)
      
      inline def set_authUndefined: Self = StObject.set(x, "_auth", js.undefined)
      
      inline def set_password(value: String): Self = StObject.set(x, "_password", value.asInstanceOf[js.Any])
      
      inline def set_passwordUndefined: Self = StObject.set(x, "_password", js.undefined)
    }
  }
}
