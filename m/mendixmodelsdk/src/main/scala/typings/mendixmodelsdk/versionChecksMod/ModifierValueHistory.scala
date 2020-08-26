package typings.mendixmodelsdk.versionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "ModifierValueHistory")
@js.native
class ModifierValueHistory protected () extends js.Object {
  def this(lifecycle: js.UndefOr[scala.Nothing], defaultFallback: Boolean) = this()
  def this(lifecycle: Null, defaultFallback: Boolean) = this()
  /**
    * defaultFallback indiciates whether the absence of a lifecycle yields true or false
    */
  def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
  /**
    * ordered from low to high
    */
  var changedIn: js.Array[Version] = js.native
  var latestValue: Boolean = js.native
  def isEnabledIn(version: Version): Boolean = js.native
}

