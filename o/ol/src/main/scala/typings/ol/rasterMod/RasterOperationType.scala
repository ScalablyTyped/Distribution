package typings.ol.rasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RasterOperationType extends js.Object
/**
  * Raster operation type. Supported values are 'pixel' and 'image'.
  */
@JSImport("ol/source/Raster", "RasterOperationType")
@js.native
object RasterOperationType extends js.Object {
  
  @js.native
  sealed trait IMAGE extends RasterOperationType
  
  @js.native
  sealed trait PIXEL extends RasterOperationType
}
