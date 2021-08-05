package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session[T /* <: Attributes */]
  extends StObject
     with Object[T] {
  
  def getSessionToken(): String = js.native
  
  def isCurrentSessionRevocable(): Boolean = js.native
}
object Session {
  
  inline def apply: SessionConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Session").asInstanceOf[SessionConstructor]
}
