package typings.phonegap

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends js.Object {
  
  var addresses: js.Array[ContactAddress] = js.native
  
  var birthday: Date = js.native
  
  var categories: js.Array[ContactField] = js.native
  
  var displayName: String = js.native
  
  var emails: js.Array[ContactField] = js.native
  
  var id: String = js.native
  
  var ims: js.Array[ContactField] = js.native
  
  var name: ContactName = js.native
  
  var nickname: String = js.native
  
  var note: String = js.native
  
  var organizations: js.Array[ContactOrganization] = js.native
  
  var phoneNumbers: js.Array[ContactField] = js.native
  
  var photos: js.Array[ContactField] = js.native
  
  def remove(): Unit = js.native
  def remove(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* contactError */ ContactError, Unit]): Unit = js.native
  def remove(onSuccess: js.Function1[/* contacts */ Contacts, Unit]): Unit = js.native
  def remove(
    onSuccess: js.Function1[/* contacts */ Contacts, Unit],
    onError: js.Function1[/* contactError */ ContactError, Unit]
  ): Unit = js.native
  
  def save(): Unit = js.native
  def save(onSuccess: js.UndefOr[scala.Nothing], onError: js.Function1[/* contactError */ ContactError, Unit]): Unit = js.native
  def save(onSuccess: js.Function1[/* contacts */ Contacts, Unit]): Unit = js.native
  def save(
    onSuccess: js.Function1[/* contacts */ Contacts, Unit],
    onError: js.Function1[/* contactError */ ContactError, Unit]
  ): Unit = js.native
  
  var urls: js.Array[ContactField] = js.native
}
