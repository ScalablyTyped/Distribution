package typings
package olLib.sourceXYZMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source for tile data with URLs in a set XYZ format that are
  * defined in a URL template. By default, this follows the widely-used
  * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
  * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
  * using the `{-y}` placeholder in the URL template, so long as the
  * source does not have a custom tile grid. In this case,
  * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
  * such as:
  *
  *  tileUrlFunction: function(coordinate) {
  *    return 'http://mapserver.com/' + coordinate[0] + '/' +
  *        coordinate[1] + '/' + coordinate[2] + '.png';
  *    }
  *
  *
  * @param opt_options XYZ options.
  * @api stable
  */
@JSImport("ol/source/XYZ", JSImport.Default)
@js.native
/**
  * @classdesc
  * Layer source for tile data with URLs in a set XYZ format that are
  * defined in a URL template. By default, this follows the widely-used
  * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
  * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
  * using the `{-y}` placeholder in the URL template, so long as the
  * source does not have a custom tile grid. In this case,
  * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
  * such as:
  *
  *  tileUrlFunction: function(coordinate) {
  *    return 'http://mapserver.com/' + coordinate[0] + '/' +
  *        coordinate[1] + '/' + coordinate[2] + '.png';
  *    }
  *
  *
  * @param opt_options XYZ options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.sourceNs.XYZ {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.XYZOptions) = this()
}

