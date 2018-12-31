package typings
package packeryLib.packeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("packery", "Packery")
@js.native
class Packery protected () extends js.Object {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: js.Object) = this()
  /**
    * [addItems Add item elements to the Packery instance]
    * @param {Array<Element>} elements [description]
    */
  def addItems(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [addItems Add item elements to the Packery instance]
    * @param {Element} elements [description]
    */
  def addItems(elements: stdLib.Element): scala.Unit = js.native
  /**
    * [addItems Add item elements to the Packery instance]
    * @param {NodeList} elements [description]
    */
  def addItems(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * [appended Add and lay out newly appended item elements]
    * @param {Array<Element>} elements [description]
    */
  def appended(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [appended Add and lay out newly appended item elements]
    * @param {Element} elements [description]
    */
  def appended(elements: stdLib.Element): scala.Unit = js.native
  /**
    * [appended Add and lay out newly appended item elements]
    * @param {NodeList} elements [description]
    */
  def appended(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * [bindDraggabillyEvents Bind Draggabilly events, so that the Packery instance will layout around the dragged element]
    * @param {any} draggie [description]
    */
  def bindDraggabillyEvents(draggie: js.Any): scala.Unit = js.native
  /**
    * [bindResize Binds event listener to window resize, so layout is triggered when the browser window is resized]
    */
  def bindResize(): scala.Unit = js.native
  /**
    * [bindUIDraggableEvents Bind jQuery UI Draggable events, so that the Packery instance will layout around the dragged element]
    * @param {any} elements [jQuery UI]
    */
  def bindUIDraggableEvents($element: js.Any): scala.Unit = js.native
  /**
    * [data Get the Packery instance from an element. Note this method is of Packery, rather than of a Packery instance]
    * @param  {Element} element [description]
    * @return {Packery}         [description]
    */
  def data(element: stdLib.Element): Packery = js.native
  /**
    * [destroy Removes the Packery functionality completely. This will return the element back to its pre-initialized state]
    */
  def destroy(): scala.Unit = js.native
  /**
    * [fit Fit an item element within the layout, and have other item elements laid out around it. This method is useful when expanding an element, and keeping it in its same position.]
    * @param {any}    element [description]
    * @param {number} x       [description]
    * @param {number} y       [description]
    */
  def fit(element: stdLib.Element): scala.Unit = js.native
  def fit(element: stdLib.Element, x: scala.Double): scala.Unit = js.native
  def fit(element: stdLib.Element, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * [getItem Get a Packery.Item from an element]
    * @param  {Element} element [description]
    * @return {any}             [Packery.item]
    */
  def getItem(element: stdLib.Element): js.Any = js.native
  /**
    * [getItemElements Get an array of elements used as the Packery instance's items.]
    * @return {Array<Element>}      [description]
    */
  def getItemElements(): js.Array[stdLib.Element] = js.native
  /**
    * [layout Lay out all item elements.]
    */
  def layout(): scala.Unit = js.native
  /**
    * [layoutItems Lay out specified items]
    * @param {Array<Packery.items>} items [description]
    */
  def layoutItems(items: js.Array[_]): scala.Unit = js.native
  /**
    * [off Remove an event listener]
    * @param  {string}   eventName [description]
    * @param  {Function} listener  [description]
    * @return {Packery}            [description]
    */
  def off(eventName: java.lang.String, listener: js.Function): Packery = js.native
  /**
    * [on Add an event listener for certain events]
    * @param  {string}   eventName [description]
    * @param  {Function} listener  [description]
    * @return {Packery}            [description]
    */
  def on(eventName: java.lang.String, listener: js.Function): Packery = js.native
  /**
    * [once Add an event listener for certain events, to be triggered once]
    * @param {string}   eventName [description]
    * @param {Function} listener  [description]
    */
  def once(eventName: java.lang.String, listener: js.Function): scala.Unit = js.native
  /**
    * [prepended Add and lay out newly prepended item elements at the beginning of layout]
    * @param {Array<Element>} elements [description]
    */
  def prepended(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [prepended Add and lay out newly prepended item elements at the beginning of layout]
    * @param {Element} elements [description]
    */
  def prepended(elements: stdLib.Element): scala.Unit = js.native
  /**
    * [prepended Add and lay out newly prepended item elements at the beginning of layout]
    * @param {NodeList} elements [description]
    */
  def prepended(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * [reloadItems Recollect all item elements]
    */
  def reloadItems(): scala.Unit = js.native
  /**
    * [remove Remove elements from the Packery instance, then from the DOM]
    * @param {Array<Element>} elements [description]
    */
  def remove(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [remove Remove elements from the Packery instance, then from the DOM]
    * @param {Element} elements [description]
    */
  def remove(elements: stdLib.Element): scala.Unit = js.native
  /**
    * [remove Remove elements from the Packery instance, then from the DOM]
    * @param {NodeList} elements [description]
    */
  def remove(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
    * @param {Array<Element>} elements [description]
    */
  def stamp(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
    * @param {Element} elements [description]
    */
  def stamp(elements: stdLib.Element): scala.Unit = js.native
  /**
    * [stamp Stamp the elements in the layout. Packery will lay out item elements around stamped element]
    * @param {NodeList} elements [description]
    */
  def stamp(elements: stdLib.NodeList): scala.Unit = js.native
  /**
    * [unbindResize Un-bind layout to window resize event]
    */
  def unbindResize(): scala.Unit = js.native
  /**
    * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
    * @param {Array<Element>} element [description]
    */
  def unstamp(element: js.Array[stdLib.Element]): scala.Unit = js.native
  /**
    * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
    * @param {Element} element [description]
    */
  def unstamp(element: stdLib.Element): scala.Unit = js.native
  /**
    * [unstamp Un-stamp the elements, so that Packery will no longer layout item elements around them]
    * @param {NodeList} element [description]
    */
  def unstamp(element: stdLib.NodeList): scala.Unit = js.native
}

