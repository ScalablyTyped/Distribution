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
  def apply(setDefaultOptions: INgMapOptions => scala.Unit): INgMapProvider = {
    val __obj = js.Dynamic.literal(setDefaultOptions = js.Any.fromFunction1(setDefaultOptions))
  
    __obj.asInstanceOf[INgMapProvider]
  }
}

