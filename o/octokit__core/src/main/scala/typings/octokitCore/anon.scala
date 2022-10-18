package typings.octokitCore

import org.scalablytyped.runtime.StringDictionary
import typings.octokitRequestError.mod.RequestError
import typings.octokitTypes.anon.Format
import typings.octokitTypes.anon.RequestHeadersacceptstrin
import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import typings.octokitTypes.distTypesRequestMethodMod.RequestMethod
import typings.octokitTypes.distTypesRequestRequestOptionsMod.RequestRequestOptions
import typings.octokitTypes.distTypesUrlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(message: String): Any
    
    def error(message: String): Any
    
    def info(message: String): Any
    
    def warn(message: String): Any
  }
  object Debug {
    
    inline def apply(debug: String => Any, error: String => Any, info: String => Any, warn: String => Any): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: String => Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: String => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: String => Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dictkey
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    def debug(message: String): Any = js.native
    def debug(message: String, additionalInfo: js.Object): Any = js.native
    
    def error(message: String): Any = js.native
    def error(message: String, additionalInfo: js.Object): Any = js.native
    
    def info(message: String): Any = js.native
    def info(message: String, additionalInfo: js.Object): Any = js.native
    
    def warn(message: String): Any = js.native
    def warn(message: String, additionalInfo: js.Object): Any = js.native
  }
  
  trait Error extends StObject {
    
    var Error: RequestError | js.Error
    
    var Options: RequiredEndpointDefaults
    
    var Result: OctokitResponse[Any, Double]
  }
  object Error {
    
    inline def apply(
      Error: RequestError | js.Error,
      Options: RequiredEndpointDefaults,
      Result: OctokitResponse[Any, Double]
    ): Error = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: RequestError | js.Error): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: RequiredEndpointDefaults): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setResult(value: OctokitResponse[Any, Double]): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var Error: Any
    
    var Options: Any
    
    var Result: Any
  }
  object Options {
    
    inline def apply(Error: Any, Options: Any, Result: Any): Options = {
      val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.Array[Any]
  }
  object Plugins {
    
    inline def apply(plugins: js.Array[Any]): Plugins = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  /* Inlined std.Required<@octokit/types.@octokit/types.EndpointDefaults> */
  trait RequiredEndpointDefaults extends StObject {
    
    var baseUrl: Url
    
    var headers: RequestHeadersacceptstrin
    
    var mediaType: Format
    
    var method: RequestMethod
    
    var request: RequestRequestOptions
    
    var url: Url
  }
  object RequiredEndpointDefaults {
    
    inline def apply(
      baseUrl: Url,
      headers: RequestHeadersacceptstrin,
      mediaType: Format,
      method: RequestMethod,
      request: RequestRequestOptions,
      url: Url
    ): RequiredEndpointDefaults = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredEndpointDefaults]
    }
    
    extension [Self <: RequiredEndpointDefaults](x: Self) {
      
      inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: RequestHeadersacceptstrin): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMediaType(value: Format): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
