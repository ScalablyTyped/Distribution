package typings.mendixmodelsdk.pagesMod.pages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/page-template relevant section in reference guide}
  *
  * In version 7.7.0: introduced
  */
@js.native
trait IPageTemplate extends ITemplateFormBase {
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  val layoutCall: ILayoutCall = js.native
  /**
    * In version 7.17.0: added public
    */
  val `type`: PageTemplateType = js.native
}

