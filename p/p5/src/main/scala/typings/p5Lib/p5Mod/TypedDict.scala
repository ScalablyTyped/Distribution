package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedDict extends js.Object {
  /**
    *   Removes all previously stored key-value pairs from
    *   the Dictionary.
    */
  def clear(): scala.Unit = js.native
  def create(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def create(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def create(key: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
    *   Creates a new key-value pair in the Dictionary.
    */
  def create(key: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    *   Creates a new key-value pair in the Dictionary.
    *   @param obj key/value pair
    */
  def create(obj: js.Object): scala.Unit = js.native
  def get(the: java.lang.String): scala.Double | java.lang.String = js.native
  /**
    *   Returns the value stored at the given key.
    *   @param the key you want to access
    *   @return the value stored at that key
    */
  def get(the: scala.Double): scala.Double | java.lang.String = js.native
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    *   Returns true if the given key exists in the
    *   Dictionary, otherwise returns false.
    *   @param key that you want to look up
    *   @return whether that key exists in Dictionary
    */
  def hasKey(key: scala.Double): scala.Boolean = js.native
  /**
    *   Logs the set of items currently stored in the
    *   Dictionary to the console.
    */
  def print(): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  /**
    *   Removes the key-value pair stored at the given key
    *   from the Dictionary.
    *   @param key for the pair to remove
    */
  def remove(key: scala.Double): scala.Unit = js.native
  /**
    *   Converts the Dictionary into a JSON file for local
    *   download.
    */
  def saveJSON(): scala.Unit = js.native
  /**
    *   Converts the Dictionary into a CSV file for local
    *   download.
    */
  def saveTable(): scala.Unit = js.native
  def set(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def set(key: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
    *   Updates the value associated with the given key in
    *   case it already exists in the Dictionary.
    *   Otherwise a new key-value pair is added.
    */
  def set(key: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
    *   Returns the number of key-value pairs currently
    *   stored in the Dictionary.
    *   @return the number of key-value pairs in the
    *   Dictionary
    */
  def size(): scala.Double = js.native
}

