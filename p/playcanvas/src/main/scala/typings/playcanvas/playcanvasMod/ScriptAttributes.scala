package typings.playcanvas.playcanvasMod

import typings.playcanvas.ScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptAttributes
  * @classdesc Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link ScriptType}.
  * @param {ScriptType} scriptType Script Type that attributes relate to.
  */
@JSImport("playcanvas", "ScriptAttributes")
@js.native
class ScriptAttributes protected ()
  extends typings.playcanvas.pc.ScriptAttributes {
  def this(scriptType: ScriptType) = this()
}

