package typings
package oibackoffLib.oibackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackoffInstance extends js.Object {
  def apply[A](
    fn: js.Function1[/* callback */ js.Function1[/* a */ A, scala.Unit], scala.Unit],
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A](
    fn: js.Function1[/* callback */ js.Function1[/* a */ A, scala.Unit], scala.Unit],
    intermediate: BackoffIntermediate[A],
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, P0](
    fn: js.Function2[/* p0 */ P0, /* callback */ js.Function1[/* a */ A, scala.Unit], scala.Unit],
    p0: P0,
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, P0](
    fn: js.Function2[/* p0 */ P0, /* callback */ js.Function1[/* a */ A, scala.Unit], scala.Unit],
    p0: P0,
    intermediate: BackoffIntermediate[A],
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, P0, P1](
    fn: js.Function3[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* callback */ js.Function1[/* a */ A, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, P0, P1](
    fn: js.Function3[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* callback */ js.Function1[/* a */ A, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    intermediate: BackoffIntermediate[A],
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, B, C, D](
    fn: js.Function1[
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D](
    fn: js.Function1[
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    intermediate: BackoffIntermediate[A],
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, P0, P1, P2](
    fn: js.Function4[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* p2 */ P2, 
      /* callback */ js.Function1[/* a */ A, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    p2: P2,
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, P0, P1, P2](
    fn: js.Function4[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* p2 */ P2, 
      /* callback */ js.Function1[/* a */ A, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    p2: P2,
    intermediate: BackoffIntermediate[A],
    callback: js.Function3[/* a */ A, /* b */ scala.Null, /* priorErrors */ js.UndefOr[js.Array[A]], scala.Unit]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0](
    fn: js.Function2[
      /* p0 */ P0, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0](
    fn: js.Function2[
      /* p0 */ P0, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    intermediate: BackoffIntermediate[A],
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0, P1](
    fn: js.Function3[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0, P1](
    fn: js.Function3[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    intermediate: BackoffIntermediate[A],
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0, P1, P2](
    fn: js.Function4[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* p2 */ P2, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    p2: P2,
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply[A, B, C, D, P0, P1, P2](
    fn: js.Function4[
      /* p0 */ P0, 
      /* p1 */ P1, 
      /* p2 */ P2, 
      /* callback */ js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, scala.Unit], 
      scala.Unit
    ],
    p0: P0,
    p1: P1,
    p2: P2,
    intermediate: BackoffIntermediate[A],
    callback: js.Function4[
      /* a */ A, 
      /* b */ js.UndefOr[B | scala.Null], 
      /* priorErrorsOrC */ js.UndefOr[C | js.Array[A]], 
      /* d */ js.UndefOr[D], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

