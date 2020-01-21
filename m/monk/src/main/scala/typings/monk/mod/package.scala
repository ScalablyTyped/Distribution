package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type TFields = java.lang.String | js.Array[java.lang.String]
  type TMiddleware = js.Function1[
    /* hasCollectionMonkInstance */ typings.monk.AnonCollection, 
    js.Function1[
      /* next */ js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]], 
      js.Function2[/* args */ js.Object, /* method */ java.lang.String, js.Promise[js.Any]]
    ]
  ]
  type TQuery = java.lang.String | js.Object
}
