package typings.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  // Augments NodeJS's `global` object when node.d.ts is loaded
  // tslint:disable-next-line no-empty-interface
  type Global = typings.mocha.Mocha_.MochaGlobals
}
