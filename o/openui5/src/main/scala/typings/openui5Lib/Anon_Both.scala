package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Both extends js.Object {
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

object Anon_Both {
  @scala.inline
  def apply(Both: js.Any, Inline: js.Any, InlineRepeat: js.Any, None: js.Any, Request: js.Any): Anon_Both = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Both")(Both)
    __obj.updateDynamic("Inline")(Inline)
    __obj.updateDynamic("InlineRepeat")(InlineRepeat)
    __obj.updateDynamic("None")(None)
    __obj.updateDynamic("Request")(Request)
    __obj.asInstanceOf[Anon_Both]
  }
}

