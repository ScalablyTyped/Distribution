package typings.plugapi.plugapiMod.Enum

import typings.plugapi.plugapiStrings.advance
import typings.plugapi.plugapiStrings.ban
import typings.plugapi.plugapiStrings.boothLocked
import typings.plugapi.plugapiStrings.chat
import typings.plugapi.plugapiStrings.chatDelete
import typings.plugapi.plugapiStrings.command
import typings.plugapi.plugapiStrings.djListCycle
import typings.plugapi.plugapiStrings.djListLocked
import typings.plugapi.plugapiStrings.djListUpdate
import typings.plugapi.plugapiStrings.earn
import typings.plugapi.plugapiStrings.floodChat
import typings.plugapi.plugapiStrings.followJoin
import typings.plugapi.plugapiStrings.friendRequest
import typings.plugapi.plugapiStrings.gifted
import typings.plugapi.plugapiStrings.grab
import typings.plugapi.plugapiStrings.killSession
import typings.plugapi.plugapiStrings.modAddDJ
import typings.plugapi.plugapiStrings.modAddWaitList
import typings.plugapi.plugapiStrings.modAmbassador
import typings.plugapi.plugapiStrings.modBan
import typings.plugapi.plugapiStrings.modMoveDJ
import typings.plugapi.plugapiStrings.modMute
import typings.plugapi.plugapiStrings.modRemoveDJ
import typings.plugapi.plugapiStrings.modRemoveWaitList
import typings.plugapi.plugapiStrings.modSkip
import typings.plugapi.plugapiStrings.modStaff
import typings.plugapi.plugapiStrings.notify
import typings.plugapi.plugapiStrings.pdjMessage
import typings.plugapi.plugapiStrings.pdjUpdate
import typings.plugapi.plugapiStrings.ping
import typings.plugapi.plugapiStrings.playlistCycle
import typings.plugapi.plugapiStrings.plugMaintenance
import typings.plugapi.plugapiStrings.plugMaintenanceAlert
import typings.plugapi.plugapiStrings.requestDuration
import typings.plugapi.plugapiStrings.requestDurationRetry
import typings.plugapi.plugapiStrings.roomChanged
import typings.plugapi.plugapiStrings.roomDescriptionUpdate
import typings.plugapi.plugapiStrings.roomJoin
import typings.plugapi.plugapiStrings.roomMinChatLevelUpdate
import typings.plugapi.plugapiStrings.roomNameUpdate
import typings.plugapi.plugapiStrings.roomVoteSkip
import typings.plugapi.plugapiStrings.roomWelcomeUpdate
import typings.plugapi.plugapiStrings.sessionClose
import typings.plugapi.plugapiStrings.skip
import typings.plugapi.plugapiStrings.strobeToggle
import typings.plugapi.plugapiStrings.userCounterUpdate
import typings.plugapi.plugapiStrings.userFollow
import typings.plugapi.plugapiStrings.userJoin
import typings.plugapi.plugapiStrings.userLeave
import typings.plugapi.plugapiStrings.userUpdate
import typings.plugapi.plugapiStrings.vote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var ADVANCE: advance
  var BAN: ban
  var BOOTH_LOCKED: boothLocked
  var CHAT: chat
  var CHAT_COMMAND: command
  var CHAT_DELETE: chatDelete
  var CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate
  var COMMAND: command
  var DJ_LIST_CYCLE: djListCycle
  var DJ_LIST_LOCKED: djListLocked
  var DJ_LIST_UPDATE: djListUpdate
  var EARN: earn
  var FLOOD_CHAT: floodChat
  var FOLLOW_JOIN: followJoin
  var FRIEND_REQUEST: friendRequest
  var GIFTED: gifted
  var GRAB: grab
  var KILL_SESSION: killSession
  var MAINT_MODE: plugMaintenance
  var MAINT_MODE_ALERT: plugMaintenanceAlert
  var MODERATE_ADD_DJ: modAddDJ
  var MODERATE_ADD_WAITLIST: modAddWaitList
  var MODERATE_AMBASSADOR: modAmbassador
  var MODERATE_BAN: modBan
  var MODERATE_MOVE_DJ: modMoveDJ
  var MODERATE_MUTE: modMute
  var MODERATE_REMOVE_DJ: modRemoveDJ
  var MODERATE_REMOVE_WAITLIST: modRemoveWaitList
  var MODERATE_SKIP: modSkip
  var MODERATE_STAFF: modStaff
  var NOTIFY: notify
  var PDJ_MESSAGE: pdjMessage
  var PDJ_UPDATE: pdjUpdate
  var PING: ping
  var PLAYLIST_CYCLE: playlistCycle
  var REQUEST_DURATION: requestDuration
  var REQUEST_DURATION_RETRY: requestDurationRetry
  var ROOM_CHANGE: roomChanged
  var ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate
  var ROOM_JOIN: roomJoin
  var ROOM_NAME_UPDATE: roomNameUpdate
  var ROOM_VOTE_SKIP: roomVoteSkip
  var ROOM_WELCOME_UPDATE: roomWelcomeUpdate
  var SESSION_CLOSE: sessionClose
  var SKIP: skip
  var STROBE_TOGGLE: strobeToggle
  var USER_COUNTER_UPDATE: userCounterUpdate
  var USER_FOLLOW: userFollow
  var USER_JOIN: userJoin
  var USER_LEAVE: userLeave
  var USER_UPDATE: userUpdate
  var VOTE: vote
}

object Events {
  @scala.inline
  def apply(
    ADVANCE: advance,
    BAN: ban,
    BOOTH_LOCKED: boothLocked,
    CHAT: chat,
    CHAT_COMMAND: command,
    CHAT_DELETE: chatDelete,
    CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate,
    COMMAND: command,
    DJ_LIST_CYCLE: djListCycle,
    DJ_LIST_LOCKED: djListLocked,
    DJ_LIST_UPDATE: djListUpdate,
    EARN: earn,
    FLOOD_CHAT: floodChat,
    FOLLOW_JOIN: followJoin,
    FRIEND_REQUEST: friendRequest,
    GIFTED: gifted,
    GRAB: grab,
    KILL_SESSION: killSession,
    MAINT_MODE: plugMaintenance,
    MAINT_MODE_ALERT: plugMaintenanceAlert,
    MODERATE_ADD_DJ: modAddDJ,
    MODERATE_ADD_WAITLIST: modAddWaitList,
    MODERATE_AMBASSADOR: modAmbassador,
    MODERATE_BAN: modBan,
    MODERATE_MOVE_DJ: modMoveDJ,
    MODERATE_MUTE: modMute,
    MODERATE_REMOVE_DJ: modRemoveDJ,
    MODERATE_REMOVE_WAITLIST: modRemoveWaitList,
    MODERATE_SKIP: modSkip,
    MODERATE_STAFF: modStaff,
    NOTIFY: notify,
    PDJ_MESSAGE: pdjMessage,
    PDJ_UPDATE: pdjUpdate,
    PING: ping,
    PLAYLIST_CYCLE: playlistCycle,
    REQUEST_DURATION: requestDuration,
    REQUEST_DURATION_RETRY: requestDurationRetry,
    ROOM_CHANGE: roomChanged,
    ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate,
    ROOM_JOIN: roomJoin,
    ROOM_NAME_UPDATE: roomNameUpdate,
    ROOM_VOTE_SKIP: roomVoteSkip,
    ROOM_WELCOME_UPDATE: roomWelcomeUpdate,
    SESSION_CLOSE: sessionClose,
    SKIP: skip,
    STROBE_TOGGLE: strobeToggle,
    USER_COUNTER_UPDATE: userCounterUpdate,
    USER_FOLLOW: userFollow,
    USER_JOIN: userJoin,
    USER_LEAVE: userLeave,
    USER_UPDATE: userUpdate,
    VOTE: vote
  ): Events = {
    val __obj = js.Dynamic.literal(ADVANCE = ADVANCE, BAN = BAN, BOOTH_LOCKED = BOOTH_LOCKED, CHAT = CHAT, CHAT_COMMAND = CHAT_COMMAND, CHAT_DELETE = CHAT_DELETE, CHAT_LEVEL_UPDATE = CHAT_LEVEL_UPDATE, COMMAND = COMMAND, DJ_LIST_CYCLE = DJ_LIST_CYCLE, DJ_LIST_LOCKED = DJ_LIST_LOCKED, DJ_LIST_UPDATE = DJ_LIST_UPDATE, EARN = EARN, FLOOD_CHAT = FLOOD_CHAT, FOLLOW_JOIN = FOLLOW_JOIN, FRIEND_REQUEST = FRIEND_REQUEST, GIFTED = GIFTED, GRAB = GRAB, KILL_SESSION = KILL_SESSION, MAINT_MODE = MAINT_MODE, MAINT_MODE_ALERT = MAINT_MODE_ALERT, MODERATE_ADD_DJ = MODERATE_ADD_DJ, MODERATE_ADD_WAITLIST = MODERATE_ADD_WAITLIST, MODERATE_AMBASSADOR = MODERATE_AMBASSADOR, MODERATE_BAN = MODERATE_BAN, MODERATE_MOVE_DJ = MODERATE_MOVE_DJ, MODERATE_MUTE = MODERATE_MUTE, MODERATE_REMOVE_DJ = MODERATE_REMOVE_DJ, MODERATE_REMOVE_WAITLIST = MODERATE_REMOVE_WAITLIST, MODERATE_SKIP = MODERATE_SKIP, MODERATE_STAFF = MODERATE_STAFF, NOTIFY = NOTIFY, PDJ_MESSAGE = PDJ_MESSAGE, PDJ_UPDATE = PDJ_UPDATE, PING = PING, PLAYLIST_CYCLE = PLAYLIST_CYCLE, REQUEST_DURATION = REQUEST_DURATION, REQUEST_DURATION_RETRY = REQUEST_DURATION_RETRY, ROOM_CHANGE = ROOM_CHANGE, ROOM_DESCRIPTION_UPDATE = ROOM_DESCRIPTION_UPDATE, ROOM_JOIN = ROOM_JOIN, ROOM_NAME_UPDATE = ROOM_NAME_UPDATE, ROOM_VOTE_SKIP = ROOM_VOTE_SKIP, ROOM_WELCOME_UPDATE = ROOM_WELCOME_UPDATE, SESSION_CLOSE = SESSION_CLOSE, SKIP = SKIP, STROBE_TOGGLE = STROBE_TOGGLE, USER_COUNTER_UPDATE = USER_COUNTER_UPDATE, USER_FOLLOW = USER_FOLLOW, USER_JOIN = USER_JOIN, USER_LEAVE = USER_LEAVE, USER_UPDATE = USER_UPDATE, VOTE = VOTE)
  
    __obj.asInstanceOf[Events]
  }
}

