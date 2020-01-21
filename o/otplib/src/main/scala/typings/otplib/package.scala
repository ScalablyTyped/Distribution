package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object otplib {
  type createHmacSecret = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typings.otplib.HmacOptions, 
    typings.node.Buffer
  ]
  type hotpCheck = js.Function4[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typings.otplib.HotpOptionsInterface, 
    scala.Boolean
  ]
  type hotpCounter = js.Function1[/* counter */ scala.Double, java.lang.String]
  type hotpDigest = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typings.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type hotpOptions = js.Function1[/* options */ js.Any, typings.otplib.HotpOptionsInterface]
  type hotpSecret = typings.otplib.createHmacSecret
  type hotpToken = js.Function3[
    /* secret */ java.lang.String, 
    /* counter */ scala.Double, 
    /* options */ typings.otplib.HotpOptionsInterface, 
    java.lang.String
  ]
  type totpCheck = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typings.otplib.TotpOptionsInterface, 
    scala.Boolean
  ]
  type totpCheckWithWindow = js.Function3[
    /* token */ java.lang.String, 
    /* secret */ java.lang.String, 
    /* options */ typings.otplib.TotpOptionsInterface, 
    scala.Double | scala.Null
  ]
  type totpCounter = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpOptions = js.Function1[/* options */ js.Any, typings.otplib.TotpOptionsInterface]
  type totpSecret = typings.otplib.createHmacSecret
  type totpTimeRemaining = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpTimeUsed = js.Function2[/* epoch */ scala.Double, /* step */ scala.Double, scala.Double]
  type totpToken = js.Function2[
    /* secret */ java.lang.String, 
    /* options */ typings.otplib.TotpOptionsInterface, 
    java.lang.String
  ]
}
