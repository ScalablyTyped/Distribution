package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsDomainIsMod {
  
  @JSImport("pac-resolver/dist/dnsDomainIs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(host: String, domain: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
