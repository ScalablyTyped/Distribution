package typings.microsoftAjax.global

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
@JSGlobal("Type")
@js.native
class Type ()
  extends StObject
     with typings.microsoftAjax.Type
object Type {
  
  @JSGlobal("Type")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a callback method, given the function to callback and the parameter to pass to it.
    * @return
    *       The callback function.
    *
    * @param method
    *           The function for which the callback method will be created.
    * @param context
    *           The parameter to pass to the function. This parameter can be null, but it cannot be omitted.
    */
  /* static member */
  inline def createCallback(method: js.Function, context: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")(method.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Creates a delegate function that keeps the context from its creation. The context defines the object instance to which the this keyword points.
    * @param instance
    *           The object instance that will be the context for the function. This parameter can be null.
    * @param method
    *           The function from which the delegate is created.
    * @return The delegate function.
    */
  /* static member */
  inline def createDelegate(instance: js.Object, method: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createDelegate")(instance.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Returns an Array object containing references to all the root namespaces of the client application. This method is static and is invoked without creating an instance of the object.
    * Use the getRootNamespaces function to return an array containing references to all the root namespaces of the client application.
    * @return An object containing references to all the root namespaces of the client application.
    */
  /* static member */
  inline def getRootNamespaces(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootNamespaces")().asInstanceOf[js.Any]
  
  /**
    * Returns a value that indicates whether the specified type is a class. This method is static and can be invoked without creating an instance of the object.
    * @param type
    *           The type to test.
    * @return true if the specified type is a class; otherwise, false.
    */
  /* static member */
  inline def isClass(`type`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Indicates whether the specified type is an enumeration.
    * @param type
    *           The type to test.
    * @return true if the type is an enumeration; otherwise, false.
    */
  /* static member */
  inline def isEnum(`type`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnum")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Get a value that indicates whether the specified type is an integer of flags.
    * @param
    *      The type to test.
    * @return true if the type is an integer of flags; otherwise, false.
    */
  /* static member */
  inline def isFlags(`type`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlags")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns a value that indicates whether the specified type is an interface. This is a static member that is invoked directly without creating an instance of the class.
    * @param type
    *           The type to test.
    * @return true if the specified type is an interface; otherwise, false.
    */
  /* static member */
  inline def isInterface(`type`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns a value that indicates whether the specified object is a namespace. This is a static member that is invoked directly without creating an instance of the class.
    * @param object
    *           The object to test.
    * @return true if the specified object is a namespace; otherwise, false.
    */
  /* static member */
  inline def isNamespace(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespace")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns an instance of the type specified by a type name. This is a static member that is invoked directly without creating an instance of its class.
    * @param typeName
    *           A string that represents a fully qualified class name. Can be null.
    * @param ns
    *           (Optional) The namespace that contains the class.
    * @return The class represented by typeName, or null if a class that matches typeName does not occur in the namespace.
    */
  /* static member */
  inline def parse(typeName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(typeName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(typeName: String, ns: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(typeName.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Creates a namespace. This member is static and can be invoked without creating an instance of the class.
    * @param namespacePath
    *           A string that represents the fully qualified namespace to register.
    */
  /* static member */
  inline def registerNamespace(namespacePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNamespace")(namespacePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
