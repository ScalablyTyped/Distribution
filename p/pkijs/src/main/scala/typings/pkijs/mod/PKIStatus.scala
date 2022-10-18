package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PKIStatus extends StObject
@JSImport("pkijs", "PKIStatus")
@js.native
object PKIStatus extends StObject {
  
  @js.native
  sealed trait granted
    extends StObject
       with PKIStatus
  
  @js.native
  sealed trait grantedWithMods
    extends StObject
       with PKIStatus
  
  @js.native
  sealed trait rejection
    extends StObject
       with PKIStatus
  
  @js.native
  sealed trait revocationNotification
    extends StObject
       with PKIStatus
  
  @js.native
  sealed trait revocationWarning
    extends StObject
       with PKIStatus
  
  @js.native
  sealed trait waiting
    extends StObject
       with PKIStatus
}
