package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ol.builderTypeMod.BuilderType
import typings.ol.canvasMod.DeclutterGroup
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.ol.pluggableMapMod.DeclutterItems
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorGroupMod {
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ExecutorGroup {
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typings.ol.olStrings.default & TopLevel[js.Any]]
    ) = this()
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typings.ol.olStrings.default & TopLevel[js.Any]],
      opt_renderBuffer: Double
    ) = this()
  }
  
  inline def getCircleArray(radius: Double): js.Array[js.Array[js.UndefOr[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircleArray")(radius.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.UndefOr[Boolean]]]]
  
  inline def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[js.Any]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    opacity: Double,
    snapToPixel: Boolean,
    declutterItems: js.Array[DeclutterItems]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replayDeclutter")(declutterReplays.asInstanceOf[js.Any], context.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], snapToPixel.asInstanceOf[js.Any], declutterItems.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait ExecutorGroup extends StObject {
    
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType],
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: Unit,
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      callback: js.Function1[/* p0 */ FeatureLike, T],
      declutteredFeatures: js.Array[FeatureLike]
    ): js.UndefOr[T] = js.native
    
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    
    def hasExecutors(executors: js.Array[BuilderType]): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
