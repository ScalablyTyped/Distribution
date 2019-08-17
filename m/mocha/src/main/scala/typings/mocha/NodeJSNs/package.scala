package typings.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJSNs {
  import typings.mocha.MochaNs.MochaGlobals

  // Augments NodeJS's `global` object when node.d.ts is loaded
  // tslint:disable-next-line no-empty-interface
  type Global = MochaGlobals
}
