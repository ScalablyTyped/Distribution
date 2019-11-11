package typings.atOctokitRequestDashError.distDashTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorOptions extends js.Object {
  var headers: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any
  ] = js.undefined
  var request: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestOptions */ js.Any
}

object RequestErrorOptions {
  @scala.inline
  def apply(
    request: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RequestOptions */ js.Any,
    headers: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any = null
  ): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(request = request)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RequestErrorOptions]
  }
}

