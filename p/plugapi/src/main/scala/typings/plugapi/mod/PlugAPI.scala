package typings.plugapi.mod

import typings.plugapi.mod.Event.Advance
import typings.plugapi.mod.Event.BoothCycle
import typings.plugapi.mod.Event.BoothLocked
import typings.plugapi.mod.Event.Chat
import typings.plugapi.mod.Event.ChatDelete
import typings.plugapi.mod.Event.Command
import typings.plugapi.mod.Event.DJListUpdate
import typings.plugapi.mod.Event.Emote
import typings.plugapi.mod.Event.FollowJoin
import typings.plugapi.mod.Event.Grab
import typings.plugapi.mod.Event.ModAddDJ
import typings.plugapi.mod.Event.ModBan
import typings.plugapi.mod.Event.ModMoveDJ
import typings.plugapi.mod.Event.ModRemoveDJ
import typings.plugapi.mod.Event.ModSkip
import typings.plugapi.mod.Event.RoomJoin
import typings.plugapi.mod.Event.RoomMinChatLevelUpdate
import typings.plugapi.mod.Event.UserJoin
import typings.plugapi.mod.Event.UserLeave
import typings.plugapi.mod.Event.UserUpdate
import typings.plugapi.mod.Event.Vote
import typings.plugapi.mod.User.Audience
import typings.plugapi.mod.User.DJ
import typings.plugapi.mod.User.Extended
import typings.plugapi.plugapiStrings.advance
import typings.plugapi.plugapiStrings.boothCycle
import typings.plugapi.plugapiStrings.boothLocked
import typings.plugapi.plugapiStrings.chat
import typings.plugapi.plugapiStrings.chatDelete
import typings.plugapi.plugapiStrings.command
import typings.plugapi.plugapiStrings.djListUpdate
import typings.plugapi.plugapiStrings.emote
import typings.plugapi.plugapiStrings.followJoin
import typings.plugapi.plugapiStrings.grab
import typings.plugapi.plugapiStrings.modAddDJ
import typings.plugapi.plugapiStrings.modBan
import typings.plugapi.plugapiStrings.modMoveDJ
import typings.plugapi.plugapiStrings.modRemoveDJ
import typings.plugapi.plugapiStrings.modSkip
import typings.plugapi.plugapiStrings.roomJoin
import typings.plugapi.plugapiStrings.roomMinChatLevelUpdate
import typings.plugapi.plugapiStrings.userJoin
import typings.plugapi.plugapiStrings.userLeave
import typings.plugapi.plugapiStrings.userUpdate
import typings.plugapi.plugapiStrings.vote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlugAPI extends StObject {
  
  def changeDJCycle(enabled: Boolean): Boolean = js.native
  def changeDJCycle(enabled: Boolean, callback: js.Function0[Unit]): Boolean = js.native
  
  def changeRoom(room: String): Unit = js.native
  def changeRoom(room: String, callback: js.Function0[Unit]): Unit = js.native
  
  def close(): Unit = js.native
  
  def connect(room: String): Unit = js.native
  
  var deleteAllChat: Boolean = js.native
  
  def getAdmins(): js.Array[Extended] = js.native
  
  def getAmbassadors(): js.Array[Extended] = js.native
  
  def getAudience(): js.Array[Audience] = js.native
  
  def getDJ(): DJ = js.native
  
  def getDJs(): js.Array[DJ] = js.native
  
  def getHost(): Extended = js.native
  
  def getMedia(): Media = js.native
  
  def getRoomScore(): Score = js.native
  
  def getSelf(): Audience = js.native
  
  def getStaff(): js.Array[Extended] = js.native
  
  def getTimeElapsed(): Double = js.native
  
  def getTimeRemaining(): Double = js.native
  
  def getUser(userID: Double): DJ = js.native
  
  def getUsers(): js.Array[DJ] = js.native
  
  def getWaitList(): Extended = js.native
  
  def getWaitListPosition(userID: Double): Double = js.native
  
  def havePermission(userID: Double, permission: Double): Boolean = js.native
  def havePermission(userID: Double, permission: Double, global: Boolean): Boolean = js.native
  
  def joinBooth(): Boolean = js.native
  def joinBooth(callback: js.Function0[Unit]): Boolean = js.native
  
  def leaveBooth(): Boolean = js.native
  def leaveBooth(callback: js.Function0[Unit]): Boolean = js.native
  
  var multiLine: Boolean = js.native
  
  var multiLineLimit: Double = js.native
  
  def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_advance(event: advance, callback: js.Function1[/* data */ Advance, Unit]): Unit = js.native
  @JSName("on")
  def on_boothCycle(event: boothCycle, callback: js.Function1[/* data */ BoothCycle, Unit]): Unit = js.native
  @JSName("on")
  def on_boothLocked(event: boothLocked, callback: js.Function1[/* data */ BoothLocked, Unit]): Unit = js.native
  @JSName("on")
  def on_chat(event: chat, callback: js.Function1[/* data */ Chat, Unit]): Unit = js.native
  @JSName("on")
  def on_chatDelete(event: chatDelete, callback: js.Function1[/* data */ ChatDelete, Unit]): Unit = js.native
  @JSName("on")
  def on_command(event: command, callback: js.Function1[/* data */ Command, Unit]): Unit = js.native
  @JSName("on")
  def on_djListUpdate(event: djListUpdate, callback: js.Function1[/* data */ DJListUpdate, Unit]): Unit = js.native
  @JSName("on")
  def on_emote(event: emote, callback: js.Function1[/* data */ Emote, Unit]): Unit = js.native
  @JSName("on")
  def on_followJoin(event: followJoin, callback: js.Function1[/* data */ FollowJoin, Unit]): Unit = js.native
  @JSName("on")
  def on_grab(event: grab, callback: js.Function1[/* data */ Grab, Unit]): Unit = js.native
  @JSName("on")
  def on_modAddDJ(event: modAddDJ, callback: js.Function1[/* data */ ModAddDJ, Unit]): Unit = js.native
  @JSName("on")
  def on_modBan(event: modBan, callback: js.Function1[/* data */ ModBan, Unit]): Unit = js.native
  @JSName("on")
  def on_modMoveDJ(event: modMoveDJ, callback: js.Function1[/* data */ ModMoveDJ, Unit]): Unit = js.native
  @JSName("on")
  def on_modRemoveDJ(event: modRemoveDJ, callback: js.Function1[/* data */ ModRemoveDJ, Unit]): Unit = js.native
  @JSName("on")
  def on_modSkip(event: modSkip, callback: js.Function1[/* data */ ModSkip, Unit]): Unit = js.native
  @JSName("on")
  def on_roomJoin(event: roomJoin, callback: js.Function1[/* data */ RoomJoin, Unit]): Unit = js.native
  @JSName("on")
  def on_roomMinChatLevelUpdate(event: roomMinChatLevelUpdate, callback: js.Function1[/* data */ RoomMinChatLevelUpdate, Unit]): Unit = js.native
  @JSName("on")
  def on_userJoin(event: userJoin, callback: js.Function1[/* data */ UserJoin, Unit]): Unit = js.native
  @JSName("on")
  def on_userLeave(event: userLeave, callback: js.Function1[/* data */ UserLeave, Unit]): Unit = js.native
  @JSName("on")
  def on_userUpdate(event: userUpdate, callback: js.Function1[/* data */ UserUpdate, Unit]): Unit = js.native
  @JSName("on")
  def on_vote(event: vote, callback: js.Function1[/* data */ Vote, Unit]): Unit = js.native
  
  def selfSkip(): Boolean = js.native
  def selfSkip(callback: js.Function0[Unit]): Boolean = js.native
  
  def sendChat(msg: String): Unit = js.native
  def sendChat(msg: String, timeout: Double): Unit = js.native
  
  def setLogger(logObject: LogObject): Boolean = js.native
}
