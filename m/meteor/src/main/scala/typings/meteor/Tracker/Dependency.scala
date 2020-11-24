package typings.meteor.Tracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependency extends js.Object {
  
  def changed(): Unit = js.native
  
  def depend(): Boolean = js.native
  def depend(fromComputation: Computation): Boolean = js.native
  
  def hasDependents(): Boolean = js.native
}
