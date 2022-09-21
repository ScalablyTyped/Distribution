package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region ASP.NET Types
/**
* Provides a typing and type-reflection system for ECMAScript (JavaScript) object-oriented programming functionality.
* Type Class
* @see {@link http://msdn.microsoft.com/en-us/library/bb397568(v=vs.100).aspx}
*/
@js.native
trait Type extends StObject {
  
  /**
    * Invokes a base method with specified arguments.
    * @returns A value of the class that the base method returns. If the base method does not return a value, no value is returned.
    */
  def callBaseMethod(instance: Any, name: java.lang.String): Any = js.native
  def callBaseMethod(instance: Any, name: java.lang.String, baseArguments: js.Array[Any]): Any = js.native
  
  /**
    * Returns the base implementation of a method from the base class of the specified instance.
    * @param instance
    *          The instance for which the base method is requested.
    * @param name
    *          The name of the method to retrieve as a reference.
    */
  def getBaseMethod(instance: js.Object, name: java.lang.String): Any = js.native
  
  /**
    * Returns the base class of the instance.
    * Use the getBaseType method to retrieve the base class of the instance.
    */
  def getBaseType(): Type = js.native
  
  /**
    * Returns an Array object that contains the list of interfaces that the type implements.
    * Use the getInterfaces function to return a list of objects that define the interfaces on a type object.
    * This enables you to enumerate the array to determine the object's interfaces.
    *
    * @return An Array object that contains the list of interfaces that the type implements.
    */
  def getInterfaces(): js.Array[Any] = js.native
  
  /**
    * Returns the name of the type of the instance.
    * @return A string representing the fully qualified name of the type of the instance.
    * @example Object.getType(c[i]).getName()
    */
  def getName(): java.lang.String = js.native
  
  /**
    * Determines whether a class implements a specified interface type.
    * @param interfaceType
    *           The interface to test.
    * @return true if the class implements interfaceType; otherwise, false.
    */
  def implementsInterface(interfaceType: Type): Boolean = js.native
  
  /**
    * Determines whether an instance inherits from a specified class.
    * @param parentType
    *           The fully qualified name of the class to test as a base class for the current instance.
    * @return true if the instance inherits from parentType; otherwise, false.
    */
  def inheritsFrom(parentType: java.lang.String): Boolean = js.native
  
  /**
    * Initializes the base class and its members in the context of a given instance, which provides the model for inheritance and for initializing base members.
    * @param instance
    *           The instance to initialize the base class for. Usually this.
    * @param baseArguments
    *           (Optional) The arguments for the base constructor. Can be null.
    */
  def initializeBase(instance: Any): Any = js.native
  def initializeBase(instance: Any, baseArguments: js.Array[Any]): Any = js.native
  
  /**
    * Determines whether an instance implements an interface.
    * @param typeInstanceVar
    *           The instance on which the interface is tested.
    * @return
    */
  def isImplementedBy(typeInstanceVar: Any): Boolean = js.native
  
  /**
    * Returns a value that indicates whether an object is an instance of a specified class or of one of its derived classes.
    * @param instance
    *           The object to test.
    * @return true if instance is an instance of the class; false if instance does not implement the interface, or if it is undefined or null.
    */
  def isInstanceOfType(instance: Any): Boolean = js.native
  
  /**
    * Registers a class as defined by a constructor with an optional base type and interface type.
    * @param typeName
    *           A string that represents the fully qualified name of the type.
    * @param baseType
    *           (Optional) The base type.
    * @param interfaceTypes
    *           (Optional) An unbounded array of interface type definitions that the type implements.
    * @return The registered type.
    */
  def registerClass(typeName: java.lang.String): Any = js.native
  def registerClass(typeName: java.lang.String, baseType: Any): Any = js.native
  def registerClass(typeName: java.lang.String, baseType: Any, interfaceTypes: js.Array[Any]): Any = js.native
  def registerClass(typeName: java.lang.String, baseType: Unit, interfaceTypes: js.Array[Any]): Any = js.native
  
  /**
    * Registers an enumeration.
    * @param name
    *           The fully-qualified name of the enumeration.
    * @param flags
    *           (Optional) true if the enumeration is a collection of flags; otherwise, false.
    */
  def registerEnum(name: java.lang.String): Unit = js.native
  def registerEnum(name: java.lang.String, flags: Boolean): Unit = js.native
  
  /**
    * Registers an interface defined by a constructor.
    * @param typeName
    *           A string that represents the fully qualified name of the class to be registered as an interface.
    * @return The registered interface.
    */
  def registerInterface(typeName: java.lang.String): Any = js.native
  
  /**
    * Copies members from the base class to the prototype associated with the derived class, and continues this process up the inheritance chain. This enables you to reflect on the inherited members of a derived type.
    * Use the resolveInheritance method to reflect on the inherited members of a derived type.
    * You invoke this method from the type that you want to reflect on.
    * The resolveInheritance method copies members from the base class to the prototype associated with the derived class, and continues this process up the inheritance chain.
    * If the derived type overrides a base type member, the base type member is not copied to the derived type's prototype.
    * After invoking a derived type's resolveInheritance method, you can examine the members of the derived type to discover all members, which includes inherited members.
    */
  def resolveInheritance(): Unit = js.native
}
