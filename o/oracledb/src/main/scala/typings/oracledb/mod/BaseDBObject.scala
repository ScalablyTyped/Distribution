package typings.oracledb.mod

import typings.oracledb.anon.TypeClass
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
  * @since 4.0
  */
trait BaseDBObject[T] extends StObject {
  
  /**
    * Add the given value to the end of the collection.
    */
  def append(value: T): Unit
  
  /**
    * When dbObject.isCollection is false, this will be an object containing attributes corresponding to the Oracle Database object attributes.
    */
  var attributes: Record[String, TypeClass[T]]
  
  /**
    * Deletes the value from collection at the given index.
    */
  def deleteElement(index: Double): Unit
  
  /** When dbObject.isCollection is true, this will be one of the DB_TYPE constants. */
  val elementType: Double
  
  val elementTypeClass: DBObjectClass[T]
  
  /** When dbObject.isCollection is true, this will have the name of the element type, such as “VARCHAR2” or “NUMBER”. */
  val elementTypeName: String
  
  /** The fully qualified name of the Oracle Database object or collection. */
  val fqn: String
  
  /**
    * Return the value associated with the given index.
    */
  def getElement(index: Double): Any
  
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
  
  /** True if the object is a collection, false otherwise. */
  val isCollection: Boolean
  
  /** When dbObject.isCollection is true, this will have the number of elements in the collection. It is undefined for non-collections. */
  val length: js.UndefOr[Double] = js.undefined
  
  /** Name of the Oracle Database object or collection. */
  val name: String
  
  /** Schema owning the Oracle Database object or collection. */
  val schema: String
  
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
  
  inline def apply[T](
    append: T => Unit,
    attributes: Record[String, TypeClass[T]],
    deleteElement: Double => Unit,
    elementType: Double,
    elementTypeClass: DBObjectClass[T],
    elementTypeName: String,
    fqn: String,
    getElement: Double => Any,
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
  
  extension [Self <: BaseDBObject[?], T](x: Self & BaseDBObject[T]) {
    
    inline def setAppend(value: T => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: Record[String, TypeClass[T]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setDeleteElement(value: Double => Unit): Self = StObject.set(x, "deleteElement", js.Any.fromFunction1(value))
    
    inline def setElementType(value: Double): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setElementTypeClass(value: DBObjectClass[T]): Self = StObject.set(x, "elementTypeClass", value.asInstanceOf[js.Any])
    
    inline def setElementTypeName(value: String): Self = StObject.set(x, "elementTypeName", value.asInstanceOf[js.Any])
    
    inline def setFqn(value: String): Self = StObject.set(x, "fqn", value.asInstanceOf[js.Any])
    
    inline def setGetElement(value: Double => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    inline def setGetFirstIndex(value: () => Double): Self = StObject.set(x, "getFirstIndex", js.Any.fromFunction0(value))
    
    inline def setGetKeys(value: () => js.Array[Double | (/* keyof T */ String)]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
    
    inline def setGetLastIndex(value: () => Double): Self = StObject.set(x, "getLastIndex", js.Any.fromFunction0(value))
    
    inline def setGetNextIndex(value: () => Double): Self = StObject.set(x, "getNextIndex", js.Any.fromFunction0(value))
    
    inline def setGetPrevIndex(value: () => Double): Self = StObject.set(x, "getPrevIndex", js.Any.fromFunction0(value))
    
    inline def setGetValues(value: () => js.Array[T]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    inline def setHasElement(value: () => Boolean): Self = StObject.set(x, "hasElement", js.Any.fromFunction0(value))
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSetElement(value: (Double, T) => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction2(value))
    
    inline def setTrim(value: Double => Unit): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
  }
}
