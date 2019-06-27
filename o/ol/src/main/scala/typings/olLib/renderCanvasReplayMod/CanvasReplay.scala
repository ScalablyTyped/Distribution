package typings
package olLib.renderCanvasReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasReplay
  extends olLib.renderVectorContextMod.default {
  var coordinates: js.Array[scala.Double] = js.native
  var hitDetectionInstructions: js.Array[_] = js.native
  var instructions: js.Array[_] = js.native
  var maxExtent: olLib.extentMod.Extent = js.native
  var maxLineWidth: scala.Double = js.native
  var overlaps: scala.Boolean = js.native
  var pixelRatio: scala.Double = js.native
  var resolution: scala.Double = js.native
  var state: olLib.renderCanvasMod.FillStrokeState = js.native
  var tolerance: scala.Double = js.native
  /* protected */ def appendFlatCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    closed: scala.Boolean,
    skipFirst: scala.Boolean
  ): scala.Double = js.native
  /* protected */ def applyPixelRatio(dashArray: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def applyStroke(state: olLib.renderCanvasMod.FillStrokeState): scala.Unit = js.native
  /* protected */ def beginGeometry(geometry: olLib.geomGeometryMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  /* protected */ def beginGeometry(geometry: olLib.geomGeometryMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  /* protected */ def beginGeometry(geometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  /* protected */ def beginGeometry(geometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def createFill(state: olLib.renderCanvasMod.FillStrokeState, geometry: olLib.geomGeometryMod.default): js.Array[_] = js.native
  def createFill(state: olLib.renderCanvasMod.FillStrokeState, geometry: olLib.renderFeatureMod.default): js.Array[_] = js.native
  def createStroke(state: olLib.renderCanvasMod.FillStrokeState): js.Array[_] = js.native
  def drawCustom(): scala.Unit = js.native
  def drawCustomCoordinates_(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    replayEnds: js.Array[scala.Double]
  ): scala.Double = js.native
  def endGeometry(geometry: olLib.geomGeometryMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def endGeometry(geometry: olLib.geomGeometryMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def endGeometry(geometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def endGeometry(geometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  /* protected */ def getBufferedMaxExtent(): olLib.extentMod.Extent = js.native
  def renderDeclutter_(declutterGroup: olLib.renderCanvasMod.DeclutterGroup, feature: olLib.featureMod.default): scala.Unit = js.native
  def renderDeclutter_(declutterGroup: olLib.renderCanvasMod.DeclutterGroup, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def replay(
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    snapToPixel: scala.Boolean
  ): scala.Unit = js.native
  def replayHitDetection[T](
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ): T = js.native
  def replayHitDetection[T](
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    opt_featureCallback: js.Function0[scala.Unit]
  ): T = js.native
  def replayHitDetection[T](
    context: stdLib.CanvasRenderingContext2D,
    transform: olLib.transformMod.Transform,
    viewRotation: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    opt_featureCallback: js.Function0[scala.Unit],
    opt_hitExtent: olLib.extentMod.Extent
  ): T = js.native
  def replayImage_(
    context: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    image: stdLib.HTMLCanvasElement,
    anchorX: scala.Double,
    anchorY: scala.Double,
    declutterGroup: olLib.renderCanvasMod.DeclutterGroup,
    height: scala.Double,
    opacity: scala.Double,
    originX: scala.Double,
    originY: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    snapToPixel: scala.Boolean,
    width: scala.Double,
    padding: js.Array[scala.Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): scala.Unit = js.native
  def replayImage_(
    context: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    image: stdLib.HTMLImageElement,
    anchorX: scala.Double,
    anchorY: scala.Double,
    declutterGroup: olLib.renderCanvasMod.DeclutterGroup,
    height: scala.Double,
    opacity: scala.Double,
    originX: scala.Double,
    originY: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    snapToPixel: scala.Boolean,
    width: scala.Double,
    padding: js.Array[scala.Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): scala.Unit = js.native
  def replayImage_(
    context: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    image: stdLib.HTMLVideoElement,
    anchorX: scala.Double,
    anchorY: scala.Double,
    declutterGroup: olLib.renderCanvasMod.DeclutterGroup,
    height: scala.Double,
    opacity: scala.Double,
    originX: scala.Double,
    originY: scala.Double,
    rotation: scala.Double,
    scale: scala.Double,
    snapToPixel: scala.Boolean,
    width: scala.Double,
    padding: js.Array[scala.Double],
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): scala.Unit = js.native
  def replayTextBackground_(
    context: stdLib.CanvasRenderingContext2D,
    p1: olLib.coordinateMod.Coordinate,
    p2: olLib.coordinateMod.Coordinate,
    p3: olLib.coordinateMod.Coordinate,
    p4: olLib.coordinateMod.Coordinate,
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_]
  ): scala.Unit = js.native
  def reverseHitDetectionInstructions(): scala.Unit = js.native
  def updateFillStyle(
    state: olLib.renderCanvasMod.FillStrokeState,
    createFill: js.ThisFunction2[
      /* this */ this.type, 
      /* p1 */ olLib.renderCanvasMod.FillStrokeState, 
      /* p2 */ olLib.geomGeometryMod.default | olLib.renderFeatureMod.default, 
      js.Array[_]
    ],
    geometry: olLib.geomGeometryMod.default
  ): scala.Unit = js.native
  def updateFillStyle(
    state: olLib.renderCanvasMod.FillStrokeState,
    createFill: js.ThisFunction2[
      /* this */ this.type, 
      /* p1 */ olLib.renderCanvasMod.FillStrokeState, 
      /* p2 */ olLib.geomGeometryMod.default | olLib.renderFeatureMod.default, 
      js.Array[_]
    ],
    geometry: olLib.renderFeatureMod.default
  ): scala.Unit = js.native
  def updateStrokeStyle(
    state: olLib.renderCanvasMod.FillStrokeState,
    applyStroke: js.ThisFunction1[/* this */ this.type, /* p1 */ olLib.renderCanvasMod.FillStrokeState, scala.Unit]
  ): scala.Unit = js.native
}

