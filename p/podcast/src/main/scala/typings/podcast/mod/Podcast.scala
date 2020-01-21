package typings.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Podcast extends js.Object {
  def addItem(item: Item): Unit = js.native
  def buildXml(): String = js.native
  def buildXml(indent: String): String = js.native
  def buildXml(indent: Boolean): String = js.native
}

