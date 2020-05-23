package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mocha {
  type Mocha = typings.mocha.Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typings.mocha.Mocha.Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.mocha.Mocha.ReporterConstructor
}
