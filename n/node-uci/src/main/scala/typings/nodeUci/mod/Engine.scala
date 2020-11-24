package typings.nodeUci.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-uci", "Engine")
@js.native
class Engine protected () extends js.Object {
  def this(enginePath: String) = this()
  
  def chain(): EngineChain = js.native
  
  def getBufferUntil(fn: js.Function1[/* str */ String, Boolean]): js.Promise[js.Array[String]] = js.native
  
  def go(sp: SearchOptions): js.Promise[SearchResult] = js.native
  
  def goInfinite(sp: SearchOptions): EventEmitter = js.native
  
  def init(): js.Promise[Engine] = js.native
  
  def isready(): js.Promise[Engine] = js.native
  
  def ponderhit(): js.Promise[Engine] = js.native
  
  def position(fen: String): js.Promise[Engine] = js.native
  def position(fen: String, moves: js.Array[String]): js.Promise[Engine] = js.native
  
  def quit(): js.Promise[Engine] = js.native
  
  def sendCmd(cmd: String): js.Promise[Engine] = js.native
  
  def setoption(name: String): js.Promise[Engine] = js.native
  def setoption(name: String, value: String): js.Promise[Engine] = js.native
  
  def stop(): js.Promise[SearchResult] = js.native
  
  def ucinewgame(): js.Promise[Engine] = js.native
  
  def write(cmd: String): Unit = js.native
}
