package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Network APIs
  * Use `network.status` to determine whether the current game is a client, server or in single player mode.
  */
@js.native
trait Network_ extends StObject {
  
  def addGroup(): Unit = js.native
  
  def createListener(): Listener = js.native
  
  def createSocket(): Socket = js.native
  
  val currentPlayer: Player = js.native
  
  var defaultGroup: Double = js.native
  
  def getGroup(index: Double): PlayerGroup = js.native
  
  def getPlayer(index: Double): Player = js.native
  
  def getServerInfo(): ServerInfo = js.native
  
  val groups: js.Array[PlayerGroup] = js.native
  
  def kickPlayer(index: Double): Unit = js.native
  
  val mode: NetworkMode = js.native
  
  val numGroups: Double = js.native
  
  val numPlayers: Double = js.native
  
  val players: js.Array[Player] = js.native
  
  def removeGroup(index: Double): Unit = js.native
  
  def sendMessage(message: String): Unit = js.native
  def sendMessage(message: String, players: js.Array[Double]): Unit = js.native
  
  val stats: NetworkStats = js.native
}
