package typings.paper.paperNs

import typings.paper.Anon_ApplyMatrix
import typings.paper.Anon_AsString
import typings.paper.Anon_Click
import typings.paper.Anon_Deep
import typings.paper.Anon_Down
import typings.paper.Anon_X
import typings.std.Partial
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Item")
@js.native
class Item () extends Base {
  /**
    * Controls whether the transformations applied to the item (e.g. through transform(matrix), rotate(angle), scale(scale), etc.) are stored in its matrix property, or whether they are directly applied to its contents or children (passed on to the segments in Path items, the children of Group items, etc.).
    */
  var applyMatrix: Boolean = js.native
  /**
    * The blend mode with which the item is composited onto the canvas. Both the standard canvas compositing modes, as well as the new CSS blend modes are supported. If blend-modes cannot be rendered natively, they are emulated. Be aware that emulation can have an impact on performance.
    * String('normal', 'multiply', 'screen', 'overlay', 'soft-light', 'hard-light', 'color-dodge', 'color-burn', 'darken', 'lighten', 'difference', 'exclusion', 'hue', 'saturation', 'luminosity', 'color', 'add', 'subtract', 'average', 'pin-light', 'negation', 'source-over', 'source-in', 'source-out', 'source-atop', 'destination-over', 'destination-in', 'destination-out', 'destination-atop', 'lighter', 'darker', 'copy', 'xor')
    */
  var blendMode: String = js.native
  /**
    * The bounding rectangle of the item excluding stroke width.
    */
  var bounds: Rectangle = js.native
  /**
    * The children items contained within this item. Items that define a name can also be accessed by name.
    * Please note: The children array should not be modified directly using array functions. To remove single items from the children list, use item.remove(), to remove all items from the children list, use item.removeChildren(). To add items to the children list, use item.addChild(item) or item.insertChild(index, item).
    */
  var children: js.Array[Item] = js.native
  /**
    * The class name of the item as a string.
    * String('Group', 'Layer', 'Path', 'CompoundPath', 'Shape', 'Raster', 'PlacedSymbol', 'PointText')
    */
  var className: String = js.native
  /**
    * Specifies whether the item defines a clip mask. This can only be set on paths, compound paths, and text frame objects, and only if the item is already contained within a clipping group.
    */
  var clipMask: Boolean = js.native
  /**
    * The curvature of the #curve at the given location.
    */
  var curvature: Double = js.native
  /**
    * Specifies an array containing the dash and gap lengths of the stroke.
    */
  var dashArray: js.Array[Double] = js.native
  /**
    * The dash offset of the stroke.
    */
  var dashOffset: Double = js.native
  /**
    * A plain javascript object which can be used to store arbitrary data on the item.
    */
  var data: js.Any = js.native
  /**
    * The fill color of the item.
    */
  var fillColor: Color | String | Null = js.native
  /**
    * The fill-rule with which the shape gets filled. Please note that only modern browsers support fill-rules other than 'nonzero'.
    * Values - 'nonzero', 'evenodd'
    * Default - 'nonzero'
    */
  var fillRule: String = js.native
  /**
    * The first item contained within this item. This is a shortcut for accessing item.children[0].
    */
  val firstChild: Item = js.native
  /**
    * Specifies whether the item and all children are selected.
    */
  var fullySelected: Boolean = js.native
  /**
    * The item's global transformation matrix in relation to the global project coordinate space. Note that the view's transformations resulting from zooming and panning are not factored in.
    * Read Only.
    */
  val globalMatrix: Matrix = js.native
  /**
    * The bounding rectangle of the item including handles.
    */
  var handleBounds: Rectangle = js.native
  /**
    * The unique id of the item.
    * Read Only.
    */
  val id: Double = js.native
  /**
    * The index of this item within the list of its parent's children.
    * Read only.
    */
  val index: Double = js.native
  /**
    * The last item contained within this item.This is a shortcut for accessing item.children[item.children.length - 1].
    */
  val lastChild: Item = js.native
  /**
    * The layer that this item is contained within.
    * Read Only.
    */
  val layer: Layer = js.native
  /**
    * Specifies whether the item is locked. When set to true, item interactions with the mouse are disabled.
    */
  var locked: Boolean = js.native
  /**
    * The item's transformation matrix, defining position and dimensions in relation to its parent item in which it is contained.
    */
  var matrix: Matrix = js.native
  /**
    * When two line segments meet at a sharp angle and miter joins have been specified for item.strokeJoin, it is possible for the miter to extend far beyond the item.strokeWidth of the path. The miterLimit imposes a limit on the ratio of the miter length to the item.strokeWidth.
    */
  var miterLimit: Double = js.native
  /**
    * The name of the item. If the item has a name, it can be accessed by name through its parent's children list.
    */
  var name: String = js.native
  /**
    * The next item on the same level as this item.
    * Read Only.
    */
  val nextSibling: Item = js.native
  /**
    * The normal vector to the #curve at the given location.
    */
  var normal: Point = js.native
  /**
    * The opacity of the item as a value between 0 and 1.
    */
  var opacity: Double = js.native
  /**
    * The item that this item is contained within.
    */
  var parent: Item = js.native
  /**
    * The item's pivot point specified in the item coordinate system, defining the point around which all transformations are hinging. This is also the reference point for position. By default, it is set to null, meaning the rectangle.center of the item's bounds rectangle is used as pivot.
    */
  var pivot: Point = js.native
  /**
    * The item's position within the parent item's coordinate system. By default, this is the rectangle.center of the item's bounds rectangle.
    */
  var position: Point = js.native
  /**
    * The previous item on the same level as this item.
    * Read Only.
    */
  val previousSibling: Item = js.native
  /**
    * The project that this item belongs to.
    * Read only.
    */
  val project: Project = js.native
  /**
    * The current rotation angle of the item, as described by its matrix.
    */
  var rotation: Double = js.native
  /**
    * The current scale factor of the item, as described by its matrix.
    */
  var scaling: Point = js.native
  /**
    * Specifies whether the item is selected. This will also return true for Group items if they are partially selected, e.g. groups containing selected or partially selected paths.
    * Paper.js draws the visual outlines of selected items on top of your project. This can be useful for debugging, as it allows you to see the construction of paths, position of path curves, individual segment points and bounding boxes of symbol and raster items.
    */
  var selected: Boolean = js.native
  /**
    * The color the item is highlighted with when selected. If the item does not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | String = js.native
  /**
    * The shadow’s blur radius.
    * Default - 0
    */
  var shadowBlur: Double = js.native
  /**
    * The shadow color.
    */
  var shadowColor: Color | String | Null = js.native
  /**
    * The shadow’s offset.
    * Default - 0
    */
  var shadowOffset: Double | js.Array[Double] | Anon_X | Point = js.native
  /**
    * The bounding rectangle of the item including stroke width.
    */
  var strokeBounds: Rectangle = js.native
  /**
    * The shape to be used at the beginning and end of open Path items, when they have a stroke.
    * String('round', 'square', 'butt')
    */
  var strokeCap: String = js.native
  /**
    * The color of the stroke.
    */
  var strokeColor: Color | String | Null = js.native
  /**
    * The shape to be used at the segments and corners of Path items when they have a stroke.
    * String('miter', 'round', 'bevel')
    */
  var strokeJoin: String = js.native
  /**
    * Specifies whether the stroke is to be drawn taking the current affine transformation into account (the default behavior), or whether it should appear as a non-scaling stroke.
    */
  var strokeScaling: Boolean = js.native
  /**
    * The width of the stroke.
    */
  var strokeWidth: Double = js.native
  /**
    * The path style of the item.
    */
  var style: Partial[Style] = js.native
  /**
    * The tangential vector to the #curve at the given location.
    */
  var tangent: Point = js.native
  /**
    * The view that this item belongs to.
    * Read Only.
    */
  val view: View = js.native
  /**
    * The item’s global matrix in relation to the view coordinate space. This means that the view’s transformations resulting from zooming and panning are factored in.
    */
  val viewMatrix: Matrix = js.native
  /**
    * Specifies whether the item is visible. When set to false, the item won't be drawn.
    */
  var visible: Boolean = js.native
  /**
    * The winding-rule with which the shape gets filled. Please note that only modern browsers support winding-rules other than 'nonzero'.
    * String('nonzero', 'evenodd')
    */
  var windingRule: String = js.native
  /**
    * Adds the specified item as a child of this item at the end of the its children list. You can use this function for groups, compound paths and layers.
    * @param item - the item to add as a child
    */
  def addChild(item: Item): Item = js.native
  /**
    * Adds the specified items as children of this item at the end of the its children list. You can use this function for groups, compound paths and layers.
    * @param items - The items to be added as children
    */
  def addChildren(items: js.Array[Item]): js.Array[Item] = js.native
  def addTo(owner: CompoundPath): Item = js.native
  def addTo(owner: Group): Item = js.native
  def addTo(owner: Layer): Item = js.native
  /**
    * Adds it to the specified owner, which can be either a Item or a Project.
    * @param owner - the item or project to add the item to
    */
  def addTo(owner: Project): Item = js.native
  /**
    * Inserts the specified item as a child of this item by appending it to the list of children and moving it below all other children. You can use this function for groups, compound paths and layers.
    * @param item - the item to be appended as a child
    */
  def appendBelow(item: Item): Item = js.native
  /**
    * Inserts the specified item as a child of this item by appending it to the list of children and moving it above all other children. You can use this function for groups, compound paths and layers.
    * @param item - the item to be appended as a child
    */
  def appendTop(item: Item): Item = js.native
  /**
    * Brings this item to the front of all other items within the same parent.
    */
  def bringToFront(): Unit = js.native
  def clone(options: Anon_Deep): Item = js.native
  /**
    * Checks whether the item's geometry contains the given point.
    * @param point - The point to check for.
    */
  def contains(point: Point): Boolean = js.native
  /**
    * Copies all attributes of the specified item over to this item. This includes its style, visibility, matrix, pivot, blend-mode, opacity, selection state, data, name, etc.
    * @param source - the item to copy the attributes from
    * @param excludeMatrix - whether to exclude the transformation matrix when copying all attributes
    */
  def copyAttributes(source: Item, excludeMatrix: Boolean): Unit = js.native
  /**
    * Copies the content of the specified item over to this item.
    * @param source - the item to copy the content from
    */
  def copyContent(source: Item): Unit = js.native
  def copyTo(owner: CompoundPath): Item = js.native
  def copyTo(owner: Group): Item = js.native
  def copyTo(owner: Layer): Item = js.native
  /**
    * Clones the item and adds it to the specified owner, which can be either a Item or a Project.
    * @param owner - the item or project to copy the item to
    */
  def copyTo(owner: Project): Item = js.native
  /**
    * Emit an event on the tool.
    * @param type - the type of event: ‘frame’, mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param event - an object literal containing properties describing the event.
    */
  def emit(`type`: String, event: js.Any): Boolean = js.native
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
  /**
    * Transform the item so that its bounds fit within the specified rectangle, without changing its aspect ratio.
    * @param rectangle -
    * @param fill [optiona;] - default = false
    */
  def fitBounds(rectangle: Rectangle): Unit = js.native
  def fitBounds(rectangle: Rectangle, fill: Boolean): Unit = js.native
  def getFillColor(): Color = js.native
  /**
    * Fetch the first descendant (child or child of child) of this item that matches the properties in the specified object.
    * Extended matching is possible by providing a compare function or regular expression. Matching points, colors only work as a comparison of the full object, not partial matching (e.g. only providing the x- coordinate to match all points with that x-value). Partial matching does work for item.data.
    * @param match - the criteria to match against
    */
  def getItem(`match`: js.Any): Item = js.native
  /**
    * Fetch the descendants (children or children of children) of this item that match the properties in the specified object.
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
    * Gets the current rotation of the item.
    */
  def getRotation(): Double = js.native
  def getSelectedColor(): Color = js.native
  def getShadowColor(): Color = js.native
  def getStrokeColor(): Color = js.native
  def getStyle(): Style = js.native
  /**
    * Converts the specified point from global project coordinate space to the item's own local coordinate space.
    * @param point - the point to be transformed
    */
  def globalToLocal(point: Point): Point = js.native
  /**
    * Checks if the item contains any children items.
    */
  def hasChildren(): Boolean = js.native
  /**
    * Checks whether the item has a fill.
    */
  def hasFill(): Boolean = js.native
  /**
    * Checks whether the item has a shadow.
    */
  def hasShadow(): Boolean = js.native
  /**
    * Checks whether the item has a stroke.
    */
  def hasStroke(): Boolean = js.native
  /**
    * Performs a hit-test on the item and its children (if it is a Group or Layer) at the location of the specified point, returning the first found hit.
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
  def importSVG(svg: String, onLoad: js.Function2[/* item */ this.type, /* svg */ String, Unit]): Item = js.native
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
  def importSVG(svg: SVGElement, onLoad: js.Function2[/* item */ this.type, /* svg */ String, Unit]): Item = js.native
  def importSVG(svg: SVGElement, options: Anon_ApplyMatrix): Item = js.native
  /**
    * Inserts this item above the specified item.
    * @param item - the item above which it should be inserted
    */
  def insertAbove(item: Item): Item = js.native
  /**
    * Inserts this item below the specified item.
    * @param item - the item below which it should be inserted
    */
  def insertBelow(item: Item): Item = js.native
  /**
    * Inserts the specified item as a child of this item at the specified index in its children list. You can use this function for groups, compound paths and layers.
    * @param index - the index
    * @param item - the item to be inserted as a child
    */
  def insertChild(index: Double, item: Item): Item = js.native
  /**
    * Inserts the specified items as children of this item at the specified index in its children list. You can use this function for groups, compound paths and layers.
    * @param index -
    * @param items - The items to be appended as children
    */
  def insertChildren(index: Double, items: js.Array[Item]): js.Array[Item] = js.native
  /**
    *
    * @param item - the item to check against
    */
  def intersects(item: Item): Boolean = js.native
  /**
    * Checks if this item is above the specified item in the stacking order of the project.
    * @param item - The item to check against
    */
  def isAbove(item: Item): Boolean = js.native
  /**
    * Checks if the item is an ancestor of the specified item.
    * @param item - the item to check against
    */
  def isAncestor(item: Item): Boolean = js.native
  /**
    * Checks if the item is below the specified item in the stacking order of the project.
    * @param item - The item to check against
    */
  def isBelow(item: Item): Boolean = js.native
  /**
    * Checks whether the specified item is a child of the item.
    * @param item - The item to check against
    */
  def isChild(item: Item): Boolean = js.native
  /**
    * Checks if the item is contained within the specified item.
    * @param item - The item to check against
    */
  def isDescendant(item: Item): Boolean = js.native
  /**
    * Specifies whether the item has any content or not. The meaning of what content is differs from type to type. For example, a Group with no children, a TextItem with no text content and a Path with no segments all are considered empty.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Checks whether the item is grouped with the specified item.
    * @param item -
    */
  def isGroupedWith(item: Item): Boolean = js.native
  /**
    * Checks whether the item and all its parents are inserted into the DOM or not.
    */
  def isInserted(): Boolean = js.native
  /**
    *
    * @param rect - the rectangle to check against
    */
  def isInside(rect: Rectangle): Boolean = js.native
  /**
    * Checks whether the specified item is the parent of the item.
    * @param item - The item to check against
    */
  def isParent(item: Item): Boolean = js.native
  /**
    * Converts the specified point from the item's own local coordinate space to the global project coordinate space.
    * @param point - the point to be transformed
    */
  def localToGlobal(point: Point): Point = js.native
  /**
    * Converts the specified point from the item's own local coordinate space to the parent's coordinate space.
    * @param point - the point to be transformed
    */
  def localToParent(point: Point): Point = js.native
  /**
    * Checks whether the item matches the criteria described by the given object, by iterating over all of its properties and matching against their values through matches(name, compare).
    * See project.getItems(match) for a selection of illustrated examples.
    * @param match - the criteria to match against.
    */
  def matches(`match`: js.Any): Boolean = js.native
  /**
    * Checks whether the item matches the given criteria. Extended matching is possible by providing a compare function or a regular expression.
    * Matching points, colors only work as a comparison of the full object, not partial matching (e.g. only providing the x-coordinate to match all points with that x-value). Partial matching does work for item.data.
    * @param name - the name of the state to match against.
    * @param compare - the value, function or regular expression to compare against.
    */
  def matches(name: String, compare: js.Any): Boolean = js.native
  /**
    * Moves this item above the specified item. Returns true if the item
    * was moved.
    * @param item - the item above which it should be moved
    */
  def moveAbove(item: Item): Boolean = js.native
  /**
    * Moves this item below the specified item. Returns true if the item
    * was moved.
    * @param item - the item below which it should be moved
    */
  def moveBelow(item: Item): Boolean = js.native
  /**
    * Detach one or more event handlers from the tool.
    * @param object - an object containing one or more of the following properties: frame, mousedown, mouseup, mousedrag, click, doubleclick, mousemove, mouseenter, mouseleave
    */
  def off(`object`: Anon_Click): Item = js.native
  /**
    * Detach one or more event handlers to the item.
    * @param param - an object containing one or more of the following properties: frame, mousedown, mouseup, mousedrag, click, doubleclick, mousemove, mouseenter, mouseleave
    */
  def off(param: js.Any): Item = js.native
  /**
    * Detach an event handler from the item.
    * @param type - the type of event: ‘frame’, mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param function - The function to be detached
    */
  def off(
    `type`: String,
    callback: js.Function1[Event | (/* event */ IFrameEvent) | MouseEvent, Boolean | Unit]
  ): Item = js.native
  /**
    * Attach one or more event handlers to the item.
    * @param object - an object containing one or more of the following properties: frame, mousedown, mouseup, mousedrag, click, doubleclick, mousemove, mouseenter, mouseleave
    */
  def on(`object`: Anon_Click): Item = js.native
  /**
    * Attaches one or more event handlers to the item.
    * @param param - an object containing one or more of the following properties: frame, mousedown, mouseup, mousedrag, click, doubleclick, mousemove, mouseenter, mouseleave
    */
  def on(param: js.Any): Item = js.native
  /**
    * Attach an event handler to the item.
    * @param type - the type of event: ‘frame’, mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    * @param callback - The function to be called when the event occurs
    */
  //I cannot use function: Function as it is a reserved keyword
  /**
    * Attaches an event handler to the item.
    * @param type - String('mousedown'|'mouseup'|'mousedrag'|'mousemove'|'keydown'|'keyup') the event type
    * @param function - The function to be called when the event occurs
    */
  def on(
    `type`: String,
    callback: js.Function1[Event | (/* event */ IFrameEvent) | MouseEvent, Boolean | Unit]
  ): Item = js.native
  /**
    * The function to be called when the mouse clicks on the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onClick(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse double clicks on the item. The function receives a MouseEvent object which contains information about the mouse event.         *
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onDoubleClick(event: MouseEvent): Unit | Boolean = js.native
  /**
    * Item level handler function to be called on each frame of an animation.
    * The function receives an event object which contains information about the frame event:
    */
  def onFrame(event: IFrameEvent): Unit = js.native
  /**
    * The function to be called when the mouse button is pushed down on the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseDown(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse position changes while the mouse is being dragged. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseDrag(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse moves over the item. This function will only be called again, once the mouse moved outside of the item first. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseEnter(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse moves out of the item.
    * The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseLeave(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called repeatedly when the mouse moves on top of the item. The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseMove(event: MouseEvent): Unit | Boolean = js.native
  /**
    * The function to be called when the mouse button is released over the item.
    * The function receives a MouseEvent object which contains information about the mouse event.
    * Note that such mouse events bubble up the scene graph hierarchy and will reach the view, unless they are stopped with event.stopPropagation() or by returning false from the handler.
    */
  def onMouseUp(event: MouseEvent): Unit | Boolean = js.native
  /**
    * Converts the specified point from the parent's coordinate space to item's own local coordinate space.
    * @param point - the point to be transformed
    */
  def parentToLocal(point: Point): Point = js.native
  /**
    * Rasterizes the item into a newly created Raster object. The item itself is not removed after rasterization.
    * @param resolution [optional] - the resolution of the raster in pixels per inch (DPI). If not specified, the value of view.resolution is used. default: view.resolution
    * @param insert [optional] - specifies whether the raster should be inserted into the scene graph. When set to true, it is inserted above the original — default: true
    */
  def rasterize(): Raster = js.native
  def rasterize(resolution: Double): Raster = js.native
  def rasterize(resolution: Double, insert: Boolean): Raster = js.native
  /**
    * If this is a group, layer or compound-path with only one child-item, the child-item is moved outside and the parent is erased. Otherwise, the item itself is returned unmodified.
    * @param options [optional]
    */
  def reduce(): Item = js.native
  def reduce(options: js.Any): Item = js.native
  /**
    * Removes the item and all its children from the project. The item is not destroyed and can be inserted again after removal.
    */
  def remove(): Boolean = js.native
  /**
    * Removes all of the item's children (if any).
    */
  def removeChildren(): js.Array[Item] = js.native
  /**
    * Removes the children from the specified from index to the to index from the parent's children array.
    * @param start - the beginning index, inclusive
    * @param end [optional] - the ending index, exclusive, default: children.length
    */
  def removeChildren(start: Double): js.Array[Item] = js.native
  def removeChildren(start: Double, end: Double): js.Array[Item] = js.native
  /**
    * Removes the item when the events specified in the passed object literal occur.
    * @param options - The object literal can contain the following values
    * @param options.move - Remove the item when the next tool.onMouseMove event is fired
    * @param options.drag - Remove the item when the next tool.onMouseDrag event is fired
    * @param options.down - Remove the item when the next tool.onMouseDown event is fired
    * @param options.up - Remove the item when the next tool.onMouseUp event is fired
    */
  def removeOn(options: Anon_Down): Unit = js.native
  /**
    * Removes the item when the next tool.onMouseDown event is fired.
    */
  def removeOnDown(): Unit = js.native
  /**
    * Removes the item when the next tool.onMouseDrag event is fired.
    */
  def removeOnDrag(): Unit = js.native
  /**
    * Removes the item when the next tool.onMouseMove event is fired.
    */
  def removeOnMove(): Unit = js.native
  /**
    * Removes the item when the next tool.onMouseUp event is fired.
    */
  def removeOnUp(): Unit = js.native
  /**
    * Replaces this item with the provided new item which will takes its place in the project hierarchy instead.
    * @param item - the item to replace this one with
    */
  def replaceWith(item: Item): Boolean = js.native
  /**
    * Check if the tool has one or more event handlers of the specified type.
    * @param type - the type of event: ‘frame’, mousedown’, ‘mouseup’, ‘mousedrag’, ‘click’, ‘doubleclick’, ‘mousemove’, ‘mouseenter’, ‘mouseleave’
    */
  def responds(`type`: String): Boolean = js.native
  /**
    * Reverses the order of the item's children
    */
  def reverseChildren(): Unit = js.native
  /**
    * Rotates the item by a given angle around the given point.
    * Angles are oriented clockwise and measured in degrees.
    * @param angle - the rotation angle
    * @param center [optional] - default: item.position
    */
  def rotate(angle: Double): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  /**
    * Scales the item by the given values from its center point, or optionally from a supplied point.
    * @param hor - the horizontal scale factor
    * @param ver - the vertical scale factor
    * @param center [optional] - default: item.position
    */
  def scale(hor: Double, ver: Double): Unit = js.native
  def scale(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Scales the item by the given value from its center point, or optionally from a supplied point.
    * @param scale - the scale factor
    * @param center [optional] - default: item.position
    */
  def scale(scale: Double): Unit = js.native
  def scale(scale: Double, center: Point): Unit = js.native
  /**
    * Sends this item to the back of all other items within the same parent.
    */
  def sendToBack(): Unit = js.native
  /**
    * Sets those properties of the passed object literal on this item to the values defined in the object literal, if the item has property of the given name (or a setter defined for it).
    */
  def set(props: js.Any): Item = js.native
  def setFillColor(): Unit = js.native
  def setFillColor(value: String): Unit = js.native
  def setFillColor(value: Color): Unit = js.native
  def setSelectedColor(value: String): Unit = js.native
  def setSelectedColor(value: Color): Unit = js.native
  def setShadowColor(): Unit = js.native
  def setShadowColor(value: String): Unit = js.native
  def setShadowColor(value: Color): Unit = js.native
  def setStrokeColor(): Unit = js.native
  def setStrokeColor(value: String): Unit = js.native
  def setStrokeColor(value: Color): Unit = js.native
  def setStyle(value: Partial[Style]): Unit = js.native
  /**
    * Shears the item by the given values from its center point, or optionally by a supplied point.
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    * @param center [optional] - default: item.position
    */
  def shear(hor: Double, ver: Double): Unit = js.native
  def shear(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Shears the item by the given value from its center point, or optionally by a supplied point.
    * @param shear - the horziontal and vertical shear factors as a point
    * @param center [optional] - default: item.position
    */
  def shear(shear: Double): Unit = js.native
  def shear(shear: Double, center: Point): Unit = js.native
  /**
    * Skews the item by the given angles from its center point, or optionally by a supplied point.
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical sskew angle in degrees
    * @param center [optional] - default: item.position
    */
  def skew(hor: Double, ver: Double): Unit = js.native
  def skew(hor: Double, ver: Double, center: Point): Unit = js.native
  /**
    * Skews the item by the given angles from its center point, or optionally by a supplied point.
    * @param skew - the horziontal and vertical skew angles in degrees
    * @param center [optional] - default: item.position
    */
  def skew(skew: Point): Unit = js.native
  def skew(skew: Point, center: Point): Unit = js.native
  /**
    * Transform the item.
    * @param matrix - the matrix by which the item shall be transformed.
    */
  def transform(matrix: Matrix): Unit = js.native
  /**
    * Translates (moves) the item by the given offset point.
    * @param delta - the offset to translate the item by
    */
  def translate(delta: Point): Point = js.native
}

