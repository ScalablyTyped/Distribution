package typings.mdns.mod

import typings.mdns.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdns", "ServiceType")
@js.native
class ServiceTypeCls protected () extends ServiceType {
  def this(serviceTypeIdentifier: String) = this()
  def this(serviceTypeIdentifier: js.Array[String]) = this()
  def this(serviceTypeIdentifier: Name) = this()
  def this(serviceType: ServiceType) = this()
  def this(name: String, protocol: String, subtypes: String*) = this()
}
