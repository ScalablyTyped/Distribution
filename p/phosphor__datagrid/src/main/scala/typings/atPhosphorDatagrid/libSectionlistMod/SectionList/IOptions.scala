package typings.atPhosphorDatagrid.libSectionlistMod.SectionList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a section list.
  */
trait IOptions extends js.Object {
  /**
    * The size of new sections added to the list.
    */
  var baseSize: Double
}

object IOptions {
  @scala.inline
  def apply(baseSize: Double): IOptions = {
    val __obj = js.Dynamic.literal(baseSize = baseSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

