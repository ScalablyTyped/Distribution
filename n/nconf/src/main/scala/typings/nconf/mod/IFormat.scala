package typings.nconf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormat extends js.Object {
  
  def parse(str: String): js.Any = js.native
  
  def stringify(obj: js.Any, replacer: js.Any): String = js.native
  def stringify(obj: js.Any, replacer: js.Any, spacing: js.Any): String = js.native
}
