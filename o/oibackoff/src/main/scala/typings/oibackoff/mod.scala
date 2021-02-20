package typings.oibackoff

import typings.oibackoff.oibackoffStrings.exponential
import typings.oibackoff.oibackoffStrings.fibonacci
import typings.oibackoff.oibackoffStrings.incremental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oibackoff", "backoff")
  @js.native
  def backoff(): BackoffInstance = js.native
  @JSImport("oibackoff", "backoff")
  @js.native
  def backoff(opts: BackoffOptions): BackoffInstance = js.native
  
  @JSImport("oibackoff", "exponential")
  @js.native
  def exponential(n: Double): Double = js.native
  
  @JSImport("oibackoff", "fibonacci")
  @js.native
  def fibonacci(n: Double): Double = js.native
  
  @JSImport("oibackoff", "incremental")
  @js.native
  def incremental(n: Double): Double = js.native
  
  @js.native
  trait BackoffInstance extends StObject {
    
    def apply[A](
      fn: js.Function1[/* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A](
      fn: js.Function1[/* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, P0](
      fn: js.Function2[/* p0 */ P0, /* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      p0: P0,
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, P0](
      fn: js.Function2[/* p0 */ P0, /* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      p0: P0,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, P0, P1](
      fn: js.Function3[/* p0 */ P0, /* p1 */ P1, /* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      p0: P0,
      p1: P1,
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, P0, P1](
      fn: js.Function3[/* p0 */ P0, /* p1 */ P1, /* callback */ js.Function1[/* a */ A | Null, Unit], Unit],
      p0: P0,
      p1: P1,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, B, C, D](
      fn: js.Function1[
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D](
      fn: js.Function1[
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, P0, P1, P2](
      fn: js.Function4[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* p2 */ P2, 
          /* callback */ js.Function1[/* a */ A | Null, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      p2: P2,
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, P0, P1, P2](
      fn: js.Function4[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* p2 */ P2, 
          /* callback */ js.Function1[/* a */ A | Null, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      p2: P2,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function3[/* a */ A | Null, /* b */ Null, /* priorErrors */ js.UndefOr[js.Array[A]], Unit]
    ): Unit = js.native
    def apply[A, B, C, D, P0](
      fn: js.Function2[
          /* p0 */ P0, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D, P0](
      fn: js.Function2[
          /* p0 */ P0, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D, P0, P1](
      fn: js.Function3[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D, P0, P1](
      fn: js.Function3[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D, P0, P1, P2](
      fn: js.Function4[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* p2 */ P2, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      p2: P2,
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
    def apply[A, B, C, D, P0, P1, P2](
      fn: js.Function4[
          /* p0 */ P0, 
          /* p1 */ P1, 
          /* p2 */ P2, 
          /* callback */ js.Function4[/* a */ A | Null, /* b */ B, /* c */ C, /* d */ D, Unit], 
          Unit
        ],
      p0: P0,
      p1: P1,
      p2: P2,
      intermediate: BackoffIntermediate[A | Null],
      callback: js.Function4[
          /* a */ A | Null, 
          /* b */ js.UndefOr[B | Null], 
          /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
          /* d */ js.UndefOr[D], 
          Unit
        ]
    ): Unit = js.native
  }
  
  type BackoffIntermediate[A] = js.Function3[/* err */ A, /* tries */ Double, /* delay */ Double, Boolean]
  
  @js.native
  trait BackoffOptions extends StObject {
    
    var algorithm: js.UndefOr[incremental | exponential | fibonacci] = js.native
    
    var delayRatio: js.UndefOr[Double] = js.native
    
    var maxDelay: js.UndefOr[Double] = js.native
    
    var maxTries: js.UndefOr[Double] = js.native
  }
  object BackoffOptions {
    
    @scala.inline
    def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit class BackoffOptionsMutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: incremental | exponential | fibonacci): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setDelayRatio(value: Double): Self = StObject.set(x, "delayRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayRatioUndefined: Self = StObject.set(x, "delayRatio", js.undefined)
      
      @scala.inline
      def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      @scala.inline
      def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTriesUndefined: Self = StObject.set(x, "maxTries", js.undefined)
    }
  }
}
