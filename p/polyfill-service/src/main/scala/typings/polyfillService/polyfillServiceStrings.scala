package typings.polyfillService

import typings.polyfillService.mod.PolyfillFlag
import typings.polyfillService.mod.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillServiceStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with PolyfillFlag
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait gated
    extends StObject
       with PolyfillFlag
  inline def gated: gated = "gated".asInstanceOf[gated]
  
  @js.native
  sealed trait ignore
    extends StObject
       with Unknown
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait polyfill
    extends StObject
       with Unknown
  inline def polyfill: polyfill = "polyfill".asInstanceOf[polyfill]
}
