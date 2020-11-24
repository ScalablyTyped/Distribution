package typings.moxios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracker extends js.Object {
  
  /**
    * Get an item being tracked at a given index
    *
    * @param index The index for the item to retrieve
    */
  def at(index: Double): Request = js.native
  
  /**
    * The count of items being tracked
    */
  def count(): Double = js.native
  
  /**
    * Dump the items being tracked to the console.
    */
  def debug(): Unit = js.native
  
  /**
    * Get the first item being tracked
    */
  def first(): Request = js.native
  
  /**
    * Find and return element given the HTTP method and the URL.
    */
  def get(method: String): Request = js.native
  def get(method: String, url: String): Request = js.native
  
  /**
    * Get the most recent (last) item being tracked
    */
  def mostRecent(): Request = js.native
  
  /**
    * Stop an element from being tracked by removing it. Finds and returns the element,
    * given the HTTP method and the URL.
    */
  def remove(method: String, url: String): Request = js.native
  
  /**
    * Reset all the items being tracked
    */
  def reset(): Unit = js.native
  
  /**
    * Add an item to be tracked
    *
    * @param item An item to be tracked
    */
  def track(item: Item): Unit = js.native
}
