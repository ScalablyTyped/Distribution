package typings.monacoEditor.mod.languages.json

import typings.monacoEditor.AnonFileMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticsOptions extends js.Object {
  /**
    * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
    */
  val allowComments: js.UndefOr[Boolean] = js.undefined
  /**
    *  If set, the schema service would load schema content on-demand with 'fetch' if available
    */
  val enableSchemaRequest: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of known schemas and/or associations of schemas to file names.
    */
  val schemas: js.UndefOr[js.Array[AnonFileMatch]] = js.undefined
  /**
    * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
    */
  val validate: js.UndefOr[Boolean] = js.undefined
}

object DiagnosticsOptions {
  @scala.inline
  def apply(
    allowComments: js.UndefOr[Boolean] = js.undefined,
    enableSchemaRequest: js.UndefOr[Boolean] = js.undefined,
    schemas: js.Array[AnonFileMatch] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): DiagnosticsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowComments)) __obj.updateDynamic("allowComments")(allowComments.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSchemaRequest)) __obj.updateDynamic("enableSchemaRequest")(enableSchemaRequest.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticsOptions]
  }
}

