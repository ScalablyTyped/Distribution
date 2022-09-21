package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cart extends StObject {
  
  /**
    *
    * @deprecated Cart persistence in mParticle has been deprecated. Please use mParticle.eCommerce.logProductAction(mParticle.ProductActionType.AddToCart, [products])
    */
  def add(product: Product): Unit = js.native
  def add(product: Product, logEventBoolean: Boolean): Unit = js.native
  
  /**
    *
    * @deprecated Cart persistence in mParticle has been deprecated.
    */
  def clear(): Unit = js.native
  
  /**
    *
    * @deprecated Cart persistence in mParticle has been deprecated. Please use mParticle.eCommerce.logProductAction(mParticle.ProductActionType.RemoveFromCart, [products])
    */
  def remove(product: Product): Unit = js.native
  def remove(product: Product, logEventBoolean: Boolean): Unit = js.native
}
