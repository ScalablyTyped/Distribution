package typings.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Tool object refers to a script that the user can interact with by
  *     using the mouse and keyboard and can be accessed through the global
  *     `tool` variable. All its properties are also available in the paper
  *     scope.
  * 
  * The global `tool` variable only exists in scripts that contain mouse handler
  * functions ({@link #onMouseMove}, {@link #onMouseDown}, {@link #onMouseDrag},
  * {@link #onMouseUp}) or a keyboard handler function ({@link #onKeyDown},
  * {@link #onKeyUp}).
  */
@JSGlobal("paper.Tool")
@js.native
class Tool ()
  extends typings.paper.paper.Tool

