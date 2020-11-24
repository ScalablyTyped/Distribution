package typings.mockFs.fileMod

import typings.mockFs.itemMod.Item
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends Item {
  
  /** Get the file contents. */
  def getContent(): Buffer = js.native
  
  /** Set the file contents. */
  def setContent(content: String): Unit = js.native
  def setContent(content: Buffer): Unit = js.native
}
