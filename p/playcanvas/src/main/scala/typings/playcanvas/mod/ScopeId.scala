package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for a variable.
  * @property name - The variable name.
  * @param name - The variable name.
  */
@JSImport("playcanvas", "ScopeId")
@js.native
class ScopeId protected ()
  extends StObject
     with typings.playcanvas.pc.ScopeId {
  def this(name: String) = this()
  
  /**
    * Get variable value.
    * @returns The value.
    */
  /* CompleteClass */
  override def getValue(): js.Any = js.native
  
  /**
    * The variable name.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Set variable value.
    * @param value - The value.
    */
  /* CompleteClass */
  override def setValue(value: js.Any): Unit = js.native
}
