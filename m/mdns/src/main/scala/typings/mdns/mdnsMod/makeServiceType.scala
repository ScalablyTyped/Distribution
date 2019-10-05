package typings.mdns.mdnsMod

import typings.mdns.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", "makeServiceType")
@js.native
object makeServiceType extends js.Object {
  def apply(name: String, protocol: String, subtypes: String*): ServiceType = js.native
  def apply(serviceTypeIdentifier: String): ServiceType = js.native
  def apply(serviceTypeIdentifier: js.Array[String]): ServiceType = js.native
  def apply(serviceTypeIdentifier: Anon_Name): ServiceType = js.native
  def apply(serviceType: ServiceType): ServiceType = js.native
}

