package typings
package objectDashInspectLib.objectDashInspectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("object-inspect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Return a string `s` with the string representation of `obj` up to a depth of `opts.depth`.
    *
    * @param obj Object to inspect
    * @param opts Inspection options. Default: `{}`.
    * @return String representation of `obj`
    */
  def apply(obj: js.Any): java.lang.String = js.native
  def apply(obj: js.Any, opts: objectDashInspectLib.objectDashInspectMod.objectInspectNs.Options): java.lang.String = js.native
}

