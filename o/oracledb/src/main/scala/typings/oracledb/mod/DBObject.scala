package typings.oracledb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oracledb.anon.TypeClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
  * @since 4.0
  */
@JSImport("oracledb", "DBObject")
@js.native
class DBObject ()
  extends /* key */ StringDictionary[js.Any]
     with _EnqueueMessage {
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes. 
    */
  var attributes: Record[String, TypeClass] = js.native
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double = js.native
  val elementTypeClass: DBObjectClass = js.native
  /** When dbObject.isCollection is true, this will have the name of the element type, such as “VARCHAR2” or “NUMBER”. */
  val elementTypeName: String = js.native
  /** The fully qualified name of the Oracle Database object or collection. */
  val fqn: String = js.native
  /** True if the object is a collection, false otherwise. */
  val isCollection: Boolean = js.native
  /** When dbObject.isCollection is true, this will have the number of elements in the collection. It is undefined for non-collections. */
  val length: js.UndefOr[Double] = js.native
  /** Name of the Oracle Database object or collection. */
  val name: String = js.native
  /** Schema owning the Oracle Database object or collection. */
  val schema: String = js.native
  /**
    * Add the given value to the end of the collection.
    */
  def append(value: js.Any): Unit = js.native
  /**
    * Deletes the value from collection at the given index.
    */
  def deleteElement(index: Double): Unit = js.native
  /**
    * Return the value associated with the given index.
    */
  def getElement(index: Double): js.Any = js.native
  /**
    * Returns the first index for later use to obtain the value.
    */
  def getFirstIndex(): Double = js.native
  /**
    * Returns a JavaScript array containing the ‘index’ keys.
    */    
  def getKeys(): js.Array[String] = js.native
  /**
    * To obtain the last index for later use to obtain a value.
    */
  def getLastIndex(): Double = js.native
  /**
    * Returns the next index value for later use to obtain a value.
    */
  def getNextIndex(): Double = js.native
  /**
    * Returns the previous index for later use to obtain the value.
    */
  def getPrevIndex(): Double = js.native
  /**
    * Returns an array of element values as a JavaScript array in key order.
    */    
  def getValues(): js.Array[_] = js.native
  /**
    * Returns true if an element exists in the collection at the given index. Returns false otherwise.
    */
  def hasElement(): Boolean = js.native
  /**
    * To set the given value at the position of the given index.
    */
  def setElement(index: Double, value: js.Any): Unit = js.native
  /**
    * Trims the specified number of elements from the end of the collection.
    */
  def trim(count: Double): Unit = js.native
}

