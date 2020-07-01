package typings.oracledb.mod

import typings.oracledb.anon.TypeClass
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
  * @since 4.0
  */
trait BaseDBObject[T] extends js.Object {
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes. 
    */
  var attributes: Record[String, TypeClass[T]]
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double
  val elementTypeClass: DBObjectClass[T]
  /** When dbObject.isCollection is true, this will have the name of the element type, such as “VARCHAR2” or “NUMBER”. */
  val elementTypeName: String
  /** The fully qualified name of the Oracle Database object or collection. */
  val fqn: String
  /** True if the object is a collection, false otherwise. */
  val isCollection: Boolean
  /** When dbObject.isCollection is true, this will have the number of elements in the collection. It is undefined for non-collections. */
  val length: js.UndefOr[Double] = js.undefined
  /** Name of the Oracle Database object or collection. */
  val name: String
  /** Schema owning the Oracle Database object or collection. */
  val schema: String
  /**
    * Add the given value to the end of the collection.
    */
  def append(value: T): Unit
  /**
    * Deletes the value from collection at the given index.
    */
  def deleteElement(index: Double): Unit
  /**
    * Return the value associated with the given index.
    */
  def getElement(index: Double): js.Any
  /**
    * Returns the first index for later use to obtain the value.
    */
  def getFirstIndex(): Double
  /**
    * Returns a JavaScript array containing the ‘index’ keys.
    */
  def getKeys(): js.Array[Double | (/* keyof T */ String)]
  /**
    * To obtain the last index for later use to obtain a value.
    */
  def getLastIndex(): Double
  /**
    * Returns the next index value for later use to obtain a value.
    */
  def getNextIndex(): Double
  /**
    * Returns the previous index for later use to obtain the value.
    */
  def getPrevIndex(): Double
  /**
    * Returns an array of element values as a JavaScript array in key order.
    */
  def getValues(): js.Array[T]
  /**
    * Returns true if an element exists in the collection at the given index. Returns false otherwise.
    */
  def hasElement(): Boolean
  /**
    * To set the given value at the position of the given index.
    */
  def setElement(index: Double, value: T): Unit
  /**
    * Trims the specified number of elements from the end of the collection.
    */
  def trim(count: Double): Unit
}

object BaseDBObject {
  @scala.inline
  def apply[T](
    append: T => Unit,
    attributes: Record[String, TypeClass[T]],
    deleteElement: Double => Unit,
    elementType: Double,
    elementTypeClass: DBObjectClass[T],
    elementTypeName: String,
    fqn: String,
    getElement: Double => js.Any,
    getFirstIndex: () => Double,
    getKeys: () => js.Array[Double | (/* keyof T */ String)],
    getLastIndex: () => Double,
    getNextIndex: () => Double,
    getPrevIndex: () => Double,
    getValues: () => js.Array[T],
    hasElement: () => Boolean,
    isCollection: Boolean,
    name: String,
    schema: String,
    setElement: (Double, T) => Unit,
    trim: Double => Unit,
    length: js.UndefOr[Double] = js.undefined
  ): BaseDBObject[T] = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), attributes = attributes.asInstanceOf[js.Any], deleteElement = js.Any.fromFunction1(deleteElement), elementType = elementType.asInstanceOf[js.Any], elementTypeClass = elementTypeClass.asInstanceOf[js.Any], elementTypeName = elementTypeName.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], getElement = js.Any.fromFunction1(getElement), getFirstIndex = js.Any.fromFunction0(getFirstIndex), getKeys = js.Any.fromFunction0(getKeys), getLastIndex = js.Any.fromFunction0(getLastIndex), getNextIndex = js.Any.fromFunction0(getNextIndex), getPrevIndex = js.Any.fromFunction0(getPrevIndex), getValues = js.Any.fromFunction0(getValues), hasElement = js.Any.fromFunction0(hasElement), isCollection = isCollection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setElement = js.Any.fromFunction2(setElement), trim = js.Any.fromFunction1(trim))
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDBObject[T]]
  }
}

