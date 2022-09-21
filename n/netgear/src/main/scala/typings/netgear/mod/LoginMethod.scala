package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoginMethod extends StObject
@JSImport("netgear", "LoginMethod")
@js.native
object LoginMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoginMethod & Double] = js.native
  
  @js.native
  sealed trait Heritage
    extends StObject
       with LoginMethod
  /* 1 */ val Heritage: typings.netgear.mod.LoginMethod.Heritage & Double = js.native
  
  @js.native
  sealed trait Modern
    extends StObject
       with LoginMethod
  /* 2 */ val Modern: typings.netgear.mod.LoginMethod.Modern & Double = js.native
}
