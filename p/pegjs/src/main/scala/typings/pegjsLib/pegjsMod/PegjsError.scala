package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PegjsError
  extends stdLib.Error {
  var expected: js.UndefOr[js.Array[ExpectedItem]] = js.undefined
  var found: js.UndefOr[js.Any] = js.undefined
  var location: LocationRange
  @JSName("stack")
  var stack_PegjsError: js.UndefOr[js.Any] = js.undefined
}

