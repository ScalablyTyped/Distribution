package typings.mochaSugarFree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HookFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typings.mochaSugarFree.mod.HookContext, 
    scala.Unit
  ]
  /** Construct a type with the properties of T except for those in type K. */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type SuiteFunc = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typings.mochaSugarFree.mod.SuiteContext, 
    scala.Unit
  ]
  type TestCase = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typings.mochaSugarFree.mod.TestContext, 
    scala.Unit | js.Thenable[js.Any]
  ]
  type TestCaseWithDone = js.ThisFunction1[
    /* this */ js.UndefOr[scala.Nothing], 
    /* context */ typings.mochaSugarFree.mod.TestContextWithDone, 
    scala.Unit
  ]
}
