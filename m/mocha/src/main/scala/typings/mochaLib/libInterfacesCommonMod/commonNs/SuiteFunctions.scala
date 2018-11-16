package typings
package mochaLib.libInterfacesCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SuiteFunctions extends js.Object {
  /**
               * Creates a suite.
               */
  def create(opts: CreateOptions): mochaLib.MochaNs.Suite
  /**
               * Create an exclusive Suite; convenience function
               */
  def only(opts: CreateOptions): mochaLib.MochaNs.Suite
  /**
               * Create a Suite, but skip it; convenience function
               */
  def skip(opts: CreateOptions): mochaLib.MochaNs.Suite
}

