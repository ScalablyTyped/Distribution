package typings
package mongooseDashSequenceLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait SequenceSchema extends js.Object {
  // overload for the default mongoose plugin function
  def plugin(plugin: js.Function2[/* schema */ js.Any, /* options */ js.UndefOr[js.Object], scala.Unit]): this.type = js.native
  def plugin(
    plugin: js.Function2[/* schema */ this.type, /* options */ SequenceOptions, scala.Unit],
    options: SequenceOptions
  ): this.type = js.native
  // overload for the default mongoose plugin function
  def plugin(
    plugin: js.Function2[/* schema */ js.Any, /* options */ js.UndefOr[js.Object], scala.Unit],
    opts: js.Object
  ): this.type = js.native
}

