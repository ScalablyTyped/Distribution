package typings.nextAuth.anon

import typings.nextAuth.nextAuthInts.`120`
import typings.nextAuth.nextAuthInts.`240`
import typings.nextAuth.nextAuthInts.`360`
import typings.nextAuth.nextAuthInts.`432`
import typings.nextAuth.nextAuthInts.`48`
import typings.nextAuth.nextAuthInts.`504`
import typings.nextAuth.nextAuthInts.`648`
import typings.nextAuth.nextAuthInts.`64`
import typings.nextAuth.nextAuthInts.`96`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilePhotoSize extends StObject {
  
  /**
    * https://docs.microsoft.com/en-us/graph/api/profilephoto-get?view=graph-rest-1.0#examples
    * @default 48
    */
  var profilePhotoSize: js.UndefOr[`48` | `64` | `96` | `120` | `240` | `360` | `432` | `504` | `648`] = js.undefined
  
  /** @default "common" */
  var tenantId: js.UndefOr[String] = js.undefined
}
object ProfilePhotoSize {
  
  inline def apply(): ProfilePhotoSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilePhotoSize]
  }
  
  extension [Self <: ProfilePhotoSize](x: Self) {
    
    inline def setProfilePhotoSize(value: `48` | `64` | `96` | `120` | `240` | `360` | `432` | `504` | `648`): Self = StObject.set(x, "profilePhotoSize", value.asInstanceOf[js.Any])
    
    inline def setProfilePhotoSizeUndefined: Self = StObject.set(x, "profilePhotoSize", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
