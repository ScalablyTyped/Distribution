package typings.paper.paper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.paper.anon.TypeofColor
import typings.paper.anon.TypeofKey
import typings.paper.anon.TypeofPaperScope
import typings.paper.anon.TypeofPaperScript
import typings.paper.anon.TypeofPath
import typings.paper.anon.TypeofPathItem
import typings.paper.anon.TypeofPoint
import typings.paper.anon.TypeofShape
import typings.paper.anon.TypeofSize
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The `PaperScope` class represents the scope associated with a Paper
  *     context. When working with PaperScript, these scopes are automatically
  *     created for us, and through clever scoping the properties and methods of
  *     the active scope seem to become part of the global scope.
  * 
  * When working with normal JavaScript code, `PaperScope` objects need to be
  * manually created and handled.
  * 
  * Paper classes can only be accessed through `PaperScope` objects. Thus in
  * PaperScript they are global, while in JavaScript, they are available on the
  * global {@link paper} object. For JavaScript you can use {@link
  * PaperScope#install(scope) } to install the Paper classes and objects on the
  * global scope. Note that when working with more than one scope, this still
  * works for classes, but not for objects like {@link PaperScope#project}, since
  * they are not updated in the injected scope if scopes are switched.
  * 
  * The global {@link paper} object is simply a reference to the currently active
  * `PaperScope`.
  */
@js.native
trait PaperScope extends StObject {
  
  var Color: TypeofColor & (Instantiable4[
    /* red */ Double, 
    /* green */ Double, 
    /* blue */ Double, 
    /* alpha */ js.UndefOr[Double], 
    typings.paper.paper.Color
  ]) = js.native
  
  var CompoundPath: Instantiable1[/* pathData */ String, typings.paper.paper.CompoundPath] = js.native
  
  var Curve: Instantiable2[/* segment1 */ Segment, /* segment2 */ Segment, typings.paper.paper.Curve] = js.native
  
  var CurveLocation: Instantiable3[
    /* curve */ Curve, 
    /* time */ Double, 
    /* point */ js.UndefOr[PointLike], 
    typings.paper.paper.CurveLocation
  ] = js.native
  
  var Event: Instantiable0[typings.paper.paper.Event] = js.native
  
  var Gradient: Instantiable0[typings.paper.paper.Gradient] = js.native
  
  var GradientStop: Instantiable2[
    /* color */ js.UndefOr[Color], 
    /* offset */ js.UndefOr[Double], 
    typings.paper.paper.GradientStop
  ] = js.native
  
  var Group: Instantiable1[/* children */ js.UndefOr[js.Array[Item]], typings.paper.paper.Group] = js.native
  
  var HitResult: Instantiable0[typings.paper.paper.HitResult] = js.native
  
  var Item: Instantiable0[typings.paper.paper.Item] = js.native
  
  var Key: TypeofKey & Instantiable0[typings.paper.paper.Key] = js.native
  
  var KeyEvent: Instantiable0[typings.paper.paper.KeyEvent] = js.native
  
  var Layer: Instantiable1[/* children */ js.UndefOr[js.Array[Item]], typings.paper.paper.Layer] = js.native
  
  var Matrix: Instantiable0[typings.paper.paper.Matrix] = js.native
  
  var MouseEvent: Instantiable0[typings.paper.paper.MouseEvent] = js.native
  
  var PaperScope: TypeofPaperScope & Instantiable0[typings.paper.paper.PaperScope] = js.native
  
  var PaperScript: TypeofPaperScript & Instantiable0[typings.paper.paper.PaperScript] = js.native
  
  var Path: TypeofPath & (Instantiable1[/* segments */ js.UndefOr[js.Array[Segment]], typings.paper.paper.Path]) = js.native
  
  var PathItem: TypeofPathItem & Instantiable0[typings.paper.paper.PathItem] = js.native
  
  var Point: TypeofPoint & (Instantiable2[/* x */ Double, /* y */ Double, typings.paper.paper.Point]) = js.native
  
  var PointText: Instantiable1[/* point */ PointLike, typings.paper.paper.PointText] = js.native
  
  var Project: Instantiable1[/* element */ HTMLCanvasElement | String | SizeLike, typings.paper.paper.Project] = js.native
  
  var Raster: Instantiable2[
    /* source */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    /* position */ js.UndefOr[PointLike], 
    typings.paper.paper.Raster
  ] = js.native
  
  var Rectangle: Instantiable2[/* point */ PointLike, /* size */ SizeLike, typings.paper.paper.Rectangle] = js.native
  
  var Segment: Instantiable3[
    /* point */ js.UndefOr[PointLike], 
    /* handleIn */ js.UndefOr[PointLike], 
    /* handleOut */ js.UndefOr[PointLike], 
    typings.paper.paper.Segment
  ] = js.native
  
  var Shape: TypeofShape & Instantiable0[typings.paper.paper.Shape] = js.native
  
  var Size: TypeofSize & (Instantiable2[/* width */ Double, /* height */ Double, typings.paper.paper.Size]) = js.native
  
  var Style: Instantiable1[/* style */ js.Object, typings.paper.paper.Style] = js.native
  
  var SymbolDefinition: Instantiable2[
    /* item */ Item, 
    /* dontCenter */ js.UndefOr[Boolean], 
    typings.paper.paper.SymbolDefinition
  ] = js.native
  
  var SymbolItem: Instantiable2[
    /* definition */ SymbolDefinition | Item, 
    /* point */ js.UndefOr[PointLike], 
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
  
  /** 
    * Activates this PaperScope, so all newly created items will be placed
    * in its active project.
    */
  def activate(): Unit = js.native
  
  /** 
    * Compiles the PaperScript code into a compiled function and executes it.
    * The compiled function receives all properties of this {@link PaperScope}
    * as arguments, to emulate a global scope with unaffected performance. It
    * also installs global view and tool handlers automatically on the
    * respective objects.
    * 
    * @option options.url {String} the url of the source, for source-map
    *     debugging
    * @option options.source {String} the source to be used for the source-
    *     mapping, in case the code that's passed in has already been mingled.
    * 
    * @param code - the PaperScript code
    * @param options - the compilation options
    */
  def execute(code: String): Unit = js.native
  def execute(code: String, options: js.Object): Unit = js.native
  
  /** 
    * Injects the paper scope into any other given scope. Can be used for
    * example to inject the currently active PaperScope into the window's
    * global scope, to emulate PaperScript-style globally accessible Paper
    * classes and objects.
    * 
    * <b>Please note:</b> Using this method may override native constructors
    * (e.g. Path). This may cause problems when using Paper.js in conjunction
    * with other libraries that rely on these constructors. Keep the library
    * scoped if you encounter issues caused by this.
    */
  def install(scope: Any): Unit = js.native
  
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
    * 
    * @option [settings.insertItems=true] {Boolean} controls whether newly
    *     created items are automatically inserted into the scene graph, by
    *     adding them to {@link Project#activeLayer}
    * @option [settings.applyMatrix=true] {Boolean} controls what value newly
    *     created items have their {@link Item#applyMatrix} property set to
    *     (Note that not all items can set this to `false`)
    * @option [settings.handleSize=4] {Number} the size of the curve handles
    *     when drawing selections
    * @option [settings.hitTolerance=0] {Number} the default tolerance for hit-
    *     tests, when no value is specified
    */
  var settings: Any = js.native
  
  def setup(element: String): Unit = js.native
  def setup(element: SizeLike): Unit = js.native
  /** 
    * Sets up an empty project for us. If a canvas is provided, it also creates
    * a {@link View} for it, both linked to this scope.
    * 
    * @param element - the HTML canvas element
    * this scope should be associated with, or an ID string by which to find
    * the element, or the size of the canvas to be created for usage in a web
    * worker.
    */
  def setup(element: HTMLCanvasElement): Unit = js.native
  
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
  val version: String = js.native
  
  /** 
    * The reference to the active project's view.
    */
  val view: View = js.native
}
