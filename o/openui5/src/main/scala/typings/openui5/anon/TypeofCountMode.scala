package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCountMode extends js.Object {
  /**
    * Count is retrieved by a separate request upfront and inline with each data request
    */
  var Both: js.Any
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in the data request
    */
  var Inline: js.Any
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in every data request
    */
  var InlineRepeat: js.Any
  /**
    * Count is not requested from the server
    */
  var None: js.Any
  /**
    * Count is retrieved by sending a separate $count request, before requesting data
    */
  var Request: js.Any
}

object TypeofCountMode {
  @scala.inline
  def apply(Both: js.Any, Inline: js.Any, InlineRepeat: js.Any, None: js.Any, Request: js.Any): TypeofCountMode = {
    val __obj = js.Dynamic.literal(Both = Both.asInstanceOf[js.Any], Inline = Inline.asInstanceOf[js.Any], InlineRepeat = InlineRepeat.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCountMode]
  }
}

