package typings.oracledb.mod

import typings.oracledb.anon.TypeClass
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
  * @since 4.0
  */
@js.native
trait BaseDBObject[T] extends StObject {
  
  /**
    * Add the given value to the end of the collection.
    */
  def append(value: T): Unit = js.native
  
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes. 
    */
  var attributes: Record[String, TypeClass[T]] = js.native
  
  /**
    * Deletes the value from collection at the given index.
    */
  def deleteElement(index: Double): Unit = js.native
  
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double = js.native
  
  val elementTypeClass: DBObjectClass[T] = js.native
  
  /** When dbObject.isCollection is true, this will have the name of the element type, such as “VARCHAR2” or “NUMBER”. */
  val elementTypeName: String = js.native
  
  /** The fully qualified name of the Oracle Database object or collection. */
  val fqn: String = js.native
  
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
  
  /** True if the object is a collection, false otherwise. */
  val isCollection: Boolean = js.native
  
  /** When dbObject.isCollection is true, this will have the number of elements in the collection. It is undefined for non-collections. */
  val length: js.UndefOr[Double] = js.native
  
  /** Name of the Oracle Database object or collection. */
  val name: String = js.native
  
  /** Schema owning the Oracle Database object or collection. */
  val schema: String = js.native
  
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
  implicit class BaseDBObjectMutableBuilder[Self <: BaseDBObject[_], T] (val x: Self with BaseDBObject[T]) extends AnyVal {
    
    @scala.inline
    def setAppend(value: T => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributes(value: Record[String, TypeClass[T]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteElement(value: Double => Unit): Self = StObject.set(x, "deleteElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementType(value: Double): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeClass(value: DBObjectClass[T]): Self = StObject.set(x, "elementTypeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypeName(value: String): Self = StObject.set(x, "elementTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFqn(value: String): Self = StObject.set(x, "fqn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElement(value: Double => js.Any): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFirstIndex(value: () => Double): Self = StObject.set(x, "getFirstIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeys(value: () => js.Array[Double | (/* keyof T */ String)]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastIndex(value: () => Double): Self = StObject.set(x, "getLastIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextIndex(value: () => Double): Self = StObject.set(x, "getNextIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrevIndex(value: () => Double): Self = StObject.set(x, "getPrevIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValues(value: () => js.Array[T]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasElement(value: () => Boolean): Self = StObject.set(x, "hasElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetElement(value: (Double, T) => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrim(value: Double => Unit): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
  }
}
