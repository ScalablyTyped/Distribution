package typings.mdns.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertisementCreatable
  extends Instantiable2[/* serviceType */ ServiceType, /* port */ Double, Advertisement]
     with Instantiable3[
      /* serviceType */ ServiceType, 
      /* port */ Double, 
      /* options */ AdvertisementOptions, 
      Advertisement
    ]
     with Instantiable4[
      /* serviceType */ ServiceType, 
      /* port */ Double, 
      js.UndefOr[/* options */ AdvertisementOptions], 
      /* callback */ js.Function2[/* error */ DnsSdError, /* service */ Service, Unit], 
      Advertisement
    ]
