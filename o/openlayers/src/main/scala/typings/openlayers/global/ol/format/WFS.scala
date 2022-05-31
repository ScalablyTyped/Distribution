package typings.openlayers.global.ol.format

import typings.openlayers.mod.olx.format.WFSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the WFS format.
  * By default, supports WFS version 1.1.0. You can pass a GML format
  * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
  * Also see {@link ol.format.GMLBase} which is used by this format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
@JSGlobal("ol.format.WFS")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the WFS format.
  * By default, supports WFS version 1.1.0. You can pass a GML format
  * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
  * Also see {@link ol.format.GMLBase} which is used by this format.
  *
  * @param opt_options
  *     Optional configuration object.
  * @api stable
  */
class WFS ()
  extends typings.openlayers.mod.format.WFS {
  def this(opt_options: WFSOptions) = this()
}
