package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptAttributes
  * @classdesc Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link pc.ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link pc.ScriptType}.
  * @param {pc.ScriptType} scriptType Script Type that attributes relate to.
  */
@JSImport("playcanvas", "ScriptAttributes")
@js.native
class ScriptAttributes protected ()
  extends typings.playcanvas.pc.ScriptAttributes {
  def this(scriptType: typings.playcanvas.pc.ScriptType) = this()
}

