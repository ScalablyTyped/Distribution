package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type GetCurrentPages = js.Function0[
    typings.minappEnv.Array[(typings.minappEnv.Page.PageInstance[js.Object, js.Object]) with js.Object]
  ]
  type PageConstructor = js.Function1[
    /* options */ (typings.minappEnv.Page.PageInstance[
      typings.minappEnv.IAnyObject, 
      typings.minappEnv.IAnyObject with (typings.minappEnv.Page.PageInstance[_, _])
    ]) with typings.minappEnv.IAnyObject with (typings.minappEnv.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
