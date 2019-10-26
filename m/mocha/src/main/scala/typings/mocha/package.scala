package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mocha {
  import typings.mocha.Mocha.Done

  type Mocha = Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.mocha.Mocha.ReporterConstructor
}
