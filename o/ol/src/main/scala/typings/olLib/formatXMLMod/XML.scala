package typings
package olLib.formatXMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XML extends js.Object {
  def read(source: java.lang.String): js.Any = js.native
  def read(source: stdLib.Document): js.Any = js.native
  def read(source: stdLib.Element): js.Any = js.native
  def readFromDocument(doc: stdLib.Document): js.Any = js.native
  def readFromNode(node: stdLib.Element): js.Any = js.native
}

