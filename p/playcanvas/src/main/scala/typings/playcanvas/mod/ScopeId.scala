package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for a variable.
  */
@JSImport("playcanvas", "ScopeId")
@js.native
open class ScopeId protected () extends StObject {
  /**
    * Create a new ScopeId instance.
    *
    * @param {string} name - The variable name.
    */
  def this(name: String) = this()
  
  /**
    * Get variable value.
    *
    * @returns {*} The value.
    */
  def getValue(): Any = js.native
  
  /**
    * The variable name.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * Set variable value.
    *
    * @param {*} value - The value.
    */
  def setValue(value: Any): Unit = js.native
  
  def toJSON(key: Any): Any = js.native
  
  var value: Any = js.native
  
  var versionObject: VersionedObject = js.native
}
