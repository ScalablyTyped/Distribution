package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PaperScope")
@js.native
class PaperScope () extends Base {
  var Color: org.scalablytyped.runtime.Instantiable4[
    /* red */ scala.Double, 
    /* green */ scala.Double, 
    /* blue */ scala.Double, 
    js.UndefOr[/* alpha */ scala.Double], 
    Color
  ] = js.native
  var CompoundPath: org.scalablytyped.runtime.Instantiable1[/* object */ js.Any, CompoundPath] = js.native
  var Curve: org.scalablytyped.runtime.Instantiable2[/* segment1 */ Segment, /* segment2 */ Segment, Curve] = js.native
  var CurveLocation: org.scalablytyped.runtime.Instantiable3[
    /* curve */ Curve, 
    /* time */ scala.Double, 
    js.UndefOr[/* point */ Point], 
    CurveLocation
  ] = js.native
  var Gradient: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[
      /* stops */ js.Array[(js.Array[java.lang.String | scala.Double]) | GradientStop | java.lang.String]
    ], 
    js.UndefOr[/* radial */ scala.Boolean], 
    Gradient
  ] = js.native
  var GradientStop: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[Color | java.lang.String], 
    js.UndefOr[/* rampPoint */ scala.Double], 
    GradientStop
  ] = js.native
  var Group: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* children */ js.Array[Item]], Group] = js.native
  var Item: org.scalablytyped.runtime.Instantiable0[Item] = js.native
  var Layer: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* children */ js.Array[Item]], Layer] = js.native
  /**
    * All the classes for paper can be constructed via the PaperScope instance, so
    * that they are associated with that scope
    */
  var Matrix: org.scalablytyped.runtime.Instantiable6[
    /* a */ scala.Double, 
    /* c */ scala.Double, 
    /* b */ scala.Double, 
    /* d */ scala.Double, 
    /* tx */ scala.Double, 
    /* ty */ scala.Double, 
    Matrix
  ] = js.native
  var PaperScope: paperLib.TypeofClassPaperScope = js.native
  var Path: paperLib.TypeofPath with (org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* segments */ js.Array[js.Array[scala.Double] | Point | Segment]], 
    Path
  ]) = js.native
  var PathItem: paperLib.TypeofClassPathItem = js.native
  var PlacedSymbol: org.scalablytyped.runtime.Instantiable2[/* symbol */ Symbol, js.UndefOr[/* point */ Point], PlacedSymbol] = js.native
  var Point: paperLib.TypeofClassPoint = js.native
  var PointText: org.scalablytyped.runtime.Instantiable1[/* point */ Point, PointText] = js.native
  var Project: org.scalablytyped.runtime.Instantiable1[/* element */ stdLib.HTMLCanvasElement | java.lang.String, Project] = js.native
  var Raster: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | java.lang.String], 
    js.UndefOr[/* position */ Point], 
    Raster
  ] = js.native
  var Rectangle: org.scalablytyped.runtime.Instantiable2[/* point */ Point, /* size */ Size, Rectangle] = js.native
  var Segment: org.scalablytyped.runtime.Instantiable3[
    js.UndefOr[/* point */ Point], 
    js.UndefOr[/* handleIn */ Point], 
    js.UndefOr[/* handleOut */ Point], 
    Segment
  ] = js.native
  var Shape: paperLib.TypeofClassShape = js.native
  var Size: paperLib.TypeofClassSize = js.native
  var Style: org.scalablytyped.runtime.Instantiable0[Style] = js.native
  var Symbol: org.scalablytyped.runtime.Instantiable2[/* item */ Item, js.UndefOr[/* dontCenter */ scala.Boolean], Symbol] = js.native
  var TextItem: org.scalablytyped.runtime.Instantiable0[TextItem] = js.native
  var Tool: org.scalablytyped.runtime.Instantiable0[Tool] = js.native
  var View: org.scalablytyped.runtime.Instantiable0[View] = js.native
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
  var version: java.lang.String = js.native
  /**
    * The reference to the active project's view.
    * Read Only.
    */
  val view: View = js.native
  /**
    * Activates this PaperScope, so all newly created items will be placed in its active project.
    */
  def activate(): scala.Unit = js.native
  /**
    * Compiles the PaperScript code into a compiled function and executes it. The compiled function receives all properties of this PaperScope as arguments, to emulate a global scope with unaffected performance. It also installs global view and tool handlers automatically on the respective objects.
    * @param code - the PaperScript code
    * @param options [optional] - the compilation options
    * @param options.url - the url of the source, for source-map debugging
    * @param options.source - the source to be used for the source- mapping, in case the code that’s passed in has already been mingled.
    */
  def execute(code: java.lang.String): scala.Unit = js.native
  def execute(code: java.lang.String, option: paperLib.Anon_Source): scala.Unit = js.native
  /**
    * Injects the paper scope into any other given scope. Can be used for examle to inject the currently active PaperScope into the window's global scope, to emulate PaperScript-style globally accessible Paper classes and objects
    * Please note: Using this method may override native constructors (e.g. Path, RGBColor). This may cause problems when using Paper.js in conjunction with other libraries that rely on these constructors. Keep the library scoped if you encounter issues caused by this.
    * @param scope -
    */
  def install(scope: js.Any): scala.Unit = js.native
  def setup(canvas: java.lang.String): scala.Unit = js.native
  /**
    * Sets up an empty project for us. If a canvas is provided, it also creates a View for it, both linked to this scope.
    * @param element - the HTML canvas element this scope should be associated with, or an ID string by which to find the element.
    */
  def setup(canvas: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

/* static members */
@JSGlobal("paper.PaperScope")
@js.native
object PaperScope extends js.Object {
  /**
    * Retrieves a PaperScope object with the given scope id.
    * @param id - scope id to retrieve
    */
  def get(id: java.lang.String): paperLib.paperNs.PaperScope = js.native
}

