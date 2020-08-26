package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `18`[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): Insert = js.native
}

object `18` {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => Insert): `18`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`18`[K, D]]
  }
  @scala.inline
  implicit class `18Ops`[Self <: `18`[_, _], K, D] (val x: Self with (`18`[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderer(value: RootNodeContext[K, D] => Insert): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
  
}

