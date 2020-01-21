package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraintItem extends Location {
  /**
    * If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to
    * false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without
    * checking if it's free. Default is true.
    */
  var resolveAvailability: js.UndefOr[Boolean] = js.undefined
}

object LocationConstraintItem {
  @scala.inline
  def apply(
    address: PhysicalAddress = null,
    coordinates: OutlookGeoCoordinates = null,
    displayName: String = null,
    locationEmailAddress: String = null,
    locationType: LocationType = null,
    locationUri: String = null,
    resolveAvailability: js.UndefOr[Boolean] = js.undefined,
    uniqueId: String = null,
    uniqueIdType: LocationUniqueIdType = null
  ): LocationConstraintItem = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (locationEmailAddress != null) __obj.updateDynamic("locationEmailAddress")(locationEmailAddress.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (locationUri != null) __obj.updateDynamic("locationUri")(locationUri.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveAvailability)) __obj.updateDynamic("resolveAvailability")(resolveAvailability.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    if (uniqueIdType != null) __obj.updateDynamic("uniqueIdType")(uniqueIdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraintItem]
  }
}

