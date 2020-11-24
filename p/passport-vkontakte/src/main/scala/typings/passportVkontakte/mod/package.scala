package typings.passportVkontakte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typings.passportVkontakte.mod.Profile, 
    /* done */ typings.passportVkontakte.mod.VerifyCallback, 
    scala.Unit
  ]
  
  type VerifyFunctionWithParams = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ typings.passportVkontakte.mod.Params, 
    /* profile */ typings.passportVkontakte.mod.Profile, 
    /* done */ typings.passportVkontakte.mod.VerifyCallback, 
    scala.Unit
  ]
}
