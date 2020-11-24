package typings.nodeUci.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-uci", "EngineChain")
@js.native
class EngineChain protected () extends js.Object {
  def this(engine: Engine) = this()
  
  def exec(): js.Any = js.native
  
  def go(sp: SearchOptions): js.Promise[SearchResult] = js.native
  
  def init(): EngineChain = js.native
  
  def isready(): EngineChain = js.native
  
  def position(fen: String): EngineChain = js.native
  def position(fen: String, moves: js.Array[String]): EngineChain = js.native
  
  def quit(): EngineChain = js.native
  
  def setoption(name: String): EngineChain = js.native
  def setoption(name: String, value: String): EngineChain = js.native
  
  def ucinewgame(): EngineChain = js.native
}
