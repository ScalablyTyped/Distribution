package typings.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MakeStore = js.Function2[
    /* initialState */ js.Any, 
    /* options */ typings.nextReduxWrapper.mod.MakeStoreOptions, 
    typings.redux.mod.Store[js.Any, typings.redux.mod.AnyAction]
  ]
}
