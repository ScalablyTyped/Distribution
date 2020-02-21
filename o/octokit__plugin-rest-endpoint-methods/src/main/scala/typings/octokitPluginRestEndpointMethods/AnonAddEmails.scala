package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddEmails extends js.Object {
  var addEmails: AnonMethodParamsUrlAnonEmails
  var block: AnonMethodParamsUrlAnonUsername
  var checkBlocked: AnonMethodParamsUrlAnonUsername
  var checkFollowing: AnonMethodParamsUrlAnonUsername
  var checkFollowingForUser: AnonMethodParamsUrlAnonTargetuser
  var createGpgKey: AnonMethodParamsUrlAnonArmoredpublickey
  var createPublicKey: AnonMethodParamsUrlAnonKeyTitle
  var deleteEmails: AnonMethodParamsUrlAnonEmails
  var deleteGpgKey: AnonMethodParamsUrlAnonGpgkeyid
  var deletePublicKey: AnonMethodParamsUrlAnonKeyidAnonRequired
  var follow: AnonMethodParamsUrlAnonUsername
  var getAuthenticated: AnonMethodParamsUrlString
  var getByUsername: AnonMethodParamsUrlAnonUsername
  var getContextForUser: AnonMethodParamsUrlAnonSubjectid
  var getGpgKey: AnonMethodParamsUrlAnonGpgkeyid
  var getPublicKey: AnonMethodParamsUrlAnonKeyidAnonRequired
  var list: AnonMethodParamsUrlAnonPagePerpageSince
  var listBlocked: AnonMethodParamsUrlString
  var listEmails: AnonMethodParamsUrlAnonPagePerpage
  var listFollowersForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listFollowersForUser: AnonMethodParamsUrlAnonPage
  var listFollowingForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listFollowingForUser: AnonMethodParamsUrlAnonPage
  var listGpgKeys: AnonMethodParamsUrlAnonPagePerpage
  var listGpgKeysForUser: AnonMethodParamsUrlAnonPage
  var listPublicEmails: AnonMethodParamsUrlAnonPagePerpage
  var listPublicKeys: AnonMethodParamsUrlAnonPagePerpage
  var listPublicKeysForUser: AnonMethodParamsUrlAnonPage
  var togglePrimaryEmailVisibility: AnonMethodParamsUrlAnonEmailVisibility
  var unblock: AnonMethodParamsUrlAnonUsername
  var unfollow: AnonMethodParamsUrlAnonUsername
  var updateAuthenticated: AnonMethodParamsUrlAnonBio
}

object AnonAddEmails {
  @scala.inline
  def apply(
    addEmails: AnonMethodParamsUrlAnonEmails,
    block: AnonMethodParamsUrlAnonUsername,
    checkBlocked: AnonMethodParamsUrlAnonUsername,
    checkFollowing: AnonMethodParamsUrlAnonUsername,
    checkFollowingForUser: AnonMethodParamsUrlAnonTargetuser,
    createGpgKey: AnonMethodParamsUrlAnonArmoredpublickey,
    createPublicKey: AnonMethodParamsUrlAnonKeyTitle,
    deleteEmails: AnonMethodParamsUrlAnonEmails,
    deleteGpgKey: AnonMethodParamsUrlAnonGpgkeyid,
    deletePublicKey: AnonMethodParamsUrlAnonKeyidAnonRequired,
    follow: AnonMethodParamsUrlAnonUsername,
    getAuthenticated: AnonMethodParamsUrlString,
    getByUsername: AnonMethodParamsUrlAnonUsername,
    getContextForUser: AnonMethodParamsUrlAnonSubjectid,
    getGpgKey: AnonMethodParamsUrlAnonGpgkeyid,
    getPublicKey: AnonMethodParamsUrlAnonKeyidAnonRequired,
    list: AnonMethodParamsUrlAnonPagePerpageSince,
    listBlocked: AnonMethodParamsUrlString,
    listEmails: AnonMethodParamsUrlAnonPagePerpage,
    listFollowersForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listFollowersForUser: AnonMethodParamsUrlAnonPage,
    listFollowingForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listFollowingForUser: AnonMethodParamsUrlAnonPage,
    listGpgKeys: AnonMethodParamsUrlAnonPagePerpage,
    listGpgKeysForUser: AnonMethodParamsUrlAnonPage,
    listPublicEmails: AnonMethodParamsUrlAnonPagePerpage,
    listPublicKeys: AnonMethodParamsUrlAnonPagePerpage,
    listPublicKeysForUser: AnonMethodParamsUrlAnonPage,
    togglePrimaryEmailVisibility: AnonMethodParamsUrlAnonEmailVisibility,
    unblock: AnonMethodParamsUrlAnonUsername,
    unfollow: AnonMethodParamsUrlAnonUsername,
    updateAuthenticated: AnonMethodParamsUrlAnonBio
  ): AnonAddEmails = {
    val __obj = js.Dynamic.literal(addEmails = addEmails.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowing = checkFollowing.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], createGpgKey = createGpgKey.asInstanceOf[js.Any], createPublicKey = createPublicKey.asInstanceOf[js.Any], deleteEmails = deleteEmails.asInstanceOf[js.Any], deleteGpgKey = deleteGpgKey.asInstanceOf[js.Any], deletePublicKey = deletePublicKey.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKey = getGpgKey.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlocked = listBlocked.asInstanceOf[js.Any], listEmails = listEmails.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForAuthenticatedUser = listFollowingForAuthenticatedUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeys = listGpgKeys.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmails = listPublicEmails.asInstanceOf[js.Any], listPublicKeys = listPublicKeys.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], togglePrimaryEmailVisibility = togglePrimaryEmailVisibility.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddEmails]
  }
}

