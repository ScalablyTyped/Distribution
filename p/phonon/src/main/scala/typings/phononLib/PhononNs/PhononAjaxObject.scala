package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PhononAjaxObject extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var crossDomain: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: java.lang.String
  var error: js.UndefOr[
    js.Function3[
      /* res */ js.Any, 
      /* flagError */ PhononAjaxErrorFlag, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  def success(res: js.Any, xhr: stdLib.XMLHttpRequest): scala.Unit
}

