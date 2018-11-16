package typings
package moxiosLib.moxiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracker extends js.Object {
  /**
       * Get an item being tracked at a given index
       *
       * @param index The index for the item to retrieve
       */
  def at(index: scala.Double): Request = js.native
  /**
       * The count of items being tracked
       */
  def count(): scala.Double = js.native
  /**
       * Dump the items being tracked to the console.
       */
  def debug(): scala.Unit = js.native
  /**
       * Get the first item being tracked
       */
  def first(): Request = js.native
  /**
       * Find and return element given the HTTP method and the URL.
       */
  def get(method: java.lang.String): Request = js.native
  /**
       * Find and return element given the HTTP method and the URL.
       */
  def get(method: java.lang.String, url: java.lang.String): Request = js.native
  /**
       * Get the most recent (last) item being tracked
       */
  def mostRecent(): Request = js.native
  /**
       * Stop an element from being tracked by removing it. Finds and returns the element,
       * given the HTTP method and the URL.
       */
  def remove(method: java.lang.String, url: java.lang.String): Request = js.native
  /**
       * Reset all the items being tracked
       */
  def reset(): scala.Unit = js.native
  /**
       * Add an item to be tracked
       *
       * @param item An item to be tracked
       */
  def track(item: Item): scala.Unit = js.native
}

