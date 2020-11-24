package typings.podcast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Podcast extends js.Object {
  
  def addItem(item: Item): Unit = js.native
  
  def buildXml(): String = js.native
  def buildXml(indent: String): String = js.native
  def buildXml(indent: Boolean): String = js.native
}
