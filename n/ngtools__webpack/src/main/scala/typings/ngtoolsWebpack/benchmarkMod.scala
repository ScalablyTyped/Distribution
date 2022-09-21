package typings.ngtoolsWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object benchmarkMod {
  
  @JSImport("@ngtools/webpack/src/benchmark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def time(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeEnd(label: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")(label.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
