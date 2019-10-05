package typings.mdns.mdnsMod

import typings.mdns.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "ServiceType")
@js.native
class ServiceTypeCls protected () extends ServiceType {
  def this(serviceTypeIdentifier: String) = this()
  def this(serviceTypeIdentifier: js.Array[String]) = this()
  def this(serviceTypeIdentifier: Anon_Name) = this()
  def this(serviceType: ServiceType) = this()
  def this(name: String, protocol: String, subtypes: String*) = this()
}

