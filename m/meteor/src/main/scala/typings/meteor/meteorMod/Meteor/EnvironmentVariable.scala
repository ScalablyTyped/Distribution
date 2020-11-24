package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/meteor", "Meteor.EnvironmentVariable")
@js.native
class EnvironmentVariable[T] () extends js.Object {
  
  def get(): T = js.native
  
  def getOrNullIfOutsideFiber(): T | Null = js.native
  
  val slot: Double = js.native
  
  def withValue[U](value: T, fn: js.Function0[U]): U = js.native
}
