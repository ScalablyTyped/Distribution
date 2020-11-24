package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerbosityLevel extends js.Object
@JSImport("pdfjs-dist", "VerbosityLevel")
@js.native
object VerbosityLevel extends js.Object {
  
  @js.native
  sealed trait ERRORS extends VerbosityLevel
  
  @js.native
  sealed trait INFOS extends VerbosityLevel
  
  @js.native
  sealed trait WARNINGS extends VerbosityLevel
}
