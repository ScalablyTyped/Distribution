package typings
package plugapiLib.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlugAPI extends js.Object {
  var deleteAllChat: scala.Boolean = js.native
  var multiLine: scala.Boolean = js.native
  var multiLineLimit: scala.Double = js.native
  def changeDJCycle(enabled: scala.Boolean): scala.Boolean = js.native
  def changeDJCycle(enabled: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Boolean = js.native
  def changeRoom(room: java.lang.String): scala.Unit = js.native
  def changeRoom(room: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def connect(room: java.lang.String): scala.Unit = js.native
  def getAdmins(): js.Array[plugapiLib.plugapiMod.UserNs.Extended] = js.native
  def getAmbassadors(): js.Array[plugapiLib.plugapiMod.UserNs.Extended] = js.native
  def getAudience(): js.Array[plugapiLib.plugapiMod.UserNs.Audience] = js.native
  def getDJ(): plugapiLib.plugapiMod.UserNs.DJ = js.native
  def getDJs(): js.Array[plugapiLib.plugapiMod.UserNs.DJ] = js.native
  def getHost(): plugapiLib.plugapiMod.UserNs.Extended = js.native
  def getMedia(): Media = js.native
  def getRoomScore(): Score = js.native
  def getSelf(): plugapiLib.plugapiMod.UserNs.Audience = js.native
  def getStaff(): js.Array[plugapiLib.plugapiMod.UserNs.Extended] = js.native
  def getTimeElapsed(): scala.Double = js.native
  def getTimeRemaining(): scala.Double = js.native
  def getUser(userID: scala.Double): plugapiLib.plugapiMod.UserNs.DJ = js.native
  def getUsers(): js.Array[plugapiLib.plugapiMod.UserNs.DJ] = js.native
  def getWaitList(): plugapiLib.plugapiMod.UserNs.Extended = js.native
  def getWaitListPosition(userID: scala.Double): scala.Double = js.native
  def havePermission(userID: scala.Double, permission: scala.Double): scala.Boolean = js.native
  def havePermission(userID: scala.Double, permission: scala.Double, global: scala.Boolean): scala.Boolean = js.native
  def joinBooth(): scala.Boolean = js.native
  def joinBooth(callback: js.Function0[scala.Unit]): scala.Boolean = js.native
  def leaveBooth(): scala.Boolean = js.native
  def leaveBooth(callback: js.Function0[scala.Unit]): scala.Boolean = js.native
  def on(event: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_advance(
    event: plugapiLib.plugapiLibStrings.advance,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Advance, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_boothCycle(
    event: plugapiLib.plugapiLibStrings.boothCycle,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.BoothCycle, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_boothLocked(
    event: plugapiLib.plugapiLibStrings.boothLocked,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.BoothLocked, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_chat(
    event: plugapiLib.plugapiLibStrings.chat,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Chat, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_chatDelete(
    event: plugapiLib.plugapiLibStrings.chatDelete,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ChatDelete, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_command(
    event: plugapiLib.plugapiLibStrings.command,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Command, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_djListUpdate(
    event: plugapiLib.plugapiLibStrings.djListUpdate,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.DJListUpdate, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_emote(
    event: plugapiLib.plugapiLibStrings.emote,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Emote, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_followJoin(
    event: plugapiLib.plugapiLibStrings.followJoin,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.FollowJoin, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_grab(
    event: plugapiLib.plugapiLibStrings.grab,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Grab, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_modAddDJ(
    event: plugapiLib.plugapiLibStrings.modAddDJ,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ModAddDJ, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_modBan(
    event: plugapiLib.plugapiLibStrings.modBan,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ModBan, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_modMoveDJ(
    event: plugapiLib.plugapiLibStrings.modMoveDJ,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ModMoveDJ, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_modRemoveDJ(
    event: plugapiLib.plugapiLibStrings.modRemoveDJ,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ModRemoveDJ, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_modSkip(
    event: plugapiLib.plugapiLibStrings.modSkip,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.ModSkip, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_roomJoin(
    event: plugapiLib.plugapiLibStrings.roomJoin,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.RoomJoin, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_roomMinChatLevelUpdate(
    event: plugapiLib.plugapiLibStrings.roomMinChatLevelUpdate,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.RoomMinChatLevelUpdate, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userJoin(
    event: plugapiLib.plugapiLibStrings.userJoin,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.UserJoin, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userLeave(
    event: plugapiLib.plugapiLibStrings.userLeave,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.UserLeave, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userUpdate(
    event: plugapiLib.plugapiLibStrings.userUpdate,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.UserUpdate, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_vote(
    event: plugapiLib.plugapiLibStrings.vote,
    callback: js.Function1[/* data */ plugapiLib.plugapiMod.EventNs.Vote, scala.Unit]
  ): scala.Unit = js.native
  def selfSkip(): scala.Boolean = js.native
  def selfSkip(callback: js.Function0[scala.Unit]): scala.Boolean = js.native
  def sendChat(msg: java.lang.String): scala.Unit = js.native
  def sendChat(msg: java.lang.String, timeout: scala.Double): scala.Unit = js.native
  def setLogger(logObject: LogObject): scala.Boolean = js.native
}

