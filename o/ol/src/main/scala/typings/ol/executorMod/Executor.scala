package typings.ol.executorMod

import typings.ol.canvasMod.DeclutterGroup
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executor
  extends typings.ol.disposableMod.default {
  var coordinates: js.Array[Double] = js.native
  var hitDetectionInstructions: js.Array[_] = js.native
  var instructions: js.Array[_] = js.native
  var overlaps: Boolean = js.native
  var pixelRatio: Double = js.native
  var resolution: Double = js.native
  def execute(
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
  def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): T = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit]
  ): T = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit],
    opt_hitExtent: Extent
  ): T = js.native
  def getTextImage(text: String, textKey: String, fillKey: String, strokeKey: String): HTMLCanvasElement = js.native
  def renderDeclutter(declutterGroup: DeclutterGroup, feature: FeatureLike, opacity: Double, declutterTree: js.Any): js.Any = js.native
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
}

