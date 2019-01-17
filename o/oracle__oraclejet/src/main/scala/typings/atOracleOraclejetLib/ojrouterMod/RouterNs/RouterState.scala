package typings
package atOracleOraclejetLib.ojrouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var canEnter: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]
  var canExit: js.Function0[scala.Boolean] | js.Function0[js.Promise[scala.Boolean]]
  var enter: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]
  var exit: js.Function0[scala.Unit] | js.Function0[js.Promise[scala.Unit]]
  val id: java.lang.String
  var label: js.UndefOr[java.lang.String]
  var parameters: js.Object
  var title: java.lang.String | js.Function0[js.UndefOr[java.lang.String]]
  var value: js.Any
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[atOracleOraclejetLib.Anon_HasChanged]
  def isCurrent(): scala.Boolean
}

