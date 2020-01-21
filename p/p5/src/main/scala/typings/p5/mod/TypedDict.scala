package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedDict extends js.Object {
  /**
    *   Removes all previously stored key-value pairs from
    *   the Dictionary.
    */
  def clear(): Unit = js.native
  def create(key: String, value: String): Unit = js.native
  def create(key: String, value: Double): Unit = js.native
  def create(key: Double, value: String): Unit = js.native
  /**
    *   Creates a new key-value pair in the Dictionary.
    */
  def create(key: Double, value: Double): Unit = js.native
  /**
    *   Creates a new key-value pair in the Dictionary.
    *   @param obj key/value pair
    */
  def create(obj: js.Object): Unit = js.native
  def get(the: String): Double | String = js.native
  /**
    *   Returns the value stored at the given key.
    *   @param the key you want to access
    *   @return the value stored at that key
    */
  def get(the: Double): Double | String = js.native
  def hasKey(key: String): Boolean = js.native
  /**
    *   Returns true if the given key exists in the
    *   Dictionary, otherwise returns false.
    *   @param key that you want to look up
    *   @return whether that key exists in Dictionary
    */
  def hasKey(key: Double): Boolean = js.native
  /**
    *   Logs the set of items currently stored in the
    *   Dictionary to the console.
    */
  def print(): Unit = js.native
  def remove(key: String): Unit = js.native
  /**
    *   Removes the key-value pair stored at the given key
    *   from the Dictionary.
    *   @param key for the pair to remove
    */
  def remove(key: Double): Unit = js.native
  /**
    *   Converts the Dictionary into a JSON file for local
    *   download.
    */
  def saveJSON(): Unit = js.native
  /**
    *   Converts the Dictionary into a CSV file for local
    *   download.
    */
  def saveTable(): Unit = js.native
  def set(key: String, value: String): Unit = js.native
  def set(key: String, value: Double): Unit = js.native
  def set(key: Double, value: String): Unit = js.native
  /**
    *   Updates the value associated with the given key in
    *   case it already exists in the Dictionary.
    *   Otherwise a new key-value pair is added.
    */
  def set(key: Double, value: Double): Unit = js.native
  /**
    *   Returns the number of key-value pairs currently
    *   stored in the Dictionary.
    *   @return the number of key-value pairs in the
    *   Dictionary
    */
  def size(): Double = js.native
}

