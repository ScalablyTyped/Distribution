package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Refspec")
@js.native
open class Refspec ()
  extends typings.nodegit.refSpecMod.Refspec
/* static members */
object Refspec {
  
  @JSImport("nodegit", "Refspec")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String, is_fetch: Double): js.Promise[typings.nodegit.refSpecMod.Refspec] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], is_fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.refSpecMod.Refspec]]
}
