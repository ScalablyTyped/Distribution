package typings.nuclearJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Getters have a really complex, recursive type that can't be represented
  // in TypeScript, but at a high level they are all Arrays.
  type Getter = js.Array[js.Any]
}
