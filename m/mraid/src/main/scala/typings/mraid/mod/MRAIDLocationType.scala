package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MRAIDLocationType extends StObject
@JSImport("mraid", "MRAIDLocationType")
@js.native
object MRAIDLocationType extends StObject {
  
  @js.native
  sealed trait IPGeoLocation
    extends StObject
       with MRAIDLocationType
  
  @js.native
  sealed trait LocationServices
    extends StObject
       with MRAIDLocationType
  
  @js.native
  sealed trait UserProvided
    extends StObject
       with MRAIDLocationType
}
