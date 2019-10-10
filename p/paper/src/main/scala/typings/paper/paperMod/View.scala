package typings.paper.paperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The View object wraps an HTML element and handles drawing and user
  * interaction through mouse and keyboard for it. It offer means to scroll the
  * view, find the currently visible bounds in project coordinates, or the
  * center, both useful for constructing artwork that should appear centered on
  * screen.
  */
@JSImport("paper", "View")
@js.native
class View ()
  extends typings.paper.paper.View

/** 
  * The reference to the active project's view.
  */
@JSImport("paper", "view")
@js.native
object view
  extends TopLevel[typings.paper.paper.View]

