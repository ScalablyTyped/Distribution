package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
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
class Helper () extends js.Object
/* static members */
@JSImport("node-mysql-wrapper", "Helper")
@js.native
object Helper extends js.Object {
  
  /**
    * Create and return a copy of an object.
    * @param {T} object the object you want to copy.
    * @returnType {T}
    * @return {T}
    */
  def copyObject[T](`object`: T): T = js.native
  
  /**
    * Iterate object's keys and return their names to the callback.
    * @param {Map<T>} map the object.
    * @param {keyCallback}
    * @returnType {U}
    * @return {U}
    */
  def forEachKey[T, U](map: Map[T], callback: js.Function1[/* key */ String, U]): U = js.native
  
  /**
    * Iterate object's keys and return their values to the callback.
    * @param {<T>} map the object.
    * @param {valueCallback}
    * @returnType {U}
    * @return {U}
    */
  def forEachValue[T, U](map: T, callback: js.Function1[/* value */ T, U]): U = js.native
  
  /**
    * Checks if an object has 'tableRules' property.
    * @param {obj} the object to pass
    * @return boolean
    */
  def hasRules(obj: js.Any): Boolean = js.native
  
  /**
    * Checks if anything is a function.
    * @param {functionToCheck} the object or function to pass
    * @return boolean
    */
  def isFunction(functionToCheck: js.Any): Boolean = js.native
  
  /**
    * Converts any_string to anyString and returns it.
    * @param {string} columnKey the string you want to convert.
    * @returnType {string}
    * @return {string}
    */
  def toObjectProperty(columnKey: String): String = js.native
  
  /**
    * Converts anyString to any_string and returns it.
    * @param {string} objectKey the string you want to convert.
    * @returnType {string}
    * @return {string}
    */
  def toRowProperty(objectKey: String): String = js.native
}
