package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosVppApp extends MobileApp {
  // The store URL.
  var appStoreUrl: js.UndefOr[String] = js.undefined
  // The applicable iOS Device Type.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  // The Identity Name.
  var bundleId: js.UndefOr[String] = js.undefined
  // The supported License Type.
  var licensingType: js.UndefOr[VppLicensingType] = js.undefined
  // The VPP application release date and time.
  var releaseDateTime: js.UndefOr[String] = js.undefined
  // The total number of VPP licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  // The number of VPP licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.undefined
  // The Apple Id associated with the given Apple Volume Purchase Program Token.
  var vppTokenAppleId: js.UndefOr[String] = js.undefined
  // The organization associated with the Apple Volume Purchase Program Token
  var vppTokenOrganizationName: js.UndefOr[String] = js.undefined
}

object IosVppApp {
  @scala.inline
  def apply(
    appStoreUrl: String = null,
    applicableDeviceType: IosDeviceType = null,
    assignments: js.Array[MobileAppAssignment] = null,
    bundleId: String = null,
    categories: js.Array[MobileAppCategory] = null,
    createdDateTime: String = null,
    description: String = null,
    developer: String = null,
    displayName: String = null,
    id: String = null,
    informationUrl: String = null,
    isFeatured: js.UndefOr[Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: String = null,
    licensingType: VppLicensingType = null,
    notes: String = null,
    owner: String = null,
    privacyInformationUrl: String = null,
    publisher: String = null,
    publishingState: MobileAppPublishingState = null,
    releaseDateTime: String = null,
    totalLicenseCount: Int | Double = null,
    usedLicenseCount: Int | Double = null,
    vppTokenAccountType: VppTokenAccountType = null,
    vppTokenAppleId: String = null,
    vppTokenOrganizationName: String = null
  ): IosVppApp = {
    val __obj = js.Dynamic.literal()
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl)
    if (applicableDeviceType != null) __obj.updateDynamic("applicableDeviceType")(applicableDeviceType)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured)
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (licensingType != null) __obj.updateDynamic("licensingType")(licensingType)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (releaseDateTime != null) __obj.updateDynamic("releaseDateTime")(releaseDateTime)
    if (totalLicenseCount != null) __obj.updateDynamic("totalLicenseCount")(totalLicenseCount.asInstanceOf[js.Any])
    if (usedLicenseCount != null) __obj.updateDynamic("usedLicenseCount")(usedLicenseCount.asInstanceOf[js.Any])
    if (vppTokenAccountType != null) __obj.updateDynamic("vppTokenAccountType")(vppTokenAccountType)
    if (vppTokenAppleId != null) __obj.updateDynamic("vppTokenAppleId")(vppTokenAppleId)
    if (vppTokenOrganizationName != null) __obj.updateDynamic("vppTokenOrganizationName")(vppTokenOrganizationName)
    __obj.asInstanceOf[IosVppApp]
  }
}

