package typings.paper.paper

import org.scalablytyped.runtime.TopLevel
import typings.paper.Anon_ApplyMatrix
import typings.paper.Anon_AsString
import typings.std.HTMLCanvasElement
import typings.std.Partial
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Project")
@js.native
class Project protected () extends Base {
  def this(element: String) = this()
  /**
    * Creates a Paper.js project containing one empty Layer, referenced by project.activeLayer.
    * @param element - the HTML canvas element that should be used as the element for the view, or an ID string by which to find the element.
    */
  def this(element: HTMLCanvasElement) = this()
  /**
    * The layer which is currently active. New items will be created on this layer by default.
    * Read Only.
    */
  val activeLayer: Layer = js.native
  /**
    * The currently active path style. All selected items and newly created items will be styled with this style.
    */
  var currentStyle: Partial[Style] = js.native
  /**
    * The index of the project in the paperScope.projects list.
    * Read Only
    */
  val index: Double = js.native
  /**
    * The layers contained within the project.
    * Read Only.
    */
  val layers: js.Array[Layer] = js.native
  /**
    * The selected items contained within the project.
    * Read only.
    */
  val selectedItems: js.Array[Item] = js.native
  /**
    * The symbols contained within the project.
    */
  val symbols: js.Array[Symbol] = js.native
  /**
    * The reference to the project's view.
    * Read only.
    */
  val view: View = js.native
  /**
    * Activates this project, so all newly created items will be placed in it.
    */
  def activate(): Unit = js.native
  /**
    * Adds the specified layer at the end of the this project’s layers list.
    */
  def addLayer(layer: Layer): Layer = js.native
  /**
    * Clears the project by removing all project.layers and project.symbols.
    */
  def clear(): Unit = js.native
  /**
    * Deselects all selected items in the project.
    */
  def deselectAll(): Unit = js.native
  /**
    * Exports the project with all its layers and child items as an SVG DOM, all contained in one top level SVG group node.
    * @param options [optional] the export options, default: { asString: false, precision: 5, matchShapes: false, bounds: 'view', matrix: paper.view.matrix, embedImages: true  }
    * @param options.asString - whether a SVG node or a String is to be returned.
    * @param options.precision - the amount of fractional digits in numbers used in SVG data.
    * @param options.matchShapes - whether path items should tried to be converted to shape items, if their geometries can be made to match
    * @param options.bounds - the bounds of the area to export, either as a string (‘view’, content’), or a Rectangle object: 'view' uses the view bounds, 'content' uses the stroke bounds of all content.
    * @param options.matrix - the matrix with which to transform the exported content: If options.bounds is set to 'view', paper.view.matrix is used, for all other settings of options.bounds the identity matrix is used.
    * @param options.embedImages: whether raster images should be embedded as base64 data inlined in the xlink:href attribute, or kept as a link to their external URL.
    */
  def exportSVG(): SVGElement = js.native
  def exportSVG(options: Anon_AsString): SVGElement = js.native
  def getCurrentStyle(): Style = js.native
  /**
    * Fetch the first item contained within the project whose properties match the criteria in the specified object.
    * Extended matching is possible by providing a compare function or regular expression. Matching points, colors only work as a comparison of the full object, not partial matching (e.g. only providing the x- coordinate to match all points with that x-value). Partial matching does work for item.data.
    */
  def getItem(`match`: js.Any): Item = js.native
  /**
    * Fetch items contained within the project whose properties match the criteria in the specified object.
    * Extended matching is possible by providing a compare function or regular expression. Matching points, colors only work as a comparison of the full object, not partial matching (e.g. only providing the x- coordinate to match all points with that x-value). Partial matching does work for item.data.
    * Matching items against a rectangular area is also possible, by setting either match.inside or match.overlapping to a rectangle describing the area in which the items either have to be fully or partly contained.
    * @param match.recursive - whether to loop recursively through all children, or stop at the current level — default: true
    * @param match.match - a match function to be called for each item, allowing the definition of more flexible item checks that are not bound to properties. If no other match properties are defined, this function can also be passed instead of the options object
    * @param match.class - the constructor function of the item type to match against
    * @param match.inside - the rectangle in which the items need to be fully contained.
    * @param match.overlapping - the rectangle with which the items need to at least partly overlap.
    */
  def getItems(`match`: js.Any): js.Array[Item] = js.native
  /**
    * Perform a hit-test on the items and its children within the project at the location of the specified point.
    * The options object allows you to control the specifics of the hit-test and may contain a combination of the following values:
    * @param point - the point where the hit-test should be performed
    * @param options.tolerance -the tolerance of the hit-test in points. Can also be controlled through paperScope.settings.hitTolerance
    * @param options.class - only hit-test again a certain item class and its sub-classes: Group, Layer, Path, CompoundPath, Shape, Raster, PlacedSymbol, PointText, etc.
    * @param options.match -a match function to be called for each found hit result: Return true to return the result, false to keep searching
    * @param options.fill - hit-test the fill of items.
    * @param options.stroke - hit-test the stroke of path items, taking into account the setting of stroke color and width.
    * @param options.segments - hit-test for segment.point of Path items.
    * @param options.curves - hit-test the curves of path items, without taking the stroke color or width into account.
    * @param options.handles - hit-test for the handles.  (segment.handleIn / segment.handleOut) of path segments.
    * @param options.ends - only hit-test for the first or last segment points of open path items.
    * @param options.position - hit-test the item.position of of items, which depends on the setting of item.pivot.
    * @param options.center - hit-test the rectangle.center of the bounding rectangle of items (item.bounds).
    * @param options.bounds - hit-test the corners and side-centers of the bounding rectangle of items (item.bounds).
    * @param options.guides - hit-test items that have Item#guide set to true.
    * @param options.selected - only hit selected items.
    */
  def hitTest(point: Point): HitResult | Null = js.native
  def hitTest(point: Point, options: IHitTestOptions): HitResult | Null = js.native
  /**
    * Performs a hit-test on the item and its children (if it is a Group or Layer) at the location of the specified point, returning all found hits.
    * The options object allows you to control the specifics of the hit-test and may contain a combination of the following values:
    * @param point - the point where the hit-test should be performed
    * @param options.tolerance -the tolerance of the hit-test in points. Can also be controlled through paperScope.settings.hitTolerance
    * @param options.class - only hit-test again a certain item class and its sub-classes: Group, Layer, Path, CompoundPath, Shape, Raster, PlacedSymbol, PointText, etc.
    * @param options.match -a match function to be called for each found hit result: Return true to return the result, false to keep searching
    * @param options.fill - hit-test the fill of items.
    * @param options.stroke - hit-test the stroke of path items, taking into account the setting of stroke color and width.
    * @param options.segments - hit-test for segment.point of Path items.
    * @param options.curves - hit-test the curves of path items, without taking the stroke color or width into account.
    * @param options.handles - hit-test for the handles.  (segment.handleIn / segment.handleOut) of path segments.
    * @param options.ends - only hit-test for the first or last segment points of open path items.
    * @param options.position - hit-test the item.position of of items, which depends on the setting of item.pivot.
    * @param options.center - hit-test the rectangle.center of the bounding rectangle of items (item.bounds).
    * @param options.bounds - hit-test the corners and side-centers of the bounding rectangle of items (item.bounds).
    * @param options.guides - hit-test items that have Item#guide set to true.
    * @param options.selected - only hit selected items.
    * */
  def hitTestAll(point: Point): js.Array[HitResult] = js.native
  def hitTestAll(point: Point, options: IHitTestOptions): js.Array[HitResult] = js.native
  def importSVG(svg: String): Item = js.native
  def importSVG(svg: String, onLoad: js.Function2[/* item */ Item, /* svg */ String, Unit]): Item = js.native
  def importSVG(svg: String, options: Anon_ApplyMatrix): Item = js.native
  /**
    * Converts the provided SVG content into Paper.js items and adds them to the active layer of this project.
    * Note that the project is not cleared first. You can call project.clear() to do so.
    * @param svg - the SVG content to import
    * @param options [optional] - the import options, default: { expandShapes: false, insert: true, applyMatrix: paperScope.settings.applyMatrix }
    * @param options.expandShapes - whether imported shape items should be expanded to path items.
    * @param options.onLoad - the callback function to call once the SVG content is loaded from the given URL receiving two arguments: the converted item and the original svg data as a string. Only required when loading from external resources.
    * @param options.onError - the callback function to call if an error occurs during loading. Only required when loading from external resources.
    * @param options.insert: Boolean — whether the imported items should be added to the item that importSVG() is called on.
    * @param options.applyMatrix  Boolean — whether the imported items should have their transformation matrices applied to their contents or not.
    */
  def importSVG(svg: SVGElement): Item = js.native
  def importSVG(svg: SVGElement, onLoad: js.Function2[/* item */ Item, /* svg */ String, Unit]): Item = js.native
  def importSVG(svg: SVGElement, options: Anon_ApplyMatrix): Item = js.native
  /**
    * Inserts the specified layer at the specified index in this project’s layers list.
    */
  def insertLayer(index: Double, layer: Layer): Layer = js.native
  /**
    * Checks whether the project has any content or not.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Removes this project from the paperScope.projects list, and also removes its view, if one was defined.
    */
  def remove(): Unit = js.native
  /**
    * Selects all items in the project.
    */
  def selectAll(): Unit = js.native
  def setCurrentStyle(value: Partial[Style]): Unit = js.native
}

@JSGlobal("paper.project")
@js.native
object project extends TopLevel[Project]

