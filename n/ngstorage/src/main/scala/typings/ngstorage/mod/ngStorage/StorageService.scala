package typings.ngstorage.mod.ngStorage

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageService
  extends /**
  * Access to the properties of the store.
  */
/* key */ StringDictionary[js.Any] {
  @JSName("$apply")
  def $apply(): Unit = js.native
  /**
    * Adds default values to the store.
    * Copies all properties of the default items to the store.
    * If the store already has one of these properties it will skip it.
    *
    * @param items object holding the default values.
    * @return the modified storage service.
    */
  @JSName("$default")
  def $default[T](items: T): StorageService with T = js.native
  /**
    * Removes all properties from the store.
    *
    * @param items optional object holding the default values to initialize the store after reset.
    * @return the modified storage service.
    */
  @JSName("$reset")
  def $reset[T](): StorageService with T = js.native
  @JSName("$reset")
  def $reset[T](items: T): StorageService with T = js.native
  /**
    * @return true if the storage service is supported by the browser.
    */
  @JSName("$supported")
  def $supported(): Boolean = js.native
  @JSName("$sync")
  def $sync(): Unit = js.native
}

