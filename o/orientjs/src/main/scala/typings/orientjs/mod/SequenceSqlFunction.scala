package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "SequenceSqlFunction")
@js.native
open class SequenceSqlFunction protected () extends StObject {
  def this(name: String) = this()
  
  def current(): Double = js.native
  
  def next(): Double = js.native
  
  def reset(): Double = js.native
}
