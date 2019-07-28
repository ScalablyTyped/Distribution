package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memoizerific {
  type memoize = js.Function1[
    /* fn */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
}
