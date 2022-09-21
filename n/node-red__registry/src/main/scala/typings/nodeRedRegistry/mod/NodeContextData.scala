package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeContextData extends StObject {
  
  /**
    * Get a value from context
    * @param key
    * @param storeName - store name when multiple context stores are used
    */
  def get(key: String): Any = js.native
  /**
    * Get a value from context asynchronously
    */
  def get(key: String, cb: js.Function2[/* err */ js.Error, /* value */ Any, Unit]): Unit = js.native
  def get(key: String, storeName: String): Any = js.native
  /**
    * Get a value from context asynchronously, when multiple context stores are used
    */
  def get(key: String, storeName: String, cb: js.Function2[/* err */ js.Error, /* value */ Any, Unit]): Unit = js.native
  def get(key: String, storeName: Unit, cb: js.Function2[/* err */ js.Error, /* value */ Any, Unit]): Unit = js.native
  /**
    * Get multiple values from context
    * @param keys
    * @param storeName - store name when multiple context stores are used
    */
  def get(keys: js.Array[String]): js.Array[Any] = js.native
  /**
    * Get multiple values from context asynchronously
    */
  def get(keys: js.Array[String], cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]): Unit = js.native
  def get(keys: js.Array[String], storeName: String): js.Array[Any] = js.native
  /**
    * Get multiple values from context asynchronously, when multiple context stores are used
    */
  def get(
    keys: js.Array[String],
    storeName: String,
    cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]
  ): Unit = js.native
  def get(
    keys: js.Array[String],
    storeName: Unit,
    cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]
  ): Unit = js.native
  
  /**
    * Returns a list of all node-scoped context property keys
    * @param storeName - store name when multiple context stores are used
    */
  def keys(): js.Array[String] = js.native
  /**
    * Returns a list of all node-scoped context property keys asynchronously
    */
  def keys(cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]): Unit = js.native
  def keys(storeName: String): js.Array[String] = js.native
  /**
    * Returns a list of all node-scoped context property keys asynchronously, when multiple context stores are used
    */
  def keys(storeName: String, cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]): Unit = js.native
  def keys(storeName: Unit, cb: js.Function2[/* err */ js.Error, /* value */ js.Array[Any], Unit]): Unit = js.native
  
  /**
    * Set a value in context
    * @param key
    * @param value
    * @param cb - callback for async calls
    */
  def set(key: String, value: Any): Unit = js.native
  def set(key: String, value: Any, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def set(key: String, value: Any, storeName: String): Unit = js.native
  def set(key: String, value: Any, storeName: String, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def set(key: String, value: Any, storeName: Unit, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  /**
    * Set multiple values in context
    * @param keys
    * @param values
    * @param cb - callback for async calls
    */
  def set(keys: js.Array[String], values: js.Array[Any]): Unit = js.native
  def set(keys: js.Array[String], values: js.Array[Any], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def set(keys: js.Array[String], values: js.Array[Any], storeName: String): Unit = js.native
  def set(
    keys: js.Array[String],
    values: js.Array[Any],
    storeName: String,
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  def set(
    keys: js.Array[String],
    values: js.Array[Any],
    storeName: Unit,
    cb: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
}
