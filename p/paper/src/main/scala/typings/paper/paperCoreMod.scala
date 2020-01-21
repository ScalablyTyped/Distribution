package typings.paper

import org.scalablytyped.runtime.TopLevel
import typings.paper.paper.PaperScope
import typings.paper.paperStrings.PaperScript
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", JSImport.Namespace)
@js.native
object paperCoreMod extends TopLevel[Pick[PaperScope, Exclude[String, PaperScript]]]

