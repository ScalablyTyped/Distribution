package typings
package ndnDashJsLib.faceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/face", "InterestFilter")
@js.native
class InterestFilter protected () extends js.Object {
  def this(filter: InterestFilter) = this()
  def this(prefix: java.lang.String) = this()
  def this(prefix: ndnDashJsLib.nameMod.Name) = this()
  def this(prefix: java.lang.String, regexFilter: java.lang.String) = this()
  def this(prefix: ndnDashJsLib.nameMod.Name, regexFilter: java.lang.String) = this()
  def doesMatch(name: ndnDashJsLib.nameMod.Name): scala.Boolean = js.native
  def getPrefix(): ndnDashJsLib.nameMod.Name = js.native
  def getRegexFilter(): java.lang.String = js.native
  def hasRegexFilter(): scala.Boolean = js.native
}

