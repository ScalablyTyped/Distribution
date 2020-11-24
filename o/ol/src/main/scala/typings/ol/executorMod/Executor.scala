package typings.ol.executorMod

import typings.ol.canvasMod.DeclutterGroup
import typings.ol.canvasMod.Label
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executor extends js.Object {
  
  var coordinates: js.Array[Double] = js.native
  
  def createLabel(text: String, textKey: String, fillKey: String, strokeKey: String): Label = js.native
  
  def execute(
    context: CanvasRenderingContext2D,
    contextScale: Double,
    transform: Transform,
    viewRotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
  
  def executeHitDetection[T](context: CanvasRenderingContext2D, transform: Transform, viewRotation: Double): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.UndefOr[scala.Nothing],
    opt_hitExtent: Extent
  ): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit]
  ): js.UndefOr[T] = js.native
  def executeHitDetection[T](
    context: CanvasRenderingContext2D,
    transform: Transform,
    viewRotation: Double,
    opt_featureCallback: js.Function0[Unit],
    opt_hitExtent: Extent
  ): js.UndefOr[T] = js.native
  
  var hitDetectionInstructions: js.Array[_] = js.native
  
  var instructions: js.Array[_] = js.native
  
  var overlaps: Boolean = js.native
  
  var pixelRatio: Double = js.native
  
  def renderDeclutter(declutterGroup: DeclutterGroup, feature: FeatureLike, opacity: Double, declutterTree: js.Any): js.Any = js.native
  
  def replayTextBackground_(
    context: CanvasRenderingContext2D,
    p1: Coordinate,
    p2: Coordinate,
    p3: Coordinate,
    p4: Coordinate,
    fillInstruction: js.Array[_],
    strokeInstruction: js.Array[_],
    declutter: Boolean
  ): Unit = js.native
  
  var resolution: Double = js.native
}
