package typings.nodegit.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Promise")
@js.native
class Promise[T] protected ()
  extends typings.std.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used to resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

@JSImport("nodegit", "Promise")
@js.native
object Promise
  extends TopLevel[
      PromiseConstructor with (Instantiable1[
        /* executor */ js.Function2[
          /* resolve */ js.Function1[
            /* value */ js.UndefOr[
              (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
            ], 
            Unit
          ], 
          /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
          Unit
        ], 
        typings.std.global.Promise[js.Object]
      ])
    ]

