package typings.parseGitignore.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-gitignore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Parse a .gitignore or .npmignore file into an array of patterns.
    */
  def apply(input: String): js.Array[String] = js.native
  def apply(input: Buffer): js.Array[String] = js.native
}
