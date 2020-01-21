package typings.octokitRequestError.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorOptions extends js.Object {
  var headers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any
  ] = js.undefined
  var request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any
}

object RequestErrorOptions {
  @scala.inline
  def apply(
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any,
    headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseHeaders */ js.Any = null
  ): RequestErrorOptions = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorOptions]
  }
}

