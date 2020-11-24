package typings.openfin.GoldenLayout

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends EventEmitter {
  
  /**
    * Closes the container or returns false if that is not possible
    */
  def close(): Boolean = js.native
  
  /**
    * This is similar to setState, but merges the provided state into the current one, rather than overwriting it.
    * @param state A serialisable object
    */
  def extendState(state: js.Any): Unit = js.native
  
  /**
    * Returns the container's inner element as a jQuery element
    */
  def getElement(): JQuery[HTMLElement] = js.native
  
  /**
    * Returns the current state.
    */
  def getState(): js.Any = js.native
  
  /**
    * The current height of the container in pixel
    */
  var height: Double = js.native
  
  /**
    * hides the container or returns false if hiding it is not possible
    */
  def hide(): Boolean = js.native
  
  /**
    * True if the item is currently hidden
    */
  var isHidden: Boolean = js.native
  
  /*
    * A reference to the GoldenLayout instance this container belongs to
    */
  var layoutManager: typings.openfin.GoldenLayout.GoldenLayout = js.native
  
  /**
    * A reference to the component-item that controls this container
    */
  var parent: ContentItem = js.native
  
  /**
    * Sets the container to the specified size or returns false if that's not possible
    * @param width the new width in pixel
    * @param height the new height in pixel
    */
  def setSize(width: Double, height: Double): Boolean = js.native
  
  /**
    * Overwrites the components state with the provided value. To only change parts of the componentState see
    * extendState below. This is the main mechanism for saving the state of a component. This state will be the
    * value of componentState when layout.toConfig() is called and will be passed back to the component's
    * constructor function. It will also be used when the component is opened in a new window.
    * @param state A serialisable object
    */
  def setState(state: js.Any): Unit = js.native
  
  /**
    * Sets the item's title to the provided value. Triggers titleChanged and stateChanged events
    * @param title the new title
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * shows the container or returns false if showing it is not possible
    */
  def show(): Boolean = js.native
  
  /**
    * A reference to the tab that controls this container. Will initially be null
    * (and populated once a tab event has been fired).
    */
  var tab: Tab = js.native
  
  /**
    * The current title of the container
    */
  var title: String = js.native
  
  /**
    * The current width of the container in pixel
    */
  var width: Double = js.native
}
