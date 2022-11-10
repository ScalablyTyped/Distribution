package typings.octokitCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.octokitCore.anon.Debug
import typings.octokitCore.anon.Error
import typings.octokitCore.anon.Options
import typings.octokitCore.mod.Octokit
import typings.octokitTypes.distTypesRequestRequestOptionsMod.RequestRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  type AnyFunction = js.Function1[/* args */ Any, Any]
  
  type Constructor[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  trait Hooks
    extends StObject
       with /* key */ StringDictionary[Options] {
    
    var request: Error
  }
  object Hooks {
    
    inline def apply(request: Error): Hooks = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setRequest(value: Error): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait OctokitOptions
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    var auth: js.UndefOr[Any] = js.undefined
    
    var authStrategy: js.UndefOr[Any] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[Debug] = js.undefined
    
    var previews: js.UndefOr[js.Array[String]] = js.undefined
    
    var request: js.UndefOr[RequestRequestOptions] = js.undefined
    
    var timeZone: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object OctokitOptions {
    
    inline def apply(): OctokitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OctokitOptions]
    }
    
    extension [Self <: OctokitOptions](x: Self) {
      
      inline def setAuth(value: Any): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthStrategy(value: Any): Self = StObject.set(x, "authStrategy", value.asInstanceOf[js.Any])
      
      inline def setAuthStrategyUndefined: Self = StObject.set(x, "authStrategy", js.undefined)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setLog(value: Debug): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPreviews(value: js.Array[String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      inline def setPreviewsUndefined: Self = StObject.set(x, "previews", js.undefined)
      
      inline def setPreviewsVarargs(value: String*): Self = StObject.set(x, "previews", js.Array(value*))
      
      inline def setRequest(value: RequestRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  type OctokitPlugin = js.Function2[/* octokit */ Octokit, /* options */ OctokitOptions, StringDictionary[Any] | Unit]
  
  type RequestParameters = typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends @octokit/core.@octokit/core/dist-types/types.AnyFunction ? std.ReturnType<T> : T extends std.Array<@octokit/core.@octokit/core/dist-types/types.AnyFunction> ? @octokit/core.@octokit/core/dist-types/types.UnionToIntersection<std.Exclude<std.ReturnType<T[number]>, void>> : never
    }}}
    */
  @js.native
  trait ReturnTypeOf[T /* <: AnyFunction | js.Array[AnyFunction] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Union extends any ? (argument : Union): void : never extends (argument : infer Intersection): void ? Intersection : never
    }}}
    */
  @js.native
  trait UnionToIntersection[Union] extends StObject
}
