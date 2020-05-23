package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a setting of the add-in.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.Setting")
@js.native
class Setting ()
  extends typings.officeJsPreview.Word.Setting {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

/* static members */
@JSGlobal("Word.Setting")
@js.native
object Setting extends js.Object {
  var DateJSONPrefix: js.Any = js.native
  var DateJSONSuffix: js.Any = js.native
  def _replaceDateWithStringDate(value: js.Any): js.Any = js.native
  /* private */ def replaceStringDateWithDate(value: js.Any): js.Any = js.native
}

