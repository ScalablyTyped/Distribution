package typings.playcanvas.global.pc

import org.scalablytyped.runtime.Instantiable1
import typings.playcanvas.anon.App
import typings.playcanvas.anon.TypeofScriptType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container of Script Attribute definitions. Implements an interface to add/remove attributes and
  * store their definition for a {@link ScriptType}. Note: An instance of ScriptAttributes is
  * created automatically by each {@link ScriptType}.
  */
@JSGlobal("pc.ScriptAttributes")
@js.native
open class ScriptAttributes protected ()
  extends typings.playcanvas.mod.ScriptAttributes {
  /**
    * Create a new ScriptAttributes instance.
    *
    * @param {typeof ScriptType} scriptType - Script Type that attributes relate to.
    */
  def this(scriptType: TypeofScriptType & (Instantiable1[/* args */ App, typings.playcanvas.mod.ScriptType])) = this()
}
object ScriptAttributes {
  
  @JSGlobal("pc.ScriptAttributes")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.ScriptAttributes.reservedNames")
  @js.native
  def reservedNames: Set[String] = js.native
  inline def reservedNames_=(x: Set[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reservedNames")(x.asInstanceOf[js.Any])
}
