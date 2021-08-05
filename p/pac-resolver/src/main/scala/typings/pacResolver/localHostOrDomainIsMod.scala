package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localHostOrDomainIsMod {
  
  @JSImport("pac-resolver/dist/localHostOrDomainIs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(host: String, hostdom: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], hostdom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
