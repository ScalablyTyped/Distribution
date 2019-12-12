package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Document class.
  *
  * [Api set:  1.1]
  */
@js.native
trait DocumentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents a Visio application instance that contains this document.
    *
    * [Api set:  1.1]
    */
  var application: js.UndefOr[ApplicationLoadOptions] = js.native
  /**
    *
    * Returns the DocumentView object.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[DocumentViewLoadOptions] = js.native
}

