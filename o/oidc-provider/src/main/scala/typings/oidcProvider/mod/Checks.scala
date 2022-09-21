package typings.oidcProvider.mod

import typings.oidcProvider.mod.interactionPolicy.Check
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checks
  extends StObject
     with Array[Check] {
  
  def add(prompt: Check): Unit = js.native
  def add(prompt: Check, index: Double): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get(name: String): js.UndefOr[Check] = js.native
  
  def remove(name: String): Unit = js.native
}
