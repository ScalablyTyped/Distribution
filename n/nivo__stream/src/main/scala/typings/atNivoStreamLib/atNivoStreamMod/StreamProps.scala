package typings
package atNivoStreamLib.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @nivo/stream.@nivo/stream.OptionalStreamProps<@nivo/stream.@nivo/stream.OptionalStreamProps<T>> ]:? @nivo/stream.@nivo/stream.OptionalStreamProps<@nivo/stream.@nivo/stream.OptionalStreamProps<T>>[P]} */ trait StreamProps[T] extends js.Object {
  var data: js.Array[T]
  var keys: js.Array[java.lang.String]
}

object StreamProps {
  @scala.inline
  def apply[T](data: js.Array[T], keys: js.Array[java.lang.String]): StreamProps[T] = {
    val __obj = js.Dynamic.literal(data = data, keys = keys)
  
    __obj.asInstanceOf[StreamProps[T]]
  }
}

