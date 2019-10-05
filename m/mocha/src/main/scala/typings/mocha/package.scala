package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mocha {
  import typings.mocha.Mocha.Done
  import typings.mocha.Mocha.MochaGlobals

  type Mocha = Mocha_
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typings.mocha.Mocha.ReporterConstructor
  // Augments the DOM `Window` object when lib.dom.d.ts is loaded.
  // tslint:disable-next-line no-empty-interface
  type Window = MochaGlobals
}
