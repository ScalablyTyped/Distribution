package typings.mongooseSimpleRandom.mod

import typings.mongoose.mod.ModelProperties
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("mongoose", JSImport.Namespace)
@js.native
object mongooseAugmentingMod extends js.Object {
  
  @js.native
  trait Model[T /* <: Document */]
    extends EventEmitter
       with ModelProperties {
    
    def findRandom(conditions: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.UndefOr[scala.Nothing], options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.UndefOr[scala.Nothing],
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.UndefOr[scala.Nothing],
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: Null, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
  }
}
