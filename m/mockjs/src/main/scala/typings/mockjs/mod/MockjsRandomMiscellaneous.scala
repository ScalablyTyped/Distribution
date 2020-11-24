package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Mockjs.Random - Miscellaneous
// see https://github.com/nuysoft/Mock/wiki/Miscellaneous
@js.native
trait MockjsRandomMiscellaneous extends js.Object {
  
  // Random.guid
  def guid(): S = js.native
  
  // Random.id
  def id(): S = js.native
  
  // Random.increment
  def increment(): N = js.native
  def increment(step: N): N = js.native
}
