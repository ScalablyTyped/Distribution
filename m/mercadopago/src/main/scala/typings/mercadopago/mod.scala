package typings.mercadopago

import org.scalablytyped.runtime.Shortcut
import typings.mercadopago.interfaceMod.MercadoPago
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mercadopago", JSImport.Namespace)
  @js.native
  val ^ : MercadoPago = js.native
  
  type _To = MercadoPago
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MercadoPago = ^
}
