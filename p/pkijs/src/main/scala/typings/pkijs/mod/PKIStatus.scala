package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PKIStatus extends StObject
@JSImport("pkijs", "PKIStatus")
@js.native
object PKIStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PKIStatus & Double] = js.native
  
  @js.native
  sealed trait granted
    extends StObject
       with PKIStatus
  /* 0 */ val granted: typings.pkijs.mod.PKIStatus.granted & Double = js.native
  
  @js.native
  sealed trait grantedWithMods
    extends StObject
       with PKIStatus
  /* 1 */ val grantedWithMods: typings.pkijs.mod.PKIStatus.grantedWithMods & Double = js.native
  
  @js.native
  sealed trait rejection
    extends StObject
       with PKIStatus
  /* 2 */ val rejection: typings.pkijs.mod.PKIStatus.rejection & Double = js.native
  
  @js.native
  sealed trait revocationNotification
    extends StObject
       with PKIStatus
  /* 5 */ val revocationNotification: typings.pkijs.mod.PKIStatus.revocationNotification & Double = js.native
  
  @js.native
  sealed trait revocationWarning
    extends StObject
       with PKIStatus
  /* 4 */ val revocationWarning: typings.pkijs.mod.PKIStatus.revocationWarning & Double = js.native
  
  @js.native
  sealed trait waiting
    extends StObject
       with PKIStatus
  /* 3 */ val waiting: typings.pkijs.mod.PKIStatus.waiting & Double = js.native
}
