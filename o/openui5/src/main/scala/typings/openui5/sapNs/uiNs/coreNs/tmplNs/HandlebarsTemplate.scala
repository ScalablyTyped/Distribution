package typings.openui5.sapNs.uiNs.coreNs.tmplNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl.HandlebarsTemplate")
@js.native
abstract class HandlebarsTemplate protected () extends Template {
  /**
    * Creates and initializes a new handlebars template with the given <code>sId</code>and settings.The
    * set of allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
    * described there.
    * @param sId optional id for the new template; generated automatically if           no non-empty id is
    * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
    * not!
    * @param mSettings optional map/JSON-object with initial settings for the           new component
    * instance
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
}

