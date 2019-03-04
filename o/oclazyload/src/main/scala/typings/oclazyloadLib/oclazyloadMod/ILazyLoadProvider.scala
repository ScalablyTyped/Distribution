package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILazyLoadProvider extends js.Object {
  /**
    * Configures the main service provider.
    * @param config The configuration settings to use
    */
  def config(config: IProviderConfig): scala.Unit
}

object ILazyLoadProvider {
  @scala.inline
  def apply(config: js.Function1[IProviderConfig, scala.Unit]): ILazyLoadProvider = {
    val __obj = js.Dynamic.literal(config = config)
  
    __obj.asInstanceOf[ILazyLoadProvider]
  }
}

