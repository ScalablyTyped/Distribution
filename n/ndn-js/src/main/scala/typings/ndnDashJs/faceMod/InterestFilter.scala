package typings.ndnDashJs.faceMod

import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/face", "InterestFilter")
@js.native
class InterestFilter protected () extends js.Object {
  def this(filter: InterestFilter) = this()
  def this(prefix: String) = this()
  def this(prefix: Name) = this()
  def this(prefix: String, regexFilter: String) = this()
  def this(prefix: Name, regexFilter: String) = this()
  def doesMatch(name: Name): Boolean = js.native
  def getPrefix(): Name = js.native
  def getRegexFilter(): String = js.native
  def hasRegexFilter(): Boolean = js.native
}

