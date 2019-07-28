package typings

import typings.mocha.MochaNs.Done
import typings.mocha.MochaNs.MochaGlobals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mocha {
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.mocha.MochaNs.ReporterConstructor
  // Augments the DOM `Window` object when lib.dom.d.ts is loaded.
  // tslint:disable-next-line no-empty-interface
  type Window = MochaGlobals
}
