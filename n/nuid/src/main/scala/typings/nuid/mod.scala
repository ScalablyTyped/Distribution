package typings.nuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def next(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[String]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @JSImport("nuid", "version")
  @js.native
  val version: String = js.native
}
