package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contacts extends js.Object {
  def create(): Contact = js.native
  def create(properties: js.Any): Contact = js.native
  def find(
    contactFields: js.Array[java.lang.String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], scala.Unit],
    contactError: js.Function1[/* error */ ContactError, scala.Unit]
  ): scala.Unit = js.native
  def find(
    contactFields: js.Array[java.lang.String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], scala.Unit],
    contactError: js.Function1[/* error */ ContactError, scala.Unit],
    contactFindOptions: ContactFindOptions
  ): scala.Unit = js.native
}

