package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "LifeCycle")
@js.native
class LifeCycle () extends js.Object {
  def this(info: ILifeCycle) = this()
  var deleted: Version | Null = js.native
  var deletionMessage: String = js.native
  var deprecationMessage: String = js.native
  var introduced: Version | Null = js.native
  def getCurrentState(version: Version): LifeCycleState = js.native
  /**
    * Yields true if this feature is available in the specified version, that is:
    * - it was in base, or added before the specified version
    * - it was not removed yet in the given version
    * - deprecation statues does not influence it results
    */
  def isAvailableIn(version: Version): Boolean = js.native
  /**
    * Yields true only if this version was actively removed in the given version.
    * Doesn't yield true if the feature was not yet introduced in the given version (see isAvailableIn for that)
    */
  def isRemovedIn(version: Version): Boolean = js.native
  /**
    * Checks a version based on this lifecycle.
    * Returns true if something is thrown or warned, otherwise false
    */
  def reportVersionIssues(version: Version, aboutWhatMessage: String): Boolean = js.native
}

