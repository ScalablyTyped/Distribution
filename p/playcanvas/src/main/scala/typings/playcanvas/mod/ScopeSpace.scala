package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for variables.
  */
@JSImport("playcanvas", "ScopeSpace")
@js.native
open class ScopeSpace protected () extends StObject {
  /**
    * Create a new ScopeSpace instance.
    *
    * @param {string} name - The scope name.
    */
  def this(name: String) = this()
  
  /**
    * The scope name.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * Clears value for any uniform with matching value (used to remove deleted textures).
    *
    * @param {*} value - The value to clear.
    * @ignore
    */
  def removeValue(value: Any): Unit = js.native
  
  /**
    * Get (or create, if it doesn't already exist) a variable in the scope.
    *
    * @param {string} name - The variable name.
    * @returns {ScopeId} The variable instance.
    */
  def resolve(name: String): ScopeId = js.native
  
  var variables: Map[Any, Any] = js.native
}
