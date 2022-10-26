package typings.next

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesUrlMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `URL` class is a global reference for `require('url').URL`
    * https://nodejs.org/api/url.html#the-whatwg-url-api
    * @since v10.0.0
    */
  /* was `typeof URL` */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/url", "URL")
  @js.native
  def URL: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URL :infer T} ? T : {readonly createObjectURL (blob : node.node:buffer.Blob): string, readonly revokeObjectURL (objectUrl : string): void} & new (input : string, base : string | node.url.URL | undefined): node.url.URL */ js.Any = js.native
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/url", "URLPattern")
  @js.native
  open class URLPattern () extends StObject {
    
    def exec(): URLPatternResult | Null = js.native
    def exec(input: Unit, baseURL: String): URLPatternResult | Null = js.native
    def exec(input: URLPatternInput): URLPatternResult | Null = js.native
    def exec(input: URLPatternInput, baseURL: String): URLPatternResult | Null = js.native
    
    val hash: String = js.native
    
    val hostname: String = js.native
    
    val password: String = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    val search: String = js.native
    
    def test(): Boolean = js.native
    def test(input: Unit, baseURL: String): Boolean = js.native
    def test(input: URLPatternInput): Boolean = js.native
    def test(input: URLPatternInput, baseURL: String): Boolean = js.native
    
    val username: String = js.native
  }
  
  /**
    * `URLSearchParams` class is a global reference for `require('url').URLSearchParams`
    * https://nodejs.org/api/url.html#class-urlsearchparams
    * @since v10.0.0
    */
  /* was `typeof URLSearchParams` */
  @JSImport("next/dist/compiled/@edge-runtime/primitives/url", "URLSearchParams")
  @js.native
  def URLSearchParams: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URLSearchParams :infer T} ? T : new (init : node.url.URLSearchParams | string | std.Record<string, string | std.ReadonlyArray<string>> | std.Iterable<[string, string]> | std.ReadonlyArray<[string, string]> | undefined): node.url.URLSearchParams */ js.Any = js.native
  inline def URLSearchParams_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URLSearchParams :infer T} ? T : new (init : node.url.URLSearchParams | string | std.Record<string, string | std.ReadonlyArray<string>> | std.Iterable<[string, string]> | std.ReadonlyArray<[string, string]> | undefined): node.url.URLSearchParams */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLSearchParams")(x.asInstanceOf[js.Any])
  
  inline def URL_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URL :infer T} ? T : {readonly createObjectURL (blob : node.node:buffer.Blob): string, readonly revokeObjectURL (objectUrl : string): void} & new (input : string, base : string | node.url.URL | undefined): node.url.URL */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  trait URLPatternComponentResult extends StObject {
    
    var groups: StringDictionary[js.UndefOr[String]]
    
    var input: String
  }
  object URLPatternComponentResult {
    
    inline def apply(groups: StringDictionary[js.UndefOr[String]], input: String): URLPatternComponentResult = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLPatternComponentResult]
    }
    
    extension [Self <: URLPatternComponentResult](x: Self) {
      
      inline def setGroups(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLPatternInit extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object URLPatternInit {
    
    inline def apply(): URLPatternInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLPatternInit]
    }
    
    extension [Self <: URLPatternInit](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type URLPatternInput = URLPatternInit | String
  
  trait URLPatternResult extends StObject {
    
    var hash: URLPatternComponentResult
    
    var hostname: URLPatternComponentResult
    
    var inputs: js.Array[URLPatternInput]
    
    var password: URLPatternComponentResult
    
    var pathname: URLPatternComponentResult
    
    var port: URLPatternComponentResult
    
    var protocol: URLPatternComponentResult
    
    var search: URLPatternComponentResult
    
    var username: URLPatternComponentResult
  }
  object URLPatternResult {
    
    inline def apply(
      hash: URLPatternComponentResult,
      hostname: URLPatternComponentResult,
      inputs: js.Array[URLPatternInput],
      password: URLPatternComponentResult,
      pathname: URLPatternComponentResult,
      port: URLPatternComponentResult,
      protocol: URLPatternComponentResult,
      search: URLPatternComponentResult,
      username: URLPatternComponentResult
    ): URLPatternResult = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLPatternResult]
    }
    
    extension [Self <: URLPatternResult](x: Self) {
      
      inline def setHash(value: URLPatternComponentResult): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: URLPatternComponentResult): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: js.Array[URLPatternInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: URLPatternInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setPassword(value: URLPatternComponentResult): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: URLPatternComponentResult): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: URLPatternComponentResult): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: URLPatternComponentResult): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: URLPatternComponentResult): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: URLPatternComponentResult): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type _URLPattern = URLPattern
}
