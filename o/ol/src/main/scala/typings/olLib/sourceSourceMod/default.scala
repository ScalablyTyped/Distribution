package typings
package olLib.sourceSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Base class for {@link ol.layer.Layer} sources.
  *
  * A generic `change` event is triggered when the state of the source changes.
  *
  * @param options Source options.
  * @api stable
  */
@JSImport("ol/source/source", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.sourceNs.Source {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link ol.layer.Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    *
    * @param options Source options.
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.SourceSourceOptions) = this()
}

