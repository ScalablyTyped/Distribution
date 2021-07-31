package typings.phin

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ClientRequestArgs
import typings.phin.phinBooleans.`true`
import typings.phin.phinStrings.json
import typings.phin.phinStrings.none
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: ToString
  }
  object Data {
    
    @scala.inline
    def apply(data: ToString): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ToString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Form extends StObject {
    
    var form: StringDictionary[String]
  }
  object Form {
    
    @scala.inline
    def apply(form: StringDictionary[String]): Form = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: StringDictionary[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithData<phin.phin.IJSONResponseOptions> */
  trait IWithDataIJSONResponseOpt extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var data: ToString
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var parse: json
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithDataIJSONResponseOpt {
    
    @scala.inline
    def apply(data: ToString, url: String | URL): IWithDataIJSONResponseOpt = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parse = "json", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithDataIJSONResponseOpt]
    }
    
    @scala.inline
    implicit class IWithDataIJSONResponseOptMutableBuilder[Self <: IWithDataIJSONResponseOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setData(value: ToString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParse(value: json): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithData<phin.phin.IOptions> */
  trait IWithDataIOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var data: ToString
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var parse: js.UndefOr[none] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithDataIOptions {
    
    @scala.inline
    def apply(data: ToString, url: String | URL): IWithDataIOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithDataIOptions]
    }
    
    @scala.inline
    implicit class IWithDataIOptionsMutableBuilder[Self <: IWithDataIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setData(value: ToString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParse(value: none): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithData<phin.phin.IStreamResponseOptions> */
  trait IWithDataIStreamResponseO extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var data: ToString
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: `true`
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithDataIStreamResponseO {
    
    @scala.inline
    def apply(data: ToString, url: String | URL): IWithDataIStreamResponseO = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], stream = true, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithDataIStreamResponseO]
    }
    
    @scala.inline
    implicit class IWithDataIStreamResponseOMutableBuilder[Self <: IWithDataIStreamResponseO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setData(value: ToString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithForm<phin.phin.IJSONResponseOptions> */
  trait IWithFormIJSONResponseOpt extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var form: StringDictionary[String]
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var parse: json
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithFormIJSONResponseOpt {
    
    @scala.inline
    def apply(form: StringDictionary[String], url: String | URL): IWithFormIJSONResponseOpt = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], parse = "json", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithFormIJSONResponseOpt]
    }
    
    @scala.inline
    implicit class IWithFormIJSONResponseOptMutableBuilder[Self <: IWithFormIJSONResponseOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForm(value: StringDictionary[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParse(value: json): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithForm<phin.phin.IOptions> */
  trait IWithFormIOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var form: StringDictionary[String]
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var parse: js.UndefOr[none] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithFormIOptions {
    
    @scala.inline
    def apply(form: StringDictionary[String], url: String | URL): IWithFormIOptions = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithFormIOptions]
    }
    
    @scala.inline
    implicit class IWithFormIOptionsMutableBuilder[Self <: IWithFormIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForm(value: StringDictionary[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParse(value: none): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phin.phin.IWithForm<phin.phin.IStreamResponseOptions> */
  trait IWithFormIStreamResponseO extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var core: js.UndefOr[ClientRequestArgs] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var form: StringDictionary[String]
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var stream: `true`
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String | URL
  }
  object IWithFormIStreamResponseO {
    
    @scala.inline
    def apply(form: StringDictionary[String], url: String | URL): IWithFormIStreamResponseO = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], stream = true, url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWithFormIStreamResponseO]
    }
    
    @scala.inline
    implicit class IWithFormIStreamResponseOMutableBuilder[Self <: IWithFormIStreamResponseO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCore(value: ClientRequestArgs): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForm(value: StringDictionary[String]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStream(value: `true`): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToString extends StObject
}
