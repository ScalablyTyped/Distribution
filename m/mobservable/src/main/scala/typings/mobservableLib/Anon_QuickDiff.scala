package typings
package mobservableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QuickDiff extends js.Object {
  var isComputingView: js.Function0[scala.Boolean]
  var quickDiff: js.Function2[
    /* current */ js.Array[_], 
    /* base */ js.Array[_], 
    js.Tuple2[js.Array[_], js.Array[_]]
  ]
}

