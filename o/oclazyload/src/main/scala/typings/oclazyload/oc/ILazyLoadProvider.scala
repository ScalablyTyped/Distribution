package typings.oclazyload.oc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILazyLoadProvider extends js.Object {
  /**
    * Configures the main service provider.
    * @param config The configuration settings to use
    */
  def config(config: IProviderConfig): Unit
}

object ILazyLoadProvider {
  @scala.inline
  def apply(config: IProviderConfig => Unit): ILazyLoadProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
    __obj.asInstanceOf[ILazyLoadProvider]
  }
}

