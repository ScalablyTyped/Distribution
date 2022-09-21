package typings.nodeFetch

import typings.nodeFetch.mod.ReferrerPolicy
import typings.nodeFetch.mod.RequestRedirect
import typings.nodeFetch.mod.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFetchStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ResponseType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait AbortError extends StObject
  inline def AbortError: AbortError = "AbortError".asInstanceOf[AbortError]
  
  @js.native
  sealed trait FetchError extends StObject
  inline def FetchError: FetchError = "FetchError".asInstanceOf[FetchError]
  
  @js.native
  sealed trait _empty
    extends StObject
       with ReferrerPolicy
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait basic
    extends StObject
       with ResponseType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait cors
    extends StObject
       with ResponseType
  inline def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait error
    extends StObject
       with RequestRedirect
       with ResponseType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait follow
    extends StObject
       with RequestRedirect
  inline def follow: follow = "follow".asInstanceOf[follow]
  
  @js.native
  sealed trait manual
    extends StObject
       with RequestRedirect
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with ReferrerPolicy
  inline def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait opaque
    extends StObject
       with ResponseType
  inline def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait opaqueredirect
    extends StObject
       with ResponseType
  inline def opaqueredirect: opaqueredirect = "opaqueredirect".asInstanceOf[opaqueredirect]
  
  @js.native
  sealed trait origin
    extends StObject
       with ReferrerPolicy
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with ReferrerPolicy
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with ReferrerPolicy
  inline def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with ReferrerPolicy
  inline def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
}
