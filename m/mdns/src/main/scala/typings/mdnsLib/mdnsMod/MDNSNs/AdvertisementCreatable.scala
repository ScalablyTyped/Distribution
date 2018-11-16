package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertisementCreatable
  extends ScalablyTyped.runtime.Instantiable2[/* serviceType */ ServiceType, /* port */ scala.Double, Advertisement]
     with ScalablyTyped.runtime.Instantiable3[
      /* serviceType */ ServiceType, 
      /* port */ scala.Double, 
      /* options */ AdvertisementOptions, 
      Advertisement
    ]
     with ScalablyTyped.runtime.Instantiable4[
      /* serviceType */ ServiceType, 
      /* port */ scala.Double, 
      /* options */ AdvertisementOptions, 
      /* callback */ js.Function2[/* error */ DnsSdError, /* service */ Service, scala.Unit], 
      Advertisement
    ]

