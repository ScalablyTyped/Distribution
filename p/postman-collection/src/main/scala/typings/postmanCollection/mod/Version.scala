package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.VersionDefinition because var conflicts: description. Inlined build, major, minor, patch, prerelease, raw, version */ @JSImport("postman-collection", "Version")
@js.native
class Version () extends PropertyBase[VersionDefinition] {
  def this(options: String) = this()
  def this(options: VersionDefinition) = this()
  var build: js.UndefOr[String] = js.native
  var major: js.UndefOr[String] = js.native
  var minor: js.UndefOr[String] = js.native
  var patch: js.UndefOr[String] = js.native
  var prerelease: js.UndefOr[String] = js.native
  var raw: js.UndefOr[String] = js.native
  var string: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
  def set(): Unit = js.native
  def set(value: String): Unit = js.native
  def set(value: VersionDefinition): Unit = js.native
}

