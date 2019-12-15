package typings.paper.paper

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Item type allows you to access and modify the items in
  * Paper.js projects. Its functionality is inherited by different project
  * item types such as {@link Path}, {@link CompoundPath}, {@link Group},
  * {@link Layer} and {@link Raster}. They each add a layer of functionality that
  * is unique to their type, but share the underlying properties and functions
  * that they inherit from Item.
  */
@JSGlobal("paper.Item")
@js.native
class Item () extends js.Object {
  /** 
    * Controls whether the transformations applied to the item (e.g. through
    * {@link #transform}, {@link #rotate},
    * {@link #scale}, etc.) are stored in its {@link #matrix} property,
    * or whether they are directly applied to its contents or children (passed
    * on to the segments in {@link Path} items, the children of {@link Group}
    * items, etc.).
    */
  var applyMatrix: Boolean = js.native
  /** 
    * The blend mode with which the item is composited onto the canvas. Both
    * the standard canvas compositing modes, as well as the new CSS blend modes
    * are supported. If blend-modes cannot be rendered natively, they are
    * emulated. Be aware that emulation can have an impact on performance.
    */
  var blendMode: String = js.native
  /** 
    * The bounding rectangle of the item excluding stroke width.
    */
  var bounds: Rectangle = js.native
  /** 
    * The children items contained within this item. Items that define a
    * {@link #name} can also be accessed by name.
    * 
    * <b>Please note:</b> The children array should not be modified directly
    * using array functions. To remove single items from the children list, use
    * {@link Item#remove}, to remove all items from the children list, use
    * {@link Item#removeChildren}. To add items to the children list, use
    * {@link Item#addChild} or {@link Item#insertChild}.
    */
  var children: js.Array[Item] = js.native
  /** 
    * The class name of the item as a string.
    */
  var className: String = js.native
  /** 
    * Specifies whether the item defines a clip mask. This can only be set on
    * paths and compound paths, and only if the item is already contained
    * within a clipping group.
    */
  var clipMask: Boolean = js.native
  /** 
    * Specifies an array containing the dash and gap lengths of the stroke.
    */
  var dashArray: js.Array[Double] = js.native
  /** 
    * The dash offset of the stroke.
    */
  var dashOffset: Double = js.native
  /** 
    * A plain javascript object which can be used to store
    * arbitrary data on the item.
    */
  var data: js.Any = js.native
  /** 
    * The fill color of the item.
    */
  var fillColor: Color | Null = js.native
  /** 
    * The fill-rule with which the shape gets filled. Please note that only
    * modern browsers support fill-rules other than `'nonzero'`.
    */
  var fillRule: String = js.native
  /** 
    * The first item contained within this item. This is a shortcut for
    * accessing `item.children[0]`.
    */
  val firstChild: Item = js.native
  /** 
    * The item's global transformation matrix in relation to the global project
    * coordinate space. Note that the view's transformations resulting from
    * zooming and panning are not factored in.
    */
  val globalMatrix: Matrix = js.native
  /** 
    * The bounding rectangle of the item including handles.
    */
  var handleBounds: Rectangle = js.native
  /** 
    * The unique id of the item.
    */
  val id: Double = js.native
  /** 
    * The index of this item within the list of its parent's children.
    */
  val index: Double = js.native
  /** 
    * The bounding rectangle of the item without any matrix transformations.
    * 
    * Typical use case would be drawing a frame around the object where you
    * want to draw something of the same size, position, rotation, and scaling,
    * like a selection frame.
    */
  var internalBounds: Rectangle = js.native
  /** 
    * The last item contained within this item.This is a shortcut for
    * accessing `item.children[item.children.length - 1]`.
    */
  val lastChild: Item = js.native
  /** 
    * The layer that this item is contained within.
    */
  val layer: Layer = js.native
  /** 
    * Specifies whether the item is locked. When set to `true`, item
    * interactions with the mouse are disabled.
    */
  var locked: Boolean = js.native
  /** 
    * The item's transformation matrix, defining position and dimensions in
    * relation to its parent item in which it is contained.
    */
  var matrix: Matrix = js.native
  /** 
    * The miter limit of the stroke.
    * When two line segments meet at a sharp angle and miter joins have been
    * specified for {@link Item#strokeJoin}, it is possible for the miter to
    * extend far beyond the {@link Item#strokeWidth} of the path. The
    * miterLimit imposes a limit on the ratio of the miter length to the
    * {@link Item#strokeWidth}.
    */
  var miterLimit: Double = js.native
  /** 
    * The name of the item. If the item has a name, it can be accessed by name
    * through its parent's children list.
    */
  var name: String = js.native
  /** 
    * The next item on the same level as this item.
    */
  val nextSibling: Item = js.native
  /** 
    * The function to be called when the mouse clicks on the item. The function
    * receives a {@link MouseEvent} object which contains information about the
    * mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onClick
    */
  var onClick: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse double clicks on the item. The
    * function receives a {@link MouseEvent} object which contains information
    * about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onDoubleClick
    */
  var onDoubleClick: js.Function | Null = js.native
  /** 
    * Item level handler function to be called on each frame of an animation.
    * The function receives an event object which contains information about
    * the frame event:
    * 
    * @see View#onFrame
    * 
    * @option event.count {Number} the number of times the frame event was
    *     fired
    * @option event.time {Number} the total amount of time passed since the
    *     first frame event in seconds
    * @option event.delta {Number} the time passed in seconds since the last
    *     frame event
    */
  var onFrame: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is pushed down on the
    * item. The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseDown
    */
  var onMouseDown: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse position changes while the mouse
    * is being dragged over the item. The function receives a {@link
    * MouseEvent} object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseDrag
    */
  var onMouseDrag: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse moves over the item. This
    * function will only be called again, once the mouse moved outside of the
    * item first. The function receives a {@link MouseEvent} object which
    * contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseEnter
    */
  var onMouseEnter: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse moves out of the item.
    * The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseLeave
    */
  var onMouseLeave: js.Function | Null = js.native
  /** 
    * The function to be called repeatedly while the mouse moves over the item.
    * The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseMove
    */
  var onMouseMove: js.Function | Null = js.native
  /** 
    * The function to be called when the mouse button is released over the item.
    * The function receives a {@link MouseEvent} object which contains
    * information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will
    * reach the view, unless they are stopped with {@link
    * Event#stopPropagation()} or by returning `false` from the handler.
    * 
    * @see View#onMouseUp
    */
  var onMouseUp: js.Function | Null = js.native
  /** 
    * The opacity of the item as a value between `0` and `1`.
    */
  var opacity: Double = js.native
  /** 
    * The item that this item is contained within.
    */
  var parent: Item = js.native
  /** 
    * The item's pivot point specified in the item coordinate system, defining
    * the point around which all transformations are hinging. This is also the
    * reference point for {@link #position}. By default, it is set to `null`,
    * meaning the {@link Rectangle#center} of the item's {@link #bounds}
    * rectangle is used as pivot.
    */
  var pivot: Point = js.native
  /** 
    * The item's position within the parent item's coordinate system. By
    * default, this is the {@link Rectangle#center} of the item's
    * {@link #bounds} rectangle.
    */
  var position: Point = js.native
  /** 
    * The previous item on the same level as this item.
    */
  val previousSibling: Item = js.native
  /** 
    * The project that this item belongs to.
    */
  val project: Project = js.native
  /** 
    * The current rotation angle of the item, as described by its
    * {@link #matrix}.
    * Please note that this only returns meaningful values for items with
    * {@link #applyMatrix} set to `false`, meaning they do not directly bake
    * transformations into their content.
    */
  var rotation: Double = js.native
  /** 
    * The current scale factor of the item, as described by its
    * {@link #matrix}.
    * Please note that this only returns meaningful values for items with
    * {@link #applyMatrix} set to `false`, meaning they do not directly bake
    * transformations into their content.
    */
  var scaling: Point = js.native
  /** 
    * Specifies whether the item is selected. This will also return `true` for
    * {@link Group} items if they are partially selected, e.g. groups
    * containing selected or partially selected paths.
    * 
    * Paper.js draws the visual outlines of selected items on top of your
    * project. This can be useful for debugging, as it allows you to see the
    * construction of paths, position of path curves, individual segment points
    * and bounding boxes of symbol and raster items.
    * 
    * @see Project#selectedItems
    * @see Segment#selected
    * @see Curve#selected
    * @see Point#selected
    */
  var selected: Boolean = js.native
  /** 
    * The color the item is highlighted with when selected. If the item does
    * not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | Null = js.native
  /** 
    * The shadow's blur radius.
    */
  var shadowBlur: Double = js.native
  /** 
    * The shadow color.
    */
  var shadowColor: Color | Null = js.native
  /** 
    * The shadow's offset.
    */
  var shadowOffset: Point = js.native
  /** 
    * The bounding rectangle of the item including stroke width.
    */
  var strokeBounds: Rectangle = js.native
  /** 
    * The shape to be used at the beginning and end of open {@link Path} items,
    * when they have a stroke.
    */
  var strokeCap: String = js.native
  /** 
    * The color of the stroke.
    */
  var strokeColor: Color | Null = js.native
  /** 
    * The shape to be used at the segments and corners of {@link Path} items
    * when they have a stroke.
    */
  var strokeJoin: String = js.native
  /** 
    * Specifies whether the stroke is to be drawn taking the current affine
    * transformation into account (the default behavior), or whether it should
    * appear as a non-scaling stroke.
    */
  var strokeScaling: Boolean = js.native
  /** 
    * The width of the stroke.
    */
  var strokeWidth: Double = js.native
  /** 
    * The path style of the item.
    */
  var style: Style = js.native
  /** 
    * The view that this item belongs to.
    */
  val view: View = js.native
  /** 
    * The item's global matrix in relation to the view coordinate space. This
    * means that the view's transformations resulting from zooming and panning
    * are factored in.
    */
  val viewMatrix: Matrix = js.native
  /** 
    * Specifies whether the item is visible. When set to `false`, the item
    * won't be drawn.
    */
  var visible: Boolean = js.native
  /** 
    * Adds the specified item as a child of this item at the end of the its
    * {@link #children}  list. You can use this function for groups, compound
    * paths and layers.
    * 
    * @param item - the item to be added as a child
    * 
    * @return the added item, or `null` if adding was not possible
    */
  def addChild(item: Item): Item = js.native
  /** 
    * Adds the specified items as children of this item at the end of the its
    * children list. You can use this function for groups, compound paths and
    * layers.
    * 
    * @param items - the items to be added as children
    * 
    * @return the added items, or `null` if adding was not possible
    */
  def addChildren(items: js.Array[Item]): js.Array[Item] = js.native
  def addTo(owner: CompoundPath): Item = js.native
  def addTo(owner: Group): Item = js.native
  def addTo(owner: Layer): Item = js.native
  /** 
    * Adds it to the specified owner, which can be either a {@link Item} or a
    * {@link Project}.
    * 
    * @param owner - the item or project to
    * add the item to
    * 
    * @return the item itself, if it was successfully added
    */
  def addTo(owner: Project): Item = js.native
  /** 
    * Brings this item to the front of all other items within the same parent.
    */
  def bringToFront(): Unit = js.native
  def clone(options: js.Object): Item = js.native
  /** 
    * Checks whether the item's geometry contains the given point.
    * 
    * @param point - the point to check for
    */
  def contains(point: Point): Boolean = js.native
  /** 
    * Copies all attributes of the specified item over to this item. This
    * includes its style, visibility, matrix, pivot, blend-mode, opacity,
    * selection state, data, name, etc.
    * 
    * @param source - the item to copy the attributes from
    * @param excludeMatrix - whether to exclude the transformation
    * matrix when copying all attributes
    */
  def copyAttributes(source: Item, excludeMatrix: Boolean): Unit = js.native
  /** 
    * Copies the content of the specified item over to this item.
    * 
    * @param source - the item to copy the content from
    */
  def copyContent(source: Item): Unit = js.native
  def copyTo(owner: CompoundPath): Item = js.native
  def copyTo(owner: Group): Item = js.native
  def copyTo(owner: Layer): Item = js.native
  /** 
    * Clones the item and adds it to the specified owner, which can be either
    * a {@link Item} or a {@link Project}.
    * 
    * @param owner - the item or project to
    * copy the item to
    * 
    * @return the new copy of the item, if it was successfully added
    */
  def copyTo(owner: Project): Item = js.native
  /** 
    * Emit an event on the item.
    * 
    * @param type - the type of event: {@values 'frame', mousedown',
    *     'mouseup', 'mousedrag', 'click', 'doubleclick', 'mousemove',
    *     'mouseenter', 'mouseleave'}
    * @param event - an object literal containing properties describing
    * the event
    * 
    * @return true if the event had listeners
    */
  def emit(`type`: String, event: js.Object): Boolean = js.native
  /** 
    * Exports (serializes) the item with its content and child items to a JSON
    * data string.
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
    * Exports the item with its content and child items as an SVG DOM.
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
    * @return the item converted to an SVG node or a
    * `String` depending on `option.asString` value
    */
  def exportSVG(): SVGElement | String = js.native
  def exportSVG(options: js.Object): SVGElement | String = js.native
  /** 
    * Transform the item so that its {@link #bounds} fit within the specified
    * rectangle, without changing its aspect ratio.
    */
  def fitBounds(rectangle: Rectangle): Unit = js.native
  def fitBounds(rectangle: Rectangle, fill: Boolean): Unit = js.native
  def getItem(`match`: js.Function): Item = js.native
  /** 
    * Fetch the first descendant (child or child of child) of this item
    * that matches the properties in the specified object.
    * Extended matching is possible by providing a compare function or
    * regular expression. Matching points, colors only work as a comparison
    * of the full object, not partial matching (e.g. only providing the x-
    * coordinate to match all points with that x-value). Partial matching
    * does work for {@link Item#data}.
    * See {@link Project#getItems} for a selection of illustrated
    * examples.
    * 
    * @see #getItems(match)
    * 
    * @param match - the criteria to match against
    * 
    * @return the first descendant item matching the given criteria
    */
  def getItem(`match`: js.Object): Item = js.native
  def getItems(options: js.Function): js.Array[Item] = js.native
  /** 
    * Fetch the descendants (children or children of children) of this item
    * that match the properties in the specified object. Extended matching is
    * possible by providing a compare function or regular expression. Matching
    * points, colors only work as a comparison of the full object, not partial
    * matching (e.g. only providing the x- coordinate to match all points with
    * that x-value). Partial matching does work for {@link Item#data}.
    * 
    * Matching items against a rectangular area is also possible, by setting
    * either `options.inside` or `options.overlapping` to a rectangle describing
    * the area in which the items either have to be fully or partly contained.
    * 
    * See {@link Project#getItems} for a selection of illustrated
    * examples.
    * 
    * @see #matches(options)
    * 
    * @option [options.recursive=true] {Boolean} whether to loop recursively
    *     through all children, or stop at the current level
    * @option options.match {Function} a match function to be called for each
    *     item, allowing the definition of more flexible item checks that are
    *     not bound to properties. If no other match properties are defined,
    *     this function can also be passed instead of the `options` object
    * @option options.class {Function} the constructor function of the item type
    *     to match against
    * @option options.inside {Rectangle} the rectangle in which the items need to
    *     be fully contained
    * @option options.overlapping {Rectangle} the rectangle with which the items
    *     need to at least partly overlap
    * 
    * @param options - the criteria to match against
    * 
    * @return the list of matching descendant items
    */
  def getItems(options: js.Object): js.Array[Item] = js.native
  /** 
    * Converts the specified point from global project coordinate space to the
    * item's own local coordinate space.
    * 
    * @param point - the point to be transformed
    * 
    * @return the transformed point as a new instance
    */
  def globalToLocal(point: Point): Point = js.native
  /** 
    * Checks if the item contains any children items.
    * 
    * @return true it has one or more children
    */
  def hasChildren(): Boolean = js.native
  /** 
    * Checks whether the item has a fill.
    * 
    * @return true if the item has a fill
    */
  def hasFill(): Boolean = js.native
  /** 
    * Checks whether the item has a shadow.
    * 
    * @return true if the item has a shadow
    */
  def hasShadow(): Boolean = js.native
  /** 
    * Checks whether the item has a stroke.
    * 
    * @return true if the item has a stroke
    */
  def hasStroke(): Boolean = js.native
  /** 
    * Performs a hit-test on the item and its children (if it is a {@link
    * Group} or {@link Layer}) at the location of the specified point,
    * returning the first found hit.
    * 
    * The options object allows you to control the specifics of the hit-
    * test and may contain a combination of the following values:
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
    *     (in global coordinates system).
    * 
    * @return a hit result object describing what exactly was hit
    *     or `null` if nothing was hit
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
    *     (in global coordinates system).
    * 
    * @return hit result objects for all hits, describing what
    *     exactly was hit or `null` if nothing was hit
    */
  def hitTestAll(point: Point): js.Array[HitResult] = js.native
  def hitTestAll(point: Point, options: js.Object): js.Array[HitResult] = js.native
  /** 
    * Imports (deserializes) the stored JSON data into this item. If the data
    * describes an item of the same class or a parent class of the item, the
    * data is imported into the item itself. If not, the imported item is added
    * to this item's {@link Item#children} list. Note that not all type of
    * items can have children.
    * 
    * @param json - the JSON data to import from
    */
  def importJSON(json: String): Item = js.native
  def importSVG(svg: String): Item = js.native
  def importSVG(svg: String, onLoad: js.Function): Item = js.native
  def importSVG(svg: String, options: js.Object): Item = js.native
  /** 
    * Converts the provided SVG content into Paper.js items and adds them to
    * the this item's children list. Note that the item is not cleared first.
    * You can call {@link Item#removeChildren} to do so.
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
    *     be added to the item that `importSVG()` is called on
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
    * and adds them to the this item's children list. Note that the item is not
    * cleared first. You can call {@link Item#removeChildren} to do so.
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
    * Inserts this item above the specified item.
    * 
    * @param item - the item above which it should be inserted
    * 
    * @return the inserted item, or `null` if inserting was not possible
    */
  def insertAbove(item: Item): Item = js.native
  /** 
    * Inserts this item below the specified item.
    * 
    * @param item - the item below which it should be inserted
    * 
    * @return the inserted item, or `null` if inserting was not possible
    */
  def insertBelow(item: Item): Item = js.native
  /** 
    * Inserts the specified item as a child of this item at the specified index
    * in its {@link #children} list. You can use this function for groups,
    * compound paths and layers.
    * 
    * @param index - the index at which to insert the item
    * @param item - the item to be inserted as a child
    * 
    * @return the inserted item, or `null` if inserting was not possible
    */
  def insertChild(index: Double, item: Item): Item = js.native
  /** 
    * Inserts the specified items as children of this item at the specified
    * index in its {@link #children} list. You can use this function for
    * groups, compound paths and layers.
    * 
    * @param items - the items to be appended as children
    * 
    * @return the inserted items, or `null` if inserted was not
    *     possible
    */
  def insertChildren(index: Double, items: js.Array[Item]): js.Array[Item] = js.native
  /** 
    * @param item - the item to check against
    */
  def intersects(item: Item): Boolean = js.native
  /** 
    * Checks if this item is above the specified item in the stacking order
    * of the project.
    * 
    * @param item - the item to check against
    * 
    * @return true if it is above the specified item
    */
  def isAbove(item: Item): Boolean = js.native
  /** 
    * Checks if the item is an ancestor of the specified item.
    * 
    * @param item - the item to check against
    * 
    * @return true if the item is an ancestor of the specified
    * item
    */
  def isAncestor(item: Item): Boolean = js.native
  /** 
    * Checks if the item is below the specified item in the stacking order of
    * the project.
    * 
    * @param item - the item to check against
    * 
    * @return true if it is below the specified item
    */
  def isBelow(item: Item): Boolean = js.native
  /** 
    * Checks whether the specified item is a child of the item.
    * 
    * @param item - the item to check against
    * 
    * @return true it is a child of the item
    */
  def isChild(item: Item): Boolean = js.native
  /** 
    * Checks if the item is contained within the specified item.
    * 
    * @param item - the item to check against
    * 
    * @return true if it is inside the specified item
    */
  def isDescendant(item: Item): Boolean = js.native
  /** 
    * Specifies whether the item has any content or not. The meaning of what
    * content is differs from type to type. For example, a {@link Group} with
    * no children, a {@link TextItem} with no text content and a {@link Path}
    * with no segments all are considered empty.
    * 
    * @param recursively - whether an item with children should be
    * considered empty if all its descendants are empty
    */
  def isEmpty(): Boolean = js.native
  def isEmpty(recursively: Boolean): Boolean = js.native
  /** 
    * Checks whether the item is grouped with the specified item.
    * 
    * @return true if the items are grouped together
    */
  def isGroupedWith(item: Item): Boolean = js.native
  /** 
    * Checks whether the item and all its parents are inserted into scene graph
    * or not.
    * 
    * @return true if the item is inserted into the scene graph
    */
  def isInserted(): Boolean = js.native
  /** 
    * @param rect - the rectangle to check against
    */
  def isInside(rect: Rectangle): Boolean = js.native
  /** 
    * Checks whether the specified item is the parent of the item.
    * 
    * @param item - the item to check against
    * 
    * @return true if it is the parent of the item
    */
  def isParent(item: Item): Boolean = js.native
  /** 
    * Checks if the item is an a sibling of the specified item.
    * 
    * @param item - the item to check against
    * 
    * @return true if the item is aa sibling of the specified item
    */
  def isSibling(item: Item): Boolean = js.native
  /** 
    * Converts the specified point from the item's own local coordinate space
    * to the global project coordinate space.
    * 
    * @param point - the point to be transformed
    * 
    * @return the transformed point as a new instance
    */
  def localToGlobal(point: Point): Point = js.native
  /** 
    * Converts the specified point from the item's own local coordinate space
    * to the parent's coordinate space.
    * 
    * @param point - the point to be transformed
    * 
    * @return the transformed point as a new instance
    */
  def localToParent(point: Point): Point = js.native
  /** 
    * Checks whether the item matches the given criteria. Extended matching is
    * possible by providing a compare function or a regular expression.
    * Matching points, colors only work as a comparison of the full object, not
    * partial matching (e.g. only providing the x-coordinate to match all
    * points with that x-value). Partial matching does work for
    * {@link Item#data}.
    * 
    * See {@link Project#getItems} for a selection of illustrated
    * examples.
    * 
    * @see #getItems(options)
    * 
    * @param name - the name of the state to match against
    * @param compare - the value, function or regular expression to
    * compare against
    * 
    * @return true if the item matches the state
    */
  def matches(name: String, compare: js.Object): Boolean = js.native
  def matches(options: js.Function): Boolean = js.native
  /** 
    * Checks whether the item matches the criteria described by the given
    * object, by iterating over all of its properties and matching against
    * their values through {@link #matches}.
    * 
    * See {@link Project#getItems} for a selection of illustrated
    * examples.
    * 
    * @see #getItems(options)
    * 
    * @param options - the criteria to match against
    * 
    * @return true if the item matches all the criteria
    */
  def matches(options: js.Object): Boolean = js.native
  /** 
    * Detach one or more event handlers to the item.
    * 
    * @param object - an object containing one or more of the following
    *     properties: {@values frame, mousedown, mouseup, mousedrag, click,
    *     doubleclick, mousemove, mouseenter, mouseleave}
    * 
    * @return this item itself, so calls can be chained
    */
  def off(`object`: js.Object): Item = js.native
  /** 
    * Detach an event handler from the item.
    * 
    * @param type - the type of event: {@values 'frame', mousedown',
    *     'mouseup', 'mousedrag', 'click', 'doubleclick', 'mousemove',
    *     'mouseenter', 'mouseleave'}
    * @param function - the function to be detached
    * 
    * @return this item itself, so calls can be chained
    */
  def off(`type`: String, callback: js.Function): Item = js.native
  /** 
    * Attaches one or more event handlers to the item.
    * 
    * @param object - an object containing one or more of the following
    *     properties: {@values frame, mousedown, mouseup, mousedrag, click,
    *     doubleclick, mousemove, mouseenter, mouseleave}
    * 
    * @return this item itself, so calls can be chained
    */
  def on(`object`: js.Object): Item = js.native
  /** 
    * Attaches an event handler to the item.
    * 
    * @param type - the type of event: {@values 'frame', mousedown',
    *     'mouseup', 'mousedrag', 'click', 'doubleclick', 'mousemove',
    *     'mouseenter', 'mouseleave'}
    * @param function - the function to be called when the event
    *     occurs, receiving a {@link MouseEvent} or {@link Event} object as its
    *     sole argument
    * 
    * @return this item itself, so calls can be chained
    */
  def on(`type`: String, callback: js.Function): Item = js.native
  /** 
    * Converts the specified point from the parent's coordinate space to
    * item's own local coordinate space.
    * 
    * @param point - the point to be transformed
    * 
    * @return the transformed point as a new instance
    */
  def parentToLocal(point: Point): Point = js.native
  /** 
    * Rasterizes the item into a newly created Raster object. The item itself
    * is not removed after rasterization.
    * 
    * @param resolution - the resolution of the raster
    *     in pixels per inch (DPI). If not specified, the value of
    *     `view.resolution` is used.
    * @param insert - specifies whether the raster should be
    *     inserted into the scene graph. When set to `true`, it is inserted
    *     above the original
    * 
    * @return the newly created raster item
    */
  def rasterize(): Raster = js.native
  def rasterize(resolution: Double): Raster = js.native
  def rasterize(resolution: Double, insert: Boolean): Raster = js.native
  /** 
    * If this is a group, layer or compound-path with only one child-item,
    * the child-item is moved outside and the parent is erased. Otherwise, the
    * item itself is returned unmodified.
    * 
    * @return the reduced item
    */
  def reduce(options: js.Any): Item = js.native
  /** 
    * Removes the item and all its children from the project. The item is not
    * destroyed and can be inserted again after removal.
    * 
    * @return true if the item was removed
    */
  def remove(): Boolean = js.native
  /** 
    * Removes all of the item's {@link #children} (if any).
    * 
    * @return an array containing the removed items
    */
  def removeChildren(): js.Array[Item] = js.native
  /** 
    * Removes the children from the specified `start` index to and excluding
    * the `end` index from the parent's {@link #children} array.
    * 
    * @param start - the beginning index, inclusive
    * @param end - the ending index, exclusive
    * 
    * @return an array containing the removed items
    */
  def removeChildren(start: Double): js.Array[Item] = js.native
  def removeChildren(start: Double, end: Double): js.Array[Item] = js.native
  /** 
    * Removes the item when the events specified in the passed options object
    * occur.
    * 
    * @option options.move {Boolean) remove the item when the next {@link
    *     Tool#onMouseMove} event is fired.
    * @option options.drag {Boolena) remove the item when the next {@link
    *     Tool#onMouseDrag} event is fired.
    * @option options.down {Boolean) remove the item when the next {@link
    *     Tool#onMouseDown} event is fired.
    * @option options.up {Boolean) remove the item when the next {@link
    *     Tool#onMouseUp} event is fired.
    */
  def removeOn(options: js.Object): Unit = js.native
  /** 
    * Removes the item when the next {@link Tool#onMouseDown} event is fired.
    */
  def removeOnDown(): Unit = js.native
  /** 
    * Removes the item when the next {@link Tool#onMouseDrag} event is fired.
    */
  def removeOnDrag(): Unit = js.native
  /** 
    * Removes the item when the next {@link Tool#onMouseMove} event is fired.
    */
  def removeOnMove(): Unit = js.native
  /** 
    * Removes the item when the next {@link Tool#onMouseUp} event is fired.
    */
  def removeOnUp(): Unit = js.native
  /** 
    * Replaces this item with the provided new item which will takes its place
    * in the project hierarchy instead.
    * 
    * @param item - the item that will replace this item
    * 
    * @return true if the item was replaced
    */
  def replaceWith(item: Item): Boolean = js.native
  /** 
    * Check if the item has one or more event handlers of the specified type.
    * 
    * @param type - the type of event: {@values 'frame', mousedown',
    *     'mouseup', 'mousedrag', 'click', 'doubleclick', 'mousemove',
    *     'mouseenter', 'mouseleave'}
    * 
    * @return true if the item has one or more event handlers of
    * the specified type
    */
  def responds(`type`: String): Boolean = js.native
  /** 
    * Reverses the order of the item's children
    */
  def reverseChildren(): Unit = js.native
  /** 
    * Rotates the item by a given angle around the given center point.
    * 
    * Angles are oriented clockwise and measured in degrees.
    * 
    * @see Matrix#rotate(angle[, center])
    * 
    * @param angle - the rotation angle
    */
  def rotate(angle: Double): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  /** 
    * Scales the item by the given values from its center point, or optionally
    * from a supplied point.
    * 
    * @param hor - the horizontal scale factor
    * @param ver - the vertical scale factor
    */
  def scale(hor: Double, ver: Double): Unit = js.native
  def scale(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Scales the item by the given value from its center point, or optionally
    * from a supplied point.
    * 
    * @param scale - the scale factor
    */
  def scale(scale: Double): Unit = js.native
  def scale(scale: Double, center: Point): Unit = js.native
  /** 
    * Sends this item to the back of all other items within the same parent.
    */
  def sendToBack(): Unit = js.native
  /** 
    * Sets the properties of the passed object literal on this item to the
    * values defined in the object literal, if the item has property of the
    * given name (or a setter defined for it).
    * 
    * @return the item itself
    */
  def set(props: js.Object): Item = js.native
  /** 
    * Shears the item by the given values from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(hor, ver[, center])
    * 
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    */
  def shear(hor: Double, ver: Double): Unit = js.native
  def shear(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Shears the item by the given value from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(shear[, center])
    * 
    * @param shear - the horziontal and vertical shear factors as a point
    */
  def shear(shear: Point): Unit = js.native
  def shear(shear: Point, center: Point): Unit = js.native
  /** 
    * Skews the item by the given angles from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(hor, ver[, center])
    * 
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical sskew angle in degrees
    */
  def skew(hor: Double, ver: Double): Unit = js.native
  def skew(hor: Double, ver: Double, center: Point): Unit = js.native
  /** 
    * Skews the item by the given angles from its center point, or optionally
    * by a supplied point.
    * 
    * @see Matrix#shear(skew[, center])
    * 
    * @param skew - the horziontal and vertical skew angles in degrees
    */
  def skew(skew: Point): Unit = js.native
  def skew(skew: Point, center: Point): Unit = js.native
  /** 
    * Transform the item.
    * 
    * @param matrix - the matrix by which the item shall be transformed
    */
  def transform(matrix: Matrix): Unit = js.native
  /** 
    * Translates (moves) the item by the given offset views.
    * 
    * @param delta - the offset to translate the item by
    */
  def translate(delta: Point): Unit = js.native
  /** 
    * Tween item between two states.
    * 
    * @option options.duration {Number} the duration of the tweening
    * @option [options.easing='linear'] {Function|String} an easing function or the type
    * of the easing: {@values 'linear' 'easeInQuad' 'easeOutQuad'
    * 'easeInOutQuad' 'easeInCubic' 'easeOutCubic' 'easeInOutCubic'
    * 'easeInQuart' 'easeOutQuart' 'easeInOutQuart' 'easeInQuint'
    * 'easeOutQuint' 'easeInOutQuint'}
    * @option [options.start=true] {Boolean} whether to start tweening automatically
    * 
    * @param from - the state at the start of the tweening
    * @param to - the state at the end of the tweening
    * @param options - the options or the duration
    */
  def tween(from: js.Object, to: js.Object, options: js.Object): Tween = js.native
  def tween(from: js.Object, to: js.Object, options: Double): Tween = js.native
  /** 
    * Tween item.
    * 
    * @see Item#tween(from, to, options)
    * 
    * @param options - the options or the duration
    */
  def tween(options: js.Object): Tween = js.native
  def tween(options: Double): Tween = js.native
  /** 
    * Tween item to a state.
    * 
    * @see Item#tween(from, to, options)
    * 
    * @param to - the state at the end of the tweening
    * @param options - the options or the duration
    */
  def tween(to: js.Object, options: js.Object): Tween = js.native
  def tween(to: js.Object, options: Double): Tween = js.native
  /** 
    * Tween item from a state to its state before the tweening.
    * 
    * @see Item#tween(from, to, options)
    * 
    * @param from - the state at the start of the tweening
    * @param options - the options or the duration
    */
  def tweenFrom(from: js.Object, options: js.Object): Tween = js.native
  def tweenFrom(from: js.Object, options: Double): Tween = js.native
  /** 
    * Tween item to a state.
    * 
    * @see Item#tween(to, options)
    * 
    * @param to - the state at the end of the tweening
    * @param options - the options or the duration
    */
  def tweenTo(to: js.Object, options: js.Object): Tween = js.native
  def tweenTo(to: js.Object, options: Double): Tween = js.native
}

