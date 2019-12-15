package typings.paper.paper

import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A Project object in Paper.js is what usually is referred to as the
  * document: The top level object that holds all the items contained in the
  * scene graph. As the term document is already taken in the browser context,
  * it is called Project.
  * 
  * Projects allow the manipulation of the styles that are applied to all newly
  * created items, give access to the selected items, and will in future versions
  * offer ways to query for items in the scene graph defining specific
  * requirements, and means to persist and load from different formats, such as
  * SVG and PDF.
  * 
  * The currently active project can be accessed through the
  * {@link PaperScope#project} variable.
  * 
  * An array of all open projects is accessible through the
  * {@link PaperScope#projects} variable.
  */
@JSGlobal("paper.Project")
@js.native
class Project protected () extends js.Object {
  def this(element: String) = this()
  def this(element: Size) = this()
  /** 
    * Creates a Paper.js project containing one empty {@link Layer}, referenced
    * by {@link Project#activeLayer}.
    * 
    * Note that when working with PaperScript, a project is automatically
    * created for us and the {@link PaperScope#project} variable points to it.
    * 
    * @param element - the HTML canvas element
    * that should be used as the element for the view, or an ID string by which
    * to find the element, or the size of the canvas to be created for usage in
    * a web worker.
    */
  def this(element: HTMLCanvasElement) = this()
  /** 
    * The layer which is currently active. New items will be created on this
    * layer by default.
    */
  val activeLayer: Layer = js.native
  /** 
    * The currently active path style. All selected items and newly
    * created items will be styled with this style.
    */
  var currentStyle: Style = js.native
  /** 
    * The index of the project in the {@link PaperScope#projects} list.
    */
  val index: Double = js.native
  /** 
    * The layers contained within the project.
    */
  val layers: js.Array[Layer] = js.native
  /** 
    * The selected items contained within the project.
    */
  val selectedItems: js.Array[Item] = js.native
  /** 
    * The symbol definitions shared by all symbol items contained place ind
    * project.
    */
  val symbolDefinitions: js.Array[SymbolDefinition] = js.native
  /** 
    * The reference to the project's view.
    */
  val view: View = js.native
  /** 
    * Activates this project, so all newly created items will be placed
    * in it.
    */
  def activate(): Unit = js.native
  /** 
    * Adds the specified layer at the end of the this project's {@link #layers}
    * list.
    * 
    * @param layer - the layer to be added to the project
    * 
    * @return the added layer, or `null` if adding was not possible
    */
  def addLayer(layer: Layer): Layer = js.native
  /** 
    * Clears the project by removing all {@link Project#layers}.
    */
  def clear(): Unit = js.native
  /** 
    * Deselects all selected items in the project.
    */
  def deselectAll(): Unit = js.native
  /** 
    * Exports (serializes) the project with all its layers and child items to a
    * JSON data object or string.
    * 
    * @option [options.asString=true] {Boolean} whether the JSON is returned as
    *     a `Object` or a `String`
    * @option [options.precision=5] {Number} the amount of fractional digits in
    *     numbers used in JSON data
    * 
    * @param options - the serialization options
    * 
    * @return the exported JSON data
    */
  def exportJSON(): String = js.native
  def exportJSON(options: js.Object): String = js.native
  /** 
    * Exports the project with all its layers and child items as an SVG DOM,
    * all contained in one top level SVG group node.
    * 
    * @option [options.bounds='view'] {String|Rectangle} the bounds of the area
    *     to export, either as a string ({@values 'view', content'}), or a
    *     {@link Rectangle} object: `'view'` uses the view bounds,
    *     `'content'` uses the stroke bounds of all content
    * @option [options.matrix=paper.view.matrix] {Matrix} the matrix with which
    *     to transform the exported content: If `options.bounds` is set to
    *     `'view'`, `paper.view.matrix` is used, for all other settings of
    *     `options.bounds` the identity matrix is used.
    * @option [options.asString=false] {Boolean} whether a SVG node or a
    *     `String` is to be returned
    * @option [options.precision=5] {Number} the amount of fractional digits in
    *     numbers used in SVG data
    * @option [options.matchShapes=false] {Boolean} whether path items should
    *     tried to be converted to SVG shape items (rect, circle, ellipse,
    *     line, polyline, polygon), if their geometries match
    * @option [options.embedImages=true] {Boolean} whether raster images should
    *     be embedded as base64 data inlined in the xlink:href attribute, or
    *     kept as a link to their external URL.
    * 
    * @param options - the export options
    * 
    * @return the project converted to an SVG node or a
    * `String` depending on `option.asString` value
    */
  def exportSVG(): SVGElement | String = js.native
  def exportSVG(options: js.Object): SVGElement | String = js.native
  def getItem(options: js.Function): Item = js.native
  /** 
    * Fetch the first item contained within the project whose properties
    * match the criteria in the specified object.
    * Extended matching is possible by providing a compare function or
    * regular expression. Matching points, colors only work as a comparison
    * of the full object, not partial matching (e.g. only providing the x-
    * coordinate to match all points with that x-value). Partial matching
    * does work for {@link Item#data}.
    * 
    * See {@link #getItems} for a selection of illustrated examples.
    * 
    * @param options - the criteria to match against
    * 
    * @return the first item in the project matching the given criteria
    */
  def getItem(options: js.Object): Item = js.native
  def getItems(options: js.Function): js.Array[Item] = js.native
  /** 
    * Fetch items contained within the project whose properties match the
    * criteria in the specified object.
    * 
    * Extended matching of properties is possible by providing a comparator
    * function or regular expression. Matching points, colors only work as a
    * comparison of the full object, not partial matching (e.g. only providing
    * the x- coordinate to match all points with that x-value). Partial
    * matching does work for {@link Item#data}.
    * 
    * Matching items against a rectangular area is also possible, by setting
    * either `options.inside` or `options.overlapping` to a rectangle
    * describing the area in which the items either have to be fully or partly
    * contained.
    * 
    * @see Item#matches(options)
    * @see Item#getItems(options)
    * 
    * @option [options.recursive=true] {Boolean} whether to loop recursively
    *     through all children, or stop at the current level
    * @option options.match {Function} a match function to be called for each
    *     item, allowing the definition of more flexible item checks that are
    *     not bound to properties. If no other match properties are defined,
    *     this function can also be passed instead of the `match` object
    * @option options.class {Function} the constructor function of the item
    *     type to match against
    * @option options.inside {Rectangle} the rectangle in which the items need
    *     to be fully contained
    * @option options.overlapping {Rectangle} the rectangle with which the
    *     items need to at least partly overlap
    * 
    * @param options - the criteria to match against
    * 
    * @return the list of matching items contained in the project
    */
  def getItems(options: js.Object): js.Array[Item] = js.native
  /** 
    * Performs a hit-test on the items contained within the project at the
    * location of the specified point.
    * 
    * The options object allows you to control the specifics of the hit-test
    * and may contain a combination of the following values:
    * 
    * @option [options.tolerance={@link PaperScope#settings}.hitTolerance]
    *     {Number} the tolerance of the hit-test
    * @option options.class {Function} only hit-test against a specific item
    *     class, or any of its sub-classes, by providing the constructor
    *     function against which an `instanceof` check is performed:
    *     {@values  Group, Layer, Path, CompoundPath, Shape, Raster,
    *     SymbolItem, PointText, ...}
    * @option options.match {Function} a match function to be called for each
    *     found hit result: Return `true` to return the result, `false` to keep
    *     searching
    * @option [options.fill=true] {Boolean} hit-test the fill of items
    * @option [options.stroke=true] {Boolean} hit-test the stroke of path
    *     items, taking into account the setting of stroke color and width
    * @option [options.segments=true] {Boolean} hit-test for {@link
    *     Segment#point} of {@link Path} items
    * @option options.curves {Boolean} hit-test the curves of path items,
    *     without taking the stroke color or width into account
    * @option options.handles {Boolean} hit-test for the handles ({@link
    *     Segment#handleIn} / {@link Segment#handleOut}) of path segments.
    * @option options.ends {Boolean} only hit-test for the first or last
    *     segment points of open path items
    * @option options.position {Boolean} hit-test the {@link Item#position} of
    *     of items, which depends on the setting of {@link Item#pivot}
    * @option options.center {Boolean} hit-test the {@link Rectangle#center} of
    *     the bounding rectangle of items ({@link Item#bounds})
    * @option options.bounds {Boolean} hit-test the corners and side-centers of
    *     the bounding rectangle of items ({@link Item#bounds})
    * @option options.guides {Boolean} hit-test items that have {@link
    *     Item#guide} set to `true`
    * @option options.selected {Boolean} only hit selected items
    * 
    * @param point - the point where the hit-test should be performed
    * 
    * @return a hit result object that contains more information
    *     about what exactly was hit or `null` if nothing was hit
    */
  def hitTest(point: Point): HitResult = js.native
  def hitTest(point: Point, options: js.Object): HitResult = js.native
  /** 
    * Performs a hit-test on the item and its children (if it is a {@link
    * Group} or {@link Layer}) at the location of the specified point,
    * returning all found hits.
    * 
    * The options object allows you to control the specifics of the hit-
    * test. See {@link #hitTest} for a list of all options.
    * 
    * @see #hitTest(point[, options]);
    * 
    * @param point - the point where the hit-test should be performed
    * 
    * @return hit result objects for all hits, describing what
    *     exactly was hit or `null` if nothing was hit
    */
  def hitTestAll(point: Point): js.Array[HitResult] = js.native
  def hitTestAll(point: Point, options: js.Object): js.Array[HitResult] = js.native
  /** 
    * Imports (deserializes) the stored JSON data into the project.
    * Note that the project is not cleared first. You can call
    * {@link Project#clear} to do so.
    * 
    * @param json - the JSON data to import from
    * 
    * @return the imported item
    */
  def importJSON(json: String): Item = js.native
  def importSVG(svg: String): Item = js.native
  def importSVG(svg: String, onLoad: js.Function): Item = js.native
  def importSVG(svg: String, options: js.Object): Item = js.native
  /** 
    * Converts the provided SVG content into Paper.js items and adds them to
    * the active layer of this project.
    * Note that the project is not cleared first. You can call
    * {@link Project#clear} to do so.
    * 
    * @option [options.expandShapes=false] {Boolean} whether imported shape
    *     items should be expanded to path items
    * @option options.onLoad {Function} the callback function to call once the
    *     SVG content is loaded from the given URL receiving two arguments: the
    *     converted `item` and the original `svg` data as a string. Only
    *     required when loading from external resources.
    * @option options.onError {Function} the callback function to call if an
    *     error occurs during loading. Only required when loading from external
    *     resources.
    * @option [options.insert=true] {Boolean} whether the imported items should
    *     be added to the project that `importSVG()` is called on
    * @option [options.applyMatrix={@link PaperScope#settings}.applyMatrix]
    *     {Boolean} whether the imported items should have their transformation
    *     matrices applied to their contents or not
    * 
    * @param svg - the SVG content to import, either as a SVG
    *     DOM node, a string containing SVG content, or a string describing the
    *     URL of the SVG file to fetch.
    * @param options - the import options
    * 
    * @return the newly created Paper.js item containing the converted
    *     SVG content
    */
  def importSVG(svg: SVGElement): Item = js.native
  /** 
    * Imports the provided external SVG file, converts it into Paper.js items
    * and adds them to the active layer of this project.
    * Note that the project is not cleared first. You can call
    * {@link Project#clear} to do so.
    * 
    * @param svg - the URL of the SVG file to fetch.
    * @param onLoad - the callback function to call once the SVG
    *     content is loaded from the given URL receiving two arguments: the
    *     converted `item` and the original `svg` data as a string. Only
    *     required when loading from external files.
    * 
    * @return the newly created Paper.js item containing the converted
    *     SVG content
    */
  def importSVG(svg: SVGElement, onLoad: js.Function): Item = js.native
  def importSVG(svg: SVGElement, options: js.Object): Item = js.native
  /** 
    * Inserts the specified layer at the specified index in this project's
    * {@link #layers} list.
    * 
    * @param index - the index at which to insert the layer
    * @param layer - the layer to be inserted in the project
    * 
    * @return the added layer, or `null` if adding was not possible
    */
  def insertLayer(index: Double, layer: Layer): Layer = js.native
  /** 
    * Checks whether the project has any content or not.
    */
  def isEmpty(): Boolean = js.native
  /** 
    * Removes this project from the {@link PaperScope#projects} list, and also
    * removes its view, if one was defined.
    */
  def remove(): Unit = js.native
  /** 
    * Selects all items in the project.
    */
  def selectAll(): Unit = js.native
}

