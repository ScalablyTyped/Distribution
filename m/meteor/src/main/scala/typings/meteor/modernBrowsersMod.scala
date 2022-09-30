package typings.meteor

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modernBrowsersMod {
  
  @JSImport("meteor/modern-browsers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setMinimumBrowserVersions(versions: Record[String, Double | js.Array[Double]], source: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMinimumBrowserVersions")(versions.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
