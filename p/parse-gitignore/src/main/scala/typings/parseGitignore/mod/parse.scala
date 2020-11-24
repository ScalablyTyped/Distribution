package typings.parseGitignore.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-gitignore", "parse")
@js.native
object parse extends js.Object {
  
  /**
    * Pass the contents of a .gitignore file as a string or buffer
    */
  def apply(input: String): State = js.native
  def apply(input: String, fn: FormatLine): State = js.native
  def apply(input: Buffer): State = js.native
  def apply(input: Buffer, fn: FormatLine): State = js.native
}
