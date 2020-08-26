package typings.paper.paperCoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import typings.paper.anon.TypeofColor
import typings.paper.anon.TypeofKey
import typings.paper.anon.TypeofPaperScope
import typings.paper.anon.TypeofPath
import typings.paper.anon.TypeofPathItem
import typings.paper.anon.TypeofPoint
import typings.paper.anon.TypeofShape
import typings.paper.anon.TypeofSize
import typings.paper.paper.Color
import typings.paper.paper.Point
import typings.paper.paper.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Color: TypeofColor = js.native
  var CompoundPath: Instantiable1[/* pathData */ String, typings.paper.paper.CompoundPath] = js.native
  var Curve: Instantiable2[
    /* segment1 */ typings.paper.paper.Segment, 
    /* segment2 */ typings.paper.paper.Segment, 
    typings.paper.paper.Curve
  ] = js.native
  var CurveLocation: Instantiable3[
    /* curve */ typings.paper.paper.Curve, 
    /* time */ Double, 
    /* point */ js.UndefOr[Point], 
    typings.paper.paper.CurveLocation
  ] = js.native
  var Event: Instantiable0[typings.paper.paper.Event] = js.native
  var Gradient: Instantiable0[typings.paper.paper.Gradient] = js.native
  var GradientStop: Instantiable2[
    /* color */ js.UndefOr[Color], 
    /* offset */ js.UndefOr[Double], 
    typings.paper.paper.GradientStop
  ] = js.native
  var Group: Instantiable1[
    /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
    typings.paper.paper.Group
  ] = js.native
  var HitResult: Instantiable0[typings.paper.paper.HitResult] = js.native
  var Item: Instantiable0[typings.paper.paper.Item] = js.native
  var Key: TypeofKey = js.native
  var KeyEvent: Instantiable0[typings.paper.paper.KeyEvent] = js.native
  var Layer: Instantiable1[
    /* children */ js.UndefOr[js.Array[typings.paper.paper.Item]], 
    typings.paper.paper.Layer
  ] = js.native
  var Matrix: Instantiable0[typings.paper.paper.Matrix] = js.native
  var MouseEvent: Instantiable0[typings.paper.paper.MouseEvent] = js.native
  var PaperScope: TypeofPaperScope = js.native
  var Path: TypeofPath with (Instantiable1[
    /* segments */ js.UndefOr[js.Array[typings.paper.paper.Segment]], 
    typings.paper.paper.Path
  ]) = js.native
  var PathItem: TypeofPathItem = js.native
  var Point: TypeofPoint = js.native
  var PointText: Instantiable1[/* point */ Point, typings.paper.paper.PointText] = js.native
  var Project: Instantiable1[/* element */ HTMLCanvasElement | String | Size, typings.paper.paper.Project] = js.native
  var Raster: Instantiable2[
    /* source */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    /* position */ js.UndefOr[Point], 
    typings.paper.paper.Raster
  ] = js.native
  var Rectangle: Instantiable2[/* point */ Point, /* size */ Size, typings.paper.paper.Rectangle] = js.native
  var Segment: Instantiable3[
    /* point */ js.UndefOr[Point], 
    /* handleIn */ js.UndefOr[Point], 
    /* handleOut */ js.UndefOr[Point], 
    typings.paper.paper.Segment
  ] = js.native
  var Shape: TypeofShape with Instantiable0[typings.paper.paper.Shape] = js.native
  var Size: TypeofSize = js.native
  var Style: Instantiable1[/* style */ js.Object, typings.paper.paper.Style] = js.native
  var SymbolDefinition: Instantiable2[
    /* item */ typings.paper.paper.Item, 
    /* dontCenter */ js.UndefOr[Boolean], 
    typings.paper.paper.SymbolDefinition
  ] = js.native
  var SymbolItem: Instantiable2[
    /* definition */ typings.paper.paper.SymbolDefinition | typings.paper.paper.Item, 
    /* point */ js.UndefOr[Point], 
    typings.paper.paper.SymbolItem
  ] = js.native
  var TextItem: Instantiable0[typings.paper.paper.TextItem] = js.native
  var Tool: Instantiable0[typings.paper.paper.Tool] = js.native
  var ToolEvent: Instantiable0[typings.paper.paper.ToolEvent] = js.native
  var Tween: Instantiable6[
    /* object */ js.Object, 
    /* from */ js.Object, 
    /* to */ js.Object, 
    /* duration */ Double, 
    /* easing */ js.UndefOr[String | js.Function], 
    /* start */ js.UndefOr[Boolean], 
    typings.paper.paper.Tween
  ] = js.native
  var View: Instantiable0[typings.paper.paper.View] = js.native
  @JSName("activate")
  var activate_Original: js.Function0[Unit] = js.native
  @JSName("execute")
  var execute_Original: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit] = js.native
  @JSName("install")
  var install_Original: js.Function1[/* scope */ js.Any, Unit] = js.native
  var project: typings.paper.paper.Project = js.native
  var projects: js.Array[typings.paper.paper.Project] = js.native
  var settings: js.Any = js.native
  @JSName("setup")
  var setup_Original: js.Function1[/* element */ HTMLCanvasElement | String | Size, Unit] = js.native
  var tool: typings.paper.paper.Tool = js.native
  var tools: js.Array[typings.paper.paper.Tool] = js.native
  var version: String = js.native
  var view: typings.paper.paper.View = js.native
  def activate(): Unit = js.native
  def execute(code: String): Unit = js.native
  def execute(code: String, options: js.Object): Unit = js.native
  def install(scope: js.Any): Unit = js.native
  def setup(element: String): Unit = js.native
  def setup(element: Size): Unit = js.native
  def setup(element: HTMLCanvasElement): Unit = js.native
}

