package typings.maximMazurokGapiClientGroupssettings

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGroupssettings.anon.Alt
import typings.maximMazurokGapiClientGroupssettings.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object groupssettings {
      
      trait Groups extends StObject {
        
        /**
          * Identifies whether members external to your organization can join the group. Possible values are:
          * - true: G Suite users external to your organization can become members of this group.
          * - false: Users not belonging to the organization are not allowed to become members of this group.
          */
        var allowExternalMembers: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. Allows Google to contact administrator of the group.
          * - true: Allow Google to contact managers of this group. Occasionally Google may send updates on the latest features, ask for input on new features, or ask for permission to
          * highlight your group.
          * - false: Google can not contact managers of this group.
          */
        var allowGoogleCommunication: js.UndefOr[String] = js.undefined
        
        /**
          * Allows posting from web. Possible values are:
          * - true: Allows any member to post to the group forum.
          * - false: Members only use Gmail to communicate with the group.
          */
        var allowWebPosting: js.UndefOr[String] = js.undefined
        
        /**
          * Allows the group to be archived only. Possible values are:
          * - true: Group is archived and the group is inactive. New messages to this group are rejected. The older archived messages are browseable and searchable.
          * - If true, the whoCanPostMessage property is set to NONE_CAN_POST.
          * - If reverted from true to false, whoCanPostMessages is set to ALL_MANAGERS_CAN_POST.
          * - false: The group is active and can receive messages.
          * - When false, updating whoCanPostMessage to NONE_CAN_POST, results in an error.
          */
        var archiveOnly: js.UndefOr[String] = js.undefined
        
        /** Set the content of custom footer text. The maximum number of characters is 1,000. */
        var customFooterText: js.UndefOr[String] = js.undefined
        
        /**
          * An email address used when replying to a message if the replyTo property is set to REPLY_TO_CUSTOM. This address is defined by an account administrator.
          * - When the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property holds a custom email address used when replying to a message.
          * - If the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property must have a text value or an error is returned.
          */
        var customReplyTo: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies whether the group has a custom role that's included in one of the settings being merged. This field is read-only and update/patch requests to it are ignored. Possible
          * values are:
          * - true
          * - false
          */
        var customRolesEnabledForSettingsToBeMerged: js.UndefOr[String] = js.undefined
        
        /**
          * When a message is rejected, this is text for the rejection notification sent to the message's author. By default, this property is empty and has no value in the API's response body.
          * The maximum notification text size is 10,000 characters. Note: Requires sendMessageDenyNotification property to be true.
          */
        var defaultMessageDenyNotificationText: js.UndefOr[String] = js.undefined
        
        /**
          * Description of the group. This property value may be an empty string if no group description has been entered. If entered, the maximum group description is no more than 300
          * characters.
          */
        var description: js.UndefOr[String] = js.undefined
        
        /**
          * The group's email address. This property can be updated using the Directory API. Note: Only a group owner can change a group's email address. A group manager can't do this.
          * When you change your group's address using the Directory API or the control panel, you are changing the address your subscribers use to send email and the web address people use to
          * access your group. People can't reach your group by visiting the old address.
          */
        var email: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies whether a collaborative inbox will remain turned on for the group. Possible values are:
          * - true
          * - false
          */
        var enableCollaborativeInbox: js.UndefOr[String] = js.undefined
        
        /**
          * Indicates if favorite replies should be displayed above other replies.
          * - true: Favorite replies will be displayed above other replies.
          * - false: Favorite replies will not be displayed above other replies.
          */
        var favoriteRepliesOnTop: js.UndefOr[String] = js.undefined
        
        /**
          * Whether to include custom footer. Possible values are:
          * - true
          * - false
          */
        var includeCustomFooter: js.UndefOr[String] = js.undefined
        
        /**
          * Enables the group to be included in the Global Address List. For more information, see the help center. Possible values are:
          * - true: Group is included in the Global Address List.
          * - false: Group is not included in the Global Address List.
          */
        var includeInGlobalAddressList: js.UndefOr[String] = js.undefined
        
        /**
          * Allows the Group contents to be archived. Possible values are:
          * - true: Archive messages sent to the group.
          * - false: Do not keep an archive of messages sent to this group. If false, previously archived messages remain in the archive.
          */
        var isArchived: js.UndefOr[String] = js.undefined
        
        /** The type of the resource. It is always groupsSettings#groups. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Deprecated. The maximum size of a message is 25Mb. */
        var maxMessageBytes: js.UndefOr[Double] = js.undefined
        
        /**
          * Enables members to post messages as the group. Possible values are:
          * - true: Group member can post messages using the group's email address instead of their own email address. Message appear to originate from the group itself. Note: When true, any
          * message moderation settings on individual users or new members do not apply to posts made on behalf of the group.
          * - false: Members can not post in behalf of the group's email address.
          */
        var membersCanPostAsTheGroup: js.UndefOr[String] = js.undefined
        
        /** Deprecated. The default message display font always has a value of "DEFAULT_FONT". */
        var messageDisplayFont: js.UndefOr[String] = js.undefined
        
        /**
          * Moderation level of incoming messages. Possible values are:
          * - MODERATE_ALL_MESSAGES: All messages are sent to the group owner's email address for approval. If approved, the message is sent to the group.
          * - MODERATE_NON_MEMBERS: All messages from non group members are sent to the group owner's email address for approval. If approved, the message is sent to the group.
          * - MODERATE_NEW_MEMBERS: All messages from new members are sent to the group owner's email address for approval. If approved, the message is sent to the group.
          * - MODERATE_NONE: No moderator approval is required. Messages are delivered directly to the group. Note: When the whoCanPostMessage is set to ANYONE_CAN_POST, we recommend the
          * messageModerationLevel be set to MODERATE_NON_MEMBERS to protect the group from possible spam.
          * When memberCanPostAsTheGroup is true, any message moderation settings on individual users or new members will not apply to posts made on behalf of the group.
          */
        var messageModerationLevel: js.UndefOr[String] = js.undefined
        
        /** Name of the group, which has a maximum size of 75 characters. */
        var name: js.UndefOr[String] = js.undefined
        
        /** The primary language for group. For a group's primary language use the language tags from the G Suite languages found at G Suite Email Settings API Email Language Tags. */
        var primaryLanguage: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who receives the default reply. Possible values are:
          * - REPLY_TO_CUSTOM: For replies to messages, use the group's custom email address.
          * When the group's ReplyTo property is set to REPLY_TO_CUSTOM, the customReplyTo property holds the custom email address used when replying to a message. If the group's ReplyTo
          * property is set to REPLY_TO_CUSTOM, the customReplyTo property must have a value. Otherwise an error is returned.
          *
          * - REPLY_TO_SENDER: The reply sent to author of message.
          * - REPLY_TO_LIST: This reply message is sent to the group.
          * - REPLY_TO_OWNER: The reply is sent to the owner(s) of the group. This does not include the group's managers.
          * - REPLY_TO_IGNORE: Group users individually decide where the message reply is sent.
          * - REPLY_TO_MANAGERS: This reply message is sent to the group's managers, which includes all managers and the group owner.
          */
        var replyTo: js.UndefOr[String] = js.undefined
        
        /**
          * Allows a member to be notified if the member's message to the group is denied by the group owner. Possible values are:
          * - true: When a message is rejected, send the deny message notification to the message author.
          * The defaultMessageDenyNotificationText property is dependent on the sendMessageDenyNotification property being true.
          *
          * - false: When a message is rejected, no notification is sent.
          */
        var sendMessageDenyNotification: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanDiscoverGroup setting. Allows the group to be visible in the Groups Directory. Possible values are:
          * - true: All groups in the account are listed in the Groups directory.
          * - false: All groups in the account are not listed in the directory.
          */
        var showInGroupDirectory: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies moderation levels for messages detected as spam. Possible values are:
          * - ALLOW: Post the message to the group.
          * - MODERATE: Send the message to the moderation queue. This is the default.
          * - SILENTLY_MODERATE: Send the message to the moderation queue, but do not send notification to moderators.
          * - REJECT: Immediately reject the message.
          */
        var spamModerationLevel: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateMembers setting. Permissions to add members. Possible values are:
          * - ALL_MEMBERS_CAN_ADD: Managers and members can directly add new members.
          * - ALL_MANAGERS_CAN_ADD: Only managers can directly add new members. this includes the group's owner.
          * - ALL_OWNERS_CAN_ADD: Only owners can directly add new members.
          * - NONE_CAN_ADD: No one can directly add new members.
          */
        var whoCanAdd: js.UndefOr[String] = js.undefined
        
        /** Deprecated. This functionality is no longer supported in the Google Groups UI. The value is always "NONE". */
        var whoCanAddReferences: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who can approve members who ask to join groups. This permission will be deprecated once it is merged into the new whoCanModerateMembers setting. Possible values are:
          * - ALL_MEMBERS_CAN_APPROVE
          * - ALL_MANAGERS_CAN_APPROVE
          * - ALL_OWNERS_CAN_APPROVE
          * - NONE_CAN_APPROVE
          */
        var whoCanApproveMembers: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can approve pending messages in the moderation queue. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanApproveMessages: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to assign topics in a forum to another user. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanAssignTopics: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who can moderate metadata. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanAssistContent: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who can deny membership to users. This permission will be deprecated once it is merged into the new whoCanModerateMembers setting. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanBanUsers: js.UndefOr[String] = js.undefined
        
        /**
          * Permission to contact owner of the group via web UI. Possible values are:
          * - ALL_IN_DOMAIN_CAN_CONTACT
          * - ALL_MANAGERS_CAN_CONTACT
          * - ALL_MEMBERS_CAN_CONTACT
          * - ANYONE_CAN_CONTACT
          */
        var whoCanContactOwner: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can delete replies to topics. (Authors can always delete their own posts). Possible values are:
          *
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanDeleteAnyPost: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can delete topics. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanDeleteTopics: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies the set of users for whom this group is discoverable. Possible values are:
          * - ANYONE_CAN_DISCOVER
          * - ALL_IN_DOMAIN_CAN_DISCOVER
          * - ALL_MEMBERS_CAN_DISCOVER
          */
        var whoCanDiscoverGroup: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to enter free form tags for topics in a forum. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanEnterFreeFormTags: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can hide posts by reporting them as abuse. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanHideAbuse: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateMembers setting. Permissions to invite new members. Possible values are:
          * - ALL_MEMBERS_CAN_INVITE: Managers and members can invite a new member candidate.
          * - ALL_MANAGERS_CAN_INVITE: Only managers can invite a new member. This includes the group's owner.
          * - ALL_OWNERS_CAN_INVITE: Only owners can invite a new member.
          * - NONE_CAN_INVITE: No one can invite a new member candidate.
          */
        var whoCanInvite: js.UndefOr[String] = js.undefined
        
        /**
          * Permission to join group. Possible values are:
          * - ANYONE_CAN_JOIN: Anyone in the account domain can join. This includes accounts with multiple domains.
          * - ALL_IN_DOMAIN_CAN_JOIN: Any Internet user who is outside your domain can access your Google Groups service and view the list of groups in your Groups directory. Warning: Group
          * owners can add external addresses, outside of the domain to their groups. They can also allow people outside your domain to join their groups. If you later disable this option, any
          * external addresses already added to users' groups remain in those groups.
          * - INVITED_CAN_JOIN: Candidates for membership can be invited to join.
          * - CAN_REQUEST_TO_JOIN: Non members can request an invitation to join.
          */
        var whoCanJoin: js.UndefOr[String] = js.undefined
        
        /**
          * Permission to leave the group. Possible values are:
          * - ALL_MANAGERS_CAN_LEAVE
          * - ALL_MEMBERS_CAN_LEAVE
          * - NONE_CAN_LEAVE
          */
        var whoCanLeaveGroup: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can prevent users from posting replies to topics. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanLockTopics: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can make topics appear at the top of the topic list. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMakeTopicsSticky: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a topic as a duplicate of another topic. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMarkDuplicate: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark any other user's post as a favorite reply. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a post for a topic they started as a favorite reply. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMarkFavoriteReplyOnOwnTopic: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to mark a topic as not needing a response. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMarkNoResponseNeeded: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who can moderate content. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanModerateContent: js.UndefOr[String] = js.undefined
        
        /**
          * Specifies who can manage members. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanModerateMembers: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateMembers setting. Specifies who can change group members' roles. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanModifyMembers: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to change tags and categories. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanModifyTagsAndCategories: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can move topics into the group or forum. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMoveTopicsIn: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can move topics out of the group or forum. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanMoveTopicsOut: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanModerateContent setting. Specifies who can post announcements, a special topic type. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanPostAnnouncements: js.UndefOr[String] = js.undefined
        
        /**
          * Permissions to post messages. Possible values are:
          * - NONE_CAN_POST: The group is disabled and archived. No one can post a message to this group.
          * - When archiveOnly is false, updating whoCanPostMessage to NONE_CAN_POST, results in an error.
          * - If archiveOnly is reverted from true to false, whoCanPostMessages is set to ALL_MANAGERS_CAN_POST.
          * - ALL_MANAGERS_CAN_POST: Managers, including group owners, can post messages.
          * - ALL_MEMBERS_CAN_POST: Any group member can post a message.
          * - ALL_OWNERS_CAN_POST: Only group owners can post a message.
          * - ALL_IN_DOMAIN_CAN_POST: Anyone in the account can post a message.
          * - ANYONE_CAN_POST: Any Internet user who outside your account can access your Google Groups service and post a message. Note: When whoCanPostMessage is set to ANYONE_CAN_POST, we
          * recommend the messageModerationLevel be set to MODERATE_NON_MEMBERS to protect the group from possible spam.
          */
        var whoCanPostMessage: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to take topics in a forum. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanTakeTopics: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to unassign any topic in a forum. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanUnassignTopic: js.UndefOr[String] = js.undefined
        
        /**
          * Deprecated. This is merged into the new whoCanAssistContent setting. Permission to unmark any post from a favorite reply. Possible values are:
          * - ALL_MEMBERS
          * - OWNERS_AND_MANAGERS
          * - MANAGERS_ONLY
          * - OWNERS_ONLY
          * - NONE
          */
        var whoCanUnmarkFavoriteReplyOnAnyTopic: js.UndefOr[String] = js.undefined
        
        /**
          * Permissions to view group messages. Possible values are:
          * - ANYONE_CAN_VIEW: Any Internet user can view the group's messages.
          * - ALL_IN_DOMAIN_CAN_VIEW: Anyone in your account can view this group's messages.
          * - ALL_MEMBERS_CAN_VIEW: All group members can view the group's messages.
          * - ALL_MANAGERS_CAN_VIEW: Any group manager can view this group's messages.
          */
        var whoCanViewGroup: js.UndefOr[String] = js.undefined
        
        /**
          * Permissions to view membership. Possible values are:
          * - ALL_IN_DOMAIN_CAN_VIEW: Anyone in the account can view the group members list.
          * If a group already has external members, those members can still send email to this group.
          *
          * - ALL_MEMBERS_CAN_VIEW: The group members can view the group members list.
          * - ALL_MANAGERS_CAN_VIEW: The group managers can view group members list.
          */
        var whoCanViewMembership: js.UndefOr[String] = js.undefined
      }
      object Groups {
        
        @scala.inline
        def apply(): Groups = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Groups]
        }
        
        @scala.inline
        implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllowExternalMembers(value: String): Self = StObject.set(x, "allowExternalMembers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowExternalMembersUndefined: Self = StObject.set(x, "allowExternalMembers", js.undefined)
          
          @scala.inline
          def setAllowGoogleCommunication(value: String): Self = StObject.set(x, "allowGoogleCommunication", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowGoogleCommunicationUndefined: Self = StObject.set(x, "allowGoogleCommunication", js.undefined)
          
          @scala.inline
          def setAllowWebPosting(value: String): Self = StObject.set(x, "allowWebPosting", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowWebPostingUndefined: Self = StObject.set(x, "allowWebPosting", js.undefined)
          
          @scala.inline
          def setArchiveOnly(value: String): Self = StObject.set(x, "archiveOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArchiveOnlyUndefined: Self = StObject.set(x, "archiveOnly", js.undefined)
          
          @scala.inline
          def setCustomFooterText(value: String): Self = StObject.set(x, "customFooterText", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomFooterTextUndefined: Self = StObject.set(x, "customFooterText", js.undefined)
          
          @scala.inline
          def setCustomReplyTo(value: String): Self = StObject.set(x, "customReplyTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomReplyToUndefined: Self = StObject.set(x, "customReplyTo", js.undefined)
          
          @scala.inline
          def setCustomRolesEnabledForSettingsToBeMerged(value: String): Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCustomRolesEnabledForSettingsToBeMergedUndefined: Self = StObject.set(x, "customRolesEnabledForSettingsToBeMerged", js.undefined)
          
          @scala.inline
          def setDefaultMessageDenyNotificationText(value: String): Self = StObject.set(x, "defaultMessageDenyNotificationText", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultMessageDenyNotificationTextUndefined: Self = StObject.set(x, "defaultMessageDenyNotificationText", js.undefined)
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          @scala.inline
          def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
          
          @scala.inline
          def setEnableCollaborativeInbox(value: String): Self = StObject.set(x, "enableCollaborativeInbox", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableCollaborativeInboxUndefined: Self = StObject.set(x, "enableCollaborativeInbox", js.undefined)
          
          @scala.inline
          def setFavoriteRepliesOnTop(value: String): Self = StObject.set(x, "favoriteRepliesOnTop", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFavoriteRepliesOnTopUndefined: Self = StObject.set(x, "favoriteRepliesOnTop", js.undefined)
          
          @scala.inline
          def setIncludeCustomFooter(value: String): Self = StObject.set(x, "includeCustomFooter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIncludeCustomFooterUndefined: Self = StObject.set(x, "includeCustomFooter", js.undefined)
          
          @scala.inline
          def setIncludeInGlobalAddressList(value: String): Self = StObject.set(x, "includeInGlobalAddressList", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIncludeInGlobalAddressListUndefined: Self = StObject.set(x, "includeInGlobalAddressList", js.undefined)
          
          @scala.inline
          def setIsArchived(value: String): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsArchivedUndefined: Self = StObject.set(x, "isArchived", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setMaxMessageBytes(value: Double): Self = StObject.set(x, "maxMessageBytes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxMessageBytesUndefined: Self = StObject.set(x, "maxMessageBytes", js.undefined)
          
          @scala.inline
          def setMembersCanPostAsTheGroup(value: String): Self = StObject.set(x, "membersCanPostAsTheGroup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMembersCanPostAsTheGroupUndefined: Self = StObject.set(x, "membersCanPostAsTheGroup", js.undefined)
          
          @scala.inline
          def setMessageDisplayFont(value: String): Self = StObject.set(x, "messageDisplayFont", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessageDisplayFontUndefined: Self = StObject.set(x, "messageDisplayFont", js.undefined)
          
          @scala.inline
          def setMessageModerationLevel(value: String): Self = StObject.set(x, "messageModerationLevel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessageModerationLevelUndefined: Self = StObject.set(x, "messageModerationLevel", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setPrimaryLanguage(value: String): Self = StObject.set(x, "primaryLanguage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrimaryLanguageUndefined: Self = StObject.set(x, "primaryLanguage", js.undefined)
          
          @scala.inline
          def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
          
          @scala.inline
          def setSendMessageDenyNotification(value: String): Self = StObject.set(x, "sendMessageDenyNotification", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSendMessageDenyNotificationUndefined: Self = StObject.set(x, "sendMessageDenyNotification", js.undefined)
          
          @scala.inline
          def setShowInGroupDirectory(value: String): Self = StObject.set(x, "showInGroupDirectory", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShowInGroupDirectoryUndefined: Self = StObject.set(x, "showInGroupDirectory", js.undefined)
          
          @scala.inline
          def setSpamModerationLevel(value: String): Self = StObject.set(x, "spamModerationLevel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpamModerationLevelUndefined: Self = StObject.set(x, "spamModerationLevel", js.undefined)
          
          @scala.inline
          def setWhoCanAdd(value: String): Self = StObject.set(x, "whoCanAdd", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanAddReferences(value: String): Self = StObject.set(x, "whoCanAddReferences", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanAddReferencesUndefined: Self = StObject.set(x, "whoCanAddReferences", js.undefined)
          
          @scala.inline
          def setWhoCanAddUndefined: Self = StObject.set(x, "whoCanAdd", js.undefined)
          
          @scala.inline
          def setWhoCanApproveMembers(value: String): Self = StObject.set(x, "whoCanApproveMembers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanApproveMembersUndefined: Self = StObject.set(x, "whoCanApproveMembers", js.undefined)
          
          @scala.inline
          def setWhoCanApproveMessages(value: String): Self = StObject.set(x, "whoCanApproveMessages", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanApproveMessagesUndefined: Self = StObject.set(x, "whoCanApproveMessages", js.undefined)
          
          @scala.inline
          def setWhoCanAssignTopics(value: String): Self = StObject.set(x, "whoCanAssignTopics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanAssignTopicsUndefined: Self = StObject.set(x, "whoCanAssignTopics", js.undefined)
          
          @scala.inline
          def setWhoCanAssistContent(value: String): Self = StObject.set(x, "whoCanAssistContent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanAssistContentUndefined: Self = StObject.set(x, "whoCanAssistContent", js.undefined)
          
          @scala.inline
          def setWhoCanBanUsers(value: String): Self = StObject.set(x, "whoCanBanUsers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanBanUsersUndefined: Self = StObject.set(x, "whoCanBanUsers", js.undefined)
          
          @scala.inline
          def setWhoCanContactOwner(value: String): Self = StObject.set(x, "whoCanContactOwner", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanContactOwnerUndefined: Self = StObject.set(x, "whoCanContactOwner", js.undefined)
          
          @scala.inline
          def setWhoCanDeleteAnyPost(value: String): Self = StObject.set(x, "whoCanDeleteAnyPost", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanDeleteAnyPostUndefined: Self = StObject.set(x, "whoCanDeleteAnyPost", js.undefined)
          
          @scala.inline
          def setWhoCanDeleteTopics(value: String): Self = StObject.set(x, "whoCanDeleteTopics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanDeleteTopicsUndefined: Self = StObject.set(x, "whoCanDeleteTopics", js.undefined)
          
          @scala.inline
          def setWhoCanDiscoverGroup(value: String): Self = StObject.set(x, "whoCanDiscoverGroup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanDiscoverGroupUndefined: Self = StObject.set(x, "whoCanDiscoverGroup", js.undefined)
          
          @scala.inline
          def setWhoCanEnterFreeFormTags(value: String): Self = StObject.set(x, "whoCanEnterFreeFormTags", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanEnterFreeFormTagsUndefined: Self = StObject.set(x, "whoCanEnterFreeFormTags", js.undefined)
          
          @scala.inline
          def setWhoCanHideAbuse(value: String): Self = StObject.set(x, "whoCanHideAbuse", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanHideAbuseUndefined: Self = StObject.set(x, "whoCanHideAbuse", js.undefined)
          
          @scala.inline
          def setWhoCanInvite(value: String): Self = StObject.set(x, "whoCanInvite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanInviteUndefined: Self = StObject.set(x, "whoCanInvite", js.undefined)
          
          @scala.inline
          def setWhoCanJoin(value: String): Self = StObject.set(x, "whoCanJoin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanJoinUndefined: Self = StObject.set(x, "whoCanJoin", js.undefined)
          
          @scala.inline
          def setWhoCanLeaveGroup(value: String): Self = StObject.set(x, "whoCanLeaveGroup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanLeaveGroupUndefined: Self = StObject.set(x, "whoCanLeaveGroup", js.undefined)
          
          @scala.inline
          def setWhoCanLockTopics(value: String): Self = StObject.set(x, "whoCanLockTopics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanLockTopicsUndefined: Self = StObject.set(x, "whoCanLockTopics", js.undefined)
          
          @scala.inline
          def setWhoCanMakeTopicsSticky(value: String): Self = StObject.set(x, "whoCanMakeTopicsSticky", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMakeTopicsStickyUndefined: Self = StObject.set(x, "whoCanMakeTopicsSticky", js.undefined)
          
          @scala.inline
          def setWhoCanMarkDuplicate(value: String): Self = StObject.set(x, "whoCanMarkDuplicate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMarkDuplicateUndefined: Self = StObject.set(x, "whoCanMarkDuplicate", js.undefined)
          
          @scala.inline
          def setWhoCanMarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnAnyTopic", js.undefined)
          
          @scala.inline
          def setWhoCanMarkFavoriteReplyOnOwnTopic(value: String): Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMarkFavoriteReplyOnOwnTopicUndefined: Self = StObject.set(x, "whoCanMarkFavoriteReplyOnOwnTopic", js.undefined)
          
          @scala.inline
          def setWhoCanMarkNoResponseNeeded(value: String): Self = StObject.set(x, "whoCanMarkNoResponseNeeded", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMarkNoResponseNeededUndefined: Self = StObject.set(x, "whoCanMarkNoResponseNeeded", js.undefined)
          
          @scala.inline
          def setWhoCanModerateContent(value: String): Self = StObject.set(x, "whoCanModerateContent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanModerateContentUndefined: Self = StObject.set(x, "whoCanModerateContent", js.undefined)
          
          @scala.inline
          def setWhoCanModerateMembers(value: String): Self = StObject.set(x, "whoCanModerateMembers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanModerateMembersUndefined: Self = StObject.set(x, "whoCanModerateMembers", js.undefined)
          
          @scala.inline
          def setWhoCanModifyMembers(value: String): Self = StObject.set(x, "whoCanModifyMembers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanModifyMembersUndefined: Self = StObject.set(x, "whoCanModifyMembers", js.undefined)
          
          @scala.inline
          def setWhoCanModifyTagsAndCategories(value: String): Self = StObject.set(x, "whoCanModifyTagsAndCategories", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanModifyTagsAndCategoriesUndefined: Self = StObject.set(x, "whoCanModifyTagsAndCategories", js.undefined)
          
          @scala.inline
          def setWhoCanMoveTopicsIn(value: String): Self = StObject.set(x, "whoCanMoveTopicsIn", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMoveTopicsInUndefined: Self = StObject.set(x, "whoCanMoveTopicsIn", js.undefined)
          
          @scala.inline
          def setWhoCanMoveTopicsOut(value: String): Self = StObject.set(x, "whoCanMoveTopicsOut", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanMoveTopicsOutUndefined: Self = StObject.set(x, "whoCanMoveTopicsOut", js.undefined)
          
          @scala.inline
          def setWhoCanPostAnnouncements(value: String): Self = StObject.set(x, "whoCanPostAnnouncements", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanPostAnnouncementsUndefined: Self = StObject.set(x, "whoCanPostAnnouncements", js.undefined)
          
          @scala.inline
          def setWhoCanPostMessage(value: String): Self = StObject.set(x, "whoCanPostMessage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanPostMessageUndefined: Self = StObject.set(x, "whoCanPostMessage", js.undefined)
          
          @scala.inline
          def setWhoCanTakeTopics(value: String): Self = StObject.set(x, "whoCanTakeTopics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanTakeTopicsUndefined: Self = StObject.set(x, "whoCanTakeTopics", js.undefined)
          
          @scala.inline
          def setWhoCanUnassignTopic(value: String): Self = StObject.set(x, "whoCanUnassignTopic", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanUnassignTopicUndefined: Self = StObject.set(x, "whoCanUnassignTopic", js.undefined)
          
          @scala.inline
          def setWhoCanUnmarkFavoriteReplyOnAnyTopic(value: String): Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanUnmarkFavoriteReplyOnAnyTopicUndefined: Self = StObject.set(x, "whoCanUnmarkFavoriteReplyOnAnyTopic", js.undefined)
          
          @scala.inline
          def setWhoCanViewGroup(value: String): Self = StObject.set(x, "whoCanViewGroup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanViewGroupUndefined: Self = StObject.set(x, "whoCanViewGroup", js.undefined)
          
          @scala.inline
          def setWhoCanViewMembership(value: String): Self = StObject.set(x, "whoCanViewMembership", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhoCanViewMembershipUndefined: Self = StObject.set(x, "whoCanViewMembership", js.undefined)
        }
      }
      
      @js.native
      trait GroupsResource extends StObject {
        
        /** Gets one resource by id. */
        def get(): Request[Groups] = js.native
        def get(request: Alt): Request[Groups] = js.native
        
        def patch(request: Alt, body: Groups): Request[Groups] = js.native
        /** Updates an existing resource. This method supports patch semantics. */
        def patch(request: Fields): Request[Groups] = js.native
        
        def update(request: Alt, body: Groups): Request[Groups] = js.native
        /** Updates an existing resource. */
        def update(request: Fields): Request[Groups] = js.native
      }
    }
  }
}
