package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mochaLib {
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = mochaLib.MochaNs.Done
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = mochaLib.MochaNs.ReporterConstructor
  // Augments the DOM `Window` object when lib.dom.d.ts is loaded.
  // tslint:disable-next-line no-empty-interface
  type Window = mochaLib.MochaNs.MochaGlobals
}
