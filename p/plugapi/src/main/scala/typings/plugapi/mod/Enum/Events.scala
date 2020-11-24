package typings.plugapi.mod.Enum

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  var ADVANCE: advance = js.native
  
  var BAN: ban = js.native
  
  var BOOTH_LOCKED: boothLocked = js.native
  
  var CHAT: chat = js.native
  
  var CHAT_COMMAND: command = js.native
  
  var CHAT_DELETE: chatDelete = js.native
  
  var CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate = js.native
  
  var COMMAND: command = js.native
  
  var DJ_LIST_CYCLE: djListCycle = js.native
  
  var DJ_LIST_LOCKED: djListLocked = js.native
  
  var DJ_LIST_UPDATE: djListUpdate = js.native
  
  var EARN: earn = js.native
  
  var FLOOD_CHAT: floodChat = js.native
  
  var FOLLOW_JOIN: followJoin = js.native
  
  var FRIEND_REQUEST: friendRequest = js.native
  
  var GIFTED: gifted = js.native
  
  var GRAB: grab = js.native
  
  var KILL_SESSION: killSession = js.native
  
  var MAINT_MODE: plugMaintenance = js.native
  
  var MAINT_MODE_ALERT: plugMaintenanceAlert = js.native
  
  var MODERATE_ADD_DJ: modAddDJ = js.native
  
  var MODERATE_ADD_WAITLIST: modAddWaitList = js.native
  
  var MODERATE_AMBASSADOR: modAmbassador = js.native
  
  var MODERATE_BAN: modBan = js.native
  
  var MODERATE_MOVE_DJ: modMoveDJ = js.native
  
  var MODERATE_MUTE: modMute = js.native
  
  var MODERATE_REMOVE_DJ: modRemoveDJ = js.native
  
  var MODERATE_REMOVE_WAITLIST: modRemoveWaitList = js.native
  
  var MODERATE_SKIP: modSkip = js.native
  
  var MODERATE_STAFF: modStaff = js.native
  
  var NOTIFY: notify = js.native
  
  var PDJ_MESSAGE: pdjMessage = js.native
  
  var PDJ_UPDATE: pdjUpdate = js.native
  
  var PING: ping = js.native
  
  var PLAYLIST_CYCLE: playlistCycle = js.native
  
  var REQUEST_DURATION: requestDuration = js.native
  
  var REQUEST_DURATION_RETRY: requestDurationRetry = js.native
  
  var ROOM_CHANGE: roomChanged = js.native
  
  var ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate = js.native
  
  var ROOM_JOIN: roomJoin = js.native
  
  var ROOM_NAME_UPDATE: roomNameUpdate = js.native
  
  var ROOM_VOTE_SKIP: roomVoteSkip = js.native
  
  var ROOM_WELCOME_UPDATE: roomWelcomeUpdate = js.native
  
  var SESSION_CLOSE: sessionClose = js.native
  
  var SKIP: skip = js.native
  
  var STROBE_TOGGLE: strobeToggle = js.native
  
  var USER_COUNTER_UPDATE: userCounterUpdate = js.native
  
  var USER_FOLLOW: userFollow = js.native
  
  var USER_JOIN: userJoin = js.native
  
  var USER_LEAVE: userLeave = js.native
  
  var USER_UPDATE: userUpdate = js.native
  
  var VOTE: vote = js.native
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
    val __obj = js.Dynamic.literal(ADVANCE = ADVANCE.asInstanceOf[js.Any], BAN = BAN.asInstanceOf[js.Any], BOOTH_LOCKED = BOOTH_LOCKED.asInstanceOf[js.Any], CHAT = CHAT.asInstanceOf[js.Any], CHAT_COMMAND = CHAT_COMMAND.asInstanceOf[js.Any], CHAT_DELETE = CHAT_DELETE.asInstanceOf[js.Any], CHAT_LEVEL_UPDATE = CHAT_LEVEL_UPDATE.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], DJ_LIST_CYCLE = DJ_LIST_CYCLE.asInstanceOf[js.Any], DJ_LIST_LOCKED = DJ_LIST_LOCKED.asInstanceOf[js.Any], DJ_LIST_UPDATE = DJ_LIST_UPDATE.asInstanceOf[js.Any], EARN = EARN.asInstanceOf[js.Any], FLOOD_CHAT = FLOOD_CHAT.asInstanceOf[js.Any], FOLLOW_JOIN = FOLLOW_JOIN.asInstanceOf[js.Any], FRIEND_REQUEST = FRIEND_REQUEST.asInstanceOf[js.Any], GIFTED = GIFTED.asInstanceOf[js.Any], GRAB = GRAB.asInstanceOf[js.Any], KILL_SESSION = KILL_SESSION.asInstanceOf[js.Any], MAINT_MODE = MAINT_MODE.asInstanceOf[js.Any], MAINT_MODE_ALERT = MAINT_MODE_ALERT.asInstanceOf[js.Any], MODERATE_ADD_DJ = MODERATE_ADD_DJ.asInstanceOf[js.Any], MODERATE_ADD_WAITLIST = MODERATE_ADD_WAITLIST.asInstanceOf[js.Any], MODERATE_AMBASSADOR = MODERATE_AMBASSADOR.asInstanceOf[js.Any], MODERATE_BAN = MODERATE_BAN.asInstanceOf[js.Any], MODERATE_MOVE_DJ = MODERATE_MOVE_DJ.asInstanceOf[js.Any], MODERATE_MUTE = MODERATE_MUTE.asInstanceOf[js.Any], MODERATE_REMOVE_DJ = MODERATE_REMOVE_DJ.asInstanceOf[js.Any], MODERATE_REMOVE_WAITLIST = MODERATE_REMOVE_WAITLIST.asInstanceOf[js.Any], MODERATE_SKIP = MODERATE_SKIP.asInstanceOf[js.Any], MODERATE_STAFF = MODERATE_STAFF.asInstanceOf[js.Any], NOTIFY = NOTIFY.asInstanceOf[js.Any], PDJ_MESSAGE = PDJ_MESSAGE.asInstanceOf[js.Any], PDJ_UPDATE = PDJ_UPDATE.asInstanceOf[js.Any], PING = PING.asInstanceOf[js.Any], PLAYLIST_CYCLE = PLAYLIST_CYCLE.asInstanceOf[js.Any], REQUEST_DURATION = REQUEST_DURATION.asInstanceOf[js.Any], REQUEST_DURATION_RETRY = REQUEST_DURATION_RETRY.asInstanceOf[js.Any], ROOM_CHANGE = ROOM_CHANGE.asInstanceOf[js.Any], ROOM_DESCRIPTION_UPDATE = ROOM_DESCRIPTION_UPDATE.asInstanceOf[js.Any], ROOM_JOIN = ROOM_JOIN.asInstanceOf[js.Any], ROOM_NAME_UPDATE = ROOM_NAME_UPDATE.asInstanceOf[js.Any], ROOM_VOTE_SKIP = ROOM_VOTE_SKIP.asInstanceOf[js.Any], ROOM_WELCOME_UPDATE = ROOM_WELCOME_UPDATE.asInstanceOf[js.Any], SESSION_CLOSE = SESSION_CLOSE.asInstanceOf[js.Any], SKIP = SKIP.asInstanceOf[js.Any], STROBE_TOGGLE = STROBE_TOGGLE.asInstanceOf[js.Any], USER_COUNTER_UPDATE = USER_COUNTER_UPDATE.asInstanceOf[js.Any], USER_FOLLOW = USER_FOLLOW.asInstanceOf[js.Any], USER_JOIN = USER_JOIN.asInstanceOf[js.Any], USER_LEAVE = USER_LEAVE.asInstanceOf[js.Any], USER_UPDATE = USER_UPDATE.asInstanceOf[js.Any], VOTE = VOTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setADVANCE(value: advance): Self = this.set("ADVANCE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBAN(value: ban): Self = this.set("BAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOOTH_LOCKED(value: boothLocked): Self = this.set("BOOTH_LOCKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHAT(value: chat): Self = this.set("CHAT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHAT_COMMAND(value: command): Self = this.set("CHAT_COMMAND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHAT_DELETE(value: chatDelete): Self = this.set("CHAT_DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHAT_LEVEL_UPDATE(value: roomMinChatLevelUpdate): Self = this.set("CHAT_LEVEL_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMAND(value: command): Self = this.set("COMMAND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDJ_LIST_CYCLE(value: djListCycle): Self = this.set("DJ_LIST_CYCLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDJ_LIST_LOCKED(value: djListLocked): Self = this.set("DJ_LIST_LOCKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDJ_LIST_UPDATE(value: djListUpdate): Self = this.set("DJ_LIST_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEARN(value: earn): Self = this.set("EARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFLOOD_CHAT(value: floodChat): Self = this.set("FLOOD_CHAT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOLLOW_JOIN(value: followJoin): Self = this.set("FOLLOW_JOIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRIEND_REQUEST(value: friendRequest): Self = this.set("FRIEND_REQUEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGIFTED(value: gifted): Self = this.set("GIFTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRAB(value: grab): Self = this.set("GRAB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKILL_SESSION(value: killSession): Self = this.set("KILL_SESSION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAINT_MODE(value: plugMaintenance): Self = this.set("MAINT_MODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAINT_MODE_ALERT(value: plugMaintenanceAlert): Self = this.set("MAINT_MODE_ALERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_ADD_DJ(value: modAddDJ): Self = this.set("MODERATE_ADD_DJ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_ADD_WAITLIST(value: modAddWaitList): Self = this.set("MODERATE_ADD_WAITLIST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_AMBASSADOR(value: modAmbassador): Self = this.set("MODERATE_AMBASSADOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_BAN(value: modBan): Self = this.set("MODERATE_BAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_MOVE_DJ(value: modMoveDJ): Self = this.set("MODERATE_MOVE_DJ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_MUTE(value: modMute): Self = this.set("MODERATE_MUTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_REMOVE_DJ(value: modRemoveDJ): Self = this.set("MODERATE_REMOVE_DJ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_REMOVE_WAITLIST(value: modRemoveWaitList): Self = this.set("MODERATE_REMOVE_WAITLIST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_SKIP(value: modSkip): Self = this.set("MODERATE_SKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATE_STAFF(value: modStaff): Self = this.set("MODERATE_STAFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTIFY(value: notify): Self = this.set("NOTIFY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDJ_MESSAGE(value: pdjMessage): Self = this.set("PDJ_MESSAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDJ_UPDATE(value: pdjUpdate): Self = this.set("PDJ_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPING(value: ping): Self = this.set("PING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLAYLIST_CYCLE(value: playlistCycle): Self = this.set("PLAYLIST_CYCLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREQUEST_DURATION(value: requestDuration): Self = this.set("REQUEST_DURATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREQUEST_DURATION_RETRY(value: requestDurationRetry): Self = this.set("REQUEST_DURATION_RETRY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_CHANGE(value: roomChanged): Self = this.set("ROOM_CHANGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_DESCRIPTION_UPDATE(value: roomDescriptionUpdate): Self = this.set("ROOM_DESCRIPTION_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_JOIN(value: roomJoin): Self = this.set("ROOM_JOIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_NAME_UPDATE(value: roomNameUpdate): Self = this.set("ROOM_NAME_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_VOTE_SKIP(value: roomVoteSkip): Self = this.set("ROOM_VOTE_SKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOM_WELCOME_UPDATE(value: roomWelcomeUpdate): Self = this.set("ROOM_WELCOME_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSESSION_CLOSE(value: sessionClose): Self = this.set("SESSION_CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSKIP(value: skip): Self = this.set("SKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTROBE_TOGGLE(value: strobeToggle): Self = this.set("STROBE_TOGGLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER_COUNTER_UPDATE(value: userCounterUpdate): Self = this.set("USER_COUNTER_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER_FOLLOW(value: userFollow): Self = this.set("USER_FOLLOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER_JOIN(value: userJoin): Self = this.set("USER_JOIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER_LEAVE(value: userLeave): Self = this.set("USER_LEAVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER_UPDATE(value: userUpdate): Self = this.set("USER_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVOTE(value: vote): Self = this.set("VOTE", value.asInstanceOf[js.Any])
  }
}
