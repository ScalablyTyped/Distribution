package typings.ospath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ospath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def data(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("data")().asInstanceOf[String]
  
  inline def desktop(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("desktop")().asInstanceOf[String]
  
  inline def home(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("home")().asInstanceOf[String]
  
  inline def tmp(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmp")().asInstanceOf[String]
}
