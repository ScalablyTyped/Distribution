package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "SequenceSqlFunction")
@js.native
class SequenceSqlFunction protected () extends js.Object {
  def this(name: String) = this()
  
  def current(): Double = js.native
  
  def next(): Double = js.native
  
  def reset(): Double = js.native
}
