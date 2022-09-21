package typings.miniprogramWxs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor
  extends StObject
     with Instantiable0[Object]
     with Instantiable1[/* value */ Any, Object] {
  
  def apply(): Any = js.native
  def apply(value: Any): Any = js.native
  
  /**
    * Creates an object that has the specified prototype or that has null prototype.
    * @param o Object to use as a prototype. May be null.
    */
  def create(): Any = js.native
  def create(o: js.Object): Any = js.native
  /**
    * Creates an object that has the specified prototype, and that optionally contains specified properties.
    * @param o Object to use as a prototype. May be null
    * @param properties JavaScript object that contains one or more property descriptors.
    */
  def create(o: js.Object, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  def create(o: Null, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  
  /**
    * Adds one or more properties to an object, and/or modifies attributes of existing properties.
    * @param o Object on which to add or modify the properties. This can be a native JavaScript object or a DOM object.
    * @param properties JavaScript object that contains one or more descriptor objects. Each descriptor object describes a data property or an accessor property.
    */
  def defineProperties(o: Any, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  
  /**
    * Adds a property to an object, or modifies attributes of an existing property.
    * @param o Object on which to add or modify the property. This can be a native JavaScript object (that is, a user-defined object or a built in object) or a DOM object.
    * @param p The property name.
    * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
    */
  def defineProperty(o: Any, p: PropertyKey, attributes: PropertyDescriptor & ThisType[Any]): Any = js.native
  
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def freeze[T](a: Array[T]): ReadonlyArray[T] = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def freeze[T /* <: Function */](f: T): T = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  @JSName("freeze")
  def freeze_T_Readonly[T](o: T): Readonly[T] = js.native
  
  /**
    * Gets the own property descriptor of the specified object.
    * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
    * @param o Object that contains the property.
    * @param p Name of the property.
    */
  def getOwnPropertyDescriptor(o: Any, p: PropertyKey): js.UndefOr[PropertyDescriptor] = js.native
  
  /**
    * Returns the names of the own properties of an object. The own properties of an object are those that are defined directly
    * on that object, and are not inherited from the object's prototype. The properties of an object include both fields (objects) and functions.
    * @param o Object that contains the own properties.
    */
  def getOwnPropertyNames(o: Any): Array[java.lang.String] = js.native
  
  /**
    * Returns the prototype of an object.
    * @param o The object that references the prototype.
    */
  def getPrototypeOf(o: Any): Any = js.native
  
  /**
    * Returns a value that indicates whether new properties can be added to an object.
    * @param o Object to test.
    */
  def isExtensible(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes and values cannot be modified in an object, and new properties cannot be added to the object.
    * @param o Object to test.
    */
  def isFrozen(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added to the object.
    * @param o Object to test.
    */
  def isSealed(o: Any): scala.Boolean = js.native
  
  /**
    * Returns the names of the enumerable string properties and methods of an object.
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  def keys(o: js.Object): Array[java.lang.String] = js.native
  
  /**
    * Prevents the addition of new properties to an object.
    * @param o Object to make non-extensible.
    */
  def preventExtensions[T](o: T): T = js.native
  
  /**
    * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def seal[T](o: T): T = js.native
}
