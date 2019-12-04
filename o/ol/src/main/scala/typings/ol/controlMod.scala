package typings.ol

import typings.ol.controlAttributionMod.Options
import typings.ol.controlAttributionMod.default
import typings.ol.controlUtilMod.DefaultsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/control", JSImport.Namespace)
@js.native
object controlMod extends js.Object {
  @js.native
  class Attribution () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Control protected ()
    extends typings.ol.controlControlMod.default {
    def this(options: typings.ol.controlControlMod.Options) = this()
  }
  
  @js.native
  class FullScreen ()
    extends typings.ol.controlFullScreenMod.default {
    def this(opt_options: typings.ol.controlFullScreenMod.Options) = this()
  }
  
  @js.native
  class MousePosition ()
    extends typings.ol.controlMousePositionMod.default {
    def this(opt_options: typings.ol.controlMousePositionMod.Options) = this()
  }
  
  @js.native
  class OverviewMap ()
    extends typings.ol.controlOverviewMapMod.default {
    def this(opt_options: typings.ol.controlOverviewMapMod.Options) = this()
  }
  
  @js.native
  class Rotate ()
    extends typings.ol.controlRotateMod.default {
    def this(opt_options: typings.ol.controlRotateMod.Options) = this()
  }
  
  @js.native
  class ScaleLine ()
    extends typings.ol.controlScaleLineMod.default {
    def this(opt_options: typings.ol.controlScaleLineMod.Options) = this()
  }
  
  @js.native
  class Zoom ()
    extends typings.ol.controlZoomMod.default {
    def this(opt_options: typings.ol.controlZoomMod.Options) = this()
  }
  
  @js.native
  class ZoomSlider ()
    extends typings.ol.controlZoomSliderMod.default {
    def this(opt_options: typings.ol.controlZoomSliderMod.Options) = this()
  }
  
  @js.native
  class ZoomToExtent ()
    extends typings.ol.controlZoomToExtentMod.default {
    def this(opt_options: typings.ol.controlZoomToExtentMod.Options) = this()
  }
  
  def defaults(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
  def defaults(opt_options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = js.native
}

