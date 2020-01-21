package typings.plottable

import typings.d3Selection.mod.Selection_
import typings.plottable.componentContainerMod.ComponentContainer
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.interfacesMod.SpaceRequest
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class Component () extends js.Object {
    /**
      * Place more objects just behind this Component's Content by appending them to the _backgroundContainer.
      */
    var _backgroundContainer: js.Any = js.native
    /**
      * Container for the visual content that this Component displays. Subclasses should attach
      * elements onto the _content. Located in between the background and the foreground.
      */
    var _content: js.Any = js.native
    var _cssClasses: js.Any = js.native
    /**
      * If .destroy() has been called on this Component.
      */
    var _destroyed: js.Any = js.native
    /**
      * Holds all the DOM associated with this component. A direct child of the element we're
      * anchored to.
      */
    var _element: js.Any = js.native
    /**
      * Place more objects just in front of this Component's Content by appending them to the _foregroundContainer.
      */
    var _foregroundContainer: js.Any = js.native
    /**
      * height of the Component as computed in computeLayout. Used to size the hitbox, bounding box, etc
      */
    var _height: js.Any = js.native
    var _isAnchored: Boolean = js.native
    var _isSetup: Boolean = js.native
    var _onAnchorCallbacks: js.Any = js.native
    var _onDetachCallbacks: js.Any = js.native
    /**
      * Origin of this Component relative to its parent.
      */
    var _origin: js.Any = js.native
    /**
      * Subclasses should set this to true in their constructor to prevent content from overflowing.
      */
    var _overflowHidden: Boolean = js.native
    /**
      * The ComponentContainer that holds this Component in its children, or null, if this
      * Component is top-level.
      */
    var _parent: js.Any = js.native
    var _resizeHandler: js.Any = js.native
    /**
      * If we're the root Component (top-level), this is the HTMLElement we've anchored to (user-supplied).
      */
    var _rootElement: js.Any = js.native
    /**
      * width of the Component as computed in computeLayout. Used to size the hitbox, bounding box, etc
      */
    var _width: js.Any = js.native
    var _xAlignment: js.Any = js.native
    var _yAlignment: js.Any = js.native
    /* private */ def _scheduleComputeLayout(): js.Any = js.native
    /**
      * Creates additional elements as necessary for the Component to function.
      * Called during anchor() if the Component's element has not been created yet.
      * Override in subclasses to provide additional functionality.
      */
    /* protected */ def _setup(): Unit = js.native
    /* protected */ def _sizeFromOffer(availableWidth: Double, availableHeight: Double): AnonHeight = js.native
    /**
      * Adds a given CSS class to the Component.
      *
      * @param {string} cssClass The CSS class to add.
      * @returns {Component} The calling Component.
      */
    def addClass(cssClass: String): this.type = js.native
    /**
      * Attaches the Component as a child of a given d3 Selection.
      *
      * @param {d3.Selection} selection.
      * @returns {Component} The calling Component.
      */
    def anchor(selection: Selection_[HTMLElement, _, _, _]): this.type = js.native
    /**
      * Gets the Selection containing the <g> behind the visual elements of the Component.
      *
      * Will return undefined if the Component has not been anchored.
      *
      * @return {d3.Selection} background selection for the Component
      */
    def background(): SimpleSelection[Unit] = js.native
    /**
      * @returns {Bounds} for the component in pixel space, where the topLeft
      * represents the component's minimum x and y values and the bottomRight represents
      * the component's maximum x and y values.
      */
    def bounds(): Bounds = js.native
    /**
      * Computes and sets the size, position, and alignment of the Component from the specified values.
      * If no parameters are supplied and the Component is a root node,
      * they are inferred from the size of the Component's element.
      *
      * @param {Point} [origin] Origin of the space offered to the Component.
      * @param {number} [availableWidth] Available width in pixels.
      * @param {number} [availableHeight] Available height in pixels.
      * @returns {Component} The calling Component.
      */
    def computeLayout(): this.type = js.native
    def computeLayout(origin: Point): this.type = js.native
    def computeLayout(origin: Point, availableWidth: Double): this.type = js.native
    def computeLayout(origin: Point, availableWidth: Double, availableHeight: Double): this.type = js.native
    /**
      * Gets the SVG that holds the visual elements of the Component.
      *
      * Will return undefined if the Component has not been anchored.
      *
      * @return {d3.Selection} content selection for the Component
      */
    def content(): SimpleSelection[Unit] = js.native
    /**
      * Removes a Component from the DOM and disconnects all listeners.
      */
    def destroy(): Unit = js.native
    /**
      * Detaches a Component from the DOM. The Component can be reused.
      *
      * This should only be used if you plan on reusing the calling Component. Otherwise, use destroy().
      *
      * @returns The calling Component.
      */
    def detach(): this.type = js.native
    /**
      * Returns the HTML Element at the root of this component's DOM tree.
      */
    def element(): Selection_[HTMLElement, _, _, _] = js.native
    /**
      * Checks if the Component has a fixed height or if it grows to fill available space.
      * Returns false by default on the base Component class.
      */
    def fixedHeight(): Boolean = js.native
    /**
      * Checks if the Component has a fixed width or if it grows to fill available space.
      * Returns false by default on the base Component class.
      */
    def fixedWidth(): Boolean = js.native
    /**
      * Gets the Selection containing the <g> in front of the visual elements of the Component.
      *
      * Will return undefined if the Component has not been anchored.
      *
      * @return {d3.Selection}
      */
    def foreground(): SimpleSelection[Unit] = js.native
    /**
      * Checks if the Component has a given CSS class.
      *
      * @param {string} cssClass The CSS class to check for.
      */
    def hasClass(cssClass: String): Boolean = js.native
    /**
      * Gets the height of the Component in pixels.
      */
    def height(): Double = js.native
    /**
      * Tell this component to invalidate any caching. This function should be
      * called when a CSS change has occurred that could influence the layout
      * of the Component, such as changing the font size.
      *
      * Subclasses should override.
      */
    def invalidateCache(): Unit = js.native
    def isRoot(): Boolean = js.native
    /**
      * Removes a callback that would be called on anchoring the Component to the DOM.
      * The callback is identified by reference equality.
      *
      * @param {ComponentCallback} callback
      * @return {Component}
      */
    def offAnchor(callback: ComponentCallback): this.type = js.native
    /**
      * Removes a callback to be called when the Component is detach()-ed.
      * The callback is identified by reference equality.
      *
      * @param {ComponentCallback} callback
      * @return {Component} The calling Component.
      */
    def offDetach(callback: ComponentCallback): this.type = js.native
    /**
      * Adds a callback to be called on anchoring the Component to the DOM.
      * If the Component is already anchored, the callback is called immediately.
      *
      * @param {ComponentCallback} callback
      * @return {Component}
      */
    def onAnchor(callback: ComponentCallback): this.type = js.native
    /**
      * Adds a callback to be called when the Component is detach()-ed.
      *
      * @param {ComponentCallback} callback
      * @return {Component} The calling Component.
      */
    def onDetach(callback: ComponentCallback): this.type = js.native
    /**
      * Sets a callback that gets called when the component resizes. The size change
      * is not guaranteed to be reflected by the DOM at the time the callback is fired.
      *
      * @param {IResizeHandler} [resizeHandler] Callback to be called when component resizes
      */
    def onResize(resizeHandler: IResizeHandler): this.type = js.native
    /**
      * Gets the origin of the Component relative to its parent.
      *
      * @return {Point}
      */
    def origin(): Point = js.native
    /**
      * Gets the origin of the Component relative to the root Component.
      *
      * @return {Point}
      */
    def originToRoot(): Point = js.native
    /**
      * Gets the parent ComponentContainer for this Component.
      */
    def parent(): ComponentContainer = js.native
    /**
      * Sets the parent ComponentContainer for this Component.
      * An error will be thrown if the parent does not contain this Component.
      * Adding a Component to a ComponentContainer should be done
      * using the appropriate method on the ComponentContainer.
      */
    def parent(parent: ComponentContainer): this.type = js.native
    /**
      * Causes the Component to re-layout and render.
      *
      * @returns {Component} The calling Component.
      */
    def redraw(): this.type = js.native
    /**
      * Removes a given CSS class from the Component.
      *
      * @param {string} cssClass The CSS class to remove.
      * @returns {Component} The calling Component.
      */
    def removeClass(cssClass: String): this.type = js.native
    /**
      * Queues the Component for rendering.
      *
      * @returns {Component} The calling Component.
      */
    def render(): this.type = js.native
    /**
      * Renders the Component without waiting for the next frame. This method is a no-op on
      * Component, Table, and Group; render them immediately with .renderTo() instead.
      */
    def renderImmediately(): this.type = js.native
    def renderLowPriority(): this.type = js.native
    /**
      * Renders the Component to a given HTML Element.
      *
      * @param {String|d3.Selection} element The element, a selector string for the element, or a d3.Selection for the element.
      * @returns {Component} The calling Component.
      */
    def renderTo(element: String): this.type = js.native
    def renderTo(element: Selection_[HTMLElement, _, _, _]): this.type = js.native
    def renderTo(element: HTMLElement): this.type = js.native
    /**
      * Given available space in pixels, returns the minimum width and height this Component will need.
      *
      * @param {number} availableWidth
      * @param {number} availableHeight
      * @returns {SpaceRequest}
      */
    def requestedSpace(availableWidth: Double, availableHeight: Double): SpaceRequest = js.native
    /**
      * Gets the root component of the hierarchy. If the provided
      * component is the root, that component will be returned.
      */
    def root(): Component = js.native
    /**
      * Returns the top-level user supplied element that roots the tree that this Component lives in.
      */
    def rootElement(): SimpleSelection[Unit] = js.native
    /**
      * Directly sets component size and, optionally, its origin.
      *
      * Preferably, layout is accomplished by placing components in a table.
      * However, if you need to directly override the component size, you may call
      * this method.
      *
      * Note that this method styles the anchored element, so this is usually only
      * useful after the component has been anchored. If the component has not been
      * anchored to an element, the internal properties will be set but no styles
      * will be applied.
      *
      * @param {number} [width] width in pixels
      * @param {number} [height] height in pixels
      * @param {number} [originX] left offset in pixels
      * @param {number} [originY] top offset in pixels
      */
    def setBounds(width: Double, height: Double): this.type = js.native
    def setBounds(width: Double, height: Double, originX: Double): this.type = js.native
    def setBounds(width: Double, height: Double, originX: Double, originY: Double): this.type = js.native
    /**
      * Gets the width of the Component in pixels.
      */
    def width(): Double = js.native
    /**
      * Gets the x alignment of the Component.
      */
    def xAlignment(): XAlignment = js.native
    /**
      * Sets the x alignment of the Component.
      *
      * @param {string} xAlignment The x alignment of the Component ("left"/"center"/"right").
      * @returns {Component} The calling Component.
      */
    def xAlignment(xAlignment: XAlignment): this.type = js.native
    /**
      * Gets the y alignment of the Component.
      */
    def yAlignment(): YAlignment = js.native
    /**
      * Sets the y alignment of the Component.
      *
      * @param {string} yAlignment The y alignment of the Component ("top"/"center"/"bottom").
      * @returns {Component} The calling Component.
      */
    def yAlignment(yAlignment: YAlignment): this.type = js.native
  }
  
  /* static members */
  @js.native
  object Component extends js.Object {
    var _xAlignToProportion: js.Any = js.native
    var _yAlignToProportion: js.Any = js.native
  }
  
  @js.native
  object XAlignment extends js.Object {
    var center: typings.plottable.plottableStrings.center = js.native
    var left: typings.plottable.plottableStrings.left = js.native
    var right: typings.plottable.plottableStrings.right = js.native
  }
  
  @js.native
  object YAlignment extends js.Object {
    var bottom: typings.plottable.plottableStrings.bottom = js.native
    var center: typings.plottable.plottableStrings.center = js.native
    var top: typings.plottable.plottableStrings.top = js.native
  }
  
  type ComponentCallback = js.Function1[/* component */ Component, Unit]
  type IResizeHandler = js.Function1[/* size */ AnonHeightWidth, Unit]
  type XAlignment = String
  type YAlignment = String
}

