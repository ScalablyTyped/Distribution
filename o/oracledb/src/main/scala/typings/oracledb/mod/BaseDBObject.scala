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
@js.native
trait BaseDBObject[T] extends js.Object {
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes. 
    */
  var attributes: Record[String, TypeClass[T]] = js.native
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double = js.native
  val elementTypeClass: DBObjectClass[T] = js.native
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
  def append(value: T): Unit = js.native
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
  def getKeys(): js.Array[Double | (/* keyof T */ String)] = js.native
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
  def getValues(): js.Array[T] = js.native
  /**
    * Returns true if an element exists in the collection at the given index. Returns false otherwise.
    */
  def hasElement(): Boolean = js.native
  /**
    * To set the given value at the position of the given index.
    */
  def setElement(index: Double, value: T): Unit = js.native
  /**
    * Trims the specified number of elements from the end of the collection.
    */
  def trim(count: Double): Unit = js.native
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
    trim: Double => Unit
  ): BaseDBObject[T] = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), attributes = attributes.asInstanceOf[js.Any], deleteElement = js.Any.fromFunction1(deleteElement), elementType = elementType.asInstanceOf[js.Any], elementTypeClass = elementTypeClass.asInstanceOf[js.Any], elementTypeName = elementTypeName.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], getElement = js.Any.fromFunction1(getElement), getFirstIndex = js.Any.fromFunction0(getFirstIndex), getKeys = js.Any.fromFunction0(getKeys), getLastIndex = js.Any.fromFunction0(getLastIndex), getNextIndex = js.Any.fromFunction0(getNextIndex), getPrevIndex = js.Any.fromFunction0(getPrevIndex), getValues = js.Any.fromFunction0(getValues), hasElement = js.Any.fromFunction0(hasElement), isCollection = isCollection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setElement = js.Any.fromFunction2(setElement), trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[BaseDBObject[T]]
  }
  @scala.inline
  implicit class BaseDBObjectOps[Self <: BaseDBObject[_], T] (val x: Self with BaseDBObject[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: T => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setAttributes(value: Record[String, TypeClass[T]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteElement(value: Double => Unit): Self = this.set("deleteElement", js.Any.fromFunction1(value))
    @scala.inline
    def setElementType(value: Double): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementTypeClass(value: DBObjectClass[T]): Self = this.set("elementTypeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementTypeName(value: String): Self = this.set("elementTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFqn(value: String): Self = this.set("fqn", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetElement(value: Double => js.Any): Self = this.set("getElement", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFirstIndex(value: () => Double): Self = this.set("getFirstIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKeys(value: () => js.Array[Double | (/* keyof T */ String)]): Self = this.set("getKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastIndex(value: () => Double): Self = this.set("getLastIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNextIndex(value: () => Double): Self = this.set("getNextIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPrevIndex(value: () => Double): Self = this.set("getPrevIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValues(value: () => js.Array[T]): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def setHasElement(value: () => Boolean): Self = this.set("hasElement", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCollection(value: Boolean): Self = this.set("isCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetElement(value: (Double, T) => Unit): Self = this.set("setElement", js.Any.fromFunction2(value))
    @scala.inline
    def setTrim(value: Double => Unit): Self = this.set("trim", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}

