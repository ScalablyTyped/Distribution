package typings.parseGitignore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-gitignore", "stringify")
@js.native
object stringify extends js.Object {
  
  def apply(sections: js.Array[Section]): String = js.native
  def apply(sections: js.Array[Section], fn: js.Function1[/* section */ Section, String]): String = js.native
}
