package typings.paper.paperNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.paper.Anon_Source
import typings.paper.TypeofClassPaperScope
import typings.paper.TypeofClassPathItem
import typings.paper.TypeofClassPoint
import typings.paper.TypeofClassShape
import typings.paper.TypeofClassSize
import typings.paper.TypeofPath
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PaperScope")
@js.native
class PaperScope () extends Base {
  var Color: Instantiable4[
    /* red */ Double, 
    /* green */ Double, 
    /* blue */ Double, 
    js.UndefOr[/* alpha */ Double], 
    typings.paper.paperNs.Color
  ] = js.native
  var CompoundPath: Instantiable1[/* object */ js.Any, typings.paper.paperNs.CompoundPath] = js.native
  var Curve: Instantiable2[/* segment1 */ Segment, /* segment2 */ Segment, typings.paper.paperNs.Curve] = js.native
  var CurveLocation: Instantiable3[
    /* curve */ Curve, 
    /* time */ Double, 
    js.UndefOr[/* point */ Point], 
    typings.paper.paperNs.CurveLocation
  ] = js.native
  var Gradient: Instantiable2[
    js.UndefOr[/* stops */ js.Array[(js.Array[String | Double]) | GradientStop | String]], 
    js.UndefOr[/* radial */ Boolean], 
    typings.paper.paperNs.Gradient
  ] = js.native
  var GradientStop: Instantiable2[
    js.UndefOr[Color | String], 
    js.UndefOr[/* rampPoint */ Double], 
    typings.paper.paperNs.GradientStop
  ] = js.native
  var Group: Instantiable1[js.UndefOr[/* children */ js.Array[Item]], typings.paper.paperNs.Group] = js.native
  var Item: Instantiable0[typings.paper.paperNs.Item] = js.native
  var Layer: Instantiable1[js.UndefOr[/* children */ js.Array[Item]], typings.paper.paperNs.Layer] = js.native
  /**
    * All the classes for paper can be constructed via the PaperScope instance, so
    * that they are associated with that scope
    */
  var Matrix: Instantiable6[
    /* a */ Double, 
    /* c */ Double, 
    /* b */ Double, 
    /* d */ Double, 
    /* tx */ Double, 
    /* ty */ Double, 
    typings.paper.paperNs.Matrix
  ] = js.native
  var PaperScope: TypeofClassPaperScope = js.native
  var Path: TypeofPath with (Instantiable1[
    js.UndefOr[/* segments */ js.Array[js.Array[Double] | Point | Segment]], 
    typings.paper.paperNs.Path
  ]) = js.native
  var PathItem: TypeofClassPathItem = js.native
  var PlacedSymbol: Instantiable2[
    /* symbol */ Symbol, 
    js.UndefOr[/* point */ Point], 
    typings.paper.paperNs.PlacedSymbol
  ] = js.native
  var Point: TypeofClassPoint = js.native
  var PointText: Instantiable1[/* point */ Point, typings.paper.paperNs.PointText] = js.native
  var Project: Instantiable1[/* element */ HTMLCanvasElement | String, typings.paper.paperNs.Project] = js.native
  var Raster: Instantiable2[
    js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    js.UndefOr[/* position */ Point], 
    typings.paper.paperNs.Raster
  ] = js.native
  var Rectangle: Instantiable2[/* point */ Point, /* size */ Size, typings.paper.paperNs.Rectangle] = js.native
  var Segment: Instantiable3[
    js.UndefOr[/* point */ Point], 
    js.UndefOr[/* handleIn */ Point], 
    js.UndefOr[/* handleOut */ Point], 
    typings.paper.paperNs.Segment
  ] = js.native
  var Shape: TypeofClassShape = js.native
  var Size: TypeofClassSize = js.native
  var Style: Instantiable0[typings.paper.paperNs.Style] = js.native
  var Symbol: Instantiable2[/* item */ Item, js.UndefOr[/* dontCenter */ Boolean], typings.paper.paperNs.Symbol] = js.native
  var TextItem: Instantiable0[typings.paper.paperNs.TextItem] = js.native
  var Tool: Instantiable0[typings.paper.paperNs.Tool] = js.native
  var View: Instantiable0[typings.paper.paperNs.View] = js.native
  /**
    * The currently active project.
    */
  var project: Project = js.native
  /**
    * The list of all open projects within the current Paper.js context.
    */
  var projects: js.Array[Project] = js.native
  /**
    * Gives access to paper's configurable settings.
    */
  var settings: Settings = js.native
  /**
    * The reference to the active tool.
    */
  var tool: Tool = js.native
  /**
    * The list of available tools.
    */
  var tools: js.Array[Tool] = js.native
  /**
    * The version of Paper.js, as a string.
    */
  var version: String = js.native
  /**
    * The reference to the active project's view.
    * Read Only.
    */
  val view: View = js.native
  /**
    * Activates this PaperScope, so all newly created items will be placed in its active project.
    */
  def activate(): Unit = js.native
  /**
    * Compiles the PaperScript code into a compiled function and executes it. The compiled function receives all properties of this PaperScope as arguments, to emulate a global scope with unaffected performance. It also installs global view and tool handlers automatically on the respective objects.
    * @param code - the PaperScript code
    * @param options [optional] - the compilation options
    * @param options.url - the url of the source, for source-map debugging
    * @param options.source - the source to be used for the source- mapping, in case the code that’s passed in has already been mingled.
    */
  def execute(code: String): Unit = js.native
  def execute(code: String, option: Anon_Source): Unit = js.native
  /**
    * Injects the paper scope into any other given scope. Can be used for examle to inject the currently active PaperScope into the window's global scope, to emulate PaperScript-style globally accessible Paper classes and objects
    * Please note: Using this method may override native constructors (e.g. Path, RGBColor). This may cause problems when using Paper.js in conjunction with other libraries that rely on these constructors. Keep the library scoped if you encounter issues caused by this.
    * @param scope -
    */
  def install(scope: js.Any): Unit = js.native
  def setup(canvas: String): Unit = js.native
  /**
    * Sets up an empty project for us. If a canvas is provided, it also creates a View for it, both linked to this scope.
    * @param element - the HTML canvas element this scope should be associated with, or an ID string by which to find the element.
    */
  def setup(canvas: HTMLCanvasElement): Unit = js.native
}

/* static members */
@JSGlobal("paper.PaperScope")
@js.native
object PaperScope extends js.Object {
  /**
    * Retrieves a PaperScope object with the given scope id.
    * @param id - scope id to retrieve
    */
  def get(id: String): PaperScope = js.native
}

