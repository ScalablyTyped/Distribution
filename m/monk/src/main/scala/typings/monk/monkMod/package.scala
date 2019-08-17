package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object monkMod {
  import typings.monk.Anon_Collection

  type TFields = String | js.Array[String]
  type TMiddleware = js.Function1[
    /* hasCollectionMonkInstance */ Anon_Collection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ String, js.Promise[js.Any]], 
      js.Function2[/* args */ js.Object, /* method */ String, js.Promise[js.Any]]
    ]
  ]
  type TQuery = String | js.Object
}
