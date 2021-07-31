package typings.plugapi.mod

import typings.plugapi.plugapiStrings.advance
import typings.plugapi.plugapiStrings.ban
import typings.plugapi.plugapiStrings.boothLocked
import typings.plugapi.plugapiStrings.chat
import typings.plugapi.plugapiStrings.chatDelete
import typings.plugapi.plugapiStrings.command
import typings.plugapi.plugapiStrings.d
import typings.plugapi.plugapiStrings.djListCycle
import typings.plugapi.plugapiStrings.djListLocked
import typings.plugapi.plugapiStrings.djListUpdate
import typings.plugapi.plugapiStrings.earn
import typings.plugapi.plugapiStrings.f
import typings.plugapi.plugapiStrings.floodChat
import typings.plugapi.plugapiStrings.followJoin
import typings.plugapi.plugapiStrings.friendRequest
import typings.plugapi.plugapiStrings.gifted
import typings.plugapi.plugapiStrings.grab
import typings.plugapi.plugapiStrings.h
import typings.plugapi.plugapiStrings.killSession
import typings.plugapi.plugapiStrings.l
import typings.plugapi.plugapiStrings.m
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
import typings.plugapi.plugapiStrings.s
import typings.plugapi.plugapiStrings.sessionClose
import typings.plugapi.plugapiStrings.skip
import typings.plugapi.plugapiStrings.strobeToggle
import typings.plugapi.plugapiStrings.userCounterUpdate
import typings.plugapi.plugapiStrings.userFollow
import typings.plugapi.plugapiStrings.userJoin
import typings.plugapi.plugapiStrings.userLeave
import typings.plugapi.plugapiStrings.userUpdate
import typings.plugapi.plugapiStrings.vote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Enum {
  
  trait Ban extends StObject {
    
    var DAY: d
    
    var HOUR: h
    
    var PERMA: f
  }
  object Ban {
    
    @scala.inline
    def apply(): Ban = {
      val __obj = js.Dynamic.literal(DAY = "d", HOUR = "h", PERMA = "f")
      __obj.asInstanceOf[Ban]
    }
    
    @scala.inline
    implicit class BanMutableBuilder[Self <: Ban] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDAY(value: d): Self = StObject.set(x, "DAY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOUR(value: h): Self = StObject.set(x, "HOUR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPERMA(value: f): Self = StObject.set(x, "PERMA", value.asInstanceOf[js.Any])
    }
  }
  
  trait BanReason extends StObject {
    
    var INAPPROPRIATE_GENRE: Double
    
    var NEGATIVE_ATTITUDE: Double
    
    var OFFENSIVE_MEDIA: Double
    
    var SPAMMING_TROLLING: Double
    
    var VERBAL_ABUSE: Double
  }
  object BanReason {
    
    @scala.inline
    def apply(
      INAPPROPRIATE_GENRE: Double,
      NEGATIVE_ATTITUDE: Double,
      OFFENSIVE_MEDIA: Double,
      SPAMMING_TROLLING: Double,
      VERBAL_ABUSE: Double
    ): BanReason = {
      val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE.asInstanceOf[js.Any], NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_MEDIA = OFFENSIVE_MEDIA.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanReason]
    }
    
    @scala.inline
    implicit class BanReasonMutableBuilder[Self <: BanReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setINAPPROPRIATE_GENRE(value: Double): Self = StObject.set(x, "INAPPROPRIATE_GENRE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNEGATIVE_ATTITUDE(value: Double): Self = StObject.set(x, "NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFFENSIVE_MEDIA(value: Double): Self = StObject.set(x, "OFFENSIVE_MEDIA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPAMMING_TROLLING(value: Double): Self = StObject.set(x, "SPAMMING_TROLLING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERBAL_ABUSE(value: Double): Self = StObject.set(x, "VERBAL_ABUSE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
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
    def apply(): Events = {
      val __obj = js.Dynamic.literal(ADVANCE = "advance", BAN = "ban", BOOTH_LOCKED = "boothLocked", CHAT = "chat", CHAT_COMMAND = "command", CHAT_DELETE = "chatDelete", CHAT_LEVEL_UPDATE = "roomMinChatLevelUpdate", COMMAND = "command", DJ_LIST_CYCLE = "djListCycle", DJ_LIST_LOCKED = "djListLocked", DJ_LIST_UPDATE = "djListUpdate", EARN = "earn", FLOOD_CHAT = "floodChat", FOLLOW_JOIN = "followJoin", FRIEND_REQUEST = "friendRequest", GIFTED = "gifted", GRAB = "grab", KILL_SESSION = "killSession", MAINT_MODE = "plugMaintenance", MAINT_MODE_ALERT = "plugMaintenanceAlert", MODERATE_ADD_DJ = "modAddDJ", MODERATE_ADD_WAITLIST = "modAddWaitList", MODERATE_AMBASSADOR = "modAmbassador", MODERATE_BAN = "modBan", MODERATE_MOVE_DJ = "modMoveDJ", MODERATE_MUTE = "modMute", MODERATE_REMOVE_DJ = "modRemoveDJ", MODERATE_REMOVE_WAITLIST = "modRemoveWaitList", MODERATE_SKIP = "modSkip", MODERATE_STAFF = "modStaff", NOTIFY = "notify", PDJ_MESSAGE = "pdjMessage", PDJ_UPDATE = "pdjUpdate", PING = "ping", PLAYLIST_CYCLE = "playlistCycle", REQUEST_DURATION = "requestDuration", REQUEST_DURATION_RETRY = "requestDurationRetry", ROOM_CHANGE = "roomChanged", ROOM_DESCRIPTION_UPDATE = "roomDescriptionUpdate", ROOM_JOIN = "roomJoin", ROOM_NAME_UPDATE = "roomNameUpdate", ROOM_VOTE_SKIP = "roomVoteSkip", ROOM_WELCOME_UPDATE = "roomWelcomeUpdate", SESSION_CLOSE = "sessionClose", SKIP = "skip", STROBE_TOGGLE = "strobeToggle", USER_COUNTER_UPDATE = "userCounterUpdate", USER_FOLLOW = "userFollow", USER_JOIN = "userJoin", USER_LEAVE = "userLeave", USER_UPDATE = "userUpdate", VOTE = "vote")
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADVANCE(value: advance): Self = StObject.set(x, "ADVANCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAN(value: ban): Self = StObject.set(x, "BAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOTH_LOCKED(value: boothLocked): Self = StObject.set(x, "BOOTH_LOCKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT(value: chat): Self = StObject.set(x, "CHAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_COMMAND(value: command): Self = StObject.set(x, "CHAT_COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_DELETE(value: chatDelete): Self = StObject.set(x, "CHAT_DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_LEVEL_UPDATE(value: roomMinChatLevelUpdate): Self = StObject.set(x, "CHAT_LEVEL_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMMAND(value: command): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_CYCLE(value: djListCycle): Self = StObject.set(x, "DJ_LIST_CYCLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_LOCKED(value: djListLocked): Self = StObject.set(x, "DJ_LIST_LOCKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_UPDATE(value: djListUpdate): Self = StObject.set(x, "DJ_LIST_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEARN(value: earn): Self = StObject.set(x, "EARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLOOD_CHAT(value: floodChat): Self = StObject.set(x, "FLOOD_CHAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFOLLOW_JOIN(value: followJoin): Self = StObject.set(x, "FOLLOW_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFRIEND_REQUEST(value: friendRequest): Self = StObject.set(x, "FRIEND_REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGIFTED(value: gifted): Self = StObject.set(x, "GIFTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRAB(value: grab): Self = StObject.set(x, "GRAB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKILL_SESSION(value: killSession): Self = StObject.set(x, "KILL_SESSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAINT_MODE(value: plugMaintenance): Self = StObject.set(x, "MAINT_MODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAINT_MODE_ALERT(value: plugMaintenanceAlert): Self = StObject.set(x, "MAINT_MODE_ALERT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_ADD_DJ(value: modAddDJ): Self = StObject.set(x, "MODERATE_ADD_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_ADD_WAITLIST(value: modAddWaitList): Self = StObject.set(x, "MODERATE_ADD_WAITLIST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_AMBASSADOR(value: modAmbassador): Self = StObject.set(x, "MODERATE_AMBASSADOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_BAN(value: modBan): Self = StObject.set(x, "MODERATE_BAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_MOVE_DJ(value: modMoveDJ): Self = StObject.set(x, "MODERATE_MOVE_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_MUTE(value: modMute): Self = StObject.set(x, "MODERATE_MUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_REMOVE_DJ(value: modRemoveDJ): Self = StObject.set(x, "MODERATE_REMOVE_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_REMOVE_WAITLIST(value: modRemoveWaitList): Self = StObject.set(x, "MODERATE_REMOVE_WAITLIST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_SKIP(value: modSkip): Self = StObject.set(x, "MODERATE_SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_STAFF(value: modStaff): Self = StObject.set(x, "MODERATE_STAFF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOTIFY(value: notify): Self = StObject.set(x, "NOTIFY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDJ_MESSAGE(value: pdjMessage): Self = StObject.set(x, "PDJ_MESSAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDJ_UPDATE(value: pdjUpdate): Self = StObject.set(x, "PDJ_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPING(value: ping): Self = StObject.set(x, "PING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLAYLIST_CYCLE(value: playlistCycle): Self = StObject.set(x, "PLAYLIST_CYCLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUEST_DURATION(value: requestDuration): Self = StObject.set(x, "REQUEST_DURATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUEST_DURATION_RETRY(value: requestDurationRetry): Self = StObject.set(x, "REQUEST_DURATION_RETRY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_CHANGE(value: roomChanged): Self = StObject.set(x, "ROOM_CHANGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_DESCRIPTION_UPDATE(value: roomDescriptionUpdate): Self = StObject.set(x, "ROOM_DESCRIPTION_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_JOIN(value: roomJoin): Self = StObject.set(x, "ROOM_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_NAME_UPDATE(value: roomNameUpdate): Self = StObject.set(x, "ROOM_NAME_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_VOTE_SKIP(value: roomVoteSkip): Self = StObject.set(x, "ROOM_VOTE_SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_WELCOME_UPDATE(value: roomWelcomeUpdate): Self = StObject.set(x, "ROOM_WELCOME_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSESSION_CLOSE(value: sessionClose): Self = StObject.set(x, "SESSION_CLOSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSKIP(value: skip): Self = StObject.set(x, "SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTROBE_TOGGLE(value: strobeToggle): Self = StObject.set(x, "STROBE_TOGGLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_COUNTER_UPDATE(value: userCounterUpdate): Self = StObject.set(x, "USER_COUNTER_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_FOLLOW(value: userFollow): Self = StObject.set(x, "USER_FOLLOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_JOIN(value: userJoin): Self = StObject.set(x, "USER_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_LEAVE(value: userLeave): Self = StObject.set(x, "USER_LEAVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_UPDATE(value: userUpdate): Self = StObject.set(x, "USER_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVOTE(value: vote): Self = StObject.set(x, "VOTE", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalRole extends StObject {
    
    var ADMIN: Double
    
    var AMBASSADOR: Double
    
    var LEADER: Double
    
    var NONE: Double
    
    var VOLUNTEER: Double
  }
  object GlobalRole {
    
    @scala.inline
    def apply(ADMIN: Double, AMBASSADOR: Double, LEADER: Double, NONE: Double, VOLUNTEER: Double): GlobalRole = {
      val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], AMBASSADOR = AMBASSADOR.asInstanceOf[js.Any], LEADER = LEADER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], VOLUNTEER = VOLUNTEER.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalRole]
    }
    
    @scala.inline
    implicit class GlobalRoleMutableBuilder[Self <: GlobalRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMIN(value: Double): Self = StObject.set(x, "ADMIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAMBASSADOR(value: Double): Self = StObject.set(x, "AMBASSADOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEADER(value: Double): Self = StObject.set(x, "LEADER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVOLUNTEER(value: Double): Self = StObject.set(x, "VOLUNTEER", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mute extends StObject {
    
    var LONG: l
    
    var MEDIUM: m
    
    var SHORT: s
  }
  object Mute {
    
    @scala.inline
    def apply(): Mute = {
      val __obj = js.Dynamic.literal(LONG = "l", MEDIUM = "m", SHORT = "s")
      __obj.asInstanceOf[Mute]
    }
    
    @scala.inline
    implicit class MuteMutableBuilder[Self <: Mute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLONG(value: l): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEDIUM(value: m): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHORT(value: s): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
    }
  }
  
  trait MuteReason extends StObject {
    
    var NEGATIVE_ATTITUDE: Double
    
    var OFFENSIVE_LANGUAGE: Double
    
    var SPAMMING_TROLLING: Double
    
    var VERBAL_ABUSE: Double
    
    var VIOLATING_COMMUNITY_RULES: Double
  }
  object MuteReason {
    
    @scala.inline
    def apply(
      NEGATIVE_ATTITUDE: Double,
      OFFENSIVE_LANGUAGE: Double,
      SPAMMING_TROLLING: Double,
      VERBAL_ABUSE: Double,
      VIOLATING_COMMUNITY_RULES: Double
    ): MuteReason = {
      val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any], VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuteReason]
    }
    
    @scala.inline
    implicit class MuteReasonMutableBuilder[Self <: MuteReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNEGATIVE_ATTITUDE(value: Double): Self = StObject.set(x, "NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFFENSIVE_LANGUAGE(value: Double): Self = StObject.set(x, "OFFENSIVE_LANGUAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPAMMING_TROLLING(value: Double): Self = StObject.set(x, "SPAMMING_TROLLING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERBAL_ABUSE(value: Double): Self = StObject.set(x, "VERBAL_ABUSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIOLATING_COMMUNITY_RULES(value: Double): Self = StObject.set(x, "VIOLATING_COMMUNITY_RULES", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoomRole extends StObject {
    
    var BOUNCER: Double
    
    var COHOST: Double
    
    var HOST: Double
    
    var MANAGER: Double
    
    var NONE: Double
    
    var RESIDENTDJ: Double
  }
  object RoomRole {
    
    @scala.inline
    def apply(BOUNCER: Double, COHOST: Double, HOST: Double, MANAGER: Double, NONE: Double, RESIDENTDJ: Double): RoomRole = {
      val __obj = js.Dynamic.literal(BOUNCER = BOUNCER.asInstanceOf[js.Any], COHOST = COHOST.asInstanceOf[js.Any], HOST = HOST.asInstanceOf[js.Any], MANAGER = MANAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RESIDENTDJ = RESIDENTDJ.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomRole]
    }
    
    @scala.inline
    implicit class RoomRoleMutableBuilder[Self <: RoomRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOUNCER(value: Double): Self = StObject.set(x, "BOUNCER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOHOST(value: Double): Self = StObject.set(x, "COHOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOST(value: Double): Self = StObject.set(x, "HOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMANAGER(value: Double): Self = StObject.set(x, "MANAGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIDENTDJ(value: Double): Self = StObject.set(x, "RESIDENTDJ", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status extends StObject {
    
    var OFFLINE: Double
    
    var ONLINE: Double
  }
  object Status {
    
    @scala.inline
    def apply(OFFLINE: Double, ONLINE: Double): Status = {
      val __obj = js.Dynamic.literal(OFFLINE = OFFLINE.asInstanceOf[js.Any], ONLINE = ONLINE.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOFFLINE(value: Double): Self = StObject.set(x, "OFFLINE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setONLINE(value: Double): Self = StObject.set(x, "ONLINE", value.asInstanceOf[js.Any])
    }
  }
}
