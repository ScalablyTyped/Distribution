package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.default
  - typings.microsoftGraph.microsoftGraphStrings.conferenceRoom
  - typings.microsoftGraph.microsoftGraphStrings.homeAddress
  - typings.microsoftGraph.microsoftGraphStrings.businessAddress
  - typings.microsoftGraph.microsoftGraphStrings.geoCoordinates
  - typings.microsoftGraph.microsoftGraphStrings.streetAddress
  - typings.microsoftGraph.microsoftGraphStrings.hotel
  - typings.microsoftGraph.microsoftGraphStrings.restaurant
  - typings.microsoftGraph.microsoftGraphStrings.localBusiness
  - typings.microsoftGraph.microsoftGraphStrings.postalAddress
*/
trait LocationType extends js.Object

object LocationType {
  @scala.inline
  def businessAddress: typings.microsoftGraph.microsoftGraphStrings.businessAddress = this.cast("businessAddress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def conferenceRoom: typings.microsoftGraph.microsoftGraphStrings.conferenceRoom = this.cast("conferenceRoom")
  @scala.inline
  def default: typings.microsoftGraph.microsoftGraphStrings.default = this.cast("default")
  @scala.inline
  def geoCoordinates: typings.microsoftGraph.microsoftGraphStrings.geoCoordinates = this.cast("geoCoordinates")
  @scala.inline
  def homeAddress: typings.microsoftGraph.microsoftGraphStrings.homeAddress = this.cast("homeAddress")
  @scala.inline
  def hotel: typings.microsoftGraph.microsoftGraphStrings.hotel = this.cast("hotel")
  @scala.inline
  def localBusiness: typings.microsoftGraph.microsoftGraphStrings.localBusiness = this.cast("localBusiness")
  @scala.inline
  def postalAddress: typings.microsoftGraph.microsoftGraphStrings.postalAddress = this.cast("postalAddress")
  @scala.inline
  def restaurant: typings.microsoftGraph.microsoftGraphStrings.restaurant = this.cast("restaurant")
  @scala.inline
  def streetAddress: typings.microsoftGraph.microsoftGraphStrings.streetAddress = this.cast("streetAddress")
}

