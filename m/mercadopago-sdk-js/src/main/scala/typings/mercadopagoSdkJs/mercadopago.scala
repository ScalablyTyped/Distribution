package typings.mercadopagoSdkJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.mercadopagoSdkJs.mercadopagocore.MercadoPagoCore
import typings.mercadopagoSdkJs.mercadopagocore.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mercadopago {
  
  @js.native
  trait MercadoPago
    extends StObject
       with Instantiable1[/* publicKey */ String, MercadoPagoCore]
       with Instantiable2[/* publicKey */ String, /* options */ Options, MercadoPagoCore]
}
