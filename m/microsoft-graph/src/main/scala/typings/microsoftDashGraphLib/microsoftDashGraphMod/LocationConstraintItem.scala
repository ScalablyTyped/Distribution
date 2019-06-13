package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraintItem extends Location {
  /**
    * If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free.
    * If set to false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without checking if it's free. Default is true.
    */
  var resolveAvailability: js.UndefOr[scala.Boolean] = js.undefined
}

object LocationConstraintItem {
  @scala.inline
  def apply(
    address: PhysicalAddress = null,
    coordinates: OutlookGeoCoordinates = null,
    displayName: java.lang.String = null,
    locationEmailAddress: java.lang.String = null,
    locationType: LocationType = null,
    locationUri: java.lang.String = null,
    resolveAvailability: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueId: java.lang.String = null,
    uniqueIdType: LocationUniqueIdType = null
  ): LocationConstraintItem = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (locationEmailAddress != null) __obj.updateDynamic("locationEmailAddress")(locationEmailAddress)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    if (locationUri != null) __obj.updateDynamic("locationUri")(locationUri)
    if (!js.isUndefined(resolveAvailability)) __obj.updateDynamic("resolveAvailability")(resolveAvailability)
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId)
    if (uniqueIdType != null) __obj.updateDynamic("uniqueIdType")(uniqueIdType)
    __obj.asInstanceOf[LocationConstraintItem]
  }
}

