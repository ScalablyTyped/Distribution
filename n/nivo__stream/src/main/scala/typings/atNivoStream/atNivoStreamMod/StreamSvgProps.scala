package typings.atNivoStream.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @nivo/core.Anon_Animate ]:? @nivo/core.Anon_Animate[P]} */ trait StreamSvgProps[T] extends StreamProps[T]

object StreamSvgProps {
  @scala.inline
  def apply[T](data: js.Array[T], keys: js.Array[String]): StreamSvgProps[T] = {
    val __obj = js.Dynamic.literal(data = data, keys = keys)
  
    __obj.asInstanceOf[StreamSvgProps[T]]
  }
}

