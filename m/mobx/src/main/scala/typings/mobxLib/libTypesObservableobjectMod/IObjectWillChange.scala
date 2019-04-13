package typings
package mobxLib.libTypesObservableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectWillChange extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.native
  var newValue: js.UndefOr[js.Any] = js.native
  var `object`: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[
    mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.remove | mobxLib.mobxLibStrings.update
  ] = js.native
}

