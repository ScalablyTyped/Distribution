package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

