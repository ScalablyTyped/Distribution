package typings.polyfillLibrary

import typings.polyfillLibrary.mod.Flag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillLibraryStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with Flag
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait gated
    extends StObject
       with Flag
  inline def gated: gated = "gated".asInstanceOf[gated]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait polyfill extends StObject
  inline def polyfill: polyfill = "polyfill".asInstanceOf[polyfill]
}
