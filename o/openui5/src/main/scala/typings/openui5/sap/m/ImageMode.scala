package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageMode extends js.Object

/**
  * Determines how the source image is used on the output DOM element.
  */
@JSGlobal("sap.m.ImageMode")
@js.native
object ImageMode extends js.Object {
  @js.native
  sealed trait Background extends ImageMode
  
  @js.native
  sealed trait Image extends ImageMode
  
}

