package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object otplib {
  import typings.node.Buffer

  type createHmacSecret = js.Function2[/* secret */ String, /* options */ HmacOptions, Buffer]
  type hotpCheck = js.Function4[
    /* token */ String, 
    /* secret */ String, 
    /* counter */ Double, 
    /* options */ HotpOptionsInterface, 
    Boolean
  ]
  type hotpCounter = js.Function1[/* counter */ Double, String]
  type hotpDigest = js.Function3[/* secret */ String, /* counter */ Double, /* options */ HotpOptionsInterface, String]
  type hotpOptions = js.Function1[/* options */ js.Any, HotpOptionsInterface]
  type hotpSecret = createHmacSecret
  type hotpToken = js.Function3[/* secret */ String, /* counter */ Double, /* options */ HotpOptionsInterface, String]
  type totpCheck = js.Function3[/* token */ String, /* secret */ String, /* options */ TotpOptionsInterface, Boolean]
  type totpCheckWithWindow = js.Function3[
    /* token */ String, 
    /* secret */ String, 
    /* options */ TotpOptionsInterface, 
    Double | Null
  ]
  type totpCounter = js.Function2[/* epoch */ Double, /* step */ Double, Double]
  type totpOptions = js.Function1[/* options */ js.Any, TotpOptionsInterface]
  type totpSecret = createHmacSecret
  type totpTimeRemaining = js.Function2[/* epoch */ Double, /* step */ Double, Double]
  type totpTimeUsed = js.Function2[/* epoch */ Double, /* step */ Double, Double]
  type totpToken = js.Function2[/* secret */ String, /* options */ TotpOptionsInterface, String]
}
