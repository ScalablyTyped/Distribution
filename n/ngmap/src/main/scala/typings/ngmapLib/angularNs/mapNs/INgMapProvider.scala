package typings
package ngmapLib.angularNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgMapProvider extends js.Object {
  /**
    * @param {Hash} options
    * @example
    *  app.config(function(NgMapProvider) {
    *    NgMapProvider.setDefaultOptions({
    *      marker: {
    *        optimized: false
    *      }
    *    });
    *  });
    */
  def setDefaultOptions(options: INgMapOptions): scala.Unit
}

object INgMapProvider {
  @scala.inline
  def apply(setDefaultOptions: js.Function1[INgMapOptions, scala.Unit]): INgMapProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDefaultOptions")(setDefaultOptions)
    __obj.asInstanceOf[INgMapProvider]
  }
}

