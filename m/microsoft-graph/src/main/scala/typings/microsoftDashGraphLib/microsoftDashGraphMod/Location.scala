package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  // The street address of the location.
  var address: js.UndefOr[PhysicalAddress] = js.undefined
  // The geographic coordinates and elevation of the location.
  var coordinates: js.UndefOr[OutlookGeoCoordinates] = js.undefined
  // The name associated with the location.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Optional email address of the location.
  var locationEmailAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates,
    * streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
    */
  var locationType: js.UndefOr[LocationType] = js.undefined
  // Optional URI representing the location.
  var locationUri: js.UndefOr[java.lang.String] = js.undefined
  // For internal use only.
  var uniqueId: js.UndefOr[java.lang.String] = js.undefined
  // For internal use only.
  var uniqueIdType: js.UndefOr[LocationUniqueIdType] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    address: PhysicalAddress = null,
    coordinates: OutlookGeoCoordinates = null,
    displayName: java.lang.String = null,
    locationEmailAddress: java.lang.String = null,
    locationType: LocationType = null,
    locationUri: java.lang.String = null,
    uniqueId: java.lang.String = null,
    uniqueIdType: LocationUniqueIdType = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (locationEmailAddress != null) __obj.updateDynamic("locationEmailAddress")(locationEmailAddress)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    if (locationUri != null) __obj.updateDynamic("locationUri")(locationUri)
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId)
    if (uniqueIdType != null) __obj.updateDynamic("uniqueIdType")(uniqueIdType)
    __obj.asInstanceOf[Location]
  }
}

