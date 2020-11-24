package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  var addEmailForAuthenticated: `1068` = js.native
  
  var block: `1069` = js.native
  
  var checkBlocked: `1070` = js.native
  
  var checkFollowingForUser: `1071` = js.native
  
  var checkPersonIsFollowedByAuthenticated: `1072` = js.native
  
  var createGpgKeyForAuthenticated: `1073` = js.native
  
  var createPublicSshKeyForAuthenticated: `1074` = js.native
  
  var deleteEmailForAuthenticated: `1075` = js.native
  
  var deleteGpgKeyForAuthenticated: `1076` = js.native
  
  var deletePublicSshKeyForAuthenticated: `1077` = js.native
  
  var follow: `1078` = js.native
  
  var getAuthenticated: `1079` = js.native
  
  var getByUsername: `1080` = js.native
  
  var getContextForUser: `1081` = js.native
  
  var getGpgKeyForAuthenticated: `1082` = js.native
  
  var getPublicSshKeyForAuthenticated: `1083` = js.native
  
  var list: `1084` = js.native
  
  var listBlockedByAuthenticated: `1085` = js.native
  
  var listEmailsForAuthenticated: `1086` = js.native
  
  var listFollowedByAuthenticated: `1087` = js.native
  
  var listFollowersForAuthenticatedUser: `1088` = js.native
  
  var listFollowersForUser: `1089` = js.native
  
  var listFollowingForUser: `1090` = js.native
  
  var listGpgKeysForAuthenticated: `1091` = js.native
  
  var listGpgKeysForUser: `1092` = js.native
  
  var listPublicEmailsForAuthenticated: `1093` = js.native
  
  var listPublicKeysForUser: `1094` = js.native
  
  var listPublicSshKeysForAuthenticated: `1095` = js.native
  
  var setPrimaryEmailVisibilityForAuthenticated: `1096` = js.native
  
  var unblock: `1097` = js.native
  
  var unfollow: `1098` = js.native
  
  var updateAuthenticated: `1099` = js.native
}
object Block {
  
  @scala.inline
  def apply(
    addEmailForAuthenticated: `1068`,
    block: `1069`,
    checkBlocked: `1070`,
    checkFollowingForUser: `1071`,
    checkPersonIsFollowedByAuthenticated: `1072`,
    createGpgKeyForAuthenticated: `1073`,
    createPublicSshKeyForAuthenticated: `1074`,
    deleteEmailForAuthenticated: `1075`,
    deleteGpgKeyForAuthenticated: `1076`,
    deletePublicSshKeyForAuthenticated: `1077`,
    follow: `1078`,
    getAuthenticated: `1079`,
    getByUsername: `1080`,
    getContextForUser: `1081`,
    getGpgKeyForAuthenticated: `1082`,
    getPublicSshKeyForAuthenticated: `1083`,
    list: `1084`,
    listBlockedByAuthenticated: `1085`,
    listEmailsForAuthenticated: `1086`,
    listFollowedByAuthenticated: `1087`,
    listFollowersForAuthenticatedUser: `1088`,
    listFollowersForUser: `1089`,
    listFollowingForUser: `1090`,
    listGpgKeysForAuthenticated: `1091`,
    listGpgKeysForUser: `1092`,
    listPublicEmailsForAuthenticated: `1093`,
    listPublicKeysForUser: `1094`,
    listPublicSshKeysForAuthenticated: `1095`,
    setPrimaryEmailVisibilityForAuthenticated: `1096`,
    unblock: `1097`,
    unfollow: `1098`,
    updateAuthenticated: `1099`
  ): Block = {
    val __obj = js.Dynamic.literal(addEmailForAuthenticated = addEmailForAuthenticated.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], checkBlocked = checkBlocked.asInstanceOf[js.Any], checkFollowingForUser = checkFollowingForUser.asInstanceOf[js.Any], checkPersonIsFollowedByAuthenticated = checkPersonIsFollowedByAuthenticated.asInstanceOf[js.Any], createGpgKeyForAuthenticated = createGpgKeyForAuthenticated.asInstanceOf[js.Any], createPublicSshKeyForAuthenticated = createPublicSshKeyForAuthenticated.asInstanceOf[js.Any], deleteEmailForAuthenticated = deleteEmailForAuthenticated.asInstanceOf[js.Any], deleteGpgKeyForAuthenticated = deleteGpgKeyForAuthenticated.asInstanceOf[js.Any], deletePublicSshKeyForAuthenticated = deletePublicSshKeyForAuthenticated.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getByUsername = getByUsername.asInstanceOf[js.Any], getContextForUser = getContextForUser.asInstanceOf[js.Any], getGpgKeyForAuthenticated = getGpgKeyForAuthenticated.asInstanceOf[js.Any], getPublicSshKeyForAuthenticated = getPublicSshKeyForAuthenticated.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listBlockedByAuthenticated = listBlockedByAuthenticated.asInstanceOf[js.Any], listEmailsForAuthenticated = listEmailsForAuthenticated.asInstanceOf[js.Any], listFollowedByAuthenticated = listFollowedByAuthenticated.asInstanceOf[js.Any], listFollowersForAuthenticatedUser = listFollowersForAuthenticatedUser.asInstanceOf[js.Any], listFollowersForUser = listFollowersForUser.asInstanceOf[js.Any], listFollowingForUser = listFollowingForUser.asInstanceOf[js.Any], listGpgKeysForAuthenticated = listGpgKeysForAuthenticated.asInstanceOf[js.Any], listGpgKeysForUser = listGpgKeysForUser.asInstanceOf[js.Any], listPublicEmailsForAuthenticated = listPublicEmailsForAuthenticated.asInstanceOf[js.Any], listPublicKeysForUser = listPublicKeysForUser.asInstanceOf[js.Any], listPublicSshKeysForAuthenticated = listPublicSshKeysForAuthenticated.asInstanceOf[js.Any], setPrimaryEmailVisibilityForAuthenticated = setPrimaryEmailVisibilityForAuthenticated.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unfollow = unfollow.asInstanceOf[js.Any], updateAuthenticated = updateAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddEmailForAuthenticated(value: `1068`): Self = this.set("addEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: `1069`): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBlocked(value: `1070`): Self = this.set("checkBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckFollowingForUser(value: `1071`): Self = this.set("checkFollowingForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckPersonIsFollowedByAuthenticated(value: `1072`): Self = this.set("checkPersonIsFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateGpgKeyForAuthenticated(value: `1073`): Self = this.set("createGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePublicSshKeyForAuthenticated(value: `1074`): Self = this.set("createPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteEmailForAuthenticated(value: `1075`): Self = this.set("deleteEmailForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteGpgKeyForAuthenticated(value: `1076`): Self = this.set("deleteGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePublicSshKeyForAuthenticated(value: `1077`): Self = this.set("deletePublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollow(value: `1078`): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAuthenticated(value: `1079`): Self = this.set("getAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByUsername(value: `1080`): Self = this.set("getByUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContextForUser(value: `1081`): Self = this.set("getContextForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGpgKeyForAuthenticated(value: `1082`): Self = this.set("getGpgKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPublicSshKeyForAuthenticated(value: `1083`): Self = this.set("getPublicSshKeyForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: `1084`): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListBlockedByAuthenticated(value: `1085`): Self = this.set("listBlockedByAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListEmailsForAuthenticated(value: `1086`): Self = this.set("listEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFollowedByAuthenticated(value: `1087`): Self = this.set("listFollowedByAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFollowersForAuthenticatedUser(value: `1088`): Self = this.set("listFollowersForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFollowersForUser(value: `1089`): Self = this.set("listFollowersForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFollowingForUser(value: `1090`): Self = this.set("listFollowingForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListGpgKeysForAuthenticated(value: `1091`): Self = this.set("listGpgKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListGpgKeysForUser(value: `1092`): Self = this.set("listGpgKeysForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicEmailsForAuthenticated(value: `1093`): Self = this.set("listPublicEmailsForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicKeysForUser(value: `1094`): Self = this.set("listPublicKeysForUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPublicSshKeysForAuthenticated(value: `1095`): Self = this.set("listPublicSshKeysForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPrimaryEmailVisibilityForAuthenticated(value: `1096`): Self = this.set("setPrimaryEmailVisibilityForAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnblock(value: `1097`): Self = this.set("unblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfollow(value: `1098`): Self = this.set("unfollow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAuthenticated(value: `1099`): Self = this.set("updateAuthenticated", value.asInstanceOf[js.Any])
  }
}
