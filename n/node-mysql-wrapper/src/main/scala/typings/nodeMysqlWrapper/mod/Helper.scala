package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "Helper")
@js.native
/**
  * Callback like forEach
  * @name valueCallback
  * @function
  * @param {T} the value of the object's key
  * @returnTye {U}
  * @return {U}
  */
/**
  * CallbaforEach
  * @name keyCallback
  * @function
  * @param {string} the name of the object's key
  * @returnTye {U}
  * @return {U}
  */
class Helper () extends StObject
object Helper {
  
  @JSImport("node-mysql-wrapper", "Helper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create and return a copy of an object.
    * @param {T} object the object you want to copy.
    * @returnType {T}
    * @return {T}
    */
  /* static member */
  @scala.inline
  def copyObject[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copyObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Iterate object's keys and return their names to the callback.
    * @param {Map<T>} map the object.
    * @param {keyCallback}
    * @returnType {U}
    * @return {U}
    */
  /* static member */
  @scala.inline
  def forEachKey[T, U](map: Map[T], callback: js.Function1[/* key */ String, U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachKey")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[U]
  
  /**
    * Iterate object's keys and return their values to the callback.
    * @param {<T>} map the object.
    * @param {valueCallback}
    * @returnType {U}
    * @return {U}
    */
  /* static member */
  @scala.inline
  def forEachValue[T, U](map: T, callback: js.Function1[/* value */ T, U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachValue")(map.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[U]
  
  /**
    * Checks if an object has 'tableRules' property.
    * @param {obj} the object to pass
    * @return boolean
    */
  /* static member */
  @scala.inline
  def hasRules(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRules")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if anything is a function.
    * @param {functionToCheck} the object or function to pass
    * @return boolean
    */
  /* static member */
  @scala.inline
  def isFunction(functionToCheck: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(functionToCheck.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Converts any_string to anyString and returns it.
    * @param {string} columnKey the string you want to convert.
    * @returnType {string}
    * @return {string}
    */
  /* static member */
  @scala.inline
  def toObjectProperty(columnKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjectProperty")(columnKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts anyString to any_string and returns it.
    * @param {string} objectKey the string you want to convert.
    * @returnType {string}
    * @return {string}
    */
  /* static member */
  @scala.inline
  def toRowProperty(objectKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRowProperty")(objectKey.asInstanceOf[js.Any]).asInstanceOf[String]
}
