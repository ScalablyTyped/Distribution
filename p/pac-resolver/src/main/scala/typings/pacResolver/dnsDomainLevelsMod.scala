package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsDomainLevelsMod {
  
  @JSImport("pac-resolver/dist/dnsDomainLevels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(host: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any]).asInstanceOf[Double]
}
