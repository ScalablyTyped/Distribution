package typings.otplibCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type CreateDigest[T] = js.Function3[
    /* algorithm */ typings.otplibCore.utilsMod.HashAlgorithms, 
    /* hmacKey */ typings.otplibCore.utilsMod.HexString, 
    /* counter */ typings.otplibCore.utilsMod.HexString, 
    T
  ]
  type CreateHmacKey[T] = js.Function3[
    /* algorithm */ typings.otplibCore.utilsMod.HashAlgorithms, 
    /* secret */ typings.otplibCore.utilsMod.SecretKey, 
    /* encoding */ typings.otplibCore.utilsMod.KeyEncodings, 
    T
  ]
  type HexString = java.lang.String
  type OTPOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type SecretKey = java.lang.String
}
