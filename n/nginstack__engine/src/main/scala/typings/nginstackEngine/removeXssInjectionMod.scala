package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeXssInjectionMod {
  
  inline def apply(content: String): String = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(content: String, preserveSymbols: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any], preserveSymbols.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/html/removeXssInjection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
}
