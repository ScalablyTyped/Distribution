package typings
package olLib.formatGmlbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Abstract base class; normally only used for creating subclasses and not
     * instantiated in apps.
     * Feature base format for reading and writing data in the GML format.
     * This class cannot be instantiated, it contains only base content that
     * is shared with versioned format classes ol.format.GML2 and
     * ol.format.GML3.
     *
     * @param opt_options
     *     Optional configuration object.
     */
@JSImport("ol/format/gmlbase", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.formatNs.GMLBase {
  /**
           * @classdesc
           * Abstract base class; normally only used for creating subclasses and not
           * instantiated in apps.
           * Feature base format for reading and writing data in the GML format.
           * This class cannot be instantiated, it contains only base content that
           * is shared with versioned format classes ol.format.GML2 and
           * ol.format.GML3.
           *
           * @param opt_options
           *     Optional configuration object.
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
}

