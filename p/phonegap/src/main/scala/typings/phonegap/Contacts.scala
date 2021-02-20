package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contacts extends StObject {
  
  def create(): Contact = js.native
  def create(properties: js.Any): Contact = js.native
  
  def find(
    contactFields: js.Array[String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    contactError: js.Function1[/* error */ ContactError, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    contactError: js.Function1[/* error */ ContactError, Unit],
    contactFindOptions: ContactFindOptions
  ): Unit = js.native
}
