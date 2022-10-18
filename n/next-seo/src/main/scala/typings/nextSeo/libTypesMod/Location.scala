package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nextSeo.libTypesMod.Place
  - typings.nextSeo.libTypesMod.VirtualLocation
*/
trait Location extends StObject
object Location {
  
  inline def Place(address: Address, name: String): typings.nextSeo.libTypesMod.Place = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nextSeo.libTypesMod.Place]
  }
  
  inline def VirtualLocation(url: String): typings.nextSeo.libTypesMod.VirtualLocation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nextSeo.libTypesMod.VirtualLocation]
  }
}
