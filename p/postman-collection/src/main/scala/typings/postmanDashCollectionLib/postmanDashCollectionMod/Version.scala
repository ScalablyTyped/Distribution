package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.VersionDefinition because var conflicts: description. Inlined build, major, minor, patch, prerelease, raw, version */ @JSImport("postman-collection", "Version")
@js.native
class Version () extends PropertyBase[VersionDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: VersionDefinition) = this()
  var build: js.UndefOr[java.lang.String] = js.native
  var major: js.UndefOr[java.lang.String] = js.native
  var minor: js.UndefOr[java.lang.String] = js.native
  var patch: js.UndefOr[java.lang.String] = js.native
  var prerelease: js.UndefOr[java.lang.String] = js.native
  var raw: js.UndefOr[java.lang.String] = js.native
  var string: js.UndefOr[java.lang.String] = js.native
  var version: js.UndefOr[java.lang.String] = js.native
  def set(): scala.Unit = js.native
  def set(value: java.lang.String): scala.Unit = js.native
  def set(value: VersionDefinition): scala.Unit = js.native
}

