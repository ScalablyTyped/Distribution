package typings.p5.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  /**
    *   Underlying HTML element. All normal HTML methods
    *   can be called on this.
    */
  var elt: js.Any = js.native
  /**
    *   Adds specified class to the element.
    *   @param class name of class to add
    *   @chainable
    */
  def addClass(theClass: String): Element = js.native
  /**
    *   Adds a new attribute or changes the value of an
    *   existing attribute on the specified element. If no
    *   value is specified, returns the value of the given
    *   attribute, or null if attribute is not set.
    *   @return value of attribute
    */
  def attribute(): String = js.native
  /**
    *   Adds a new attribute or changes the value of an
    *   existing attribute on the specified element. If no
    *   value is specified, returns the value of the given
    *   attribute, or null if attribute is not set.
    *   @param attr attribute to set
    *   @param value value to assign to attribute
    *   @chainable
    */
  def attribute(attr: String, value: String): Element = js.native
  /**
    *   Centers a p5 Element either vertically,
    *   horizontally, or both, relative to its parent or
    *   according to the body if the Element has no
    *   parent. If no argument is passed the Element is
    *   aligned both vertically and horizontally.
    *   @param [align] passing 'vertical', 'horizontal'
    *   aligns element accordingly
    *   @chainable
    */
  def center(): Element = js.native
  def center(align: String): Element = js.native
  /**
    *   Attaches the element as a child to the parent
    *   specified. Accepts either a string ID, DOM node,
    *   or p5.Element. If no argument is specified, an
    *   array of children DOM nodes is returned.
    *   @return an array of child nodes
    */
  def child(): js.Array[Node] = js.native
  def child(child: String): Element = js.native
  def child(child: Element): Element = js.native
  /**
    *   Attaches the element as a child to the parent
    *   specified. Accepts either a string ID, DOM node,
    *   or p5.Element. If no argument is specified, an
    *   array of children DOM nodes is returned.
    *   @param [child] the ID, DOM node, or p5.Element to
    *   add to the current element
    *   @chainable
    */
  @JSName("child")
  def child_Element(): Element = js.native
  /**
    *   Adds given class to the element. If no class
    *   argument is passed in, it instead returns a string
    *   containing the current class(es) of the element.
    *   @return the class of the element
    */
  def `class`(): String = js.native
  /**
    *   Adds given class to the element. If no class
    *   argument is passed in, it instead returns a string
    *   containing the current class(es) of the element.
    *   @param class class to add
    *   @chainable
    */
  def `class`(theClass: String): Element = js.native
  /**
    *   The .doubleClicked() function is called once after
    *   every time a mouse button is pressed twice over
    *   the element. This can be used to attach element
    *   and action specific event listeners.
    *   @param fxn function to be fired when mouse is
    *   double clicked over the element. if false is
    *   passed instead, the previously firing function
    *   will no longer fire.
    */
  def doubleClicked(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def doubleClicked(fxn: Boolean): Element = js.native
  /**
    *   The .dragLeave() function is called once after
    *   every time a dragged file leaves the element area.
    *   This can be used to attach an element specific
    *   event listener.
    *   @param fxn function to be fired when a file is
    *   dragged off the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def dragLeave(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def dragLeave(fxn: Boolean): Element = js.native
  /**
    *   The .dragOver() function is called once after
    *   every time a file is dragged over the element.
    *   This can be used to attach an element specific
    *   event listener.
    *   @param fxn function to be fired when a file is
    *   dragged over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def dragOver(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def dragOver(fxn: Boolean): Element = js.native
  /**
    *   Registers a callback that gets called every time a
    *   file that is dropped on the element has been
    *   loaded. p5 will load every dropped file into
    *   memory and pass it as a p5.File object to the
    *   callback. Multiple files dropped at the same time
    *   will result in multiple calls to the callback. You
    *   can optionally pass a second callback which will
    *   be registered to the raw drop event. The callback
    *   will thus be provided the original DragEvent.
    *   Dropping multiple files at the same time will
    *   trigger the second callback once per drop, whereas
    *   the first callback will trigger for each loaded
    *   file.
    *   @param callback callback to receive loaded file,
    *   called for each file dropped.
    *   @param [fxn] callback triggered once when files
    *   are dropped with the drop event.
    *   @chainable
    */
  def drop(callback: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def drop(callback: js.Function1[/* repeated */ js.Any, _], fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  /**
    *   Checks if specified class already set to element
    *   @param c class name of class to check
    *   @return a boolean value if element has specified
    *   class
    */
  def hasClass(c: String): Boolean = js.native
  /**
    *   Hides the current element. Essentially, setting
    *   display:none for the style.
    *   @chainable
    */
  def hide(): Element = js.native
  /**
    *   If an argument is given, sets the inner HTML of
    *   the element, replacing any existing html. If true
    *   is included as a second argument, html is appended
    *   instead of replacing existing html. If no
    *   arguments are given, returns the inner HTML of the
    *   element.
    *   @return the inner HTML of the element
    */
  def html(): String = js.native
  def html(html: String): Element = js.native
  def html(html: String, append: Boolean): Element = js.native
  /**
    *   If an argument is given, sets the inner HTML of
    *   the element, replacing any existing html. If true
    *   is included as a second argument, html is appended
    *   instead of replacing existing html. If no
    *   arguments are given, returns the inner HTML of the
    *   element.
    *   @param [html] the HTML to be placed inside the
    *   element
    *   @param [append] whether to append HTML to existing
    *   @chainable
    */
  @JSName("html")
  def html_Element(): Element = js.native
  /**
    *   Sets the ID of the element. If no ID argument is
    *   passed in, it instead returns the current ID of
    *   the element. Note that only one element can have a
    *   particular id in a page. The .class() function can
    *   be used to identify multiple elements with the
    *   same class name.
    *   @return the id of the element
    */
  def id(): String = js.native
  /**
    *   Sets the ID of the element. If no ID argument is
    *   passed in, it instead returns the current ID of
    *   the element. Note that only one element can have a
    *   particular id in a page. The .class() function can
    *   be used to identify multiple elements with the
    *   same class name.
    *   @param id ID of the element
    *   @chainable
    */
  def id(id: String): Element = js.native
  /**
    *   The .mouseClicked() function is called once after
    *   a mouse button is pressed and released over the
    *   element. Some mobile browsers may also trigger
    *   this event on a touch screen, if the user performs
    *   a quick tap. This can be used to attach element
    *   specific event listeners.
    *   @param fxn function to be fired when mouse is
    *   clicked over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def mouseClicked(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseClicked(fxn: Boolean): Element = js.native
  /**
    *   The .mouseMoved() function is called once every
    *   time a mouse moves over the element. This can be
    *   used to attach an element specific event listener.
    *   @param fxn function to be fired when a mouse moves
    *   over the element. if false is passed instead, the
    *   previously firing function will no longer fire.
    *   @chainable
    */
  def mouseMoved(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseMoved(fxn: Boolean): Element = js.native
  /**
    *   The .mouseOut() function is called once after
    *   every time a mouse moves off the element. This can
    *   be used to attach an element specific event
    *   listener.
    *   @param fxn function to be fired when a mouse moves
    *   off of an element. if false is passed instead, the
    *   previously firing function will no longer fire.
    *   @chainable
    */
  def mouseOut(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseOut(fxn: Boolean): Element = js.native
  /**
    *   The .mouseOver() function is called once after
    *   every time a mouse moves onto the element. This
    *   can be used to attach an element specific event
    *   listener.
    *   @param fxn function to be fired when a mouse moves
    *   onto the element. if false is passed instead, the
    *   previously firing function will no longer fire.
    *   @chainable
    */
  def mouseOver(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseOver(fxn: Boolean): Element = js.native
  /**
    *   The .mousePressed() function is called once after
    *   every time a mouse button is pressed over the
    *   element. Some mobile browsers may also trigger
    *   this event on a touch screen, if the user performs
    *   a quick tap. This can be used to attach element
    *   specific event listeners.
    *   @param fxn function to be fired when mouse is
    *   pressed over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def mousePressed(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mousePressed(fxn: Boolean): Element = js.native
  /**
    *   The .mouseReleased() function is called once after
    *   every time a mouse button is released over the
    *   element. Some mobile browsers may also trigger
    *   this event on a touch screen, if the user performs
    *   a quick tap. This can be used to attach element
    *   specific event listeners.
    *   @param fxn function to be fired when mouse is
    *   released over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def mouseReleased(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseReleased(fxn: Boolean): Element = js.native
  /**
    *   The .mouseWheel() function is called once after
    *   every time a mouse wheel is scrolled over the
    *   element. This can be used to attach element
    *   specific event listeners.  The function accepts a
    *   callback function as argument which will be
    *   executed when the wheel event is triggered on the
    *   element, the callback function is passed one
    *   argument event. The event.deltaY property returns
    *   negative values if the mouse wheel is rotated up
    *   or away from the user and positive in the other
    *   direction. The event.deltaX does the same as
    *   event.deltaY except it reads the horizontal wheel
    *   scroll of the mouse wheel.
    *
    *
    *   On OS X with "natural" scrolling enabled, the
    *   event.deltaY values are reversed.
    *   @param fxn function to be fired when mouse is
    *   scrolled over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def mouseWheel(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def mouseWheel(fxn: Boolean): Element = js.native
  /**
    *   Attaches the element to the parent specified. A
    *   way of setting the container for the element.
    *   Accepts either a string ID, DOM node, or
    *   p5.Element. If no arguments given, parent node is
    *   returned. For more ways to position the canvas,
    *   see the  positioning the canvas wiki page. All
    *   above examples except for the first one require
    *   the inclusion of the p5.dom library in your
    *   index.html. See the using a library section for
    *   information on how to include this library.
    */
  def parent(): Element = js.native
  /**
    *   Attaches the element to the parent specified. A
    *   way of setting the container for the element.
    *   Accepts either a string ID, DOM node, or
    *   p5.Element. If no arguments given, parent node is
    *   returned. For more ways to position the canvas,
    *   see the  positioning the canvas wiki page. All
    *   above examples except for the first one require
    *   the inclusion of the p5.dom library in your
    *   index.html. See the using a library section for
    *   information on how to include this library.
    *   @param parent the ID, DOM node, or p5.Element of
    *   desired parent element
    *   @chainable
    */
  def parent(parent: String): Element = js.native
  def parent(parent: js.Object): Element = js.native
  def parent(parent: Element): Element = js.native
  /**
    *   Sets the position of the element relative to (0,
    *   0) of the window. Essentially, sets
    *   position:absolute and left and top properties of
    *   style. If no arguments given returns the x and y
    *   position of the element in an object.
    *   @return the x and y position of the element in an
    *   object
    */
  def position(): js.Object = js.native
  def position(x: Double): Element = js.native
  def position(x: Double, y: Double): Element = js.native
  /**
    *   Sets the position of the element relative to (0,
    *   0) of the window. Essentially, sets
    *   position:absolute and left and top properties of
    *   style. If no arguments given returns the x and y
    *   position of the element in an object.
    *   @param [x] x-position relative to upper left of
    *   window
    *   @param [y] y-position relative to upper left of
    *   window
    *   @chainable
    */
  @JSName("position")
  def position_Element(): Element = js.native
  /**
    *   Removes the element and deregisters all listeners.
    */
  def remove(): Unit = js.native
  /**
    *   Removes an attribute on the specified element.
    *   @param attr attribute to remove
    *   @chainable
    */
  def removeAttribute(attr: String): Element = js.native
  /**
    *   Removes specified class from the element.
    *   @param class name of class to remove
    *   @chainable
    */
  def removeClass(theClass: String): Element = js.native
  /**
    *   Shows the current element. Essentially, setting
    *   display:block for the style.
    *   @chainable
    */
  def show(): Element = js.native
  /**
    *   Sets the width and height of the element. AUTO can
    *   be used to only adjust one dimension at a time. If
    *   no arguments are given, it returns the width and
    *   height of the element in an object. In case of
    *   elements which need to be loaded, such as images,
    *   it is recommended to call the function after the
    *   element has finished loading.
    *   @return the width and height of the element in an
    *   object
    */
  def size(): js.Object = js.native
  /**
    *   Sets the width and height of the element. AUTO can
    *   be used to only adjust one dimension at a time. If
    *   no arguments are given, it returns the width and
    *   height of the element in an object. In case of
    *   elements which need to be loaded, such as images,
    *   it is recommended to call the function after the
    *   element has finished loading.
    *   @param w width of the element, either AUTO, or a
    *   number
    *   @param [h] height of the element, either AUTO, or
    *   a number
    *   @chainable
    */
  def size(w: Double): Element = js.native
  def size(w: Double, h: Double): Element = js.native
  def size(w: Double, h: SIZE_H): Element = js.native
  def size(w: SIZE_W): Element = js.native
  def size(w: SIZE_W, h: Double): Element = js.native
  def size(w: SIZE_W, h: SIZE_H): Element = js.native
  /**
    *   Sets the given style (css) property (1st arg) of
    *   the element with the given value (2nd arg). If a
    *   single argument is given, .style() returns the
    *   value of the given property; however, if the
    *   single argument is given in css syntax
    *   ('text-align:center'), .style() sets the css
    *   appropriately.
    *   @param property property to be set
    *   @return value of property
    */
  def style(property: String): String = js.native
  /**
    *   Sets the given style (css) property (1st arg) of
    *   the element with the given value (2nd arg). If a
    *   single argument is given, .style() returns the
    *   value of the given property; however, if the
    *   single argument is given in css syntax
    *   ('text-align:center'), .style() sets the css
    *   appropriately.
    *   @param property property to be set
    *   @param value value to assign to property
    *   @chainable
    */
  def style(property: String, value: String): Element = js.native
  def style(property: String, value: Double): Element = js.native
  def style(property: String, value: Color): Element = js.native
  /**
    *   Toggles element class
    *   @param c class name to toggle
    *   @chainable
    */
  def toggleClass(c: String): Element = js.native
  /**
    *   The .touchEnded() function is called once after
    *   every time a touch is registered. This can be used
    *   to attach element specific event listeners.
    *   @param fxn function to be fired when a touch ends
    *   over the element. if false is passed instead, the
    *   previously firing function will no longer fire.
    *   @chainable
    */
  def touchEnded(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def touchEnded(fxn: Boolean): Element = js.native
  /**
    *   The .touchMoved() function is called once after
    *   every time a touch move is registered. This can be
    *   used to attach element specific event listeners.
    *   @param fxn function to be fired when a touch moves
    *   over the element. if false is passed instead, the
    *   previously firing function will no longer fire.
    *   @chainable
    */
  def touchMoved(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def touchMoved(fxn: Boolean): Element = js.native
  /**
    *   The .touchStarted() function is called once after
    *   every time a touch is registered. This can be used
    *   to attach element specific event listeners.
    *   @param fxn function to be fired when a touch
    *   starts over the element. if false is passed
    *   instead, the previously firing function will no
    *   longer fire.
    *   @chainable
    */
  def touchStarted(fxn: js.Function1[/* repeated */ js.Any, _]): Element = js.native
  def touchStarted(fxn: Boolean): Element = js.native
  /**
    *   Either returns the value of the element if no
    *   arguments given, or sets the value of the element.
    *   @return value of the element
    */
  def value(): String | Double = js.native
  /**
    *   Either returns the value of the element if no
    *   arguments given, or sets the value of the element.
    *   @chainable
    */
  def value(value: String): Element = js.native
  def value(value: Double): Element = js.native
}

