package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "ModifierValueHistory")
@js.native
class ModifierValueHistory protected () extends js.Object {
  /**
       * defaultFallback indiciates whether the absence of a lifecycle yields true or false
       */
  def this(lifecycle: js.UndefOr[scala.Nothing], defaultFallback: scala.Boolean) = this()
  /**
       * defaultFallback indiciates whether the absence of a lifecycle yields true or false
       */
  def this(lifecycle: IModifierValueHistory, defaultFallback: scala.Boolean) = this()
  /**
       * defaultFallback indiciates whether the absence of a lifecycle yields true or false
       */
  def this(lifecycle: scala.Null, defaultFallback: scala.Boolean) = this()
  /**
       * ordered from low to high
       */
  var changedIn: js.Array[Version] = js.native
  var latestValue: scala.Boolean = js.native
  def isEnabledIn(version: Version): scala.Boolean = js.native
}

