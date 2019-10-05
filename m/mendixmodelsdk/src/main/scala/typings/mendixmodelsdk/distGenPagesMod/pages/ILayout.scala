package typings.mendixmodelsdk.distGenPagesMod.pages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/layout relevant section in reference guide}
  */
@js.native
trait ILayout extends IFormBase {
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.0.0: introduced
    */
  val content: ILayoutContent = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.17.0: added public
    * In version 6.8.0: added optional
    */
  val layoutCall: ILayoutCall | Null = js.native
  /**
    * In version 8.0.0: deleted
    * In version 6.8.0: added public
    */
  val layoutType: LayoutType = js.native
}

