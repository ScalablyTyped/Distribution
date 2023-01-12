package typings.oibackoff

import typings.oibackoff.oibackoffStrings.exponential
import typings.oibackoff.oibackoffStrings.fibonacci
import typings.oibackoff.oibackoffStrings.incremental
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oibackoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def backoff(): BackoffInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("backoff")().asInstanceOf[BackoffInstance]
  inline def backoff(opts: BackoffOptions): BackoffInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("backoff")(opts.asInstanceOf[js.Any]).asInstanceOf[BackoffInstance]
  
  inline def exponential(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fibonacci(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fibonacci")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def incremental(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("incremental")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
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
  
  trait BackoffOptions extends StObject {
    
    var algorithm: js.UndefOr[incremental | exponential | fibonacci] = js.undefined
    
    var delayRatio: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
    
    var maxTries: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    inline def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackoffOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: incremental | exponential | fibonacci): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDelayRatio(value: Double): Self = StObject.set(x, "delayRatio", value.asInstanceOf[js.Any])
      
      inline def setDelayRatioUndefined: Self = StObject.set(x, "delayRatio", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
      
      inline def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      inline def setMaxTriesUndefined: Self = StObject.set(x, "maxTries", js.undefined)
    }
  }
}
