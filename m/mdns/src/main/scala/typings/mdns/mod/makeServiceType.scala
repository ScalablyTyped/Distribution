package typings.mdns.mod

import typings.mdns.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "makeServiceType")
@js.native
object makeServiceType extends js.Object {
  def apply(name: String, protocol: String, subtypes: String*): ServiceType = js.native
  def apply(serviceTypeIdentifier: String): ServiceType = js.native
  def apply(serviceTypeIdentifier: js.Array[String]): ServiceType = js.native
  def apply(serviceTypeIdentifier: AnonName): ServiceType = js.native
  def apply(serviceType: ServiceType): ServiceType = js.native
}

