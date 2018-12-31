package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Asynchronous, global, and persistent key-value storage that can be used by Excel Custom Functions.
  * @beta
  *
  * @remarks
  * Each add-in instance has its own storage partition, unique to a user and their device.
  *
  * The default amount of total storage allowed per add-in is 5MB.
  *
  * Each method listed below returns a Promise object.
  *
  */
@js.native
trait AsyncStorage extends js.Object {
  /**
    * @beta
    * Returns a Promise with all keys.
    */
  def getAllKeys(): js.Promise[js.Array[java.lang.String]] = js.native
  def getAllKeys(
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* keys */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * @beta
    * Retrieves an object based on a key and invokes a callback when finished. Returns a Promise.
    */
  def getItem(key: java.lang.String): js.Promise[java.lang.String] = js.native
  def getItem(
    key: java.lang.String,
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* result */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): js.Promise[java.lang.String] = js.native
  /**
    * @beta
    * Fetches a batch of keys, specified in the `keys` array. When a key doesn't exist, returns null.
    */
  def multiGet(keys: js.Array[java.lang.String]): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  def multiGet(
    keys: js.Array[java.lang.String],
    callback: js.Function2[
      /* errors */ js.UndefOr[js.Array[stdLib.Error]], 
      /* result */ js.UndefOr[js.Array[js.Array[java.lang.String]]], 
      scala.Unit
    ]
  ): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  /**
    * @beta
    * Deletes a batch of keys, specified in the `keys` array.
    */
  def multiRemove(keys: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def multiRemove(
    keys: js.Array[java.lang.String],
    callback: js.Function1[/* errors */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @beta
    * Stores multiple key-value pairs in one batch. Returns a Promise. When a key doesn't exist, returns null.
    */
  def multiSet(keyValuePairs: js.Array[js.Array[java.lang.String]]): js.Promise[scala.Unit] = js.native
  def multiSet(
    keyValuePairs: js.Array[js.Array[java.lang.String]],
    callback: js.Function1[/* errors */ js.UndefOr[js.Array[stdLib.Error]], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
    * @beta
    * Removes an item for specified key and invokes a callback when finished. Returns a Promise.
    */
  def removeItem(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeItem(key: java.lang.String, callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * @beta
    * Assigns the value for a key-value pair and invokes a callback when finished. Returns a Promise.
    */
  def setItem(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def setItem(
    key: java.lang.String,
    value: java.lang.String,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): js.Promise[scala.Unit] = js.native
}

