package typings.otplibPresetV11

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type createHmacSecret = js.Function2[/* secret */ String, /* options */ HmacOptions, Buffer]

type hotpCheck = js.Function4[
/* token */ String, 
/* secret */ String, 
/* counter */ Double, 
/* options */ HotpOptionsInterface, 
Boolean]

type hotpCounter = js.Function1[/* counter */ Double, String]

type hotpDigest = js.Function3[/* secret */ String, /* counter */ Double, /* options */ HotpOptionsInterface, String]

type hotpOptions = js.Function1[/* options */ Any, HotpOptionsInterface]

type hotpSecret = createHmacSecret

type hotpToken = js.Function3[/* secret */ String, /* counter */ Double, /* options */ HotpOptionsInterface, String]

type totpCheck = js.Function3[/* token */ String, /* secret */ String, /* options */ TotpOptionsInterface, Boolean]

type totpCheckWithWindow = js.Function3[
/* token */ String, 
/* secret */ String, 
/* options */ TotpOptionsInterface, 
Double | Null]

type totpCounter = js.Function2[/* epoch */ Double, /* step */ Double, Double]

type totpOptions = js.Function1[/* options */ Any, TotpOptionsInterface]

type totpSecret = createHmacSecret

type totpTimeRemaining = js.Function2[/* epoch */ Double, /* step */ Double, Double]

type totpTimeUsed = js.Function2[/* epoch */ Double, /* step */ Double, Double]

type totpToken = js.Function2[/* secret */ String, /* options */ TotpOptionsInterface, String]
