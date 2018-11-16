package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  var addresses: js.Array[ContactAddress] = js.native
  var birthday: stdLib.Date = js.native
  var categories: js.Array[ContactField] = js.native
  var displayName: java.lang.String = js.native
  var emails: js.Array[ContactField] = js.native
  var id: java.lang.String = js.native
  var ims: js.Array[ContactField] = js.native
  var name: ContactName = js.native
  var nickname: java.lang.String = js.native
  var note: java.lang.String = js.native
  var organizations: js.Array[ContactOrganization] = js.native
  var phoneNumbers: js.Array[ContactField] = js.native
  var photos: js.Array[ContactField] = js.native
  var urls: js.Array[ContactField] = js.native
  def remove(): scala.Unit = js.native
  def remove(onSuccess: js.Function1[/* contacts */ Contacts, scala.Unit]): scala.Unit = js.native
  def remove(
    onSuccess: js.Function1[/* contacts */ Contacts, scala.Unit],
    onError: js.Function1[/* contactError */ ContactError, scala.Unit]
  ): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def save(onSuccess: js.Function1[/* contacts */ Contacts, scala.Unit]): scala.Unit = js.native
  def save(
    onSuccess: js.Function1[/* contacts */ Contacts, scala.Unit],
    onError: js.Function1[/* contactError */ ContactError, scala.Unit]
  ): scala.Unit = js.native
}

