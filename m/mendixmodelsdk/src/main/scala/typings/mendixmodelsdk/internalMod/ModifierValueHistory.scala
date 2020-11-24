package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.versionChecksMod.IModifierValueHistory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "ModifierValueHistory")
@js.native
class ModifierValueHistory protected ()
  extends typings.mendixmodelsdk.versionChecksMod.ModifierValueHistory {
  def this(lifecycle: js.UndefOr[scala.Nothing], defaultFallback: Boolean) = this()
  def this(lifecycle: Null, defaultFallback: Boolean) = this()
  /**
    * defaultFallback indiciates whether the absence of a lifecycle yields true or false
    */
  def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
}
