package typings
package olLib.controlControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * A control is a visible widget with a DOM element in a fixed position on the
     * screen. They can involve user input (buttons), or be informational only;
     * the position is determined using CSS. By default these are placed in the
     * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
     * any outside DOM element.
     *
     * This is the base class for controls. You can use it for simple custom
     * controls by creating the element with listeners, creating an instance:
     * ```js
     * var myControl = new ol.control.Control({element: myElement});
     * ```
     * and then adding this to the map.
     *
     * The main advantage of having this as a control rather than a simple separate
     * DOM element is that preventing propagation is handled for you. Controls
     * will also be `ol.Object`s in a `ol.Collection`, so you can use their
     * methods.
     *
     * You can also extend this base for your own control class. See
     * examples/custom-controls for an example of how to do this.
     *
     * @param options Control options.
     * @api stable
     */
/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("ol/control/control", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.controlNs.Control {
  /**
           * @classdesc
           * A control is a visible widget with a DOM element in a fixed position on the
           * screen. They can involve user input (buttons), or be informational only;
           * the position is determined using CSS. By default these are placed in the
           * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
           * any outside DOM element.
           *
           * This is the base class for controls. You can use it for simple custom
           * controls by creating the element with listeners, creating an instance:
           * ```js
           * var myControl = new ol.control.Control({element: myElement});
           * ```
           * and then adding this to the map.
           *
           * The main advantage of having this as a control rather than a simple separate
           * DOM element is that preventing propagation is handled for you. Controls
           * will also be `ol.Object`s in a `ol.Collection`, so you can use their
           * methods.
           *
           * You can also extend this base for your own control class. See
           * examples/custom-controls for an example of how to do this.
           *
           * @param options Control options.
           * @api stable
           */
  def this(options: openlayersLib.openlayersMod.olxNs.controlNs.ControlOptions) = this()
}

