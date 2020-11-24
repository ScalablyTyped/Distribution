package typings.ol.builderMod

import typings.ol.canvasMod.FillStrokeState
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasBuilder
  extends typings.ol.vectorContextMod.default {
  
  /* protected */ def appendFlatCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    closed: Boolean,
    skipFirst: Boolean
  ): Double = js.native
  
  /* protected */ def applyPixelRatio(dashArray: js.Array[Double]): js.Array[Double] = js.native
  
  def applyStroke(state: FillStrokeState): Unit = js.native
  
  /* protected */ def beginGeometry(geometry: typings.ol.geometryMod.default, feature: FeatureLike): Unit = js.native
  /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
  
  var coordinates: js.Array[Double] = js.native
  
  def createFill(state: FillStrokeState): js.Array[_] = js.native
  
  def createStroke(state: FillStrokeState): js.Array[_] = js.native
  
  def drawCustomCoordinates_(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    builderEnds: js.Array[Double]
  ): Double = js.native
  
  def endGeometry(feature: FeatureLike): Unit = js.native
  
  def finish(): SerializableInstructions = js.native
  
  /**
    * Get the buffered rendering extent.  Rendering will be clipped to the extent
    * provided to the constructor.  To account for symbolizers that may intersect
    * this extent, we calculate a buffered extent (e.g. based on stroke width).
    */
  /* protected */ def getBufferedMaxExtent(): Extent = js.native
  
  var hitDetectionInstructions: js.Array[_] = js.native
  
  var instructions: js.Array[_] = js.native
  
  var maxExtent: Extent = js.native
  
  var maxLineWidth: Double = js.native
  
  var pixelRatio: Double = js.native
  
  var resolution: Double = js.native
  
  /**
    * Reverse the hit detection instructions.
    */
  def reverseHitDetectionInstructions(): Unit = js.native
  
  var state: FillStrokeState = js.native
  
  var tolerance: Double = js.native
  
  def updateFillStyle(
    state: FillStrokeState,
    createFill: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, js.Array[_]]
  ): Unit = js.native
  
  def updateStrokeStyle(
    state: FillStrokeState,
    applyStroke: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, Unit]
  ): Unit = js.native
}
