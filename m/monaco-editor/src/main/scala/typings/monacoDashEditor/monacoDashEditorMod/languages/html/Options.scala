package typings.monacoDashEditor.monacoDashEditorMod.languages.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
    */
  val format: js.UndefOr[HTMLFormatConfiguration] = js.undefined
  /**
    * A list of known schemas and/or associations of schemas to file names.
    */
  val suggest: js.UndefOr[CompletionConfiguration] = js.undefined
}

object Options {
  @scala.inline
  def apply(format: HTMLFormatConfiguration = null, suggest: CompletionConfiguration = null): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (suggest != null) __obj.updateDynamic("suggest")(suggest)
    __obj.asInstanceOf[Options]
  }
}

