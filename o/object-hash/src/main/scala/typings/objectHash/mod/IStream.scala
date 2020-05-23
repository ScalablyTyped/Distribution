package typings.objectHash.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStream extends js.Object {
  var update: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BufferEncoding */ /* encoding */ js.Any, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BufferEncoding */ /* encoding */ js.Any, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object IStream {
  @scala.inline
  def apply(
    update: (/* chunk */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BufferEncoding */ /* encoding */ js.Any, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit = null,
    write: (/* chunk */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BufferEncoding */ /* encoding */ js.Any, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit = null
  ): IStream = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3(update))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    __obj.asInstanceOf[IStream]
  }
}

