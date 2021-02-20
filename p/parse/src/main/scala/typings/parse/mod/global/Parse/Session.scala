package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session[T /* <: Attributes */] extends Object[T] {
  
  def getSessionToken(): String = js.native
  
  def isCurrentSessionRevocable(): Boolean = js.native
}
