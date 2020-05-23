package typings.openfin.contextMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /**
  * @hidden
  * Custom properties and metadata. This can be extended in specific context object.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * An optional map of any equivalent identifiers for the context type, e.g. ISIN, CUSIP, etc. for an instrument.
    */
  var id: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  /**
    * The name of the context data (optional). This is a text string that describes the data being sent.
    * Implementors of context may choose to make the name mandatory.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The type of the context that uniquely identifies it, e.g. "fdc3.instrument".
    * This is used to refer to the accepted context(s) when declaring intents. See [[AppDirIntent]].
    */
  var `type`: String
}

object Context {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    id: StringDictionary[js.UndefOr[String]] = null,
    name: String = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

