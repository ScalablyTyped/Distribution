package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for variables and subspaces.
  * @property name - The scope name.
  * @param name - The scope name.
  */
@JSImport("playcanvas", "ScopeSpace")
@js.native
class ScopeSpace protected ()
  extends StObject
     with typings.playcanvas.pc.ScopeSpace {
  def this(name: String) = this()
  
  /**
    * Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param name - The subspace name.
    * @returns The subspace instance.
    */
  /* CompleteClass */
  override def getSubSpace(name: String): typings.playcanvas.pc.ScopeSpace = js.native
  
  /**
    * The scope name.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Get (or create, if it doesn't already exist) a variable in the scope.
    * @param name - The variable name.
    * @returns The variable instance.
    */
  /* CompleteClass */
  override def resolve(name: String): typings.playcanvas.pc.ScopeId = js.native
}
