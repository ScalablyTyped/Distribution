package typings.ol.renderCanvasReplayMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.renderCanvasMod.DeclutterGroup
import typings.ol.renderCanvasMod.FillStrokeState
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasReplay
  extends typings.ol.renderVectorContextMod.default {
  var coordinates: js.Array[Double] = js.native
  var hitDetectionInstructions: js.Array[_] = js.native
  var instructions: js.Array[_] = js.native
  var maxExtent: Extent = js.native
  var maxLineWidth: Double = js.native
  var overlaps: Boolean = js.native
  var pixelRatio: Double = js.native
  var resolution: Double = js.native
  var state: FillStrokeState = js.native
  var tolerance: Double = js.native
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
  /* protected */ def beginGeometry(geometry: typings.ol.geomGeometryMod.default, feature: typings.ol.featureMod.default): Unit = js.native
  /* protected */ def beginGeometry(geometry: typings.ol.geomGeometryMod.default, feature: typings.ol.renderFeatureMod.default): Unit = js.native
  /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: typings.ol.featureMod.default): Unit = js.native
  /* protected */ def beginGeometry(geometry: typings.ol.renderFeatureMod.default, feature: typings.ol.renderFeatureMod.default): Unit = js.native
  def createFill(state: FillStrokeState, geometry: typings.ol.geomGeometryMod.default): js.Array[_] = js.native
  def createFill(state: FillStrokeState, geometry: typings.ol.renderFeatureMod.default): js.Array[_] = js.native
  def createStroke(state: FillStrokeState): js.Array[_] = js.native
  def drawCustom(): Unit = js.native
  def drawCustomCoordinates_(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    replayEnds: js.Array[Double]
  ): Double = js.native
  def endGeometry(geometry: typings.ol.geomGeometryMod.default, feature: typings.ol.featureMod.default): Unit = js.native
  def endGeometry(geometry: typings.ol.geomGeometryMod.default, feature: typings.ol.renderFeatureMod.default): Unit = js.native
  def endGeometry(geometry: typings.ol.renderFeatureMod.default, feature: typings.ol.featureMod.default): Unit = js.native
  def endGeometry(geometry: typings.ol.renderFeatureMod.default, feature: typings.ol.renderFeatureMod.default): Unit = js.native
  def finish(): Unit = js.native
  /* protected */ def getBufferedMaxExtent(): Extent = js.native
  def renderDeclutter_(declutterGroup: DeclutterGroup, feature: typings.ol.featureMod.default): Unit = js.native
  def renderDeclutter_(declutterGroup: DeclutterGroup, feature: typings.ol.renderFeatureMod.default): Unit = js.native
  def replay(
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    skippedFeaturesHash: StringDictionary[Boolean],
    snapToPixel: Boolean
  ): Unit = js.native
  def replayHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    skippedFeaturesHash: StringDictionary[Boolean]
  ): js.UndefOr[T] = js.native
  def replayHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    skippedFeaturesHash: StringDictionary[Boolean],
    opt_featureCallback: js.Function0[Unit]
  ): js.UndefOr[T] = js.native
  def replayHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    skippedFeaturesHash: StringDictionary[Boolean],
    opt_featureCallback: js.Function0[Unit],
    opt_hitExtent: Extent
  ): js.UndefOr[T] = js.native
  def replayImage_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    image: HTMLCanvasElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayImage_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    image: HTMLImageElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayImage_(
    context: CanvasRenderingContext2D,
    x: Double,
    y: Double,
    image: HTMLVideoElement,
    anchorX: Double,
    anchorY: Double,
    declutterGroup: DeclutterGroup,
    height: Double,
    opacity: Double,
    originX: Double,
    originY: Double,
    rotation: Double,
    scale: Double,
    snapToPixel: Boolean,
    width: Double,
    padding: js.Array[Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def replayTextBackground_(
    context: CanvasRenderingContext2D,
    p1: Coordinate,
    p2: Coordinate,
    p3: Coordinate,
    p4: Coordinate,
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): Unit = js.native
  def reverseHitDetectionInstructions(): Unit = js.native
  def updateFillStyle(
    state: FillStrokeState,
    createFill: js.ThisFunction2[
      /* this */ this.type, 
      /* p0 */ FillStrokeState, 
      /* p1 */ typings.ol.geomGeometryMod.default | typings.ol.renderFeatureMod.default, 
      js.Array[_]
    ],
    geometry: typings.ol.geomGeometryMod.default
  ): Unit = js.native
  def updateFillStyle(
    state: FillStrokeState,
    createFill: js.ThisFunction2[
      /* this */ this.type, 
      /* p0 */ FillStrokeState, 
      /* p1 */ typings.ol.geomGeometryMod.default | typings.ol.renderFeatureMod.default, 
      js.Array[_]
    ],
    geometry: typings.ol.renderFeatureMod.default
  ): Unit = js.native
  def updateStrokeStyle(
    state: FillStrokeState,
    applyStroke: js.ThisFunction1[/* this */ this.type, /* p0 */ FillStrokeState, Unit]
  ): Unit = js.native
}

