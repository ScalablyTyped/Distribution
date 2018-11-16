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

