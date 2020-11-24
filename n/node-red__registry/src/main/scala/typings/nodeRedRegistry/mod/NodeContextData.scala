package typings.nodeRedRegistry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeContextData extends js.Object {
  
  /**
    * Get a value from context
    * @param key
    * @param storeName - store name when multiple context stores are used
    */
  def get(key: String): js.Any = js.native
  /**
    * Get a value from context asynchronously
    */
  def get(key: String, cb: js.Function2[/* err */ Error, /* value */ js.Any, Unit]): Unit = js.native
  def get(
    key: String,
    storeName: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ Error, /* value */ js.Any, Unit]
  ): Unit = js.native
  def get(key: String, storeName: String): js.Any = js.native
  /**
    * Get a value from context asynchronously, when multiple context stores are used
    */
  def get(key: String, storeName: String, cb: js.Function2[/* err */ Error, /* value */ js.Any, Unit]): Unit = js.native
  /**
    * Get multiple values from context
    * @param keys
    * @param storeName - store name when multiple context stores are used
    */
  def get(keys: js.Array[String]): js.Array[_] = js.native
  /**
    * Get multiple values from context asynchronously
    */
  def get(keys: js.Array[String], cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]): Unit = js.native
  def get(
    keys: js.Array[String],
    storeName: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]
  ): Unit = js.native
  def get(keys: js.Array[String], storeName: String): js.Array[_] = js.native
  /**
    * Get multiple values from context asynchronously, when multiple context stores are used
    */
  def get(
    keys: js.Array[String],
    storeName: String,
    cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]
  ): Unit = js.native
  
  /**
    * Returns a list of all node-scoped context property keys
    * @param storeName - store name when multiple context stores are used
    */
  def keys(): js.Array[String] = js.native
  /**
    * Returns a list of all node-scoped context property keys asynchronously
    */
  def keys(cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]): Unit = js.native
  def keys(
    storeName: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]
  ): Unit = js.native
  def keys(storeName: String): js.Array[String] = js.native
  /**
    * Returns a list of all node-scoped context property keys asynchronously, when multiple context stores are used
    */
  def keys(storeName: String, cb: js.Function2[/* err */ Error, /* value */ js.Array[_], Unit]): Unit = js.native
  
  /**
    * Set a value in context
    * @param key
    * @param value
    * @param cb - callback for async calls
    */
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def set(
    key: String,
    value: js.Any,
    storeName: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def set(key: String, value: js.Any, storeName: String): Unit = js.native
  def set(key: String, value: js.Any, storeName: String, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Set multiple values in context
    * @param keys
    * @param values
    * @param cb - callback for async calls
    */
  def set(keys: js.Array[String], values: js.Array[_]): Unit = js.native
  def set(keys: js.Array[String], values: js.Array[_], cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def set(
    keys: js.Array[String],
    values: js.Array[_],
    storeName: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def set(keys: js.Array[String], values: js.Array[_], storeName: String): Unit = js.native
  def set(
    keys: js.Array[String],
    values: js.Array[_],
    storeName: String,
    cb: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}
