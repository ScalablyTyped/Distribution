package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentityType extends StObject
@JSImport("@mparticle/web-sdk", "IdentityType")
@js.native
object IdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentityType & Double] = js.native
  
  @js.native
  sealed trait CustomerId
    extends StObject
       with IdentityType
  /* 1 */ val CustomerId: typings.mparticleWebSdk.mod.IdentityType.CustomerId & Double = js.native
  
  @js.native
  sealed trait Email
    extends StObject
       with IdentityType
  /* 7 */ val Email: typings.mparticleWebSdk.mod.IdentityType.Email & Double = js.native
  
  @js.native
  sealed trait Facebook
    extends StObject
       with IdentityType
  /* 2 */ val Facebook: typings.mparticleWebSdk.mod.IdentityType.Facebook & Double = js.native
  
  @js.native
  sealed trait FacebookCustomAudienceId
    extends StObject
       with IdentityType
  /* 9 */ val FacebookCustomAudienceId: typings.mparticleWebSdk.mod.IdentityType.FacebookCustomAudienceId & Double = js.native
  
  @js.native
  sealed trait Google
    extends StObject
       with IdentityType
  /* 4 */ val Google: typings.mparticleWebSdk.mod.IdentityType.Google & Double = js.native
  
  @js.native
  sealed trait Microsoft
    extends StObject
       with IdentityType
  /* 5 */ val Microsoft: typings.mparticleWebSdk.mod.IdentityType.Microsoft & Double = js.native
  
  @js.native
  sealed trait MobileNumber
    extends StObject
       with IdentityType
  /* 19 */ val MobileNumber: typings.mparticleWebSdk.mod.IdentityType.MobileNumber & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with IdentityType
  /* 0 */ val Other: typings.mparticleWebSdk.mod.IdentityType.Other & Double = js.native
  
  @js.native
  sealed trait Other10
    extends StObject
       with IdentityType
  /* 18 */ val Other10: typings.mparticleWebSdk.mod.IdentityType.Other10 & Double = js.native
  
  @js.native
  sealed trait Other2
    extends StObject
       with IdentityType
  /* 10 */ val Other2: typings.mparticleWebSdk.mod.IdentityType.Other2 & Double = js.native
  
  @js.native
  sealed trait Other3
    extends StObject
       with IdentityType
  /* 11 */ val Other3: typings.mparticleWebSdk.mod.IdentityType.Other3 & Double = js.native
  
  @js.native
  sealed trait Other4
    extends StObject
       with IdentityType
  /* 12 */ val Other4: typings.mparticleWebSdk.mod.IdentityType.Other4 & Double = js.native
  
  @js.native
  sealed trait Other5
    extends StObject
       with IdentityType
  /* 13 */ val Other5: typings.mparticleWebSdk.mod.IdentityType.Other5 & Double = js.native
  
  @js.native
  sealed trait Other6
    extends StObject
       with IdentityType
  /* 14 */ val Other6: typings.mparticleWebSdk.mod.IdentityType.Other6 & Double = js.native
  
  @js.native
  sealed trait Other7
    extends StObject
       with IdentityType
  /* 15 */ val Other7: typings.mparticleWebSdk.mod.IdentityType.Other7 & Double = js.native
  
  @js.native
  sealed trait Other8
    extends StObject
       with IdentityType
  /* 16 */ val Other8: typings.mparticleWebSdk.mod.IdentityType.Other8 & Double = js.native
  
  @js.native
  sealed trait Other9
    extends StObject
       with IdentityType
  /* 17 */ val Other9: typings.mparticleWebSdk.mod.IdentityType.Other9 & Double = js.native
  
  @js.native
  sealed trait PhoneNumber2
    extends StObject
       with IdentityType
  /* 20 */ val PhoneNumber2: typings.mparticleWebSdk.mod.IdentityType.PhoneNumber2 & Double = js.native
  
  @js.native
  sealed trait PhoneNumber3
    extends StObject
       with IdentityType
  /* 21 */ val PhoneNumber3: typings.mparticleWebSdk.mod.IdentityType.PhoneNumber3 & Double = js.native
  
  @js.native
  sealed trait Twitter
    extends StObject
       with IdentityType
  /* 3 */ val Twitter: typings.mparticleWebSdk.mod.IdentityType.Twitter & Double = js.native
  
  @js.native
  sealed trait Yahoo
    extends StObject
       with IdentityType
  /* 6 */ val Yahoo: typings.mparticleWebSdk.mod.IdentityType.Yahoo & Double = js.native
}
