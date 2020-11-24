package typings.netflixNerror.mod.VError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Like JavaScript's built-in Error class, but supports a "cause" argument which
  * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
  * The cause argument can be null.
  */
@JSImport("@netflix/nerror", "VError.WError")
@js.native
class WError ()
  extends typings.netflixNerror.mod.VError
